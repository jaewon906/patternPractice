package pattern.behavioral.command;

/*
* 의도: 요청을 객체(명령)로 캡슐화(실행/취소/큐잉).
* 언제: Undo/Redo, 매크로, 작업 스케줄러.
* 장점/주의: 확장/기록 쉬움 / 명령 클래스가 많아질 수 있음.
*/

public class DoCommand {
    public void run() {
        System.out.println("***** start 명령 *****");
        LightCommand lightCommand = new LightCommand(new Light());
        lightCommand.execute();
        System.out.println("***** end 명령 *****");
    }
}
