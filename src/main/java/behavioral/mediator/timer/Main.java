package behavioral.mediator.timer;

public class Main {
    public static void main(String[] args) {

        System.out.println("About to schedule a task");
        Mediator timerMediator = new Mediator(3);
        System.out.println("Task has been scheduled");
    }
}

