package Assignments.ChainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        Supervisor supervisor = new Supervisor();
        Manager manager = new Manager();
        CEO ceo = new CEO();

        supervisor.setNextHandler(manager);
        manager.setNextHandler(ceo);

        double payRaise = 0.01;
        supervisor.handleRequest(payRaise);
        payRaise = 0.03;
        supervisor.handleRequest(payRaise);
        payRaise = 0.06;
        supervisor.handleRequest(payRaise);
    }
}
