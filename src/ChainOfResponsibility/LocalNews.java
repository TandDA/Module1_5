package ChainOfResponsibility;

public class LocalNews extends News {

    @Override
    public void post(String newsText) {
        System.out.println("Метстные новости:" + newsText);
    }
}
