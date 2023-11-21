package Assignments.Builder;

public class Salad extends BurgerPart {
    Salad() {
        this.name = "Salaatti";
    }

    @Override
    public String toString() {
        return name;
    }
}
