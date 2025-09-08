package pattern.creational.builder;

/*
* 의도: 복잡한 객체를 단계적으로 조립(순서 제어, 가독성↑).
* 언제: 선택적 파라미터 많거나, 불변 객체 구성 시.
* 장점/주의: 생성자 폭발 해결 / 코드 양 증가.
*/
public class DoBuild {
    public void run(){
        System.out.println("***** start 빌더 *****");
        User user = new User.Builder().age("30").name("재원").email("ploi9@naver.com").build();
        System.out.println(user.toString());
        System.out.println("***** end 빌더 *****");
    }
}
