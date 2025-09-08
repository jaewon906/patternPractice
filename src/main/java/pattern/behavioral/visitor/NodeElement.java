package pattern.behavioral.visitor;

public class NodeElement implements Node {

    int v;
    NodeElement(int v) {
        this.v = v;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
