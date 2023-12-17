package Assignments.Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class B {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<Integer> list = new ArrayList<>(List.of(new Integer[]{1, 2, 3, 4, 5}));
        Iterator<Integer> it = list.iterator();

        Thread thread1 = new Thread(() -> {
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

        thread1.join();
        thread2.join();
    }
}
