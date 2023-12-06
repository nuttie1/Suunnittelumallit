package Assignments.Memento.ProtectivePackage;

public class Memento {
    private final int randNum;

    public Memento(int randNum) {
        this.randNum = randNum;
    }

    // Guesser can't access the randnum but Riddler can.
    protected int getRandNum() {
        return randNum;
    }
}
