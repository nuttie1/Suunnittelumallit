package Assignments.ChainOfResponsibility;

public class Manager extends PayRaiseHandler {
    public void handleRequest(double percentage) {
        if (percentage <= 0.05) {
            System.out.println("Manager approves a " + percentage * 100 + "% pay raise.");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(percentage);
        }
    }
}
