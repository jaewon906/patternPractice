package pattern.behavioral.state;

public class Context {
    private State s;

    Context(State s) {
        this.s = s;
    }

    void set(State s) {
        this.s = s;
    }

    void request() {
        s.handle(this);
    }
}
