package pattern.behavioral.visitor;

public interface Node {
    void accept(Visitor visitor);
}
