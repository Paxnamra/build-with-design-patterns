package behavioral.command;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Light bedroomLight = new Light();
        Light kitchenLight = new Light();
        Switch switchLight = new Switch();

        Command toggleCommand = new ToggleCommand(bedroomLight);

        switchLight.storeAndExecute(toggleCommand);
        //switchlight.storeAndExecute(toggleCommand);
        //switchlight.storeAndExecute(toggleCommand);

        List<Light> lights = new ArrayList<>();
        lights.add(kitchenLight);
        lights.add(bedroomLight);

        Command allLightsCommand = new AllLightsCommand(lights);

        switchLight.storeAndExecute(allLightsCommand);

    }
}
