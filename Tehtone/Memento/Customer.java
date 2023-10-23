package Assignments.Memento;

public class Customer extends Thread {
    private final Riddler riddler;
    private final Memento memento;

    public Customer(Riddler riddler) {
        this.riddler = riddler;
        this.memento = riddler.joinTheGame();
    }

    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            if (riddler.guessTheNumber(memento, i)) {
                System.out.println("Asiakas " + this.getId() + " arvasi oikein: " + i);
                break;
            }
        }
    }
}