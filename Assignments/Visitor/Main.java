package Assignments.Visitor;

import Assignments.Visitor.Bonus.BonusVisitor;
import Assignments.Visitor.Bonus.BonusVisitorImpl;
import Assignments.Visitor.Character.Knight;
import Assignments.Visitor.Character.Mage;
import Assignments.Visitor.State.BoostedState;

public class Main {
    public static void main(String[] args) {
        Knight knight = new Knight();
        Mage mage = new Mage();

        BonusVisitor visitor = new BonusVisitorImpl();

        // Give points based on state
        knight.accept(visitor);
        mage.accept(visitor);

        System.out.println("Knight points: " + knight.getPoints());
        System.out.println("Mage points: " + mage.getPoints());

        // Change state
        knight.setState(new BoostedState());
        mage.setState(new BoostedState());

        // Add the boints
        knight.accept(visitor);
        mage.accept(visitor);

        System.out.println("Knight points: " + knight.getPoints());
        System.out.println("Mage points: " + mage.getPoints());

    }
}


