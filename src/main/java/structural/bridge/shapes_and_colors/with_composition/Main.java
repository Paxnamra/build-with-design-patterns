package structural.bridge.shapes_and_colors.with_composition;

public class Main {
    public static void main(String[] args) {

        Color blue = new Blue();
        Shape square = new Square(blue);

        Color red = new Red();
        Shape circle = new Circle(red);

        Color green = new Green();
        Shape greenCircle = new Circle(green);
        Shape greenSquare = new Square(green);

        square.applyColor();
        circle.applyColor();
        greenCircle.applyColor();
        greenSquare.applyColor();


    }
}
