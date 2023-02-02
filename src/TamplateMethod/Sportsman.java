package TamplateMethod;

public abstract class Sportsman {
    public void doSport(){
        System.out.println("Одеваюсь");
        System.out.println("Еду в спортзал");
        doMySport();
    }
    protected abstract void doMySport();
}
