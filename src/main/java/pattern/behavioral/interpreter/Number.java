package pattern.behavioral.interpreter;

public class Number implements Expression {
    int v;

    Number(int v) {
        this.v = v;
    }
    @Override
    public int interpret() {
        return v;
    }
}
