package Assignments.Composite.Components;

public class GPU implements Component {

    private final double price;

    public GPU(double price) {
        this.price = price;
    }

    @Override
    public void add(Component component) {
        throw new UnsupportedOperationException("");
    }

    @Override
    public Component getChild(int i) {
        throw new UnsupportedOperationException("");
    }

    @Override
    public double getPrice() {
        return this.price;
    }
}