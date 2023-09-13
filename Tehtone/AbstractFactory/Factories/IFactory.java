package Assignments.AbstractFactory.Factories;

import Assignments.AbstractFactory.Clothing.ICap;
import Assignments.AbstractFactory.Clothing.IJeans;
import Assignments.AbstractFactory.Clothing.IShirt;
import Assignments.AbstractFactory.Clothing.IShoes;

public interface IFactory {

    ICap createCap();
    IShirt createShirt();
    IJeans createJeans();
    IShoes createShoes();

}
