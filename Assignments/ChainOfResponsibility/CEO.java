package Assignments.ChainOfResponsibility;

public class CEO extends PayRaiseHandler {
    public void handleRequest(double percentage) {
        System.out.println("CEO approves a " + percentage * 100 + "% pay raise.");
    }
}
