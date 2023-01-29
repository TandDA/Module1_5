package Facade;

public class DataFacade {
    Database database;
    Work work;

    public DataFacade(String input){
        database = new Database();
        work = new Work(input);
    }

    public void doWork(){
        String workResult = work.getResult();
        database.insert(workResult);
    }
}
