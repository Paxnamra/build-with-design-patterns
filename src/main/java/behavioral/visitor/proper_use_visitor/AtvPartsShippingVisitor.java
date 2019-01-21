package behavioral.visitor.proper_use_visitor;

import java.util.List;

public class AtvPartsShippingVisitor implements AtvPartVisitor {

    double shippingAmount = 0;

    @Override
    public void visit(Oil oil) {
        shippingAmount += 5;
        System.out.println("Shipping oil");
    }

    @Override
    public void visit(Fender fender) {
        shippingAmount += 10;
        System.out.println("Shipping fender");
    }

    @Override
    public void visit(Wheel wheel) {
        shippingAmount += 15;
        System.out.println("Shipping wheels");
    }

    @Override
    public void visit(PartsOrder partsOrder) {
        System.out.println("If there are more than 3 things");
        List<AtvPart> parts = partsOrder.getParts();
        if(parts.size() > 3 ) {
            shippingAmount -= 6;
        }
        System.out.println("Shipping amount is " + shippingAmount);

    }
}
