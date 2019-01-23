package behavioral.mediator.mediator_switching_lights;

//concrete command
public class TurnAllLightsOffCommand implements Command {

    private Mediator mediator;

    public TurnAllLightsOffCommand(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void execute() {
        mediator.turnOffAllLights();

    }
}
