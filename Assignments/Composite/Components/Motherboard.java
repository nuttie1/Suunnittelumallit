package Assignments.Composite.Components;

import java.util.ArrayList;

public class Motherboard implements Component{

    private final double price;
    private ArrayList<Component> components;

    public Motherboard(double price) {
        this.price = price;
        this.components = new ArrayList<>();
    }

    @Override
    public void add(Component component) {
        this.components.add(component);
    }

    @Override
    public Component getChild(int i) {
        return this.components.get(i);
    }

    @Override
    public double getPrice() {
        double prices = price;
        for (Component component : components){
            prices += component.getPrice();
        }
        return prices;
    }
}
