package Adapter;

public class Run {
    public static void main(String[] args) {
        Workable workable = new AdapterProgrammerToWorkable();
        workable.findWork();
        workable.startWork();
        workable.stopWork();
    }
}
