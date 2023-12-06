package Assignments.Builder;

public class Director {
    private BurgerBuilder builder;

    public void setBuilder(BurgerBuilder builder) {
        this.builder = builder;
    }

    public void makeBurger() {
        builder.cleanKitchen();

        builder.addSalad();
        builder.addPatty();
    }

    public void makeDoubleBurger() {
        builder.cleanKitchen();

        builder.addPatty();
        builder.addSalad();
        builder.addPatty();
    }
}
