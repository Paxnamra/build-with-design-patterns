package structural.decorator;

public class DressingDecorator extends SandwitchDecorator {

    public DressingDecorator(Sandwitch customSandwitch) {
        super(customSandwitch);
    }

    public String make() {
        return customSandwitch.make() + addDressing();
    }

    private String addDressing() {
        return " + mustard";
    }

}
