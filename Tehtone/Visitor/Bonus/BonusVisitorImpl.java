package Assignments.Visitor.Bonus;

import Assignments.Visitor.Character.Character;
import Assignments.Visitor.Character.Knight;
import Assignments.Visitor.Character.Mage;
import Assignments.Visitor.State.BoostedState;
import Assignments.Visitor.State.NormalState;
import Assignments.Visitor.State.State;

import java.util.HashMap;
import java.util.Map;

public class BonusVisitorImpl implements BonusVisitor {
    private Map<Class<? extends Character>, Integer> normalPoints;
    private Map<Class<? extends Character>, Integer> boostedPoints;

    // Sublimed control easy to add classes
    public BonusVisitorImpl() {
        normalPoints = new HashMap<>();
        normalPoints.put(Knight.class, 15);
        normalPoints.put(Mage.class, 5);

        boostedPoints = new HashMap<>();
        boostedPoints.put(Knight.class, 10);
        boostedPoints.put(Mage.class, 25);
    }

    @Override
    public void visit(Character character, State state) {
        if (state instanceof NormalState) {
            character.addPoints(normalPoints.get(character.getClass()));
        } else if (state instanceof BoostedState) {
            character.addPoints(boostedPoints.get(character.getClass()));
        }
    }
}
