package pattern.creational.singleton;


/*
* 의도: 인스턴스 하나 보장 + 전역 접근점.
* 언제: 설정/캐시/로그 등 하나만 있어야 하는 리소스.
* 장점/주의: 생명주기 단순 / 테스트 어려움, 전역 상태 남용 주의, 동시성 안전 구현 필요.
*/
public class DoSingleton {
    public void run(){
        System.out.println("***** start 싱글톤 *****");
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println(s1 == s2); //static final 객체가 항상 만들어지므로 true
        System.out.println("***** end 싱글톤 *****");

    }
}
