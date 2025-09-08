package pattern.structural.adaptor;

/*
* 의도: 호환되지 않는 인터페이스를 맞춰 연결.
* 언제: 레거시/외부 라이브러리 인터페이스를 현재 코드에 맞춰야 할 때.
* 장점/주의: 재사용성↑ / 어댑터 남발 시 복잡.
*/
public class DoAdaptor {
    public void run(){
        System.out.println("***** start 어댑터 *****");
        Adaptor adaptor = new Adaptor(new Adaptee());
        adaptor.request();
        System.out.println("***** end 어댑터 *****");
    }
}
