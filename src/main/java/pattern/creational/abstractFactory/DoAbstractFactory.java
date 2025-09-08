package pattern.creational.abstractFactory;

/*
* 의도: 관련된 제품 패밀리(Button+Checkbox 등)를 일관된 방식으로 생성.
* 언제: 여러 제품군을 통째로 교체해야 할 때(Win UI ↔ Mac UI).
* 장점/주의: 제품군 교체 쉬움 / 새 제품군 추가는 쉽지만, 기존 제품군에 새 부품 추가는 추상팩토리 시그니처 변경 필요.
*/
public class DoAbstractFactory {
    public void run(){
        System.out.println("***** start 추상화 팩토리 *****");
        MacFactory macFactory = new MacFactory();
        macFactory.createButton().render();
        macFactory.createCheckbox().render();
        System.out.println("***** end 추상화 팩토리 *****");

        WinFactory winFactory = new WinFactory();
        winFactory.createButton().render();
        winFactory.createCheckbox().render();
    }
}
