package State;

public class Birth implements Action{
    @Override
    public void Do() {
        System.out.println("Я родился)");
    }
}
