package Assignments.Memento.ProtectivePackage;

import Assignments.Memento.ProtectivePackage.Memento;

import java.util.Random;

public class Riddler {
    public Memento joinTheGame() {
        int num = new Random().nextInt(10) + 1;
        return new Memento(num);
    }

    public boolean guessTheNumber(Memento memento, int guess) {
        return memento.getRandNum() == guess;
    }
}