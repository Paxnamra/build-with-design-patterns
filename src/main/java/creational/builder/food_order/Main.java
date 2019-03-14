package creational.builder.food_order;

public class Main {
    public static void main(String[] args) {

        FoodOrder.Builder builder = new FoodOrder.Builder();
        builder.bread("Wheat").condiments("Tomato").dressing("Vinegar").meat("Mozzarella");

        FoodOrder foodOrder = builder.makeSandwitch();

        System.out.println(foodOrder.getBread());
        System.out.println(foodOrder.getCondiments());
        System.out.println(foodOrder.getDressing());
        System.out.println(foodOrder.getMeat());
    }

}
