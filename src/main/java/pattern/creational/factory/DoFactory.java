package pattern.creational.factory;
/*
* 의도: 객체 생성 코드를 서브클래스에 위임. “무엇을 만들지는 추상, 어떻게 만들지는 하위 클래스.”
* 언제: 제품군이 확장될 가능성 높고, 생성 로직이 타입마다 다른 경우.
* 장점/주의: OCP에 유리 / 클래스 수 증가.
* */
public class DoFactory {
    public void run(){
        System.out.println("***** start 팩토리 *****");
        Creator c = new CreatorA();
        Product p = c.createProduct();
        p.use();
        System.out.println("***** end 팩토리 *****");
    }
}
