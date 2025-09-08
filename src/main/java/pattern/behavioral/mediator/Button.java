package pattern.behavioral.mediator;

public class Button extends Component {
    private boolean enabled = false;
    public Button(Mediator mediator) { super(mediator); }
    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
        System.out.println("버튼 상태: " + (enabled ? "활성화" : "비활성화"));
    }
    public void click() {
        if (enabled) {
            changed("click");
        }
    }
}
