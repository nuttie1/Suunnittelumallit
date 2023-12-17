package Assignments.Observer;

import java.util.Observable;

// Observable class
class Clock extends Observable {
    private String time;

    public Clock(String time) {
        this.time = time;
    }

    public void setTime(String time) {
        this.time = time;
        setChanged();
        notifyObservers(time);
    }
}
