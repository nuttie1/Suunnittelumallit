package Assignments.Visitor.State;

import Assignments.Visitor.Bonus.BonusVisitor;
import Assignments.Visitor.Character.Character;

public class NormalState implements State {
    @Override
    public void accept(BonusVisitor visitor, Character character) {
        visitor.visit(character, this);
    }
}