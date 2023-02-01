package ChainOfResponsibility;

public class Run {
    public static void main(String[] args) {
        LocalNews localNews = new LocalNews();
        RegionalNews regionalNews = new RegionalNews();
        CountryNews countryNews = new CountryNews();

        countryNews.setNextNewsLevel(regionalNews);
        regionalNews.setNextNewsLevel(localNews);

        localNews.postNews("Пропала собачка");
        regionalNews.postNews("Выборы в местные органы самоуправления");
        countryNews.postNews("Цены на нефть, упали в следствии...");
    }
}
