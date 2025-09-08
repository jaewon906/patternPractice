package pattern.behavioral.visitor;

public class PrintVisitor implements Visitor {

    @Override
    public void visit(NodeElement node) {
        System.out.println(node.v+"번째 노드 방문 완료");
    }
}
