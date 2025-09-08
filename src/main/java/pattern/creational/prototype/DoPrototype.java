package pattern.creational.prototype;

/*
* 의도: 복제로 새 객체 생성(런타임에 복제할 타입을 결정).
* 언제: 생성 비용이 크거나, 런타임에 다양한 조합/상태를 복제해야 할 때.
* 장점/주의: 복잡한 초기화 절약 / 얕은·깊은 복사 주의.
* */
public class DoPrototype {
    public void run(){
        System.out.println("***** start 프로토타입 *****");
        Document document1 = new Document("원본이다");
        Document document2 = document1.clone();

        System.out.println(document1);
        System.out.println(document2.toString());

        System.out.println("***** end 프로토타입 *****");
    }
}
