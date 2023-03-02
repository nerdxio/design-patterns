package io.nerd;

import io.nerd.singleton.Counter;
import io.nerd.singleton.Singleton;

public class Main {
    public static void main(String[] args) {

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                var count1 = Counter.getInstance();
                count1.addOne();
                System.out.println("Counter 1: " + count1.getCount());
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                var count2 = Counter.getInstance();
                count2.addOne();
                System.out.println("Counter 2: " + count2.getCount());
            }
        });

        thread.run();
        thread2.run();

        //other way to impl using Our Class Singleton

        Thread threadSingleton1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Singleton.INSTANCE.addOne();
                System.out.println("Thead 1 Counter : " + Singleton.INSTANCE.getCounter());
            }
        });

        Thread threadSingleton2 = new Thread(new Runnable() {
            @Override
            public void run() {
                Singleton.INSTANCE.addOne();
                System.out.println("Thead 1 Counter : " + Singleton.INSTANCE.getCounter());
            }
        });

        thread.run();
        thread2.run();

        threadSingleton1.run();
        threadSingleton2.run();
    }
}
