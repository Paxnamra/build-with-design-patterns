package behavioral.visitor.proper_use_visitor;

public class AtvPartsDisplayVisitor implements AtvPartVisitor {

    @Override
    public void visit(Oil oil) {
        System.out.println("Got an oil");
    }

    @Override
    public void visit(Fender fender) {
        System.out.println("Got a fender");
    }

    @Override
    public void visit(Wheel wheel) {
        System.out.println("Got a wheel");
    }

    @Override
    public void visit(PartsOrder partsOrder) {
        System.out.println("Got a whole order");

    }
}
