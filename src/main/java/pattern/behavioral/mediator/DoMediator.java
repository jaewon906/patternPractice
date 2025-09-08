package pattern.behavioral.mediator;

/*
* 의도: 객체 간 상호작용을 허브가 조정(동료들 간 결합도↓).
* 언제: UI 위젯 상호작용, 채팅룸 등.
* 장점/주의: 상호 의존↓ / 미디에이터가 비대해질 위험.
*/

public class DoMediator {
    public void run(){
        System.out.println("***** start 중재자 *****");
        DialogMediator mediator = new DialogMediator();

        TextBox textBox = new TextBox(mediator);
        Button okButton = new Button(mediator);

        mediator.setTextBox(textBox);
        mediator.setOkButton(okButton);

        // 사용자 입력 시나리오
        textBox.setText("");       // 버튼 비활성화
        textBox.setText("Hello");  // 버튼 활성화
        okButton.click();          // 저장 동작 실행

        System.out.println("***** end 중재자 *****");
    }
}
