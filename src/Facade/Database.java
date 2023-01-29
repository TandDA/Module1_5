package Facade;

public class Database {
    public Database(){
        System.out.println("База данных создана");
    }
    public void insert(String workResult){
        System.out.println(workResult + " данные записаны в бд");
    }
}
