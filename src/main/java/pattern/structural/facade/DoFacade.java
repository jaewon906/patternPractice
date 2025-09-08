package pattern.structural.facade;

/*
* 의도: 복잡한 서브시스템에 대한 간단한 진입점 제공.
* 언제: 서브시스템 사용성이 떨어질 때, 의존을 최소화하고 싶을 때.
* 장점/주의: 사용성↑, 결합도↓ / 과도한 기능은 또 다른 복잡도.
*/

public class DoFacade {
    public void run(){
        System.out.println("***** start 파사드 *****");
        ComputerFacade computerFacade = new ComputerFacade();
        computerFacade.start();
        System.out.println("***** end 파사드 *****");
    }
}
