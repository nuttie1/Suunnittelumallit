package Assignments.ChainOfResponsibility;

public class Supervisor extends PayRaiseHandler {
    public void handleRequest(double percentage) {
        if (percentage <= 0.02) {
            System.out.println("Supervisor approves a " + percentage * 100 + "% pay raise.");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(percentage);
        }
    }
}
