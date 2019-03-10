package structural.flyweight;

public class Main {
    public static void main(String[] args) {
        InventorySystem ims = new InventorySystem();

        ims.takeOrder("Lays", 400);
        ims.takeOrder("Yellow Ducks", 340);
        ims.takeOrder("Piniata", 8);
        ims.takeOrder("Steam", 1);
        ims.takeOrder("Lays", 19);
        ims.takeOrder("Yellow Ducks", 12);
        ims.takeOrder("Piniata", 33);
        ims.takeOrder("Steam", 0);

        ims.process();

        System.out.println(ims.report());
    }
}
