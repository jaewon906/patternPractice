package pattern.behavioral.mediator;

public class TextBox extends Component {
    private String text = "";

    public TextBox(Mediator mediator) { super(mediator); }

    public void setText(String text) {
        this.text = text;
        changed("textChanged");
    }

    public String getText() { return text; }
}
