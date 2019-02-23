package behavioral.template_method;

public class StoreOrder extends OrderTemplate {

    @Override
    public void doCheckOut() {
        System.out.println("Ring up items from the cart");

    }

    @Override
    public void doPayment() {
        System.out.println("Process payment with a Card present");

    }

    @Override
    public void doReceipt() {
        System.out.println("Print receipt");

    }

    @Override
    public void doDelivery() {
        System.out.println("Bag items at counter");

    }
}
