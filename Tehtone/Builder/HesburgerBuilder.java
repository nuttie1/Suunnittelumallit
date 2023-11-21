package Assignments.Builder;

import java.util.ArrayList;
import java.util.List;

public class HesburgerBuilder extends BurgerBuilder {
    private List<BurgerPart> burgerParts = new ArrayList<>();

    public void cleanKitchen() {
        burgerParts.clear();
    }

    public void addSalad() {
        burgerParts.add(new Salad());
    }

    public void addPatty() {
        burgerParts.add(new Patty());
    }

    public List<BurgerPart> getBurger() {
        return burgerParts;
    }
}
