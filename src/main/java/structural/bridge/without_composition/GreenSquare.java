package structural.bridge.without_composition;

public class GreenSquare extends Square {

    @Override
    public void applyColor() {
        System.out.println("Square becomes green");
    }
}
