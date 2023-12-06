package Assignments.AbstractFactory;

import Assignments.AbstractFactory.Factories.AdidasFactory;
import Assignments.AbstractFactory.Factories.BossFactory;
import Assignments.AbstractFactory.Factories.IFactory;

public class main {
    public static void main(String[] args) {
        Jasper jasper = new Jasper();
        IFactory[] factories = {
                new AdidasFactory(),
                new BossFactory()
        };

        for (IFactory IFactory : factories){
            jasper.setFactory(IFactory);
            jasper.setOutfit();
            System.out.println(jasper);
        }
    }
}
