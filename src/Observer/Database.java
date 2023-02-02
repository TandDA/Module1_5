package Observer;

import java.util.ArrayList;
import java.util.List;

public class Database implements Observed {
    List<String> data = new ArrayList<>();

    List<Observer> subscribers = new ArrayList<>();

    public void addData(String data) {
        this.data.add(data);
        notifyObservers();
    }

    public void removeData(String vacancy) {
        this.data.remove(vacancy);
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        this.subscribers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.subscribers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : subscribers) {
            observer.handleEvent(this.data);
        }
    }
}