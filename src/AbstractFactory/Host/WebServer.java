package AbstractFactory.Host;

import AbstractFactory.Program;

public class WebServer implements Program {
    @Override
    public void execute() {
        System.out.println("Веб сервер запущен");
    }
}
