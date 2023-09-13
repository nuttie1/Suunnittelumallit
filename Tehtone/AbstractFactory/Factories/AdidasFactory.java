package Assignments.AbstractFactory.Factories;

import Assignments.AbstractFactory.Clothing.Adidas.AdidasCap;
import Assignments.AbstractFactory.Clothing.Adidas.AdidasJeans;
import Assignments.AbstractFactory.Clothing.Adidas.AdidasShirt;
import Assignments.AbstractFactory.Clothing.Adidas.AdidasShoes;
import Assignments.AbstractFactory.Clothing.Cap;
import Assignments.AbstractFactory.Clothing.Jeans;
import Assignments.AbstractFactory.Clothing.Shirt;
import Assignments.AbstractFactory.Clothing.Shoes;

public class AdidasFactory implements Factory{
    @Override
    public Cap createCap() {
        return new AdidasCap();
    }

    @Override
    public Shirt createShirt() {
        return new AdidasShirt();
    }

    @Override
    public Jeans createJeans() {
        return new AdidasJeans();
    }

    @Override
    public Shoes createShoes() {
        return new AdidasShoes();
    }
}
