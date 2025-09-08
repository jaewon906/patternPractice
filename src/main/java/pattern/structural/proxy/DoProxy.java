package pattern.structural.proxy;

/*
* 의도: 대리 객체가 접근 제어/지연 로딩/원격 호출/캐시 등을 담당.
* 언제: 비용 큰 객체(이미지/DB), 보안/트랜잭션, 원격 서비스.
* 장점/주의: 부가기능 주입 / 계층이 늘어 성능·복잡도 고려.
*/

public class DoProxy {
    public void run(){
        System.out.println("***** start 프록시 *****");

        ProxyImage proxyImage = new ProxyImage();
        proxyImage.display();

        System.out.println("***** end 프록시 *****");
    }
}
