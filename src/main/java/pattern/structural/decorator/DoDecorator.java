package pattern.structural.decorator;

/*
* 의도: 상속 없이 런타임에 기능을 겹겹이 추가(래핑).
* 언제: 기능 조합이 다양하고, 일부만 선택적으로 추가하고 싶을 때.
* 장점/주의: 조합 유연 / 디버깅이 어려워질 수 있음.
*/

public class DoDecorator {
    public void run(){
        System.out.println("***** start 데코레이터 *****");
        DecoNotifier decoNotifier = new DecoNotifier(new BaseNotifier());
        decoNotifier.send("메세지");
        System.out.println("***** end 데코레이터 *****");
    }
}
