package Assignments.Memento;

import Assignments.Memento.ProtectivePackage.Riddler;

public class Main {
    public static void main(String[] args) {
        Riddler riddler = new Riddler();

        for (int i = 0; i < 5; i++) {
            new Guesser(riddler).start();
        }
    }
}
