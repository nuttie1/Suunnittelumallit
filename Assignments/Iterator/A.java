package Assignments.Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class A {
    public static void main(String[] args) throws InterruptedException {
        // Ei pysty editoimaan kesken ajon. Mutta siis toimii ihan normisti. Ottaa kopion listasta kun iteroidaan.
        exampleA();
        // Pystyy editoida kesken ajon.
        exampleB();
    }

        public static void exampleA() throws InterruptedException {
            ArrayList<Integer> list = new ArrayList<>(List.of(new Integer[]{1, 2, 3, 4, 5, 6}));

            Thread thread1 = new Thread(() -> {
                Iterator<Integer> it = list.iterator();
                while (it.hasNext()) {
                    Integer i = (Integer) it.next();
                    System.out.println("Thread 1: " + i);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });

            Thread thread2 = new Thread(() -> {
                Iterator<Integer> it = list.iterator();
                while (it.hasNext()) {
                    Integer i = (Integer) it.next();
                    System.out.println("Thread 2: " + i);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });

            thread1.start();
            thread2.start();

            for (int i = 6; i <= 10; i++) {
                list.add(i);
                Thread.sleep(100);
            }

            thread1.join();
            thread2.join();
    }
    public static void exampleB() throws InterruptedException {
        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>(new Integer[]{1, 2, 3, 4, 5});

        Thread thread1 = new Thread(() -> {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                Integer i = it.next();
                System.out.println("Thread 1: " + i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                Integer i = it.next();
                System.out.println("Thread 2: " + i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        thread1.start();
        thread2.start();

        // Muutetaan kokoelmaa säikeiden iteroinnin aikana
        for (int i = 6; i <= 10; i++) {
            list.add(i);
            Thread.sleep(100);
        }

        thread1.join();
        thread2.join();
    }
}
