package TamplateMethod;

public class Run {
    public static void main(String[] args) {
        Sportsman athlete = new Athlete();
        Sportsman boxer = new Boxer();
        Sportsman taekwondo = new Taekwondo();

        athlete.doSport();
        boxer.doSport();
        taekwondo.doSport();
    }
}
