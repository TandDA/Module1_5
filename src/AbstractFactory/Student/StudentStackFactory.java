package AbstractFactory.Student;

import AbstractFactory.OS;
import AbstractFactory.Program;
import AbstractFactory.StackFactory;

public class StudentStackFactory implements StackFactory {
    @Override
    public OS getOS() {
        return new Windows();
    }

    @Override
    public Program getProgram() {
        return new IntelliJIDEA();
    }
}
