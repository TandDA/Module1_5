package Bridge;

public class Run {
    public static void main(String[] args) {
        News[] news = {
                new JavaNews(new Website()),
                new LocalNews(new SocialNetwork())
        };
        for (News news1 : news) {
            news1.cretePost();
        }
    }
}
