package behavioral.state.upgraded_fan;

public class FanLowState extends State{

    private Fan fan;

    public FanLowState(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void handleRequest() {
        System.out.println("Turning fan on to med");
        //state we are transitioning to
        fan.setState(fan.getFanMedState());
    }

    public String toString() {
        return "Fan is low";
    }
}
