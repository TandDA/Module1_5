package State;

public class Live implements Action{
    @Override
    public void Do() {
        System.out.println("Я живу!");
    }
}
