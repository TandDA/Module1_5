package Strategy;

public class RunSansara { // Буддистский пример :D
    public static void main(String[] args) {
        Man man = new Man();

        man.setAction(new Birth());
        man.nextStep();

        man.setAction(new Live());
        man.nextStep();

        man.setAction(new Death());
        man.nextStep();

        man.setAction(new Rebirth());
        man.nextStep();

        man.setAction(new Birth());
        man.nextStep();
    }
}
