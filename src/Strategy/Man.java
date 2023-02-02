package Strategy;

public class Man {
    Action action;

    public void setAction(Action action) {
        this.action = action;
    }
    public void nextStep() {
        action.Do();
    }
}
