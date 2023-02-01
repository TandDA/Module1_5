package ChainOfResponsibility;

public class CountryNews extends News{
    @Override
    public void post(String newsText) {
        System.out.println("Новсти страны:"+newsText);
    }
}
