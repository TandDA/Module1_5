package AbstractFactory.Host;

import AbstractFactory.OS;
import AbstractFactory.Program;
import AbstractFactory.StackFactory;

public class HostStackFactory implements StackFactory {
    @Override
    public OS getOS() {
        return new Linux();
    }

    @Override
    public Program getProgram() {
        return new WebServer();
    }
}
