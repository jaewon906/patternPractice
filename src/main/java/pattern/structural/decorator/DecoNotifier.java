package pattern.structural.decorator;

public class DecoNotifier implements Notifier {
    private Notifier notifier;

    public DecoNotifier(Notifier notifier) {
        this.notifier = notifier;
    }

    @Override
    public void send(String msg) {
        notifier.send(msg);
        System.out.println("데코 "+msg);
    }
}
