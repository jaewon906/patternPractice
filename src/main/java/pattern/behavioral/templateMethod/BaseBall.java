package pattern.behavioral.templateMethod;

public class BaseBall extends Game{
    @Override
    void init() {
        System.out.println("BaseBall init");
    }

    @Override
    void start() {
        System.out.println("BaseBall start");
    }

    @Override
    void end() {
        System.out.println("BaseBall end");
    }
}
