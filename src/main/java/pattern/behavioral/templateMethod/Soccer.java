package pattern.behavioral.templateMethod;

public class Soccer extends Game{

    @Override
    void init() {
        System.out.println("Soccer init");
    }

    @Override
    void start() {
        System.out.println("Soccer start");
    }

    @Override
    void end() {
        System.out.println("Soccer end");
    }
}
