package pattern.behavioral.state;

/**
 * 의도: 상태 객체로 행동을 위임(상태 전이에 따라 행위 변경).
 * 언제: FSM(상태기계), 복잡한 상태 전환 로직.
 * 장점/주의: 조건문 폭발 제거 / 상태 클래스 증가.
 */

public class DoState {
    public void run(){
        System.out.println("***** start 상태 *****");
        Context c = new Context(new OffState());
        c.request();
        c.set(new OnState());
        c.request();
        System.out.println("***** end 상태 *****");
    }
}
