package Assignments.Memento;

public class Main {
    public static void main(String[] args) {
        Riddler riddler = new Riddler();

        for (int i = 0; i < 5; i++) {
            new Customer(riddler).start();
        }
    }
}
