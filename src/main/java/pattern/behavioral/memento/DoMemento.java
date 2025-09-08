package pattern.behavioral.memento;

/*
* 의도: 캡슐화를 깨지 않고 객체 상태 스냅샷 저장/복원.
* 언제: Undo/복원 포인트.
* 장점/주의: 캡슐화 유지 / 메모리 비용·보안(민감 데이터) 고려.
*/

public class DoMemento {
    public void run(){
        System.out.println("***** start 매멘토 *****");
        Originator origin = new Originator();
        Caretaker caretaker = new Caretaker();

        origin.setState("State-1");
        caretaker.save(origin.save());

        origin.setState("State-2");
        caretaker.save(origin.save());

        origin.setState("State-3");
        System.out.println("현재 상태: " + origin.getState()); // State-3

        // 이전 상태로 복원 (undo)
        origin.restore(caretaker.pop());          // restore State-2
        System.out.println("undo 1: " + origin.getState()); // State-2

        origin.restore(caretaker.pop());          // restore State-1
        System.out.println("undo 2: " + origin.getState()); // State-1

        System.out.println("***** end 매멘토 *****");
    }
}
