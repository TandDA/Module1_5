package ChainOfResponsibility;

public abstract class News {
    private News nextNewsLevel;

    public void setNextNewsLevel(News nextNewsLevel){
        this.nextNewsLevel = nextNewsLevel;
    }
    public void postNews(String newsText){
        post(newsText);
        if(nextNewsLevel != null){
            nextNewsLevel.postNews(newsText);
        }
    }

    public abstract void post(String newsText);
}
