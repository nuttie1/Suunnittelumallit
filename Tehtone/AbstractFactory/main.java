package Assignments.AbstractFactory;

import Assignments.AbstractFactory.Factories.AdidasFactory;
import Assignments.AbstractFactory.Factories.BossFactory;
import Assignments.AbstractFactory.Factories.Factory;

public class main {
    public static void main(String[] args) {
        Jasper jasper = new Jasper();
        Factory[] factories = {
                new AdidasFactory(),
                new BossFactory()
        };

        for (Factory factory : factories){
            jasper.setFactory(factory);
            jasper.setOutfit();
            System.out.println(jasper);
        }
    }
}
