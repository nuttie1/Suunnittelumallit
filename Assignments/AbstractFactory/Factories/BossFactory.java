package Assignments.AbstractFactory.Factories;

import Assignments.AbstractFactory.Clothing.Boss.BossCap;
import Assignments.AbstractFactory.Clothing.Boss.BossJeans;
import Assignments.AbstractFactory.Clothing.Boss.BossShirt;
import Assignments.AbstractFactory.Clothing.Boss.BossShoes;
import Assignments.AbstractFactory.Clothing.ICap;
import Assignments.AbstractFactory.Clothing.IJeans;
import Assignments.AbstractFactory.Clothing.IShirt;
import Assignments.AbstractFactory.Clothing.IShoes;

public class BossFactory implements IFactory {
    @Override
    public ICap createCap() {
        return new BossCap();
    }

    @Override
    public IShirt createShirt() {
        return new BossShirt();
    }

    @Override
    public IJeans createJeans() {
        return new BossJeans();
    }

    @Override
    public IShoes createShoes() {
        return new BossShoes();
    }
}
