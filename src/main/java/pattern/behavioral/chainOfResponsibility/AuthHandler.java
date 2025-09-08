package pattern.behavioral.chainOfResponsibility;

public class AuthHandler extends Handler {
    public Handler setNext(Handler handler){
        return super.setNext(handler);
    }
    public void handle(String msg){
        if(msg.contains("auth")) System.out.println("인증처리");
        else super.handle(msg);
    }
}
