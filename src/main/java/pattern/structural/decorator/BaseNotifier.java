package pattern.structural.decorator;

public class BaseNotifier implements Notifier {
    @Override
    public void send(String msg) {
        System.out.println("기본 " + msg);
    }
}
