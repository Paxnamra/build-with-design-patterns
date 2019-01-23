package behavioral.mediator.timer;

import java.util.TimerTask;

public class RemindTaskWithoutBeep extends TimerTask {

    @Override
    public void run() {
        System.out.println("Now time's really up!");
    }
}
