package Observer;

public class Run {
    public static void main(String[] args) {
        Database jobSite = new Database();

        jobSite.addData("First Java Position");
        jobSite.addData("Second Java Position");

        Observer firstSubscriber = new Subscriber("Eugene Suleimanov");
        Observer secondSubscriber = new Subscriber("Peter Romanenko");

        jobSite.addObserver(firstSubscriber);
        jobSite.addObserver(secondSubscriber);

        jobSite.addData("Third Java Position");

        jobSite.removeData("First Java Position");
    }
}