package Assignments.ChainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        Supervisor supervisor = new Supervisor();
        Manager manager = new Manager();
        CEO ceo = new CEO();

        supervisor.setNextHandler(manager);
        manager.setNextHandler(ceo);

        supervisor.handleRequest(0.01);
        supervisor.handleRequest(0.03);
        supervisor.handleRequest(0.06);
    }
}
