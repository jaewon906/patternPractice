package pattern.behavioral.observer;

/*
* 의도: 한 객체 상태 변화 → 구독자에게 푸시 알림.
* 언제: 이벤트 시스템, GUI, 모델-뷰 동기화.
* 장점/주의: 느슨한 결합 / 알림 폭주·순서 의존성 주의.
*/

public class DoObserver {
    public void run(){
        System.out.println("***** start 옵저버 *****");
        Subject subject = new Subject();

        subject.addObserver(new ConsoleObserver());
        subject.addObserver(new ConsoleObserver());
        subject.addObserver(new ConsoleObserver());
        subject.addObserver(new ConsoleObserver());

        subject.set(1);
        System.out.println("***** end 옵저버 *****");
    }
}
