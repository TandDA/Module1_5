package AbstractFactory.StudentUniversityProject;

import AbstractFactory.OS;
import AbstractFactory.Program;
import AbstractFactory.StackFactory;
import AbstractFactory.Student.StudentStackFactory;

public class Run {
    public static void main(String[] args) {
        StackFactory stackFactory = new StudentStackFactory();
        OS os = stackFactory.getOS();
        Program program = stackFactory.getProgram();

        os.Run();
        program.execute();
    }
}
