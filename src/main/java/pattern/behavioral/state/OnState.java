package pattern.behavioral.state;

public class OnState implements State {

    @Override
    public void handle(Context c) {
        System.out.println("On State");
        c.set(new OffState());
    }
}
