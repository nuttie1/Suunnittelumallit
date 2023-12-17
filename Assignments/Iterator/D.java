package Assignments.Iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class D {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(new Integer[]{1, 2, 3, 4, 5}));
        ListIterator<Integer> it = list.listIterator();

        while (it.hasNext()) {
            Integer i = it.next();
            System.out.println("Next: " + i);

            // Kokeillaan 'add' metodia
            if (i == 3) {
                it.add(6);
                System.out.println("Added 6 after 3");
            }

            // Kokeillaan 'set' metodia
            if (i == 4) {
                it.set(7);
                System.out.println("Replaced 4 with 7");
            }
        }

        System.out.println("Modified list: " + list);

        System.out.println("Iterating backwards:");
        while (it.hasPrevious()) {
            Integer i = it.previous();
            System.out.println("Previous: " + i);
        }
    }
}

