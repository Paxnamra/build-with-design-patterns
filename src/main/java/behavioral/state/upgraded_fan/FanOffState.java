package behavioral.state.upgraded_fan;

public class FanOffState extends State {

    private Fan fan;

    public FanOffState(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void handleRequest() {
        System.out.println("Turning fan on to low");
        //state we are transitioning to
        fan.setState(fan.getFanLowState());
    }

    public String toString() {
        return "Fan is off";
    }
}
