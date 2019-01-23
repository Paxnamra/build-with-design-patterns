package behavioral.mediator.mediator_switching_lights;

//receiver
public class Light {

    private String location = "";
    private boolean isOn = false;

    public Light(String location) {
        this.location = location;
    }

    public boolean isOn() {
        return isOn;
    }

    public void toggle() {
        if(isOn) {
            off();
           isOn = false;
        } else {
            on();
            isOn = true;
        }
    }

    private void on() {
        System.out.println(location + ": " + "light switched on.");
    }

    private void off() {
        System.out.println(location + ": " + "light switched off.");
    }
}
