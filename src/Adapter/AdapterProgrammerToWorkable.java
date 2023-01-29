package Adapter;

public class AdapterProgrammerToWorkable extends Programmer implements Workable{
    @Override
    public void startWork() {
        startJavaWork();
    }

    @Override
    public void stopWork() {
        stopJavaWork();
    }
    @Override
    public void findWork() {
        findJavaWork();
    }
}
