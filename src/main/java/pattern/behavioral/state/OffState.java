package pattern.behavioral.state;

public class OffState implements State {

    @Override
    public void handle(Context c) {
        System.out.println("Off State");
        c.set(new OnState());
    }
}
