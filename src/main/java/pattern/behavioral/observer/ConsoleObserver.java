package pattern.behavioral.observer;

public class ConsoleObserver implements Observer {

    @Override
    public void update(int v) {
        System.out.println("update: " + v);
    }
}
