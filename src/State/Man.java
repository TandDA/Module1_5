package State;

public class Man {
    Action action;

    public void setAction(Action action) {
        this.action = action;
    }
    public void nextStep(){
        action.Do();
        if(action instanceof Birth){
            setAction(new Live());
        }
        else if(action instanceof Live){
            setAction(new Death());
        }
        else if(action instanceof Death){
            setAction(new Rebirth());
        }
        else if(action instanceof Rebirth){
            setAction(new Birth());
        }
    }
}
