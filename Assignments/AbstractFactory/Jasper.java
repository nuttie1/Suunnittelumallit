package Assignments.AbstractFactory;

import Assignments.AbstractFactory.Clothing.ICap;
import Assignments.AbstractFactory.Clothing.IJeans;
import Assignments.AbstractFactory.Clothing.IShirt;
import Assignments.AbstractFactory.Clothing.IShoes;
import Assignments.AbstractFactory.Factories.IFactory;

public class Jasper {
    private IFactory factory;
    private ICap cap;
    private IShirt shirt;
    private IJeans jeans;
    private IShoes shoes;

    public Jasper() {}

    public void setFactory(IFactory factory) {
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
