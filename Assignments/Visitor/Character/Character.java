package Assignments.Visitor.Character;

import Assignments.Visitor.Bonus.BonusVisitor;
import Assignments.Visitor.State.State;

public interface Character {
    void accept(BonusVisitor visitor);


    void setState(State state);
    int getPoints();
    void addPoints(int points);
}
