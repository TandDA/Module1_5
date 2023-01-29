package Bridge;

public class LocalNews extends News{
    protected LocalNews(Resource resource) {
        super(resource);
    }

    @Override
    public void cretePost() {
        System.out.println("Местные новости");
        resource.postInformation();
    }
}
