package Bridge;

public abstract class News {
    protected Resource resource;
    protected News(Resource resource){
        this.resource = resource;
    }
    public abstract void cretePost();
}
