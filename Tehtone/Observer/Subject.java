package Assignments.Observer;

import java.util.HashSet;
import java.util.Set;

public abstract class Subject {
    Set<Observer> Observers = new HashSet();
    public void attach(Observer o){
        Observers.add(o);
    }
    public void detach(Observer o){
        Observers.remove(o);
    }
    protected void notified(){
        for (Observer o: Observers){
            o.update(this);
        }
    }
}
