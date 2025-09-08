package pattern.behavioral.mediator;

public class TextBox extends Component {
    private String text = "";

    // 서브클래스는 항상 부모클래스의 생성자를 호출함 (이것은 자바의 규칙)
    // 서브클래스의 생성자를 명시하지 않아도 부모클래스의 생성자를 호출함
    // 만약 부모클래스의 생성자의 매개변수가 있을때 서브클래스에서 생성자를 명시하지 않으면 컴파일 에러 발생
    public TextBox(Mediator mediator) { super(mediator); }

    public void setText(String text) {
        this.text = text;
        changed("textChanged");
    }

    public String getText() { return text; }
}
