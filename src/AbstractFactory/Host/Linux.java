package AbstractFactory.Host;

import AbstractFactory.OS;

public class Linux implements OS {
    @Override
    public void Run() {
        System.out.println("Linux готов");
    }
}
