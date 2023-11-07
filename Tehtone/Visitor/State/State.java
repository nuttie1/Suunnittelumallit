package Assignments.Visitor.State;

import Assignments.Visitor.Bonus.BonusVisitor;
import Assignments.Visitor.Character.Character;

// State interface
public interface State {
    void accept(BonusVisitor visitor, Character character);
}
