package pattern.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    List<Observer> observers = new ArrayList<>();
    int val;

    void addObserver(Observer observer) {
        observers.add(observer);
    }
    void set(int v){
        this.val = v;
        observers.forEach(observer -> observer.update(v));
    }
}
