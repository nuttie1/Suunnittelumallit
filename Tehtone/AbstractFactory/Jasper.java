package Assignments.AbstractFactory;

import Assignments.AbstractFactory.Clothing.Cap;
import Assignments.AbstractFactory.Clothing.Jeans;
import Assignments.AbstractFactory.Clothing.Shirt;
import Assignments.AbstractFactory.Clothing.Shoes;
import Assignments.AbstractFactory.Factories.Factory;

public class Jasper {
    private Factory factory;
    private Cap cap;
    private Shirt shirt;
    private Jeans jeans;
    private Shoes shoes;

    public Jasper() {}

    public void setFactory(Factory factory) {
        this.factory = factory;
    }

    public void setOutfit(){
        this.cap = factory.createCap();
        this.shirt = factory.createShirt();
        this.jeans = factory.createJeans();
        this.shoes = factory.createShoes();
    }
    @Override
    public String toString() {
        return "Jasperilla on päällään " + cap + ", " + shirt + ", " + jeans + " ja " + shoes + ".";
    }
}
