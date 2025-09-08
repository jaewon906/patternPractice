package pattern.behavioral.memento;

import java.util.ArrayDeque;
import java.util.Deque;

public class Caretaker {
    private final Deque<Originator.Memento> history = new ArrayDeque<>();
    public void save(Originator.Memento m) { history.push(m); }
    public Originator.Memento pop() { return history.isEmpty() ? null : history.pop(); }
    public boolean isEmpty() { return history.isEmpty(); }
}
