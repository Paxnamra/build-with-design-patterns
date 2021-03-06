package behavioral.mediator.mediator_switching_lights;

//concrete colleague
public class TurnAllLightsOnCommand implements Command {

    private Mediator mediator;

    public TurnAllLightsOnCommand(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void execute() {
        mediator.turnOnAllLights();

    }
}
