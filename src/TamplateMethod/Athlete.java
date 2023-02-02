package TamplateMethod;

public class Athlete extends Sportsman{
    @Override
    protected void doMySport() {
        System.out.println("Бегаю");
    }
}
