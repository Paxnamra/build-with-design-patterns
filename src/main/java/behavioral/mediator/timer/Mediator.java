package behavioral.mediator.timer;

import java.util.Timer;

public class Mediator {
    private Timer timer;

    public Mediator(int seconds) {
        timer = new Timer();
        timer.schedule(new RemindTask(), seconds * 1000);
        timer.schedule(new RemindTaskWithoutBeep(), seconds * 2 * 1000);
    }
}
