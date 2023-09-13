package Assignments.AbstractFactory.Factories;

import Assignments.AbstractFactory.Clothing.Cap;
import Assignments.AbstractFactory.Clothing.Jeans;
import Assignments.AbstractFactory.Clothing.Shirt;
import Assignments.AbstractFactory.Clothing.Shoes;

public interface Factory {

    Cap createCap();
    Shirt createShirt();
    Jeans createJeans();
    Shoes createShoes();

}
