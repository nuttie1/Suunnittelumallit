package Assignments.Visitor.Character;

import Assignments.Visitor.Bonus.BonusVisitor;
import Assignments.Visitor.State.NormalState;
import Assignments.Visitor.State.State;

public class Knight implements Character {
    private State state;
    private int points;

    public Knight() {
        state = new NormalState();
        points = 0;
    }

    // Add the points based on state.
    @Override
    public void accept(BonusVisitor visitor) {
        state.accept(visitor, this);
    }



    @Override
    public void setState(State state) {
        this.state = state;
    }

    @Override
    public int getPoints() {
        return points;
    }

    @Override
    public void addPoints(int points) {
        this.points += points;
    }


}
