package Singleton;

public class Run {
    public static void main(String[] args) {
        ProgramHide ph = ProgramHide.getInstance();
        ph.changeHide();
        System.out.println(ph.getHide());
    }
}
