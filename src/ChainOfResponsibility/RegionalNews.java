package ChainOfResponsibility;

public class RegionalNews extends News {

    @Override
    public void post(String newsText) {
        System.out.println("Региональные новсти:" + newsText);
    }
}
