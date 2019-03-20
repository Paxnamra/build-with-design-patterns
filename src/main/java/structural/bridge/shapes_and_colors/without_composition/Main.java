package structural.bridge.shapes_and_colors.without_composition;

public class Main {
    public static void main(String[] args) {

        Circle circle = new RedCircle();
        Square square = new BlueSquare();
        Square greenSquare = new GreenSquare();

        circle.applyColor();
        square.applyColor();
        greenSquare.applyColor();





    }
}
