package Assignments.Strategy;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Thingy 1", "Thingy 2", "Thingy 3", "Thingy 4", "Thingy 5");

        ListConverter one = new StrategyOne();
        System.out.println(one.listToString(list));

        ListConverter two = new StrategyTwo();
        System.out.println(two.listToString(list));

        ListConverter three = new StrategyThree();
        System.out.println(three.listToString(list));
    }
}
