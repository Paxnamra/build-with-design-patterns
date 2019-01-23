package behavioral.mediator.mediator_switching_lights;

public class Main {
    public static void main(String[] args) {
        Mediator mediator = new Mediator();

        Light bedroomLight = new Light("Bedroom");
        Light kitchenLight = new Light("Kitchen");

        mediator.registerLights(bedroomLight);
        mediator.registerLights(kitchenLight);

        Command turnAllLightsCommand = new TurnAllLightsOnCommand(mediator);
        turnAllLightsCommand.execute();

        System.out.println();

        Command turnAllLightsOffCommand = new TurnAllLightsOffCommand(mediator);
        turnAllLightsOffCommand.execute();
    }
}
