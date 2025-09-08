package pattern.behavioral.chainOfResponsibility;

/*
* 의도: 요청을 처리할 수 있을 때까지 연쇄적으로 넘김.
* 언제: 검증/로깅/권한 등 단계적 처리 파이프라인.
* 장점/주의: 송신자-수신자 분리 / 디버깅 시 흐름 추적 필요.
*/

public class DoChainOfResponsibility {
    public void run(){
        System.out.println("***** start 책임사슬 *****");
        AuthHandler authHandler = new AuthHandler();
        authHandler.setNext(new Handler()).handle("1a1uth");
        authHandler.handle("1a1uth");
        System.out.println("***** end 책임사슬 *****");
    }
}
