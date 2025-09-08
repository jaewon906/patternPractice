package pattern.behavioral.memento;

public class Originator {
    private String state;

    public void setState(String s) { this.state = s; }
    public String getState() { return state; }

    // 스냅샷 생성 (불변 Memento 반환)
    public Memento save() {
        // 만약 state가 가변 객체라면 깊은 복사 수행해야 함
        return new Memento(state);
    }

    // Memento로 복원 (Originator 내부에서만 상태 접근)
    public void restore(Memento m) {
        if (m != null) {
            // Originator는 Memento의 private 멤버에 접근 가능(내부 클래스이므로)
            this.state = m.state;
        }
    }

    // 외부는 이 타입을 보관할 수 있으나 내부 상태에 직접 접근 불가
    public static class Memento {
        private final String state;              // 불변으로 유지
        private Memento(String state) { this.state = state; }
        // 외부에 getter를 만들지 않음 -> 캡슐화 유지
    }
}
