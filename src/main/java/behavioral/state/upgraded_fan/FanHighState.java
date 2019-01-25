package behavioral.state.upgraded_fan;

public class FanHighState extends State {

    private Fan fan;

    public FanHighState(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void handleRequest() {
        System.out.println("Turning fan off");
        //state we are transitioning to
        fan.setState(fan.getFanOffState());
    }

    public String toString() {
        return "Fan is off";
    }
}
