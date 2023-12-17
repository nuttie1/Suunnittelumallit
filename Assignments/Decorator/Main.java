package Assignments.Decorator;

public class Main {
    public static void main(String[] args) {
        Data realData = new RealData("Secret data");
        Data protectedData = new AccessControlDecorator(realData, "password123");

        System.out.println(protectedData.getData());
    }
}

