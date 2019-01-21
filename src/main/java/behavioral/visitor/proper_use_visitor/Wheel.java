package behavioral.visitor.proper_use_visitor;

public class Wheel implements AtvPart {

    @Override
    public void accept(AtvPartVisitor visitor) {
        visitor.visit(this);
    }
}
