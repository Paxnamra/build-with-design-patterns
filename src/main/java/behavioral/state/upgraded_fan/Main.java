package behavioral.state.upgraded_fan;

public class Main {
    public static void main(String[] args) {

        Fan fan = new Fan();
        System.out.println(fan);

        fan.pullChain();
        System.out.println(fan);

        fan.pullChain();
        System.out.println(fan);

        fan.pullChain();
        System.out.println(fan);
    }
}

