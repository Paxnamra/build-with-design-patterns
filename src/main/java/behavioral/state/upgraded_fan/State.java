package behavioral.state.upgraded_fan;

public abstract class State {

    public void handleRequest() {
        System.out.println("You shouldn't be able to get here");
    }
}
