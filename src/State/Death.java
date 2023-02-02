package State;

public class Death implements Action{
    @Override
    public void Do() {
        System.out.println("Я умираю(");
    }
}
