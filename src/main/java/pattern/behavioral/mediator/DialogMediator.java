package pattern.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class DialogMediator implements Mediator {
    private TextBox textBox;
    private Button okButton;

    public void setTextBox(TextBox textBox) { this.textBox = textBox; }
    public void setOkButton(Button okButton) { this.okButton = okButton; }

    @Override
    public void notify(Component sender, String event) {
        if (sender == textBox && event.equals("textChanged")) {
            // 텍스트가 있으면 버튼 활성화
            boolean hasText = !textBox.getText().isEmpty();
            okButton.setEnabled(hasText);
        } else if (sender == okButton && event.equals("click")) {
            System.out.println("OK 버튼 클릭 → 입력값 저장: " + textBox.getText());
        }
    }
}
