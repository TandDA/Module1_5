package Facade;

public class Work {
    String input;
    public Work(String input){
        System.out.println("Работа создана");
        this.input = input;
    }
    public String getResult(){
        return input.toUpperCase();
    }
}
