package Assignments.ChainOfResponsibility;

abstract class PayRaiseHandler {
    protected PayRaiseHandler nextHandler;

    public void setNextHandler(PayRaiseHandler handler) {
        this.nextHandler = handler;
    }

    public abstract void handleRequest(double percentage);
}
