package Singleton;

public class ProgramHide {
    private static ProgramHide programHide;
    private static  boolean hide = false;

    private ProgramHide(){

    }
    public static synchronized ProgramHide getInstance(){
        if(programHide==null){
            programHide = new ProgramHide();
        }
        return programHide;
    }
    public boolean getHide(){
        return  hide;
    }
    public void changeHide(){
        hide = !hide;
    }
}
