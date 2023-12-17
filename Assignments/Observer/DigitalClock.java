package Assignments.Observer;

import java.util.Observable;
import java.util.Observer;

// Observer class
class DigitalClock implements Observer {
    private Clock clock;

    public DigitalClock(Clock clock) {
        this.clock = clock;
        clock.addObserver(this);
    }

    @Override
    public void update(Observable obs, Object arg) {
        if (obs == clock) {
            System.out.println("Time is now: " + (String) arg);
        }
    }
}
