package Assignments.AbstractFactory.Factories;

import Assignments.AbstractFactory.Clothing.Boss.BossCap;
import Assignments.AbstractFactory.Clothing.Boss.BossJeans;
import Assignments.AbstractFactory.Clothing.Boss.BossShirt;
import Assignments.AbstractFactory.Clothing.Boss.BossShoes;
import Assignments.AbstractFactory.Clothing.Cap;
import Assignments.AbstractFactory.Clothing.Jeans;
import Assignments.AbstractFactory.Clothing.Shirt;
import Assignments.AbstractFactory.Clothing.Shoes;

public class BossFactory implements Factory{
    @Override
    public Cap createCap() {
        return new BossCap();
    }

    @Override
    public Shirt createShirt() {
        return new BossShirt();
    }

    @Override
    public Jeans createJeans() {
        return new BossJeans();
    }

    @Override
    public Shoes createShoes() {
        return new BossShoes();
    }
}
