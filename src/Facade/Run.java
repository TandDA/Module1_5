package Facade;

public class Run {
    public static void main(String[] args) {
        DataFacade dataFacade = new DataFacade("Работаем");
        dataFacade.doWork();
    }
}
