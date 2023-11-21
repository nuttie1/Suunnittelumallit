package Assignments.Builder;

public class McDonaldsBuilder extends BurgerBuilder {
    private StringBuilder burgerParts = new StringBuilder();

    public void cleanKitchen() {
        burgerParts.setLength(0);
    }

    public void addSalad() {
        burgerParts.append("Salaatti ");
    }

    public void addPatty() {
        burgerParts.append("Pihvi ");
    }

    public StringBuilder getBurger() {
        return burgerParts;
    }
}
