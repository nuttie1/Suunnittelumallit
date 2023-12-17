package Assignments.Decorator;

import java.util.Scanner;

public class AccessControlDecorator implements Data {
    private final Data realData;
    private final String password;

    public AccessControlDecorator(Data realData, String password) {
        this.realData = realData;
        this.password = password;
    }

    @Override
    public String getData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter password: ");
        String inputPassword = scanner.nextLine();

        if (inputPassword.equals(this.password)) {
            return this.realData.getData();
        } else {
            return "Access denied";
        }
    }
}
