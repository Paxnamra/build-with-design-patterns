package behavioral.mediator.timer;

import java.util.TimerTask;

public class RemindTask extends TimerTask {

    @Override
    public void run() {
        System.out.println("Times up!");
    }
}
