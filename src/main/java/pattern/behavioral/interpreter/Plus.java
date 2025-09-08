package pattern.behavioral.interpreter;

public class Plus implements Expression {

    Expression l,r;

    Plus(Expression l,Expression r)
    {
        this.l=l;
        this.r=r;
    }

    @Override
    public int interpret() {
        return  l.interpret() + r.interpret();
    }
}
