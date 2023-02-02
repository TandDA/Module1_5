package Observer;

import java.util.List;

public class Subscriber implements Observer {
    String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(List<String> data) {
        System.out.println(name + " в БД произошло изменение\n" + data +"\n");
    }
}