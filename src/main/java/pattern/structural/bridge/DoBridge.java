package pattern.structural.bridge;

/*
* 의도: 추상화(Abstraction)와 구현(Implementation)을 분리해 독립적 확장.
* 언제: 플랫폼별 구현 다수 + 기능 축도 다수인 경우(조합 폭발 방지).
* 장점/주의: 결합도↓, 확장 용이 / 초기 설계가 다소 추상적.
*/

public class DoBridge {
    public void run(){
        System.out.println("***** start 브릿지 *****");
        Circle circle1 = new Circle(new Red());
        Circle circle2 = new Circle(new Blue());

        circle1.draw();
        circle2.draw();

        System.out.println("***** end 브릿지 *****");
    }
}
