package pattern.behavioral.chainOfResponsibility;

public class Handler {
    private Handler next;

    public Handler setNext(Handler next) {
        this.next = next;
        return next;
    }

    public void handle(String msg) {
        if(next!=null){
            next.handle(msg);
        }
    }
}
