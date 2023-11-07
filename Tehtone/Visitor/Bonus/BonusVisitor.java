package Assignments.Visitor.Bonus;

import Assignments.Visitor.Character.Character;
import Assignments.Visitor.State.State;

public interface BonusVisitor {
    void visit(Character character, State state);

}
