package Assignments.Memento;

import java.util.Random;

public class Riddler {
    public Memento joinTheGame() {
        int num = new Random().nextInt(10);
        return new Memento(num);
    }

    public boolean guessTheNumber(Memento memento, int guess) {
        return memento.getRandNum() == guess;
    }
}