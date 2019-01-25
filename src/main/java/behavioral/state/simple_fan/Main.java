package behavioral.state.simple_fan;

public class Main {
    public static void main(String[] args) {

        Fan fan = new Fan();
        System.out.println(fan);

        fan.pullChain();
        System.out.println(fan);

        fan.pullChain();
        System.out.println(fan);
    }
}
