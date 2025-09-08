package pattern.behavioral.visitor;

/**
 * 의도: 데이터 구조는 고정, 연산을 외부로 분리해 추가.
 * 언제: 요소 타입이 고정되고, 새로운 연산(방문자)이 자주 추가될 때.
 * 장점/주의: 연산 추가 쉬움 / 요소 타입 추가는 어렵고, 이중 디스패치 복잡.
 * */

public class DoVisitor {
    public void run(){
        System.out.println("***** start 방문자 *****");
        NodeElement node = new NodeElement(3);
        PrintVisitor printVisitor = new PrintVisitor();

        node.accept(printVisitor);

        System.out.println("***** end 방문자 *****");
    }
}
