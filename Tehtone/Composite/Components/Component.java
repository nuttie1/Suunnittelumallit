package Assignments.Composite.Components;

public interface Component {
    void add(Component component);
    Component getChild(int i);
    double getPrice();

    String toString();
}
