package Assignments.AbstractFactory.Factories;

import Assignments.AbstractFactory.Clothing.Adidas.AdidasCap;
import Assignments.AbstractFactory.Clothing.Adidas.AdidasJeans;
import Assignments.AbstractFactory.Clothing.Adidas.AdidasShirt;
import Assignments.AbstractFactory.Clothing.Adidas.AdidasShoes;
import Assignments.AbstractFactory.Clothing.ICap;
import Assignments.AbstractFactory.Clothing.IJeans;
import Assignments.AbstractFactory.Clothing.IShirt;
import Assignments.AbstractFactory.Clothing.IShoes;

public class AdidasFactory implements IFactory {
    @Override
    public ICap createCap() {
        return new AdidasCap();
    }

    @Override
    public IShirt createShirt() {
        return new AdidasShirt();
    }

    @Override
    public IJeans createJeans() {
        return new AdidasJeans();
    }

    @Override
    public IShoes createShoes() {
        return new AdidasShoes();
    }
}
