package structural.decorator;

public class MeatDecorator extends SandwitchDecorator {

    public MeatDecorator(Sandwitch customSandwitch) {
        super(customSandwitch);
    }

    public String make() {
        return customSandwitch.make() + addMeat();
    }

    private String addMeat() {
        return " + turkey";
    }
}
