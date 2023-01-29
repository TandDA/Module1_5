package Bridge;

public class JavaNews extends News {
    protected JavaNews(Resource resource) {
        super(resource);
    }

    @Override
    public void cretePost() {
        System.out.println("Новые фичи");
        resource.postInformation();
    }
}
