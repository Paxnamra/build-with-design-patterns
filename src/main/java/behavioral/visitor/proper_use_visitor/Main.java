package behavioral.visitor.proper_use_visitor;

public class Main {
    public static void main(String[] args) {

        PartsOrder order = new PartsOrder();
        order.addPart(new Oil());
        order.addPart(new Wheel());
        order.addPart(new Fender());

        order.accept(new AtvPartsShippingVisitor());
        order.accept(new AtvPartsDisplayVisitor());
    }
}
