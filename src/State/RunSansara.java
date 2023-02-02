package State;

public class RunSansara { // Буддистский пример :D
    public static void main(String[] args) {
        Man man = new Man();
        man.setAction(new Birth());
        for(int i = 0;i < 20;i++){
            man.nextStep();
        }
    }
}
