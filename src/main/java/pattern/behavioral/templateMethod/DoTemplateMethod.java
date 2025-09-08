package pattern.behavioral.templateMethod;

/**
 * 의도: 알고리즘 골격은 상위 클래스가 정의, 세부 단계는 하위가 재정의.
 * 언제: 공통 절차 + 변하는 단계가 있는 경우.
 * 장점/주의: 코드 중복 제거 / 상속 기반이라 유연성(합성 대비) 낮을 수 있음.
 * */

public class DoTemplateMethod {
    public void run(){
        System.out.println("***** start 템플릿메서드 *****");
        Soccer soccer = new Soccer();
        soccer.play();

        BaseBall baseball = new BaseBall();
        baseball.play();
        System.out.println("***** end 템플릿메서드 *****");
    }
}
