package io.nerd.singleton;

public class SingletonDemo {
    public static void main(String[] args) {

        var thread = new Thread(() -> {
            var count1 = Counter.getInstance();
            count1.addOne();
            System.out.println("Counter 1: " + count1.getCount() + count1.hashCode());
        });

        var thread2 = new Thread(() -> {
            var count2 = Counter.getInstance();
            count2.addOne();
            System.out.println("Counter2: " + count2.getCount() + count2.hashCode());
        });

        thread.start();
        thread2.start();

        //other way to impl using Our Class Singleton

        var threadWithEnum1 = new Thread(() -> {
            Singleton.INSTANCE.addOne();
            System.out.println("Thead 1 Counter : " + Singleton.INSTANCE.getCounter());
        });

        Thread threadWithEnum2 = new Thread(() -> {
            Singleton.INSTANCE.addOne();
            System.out.println("Thead 1 Counter : " + Singleton.INSTANCE.getCounter());
        }
        );

        thread.start();
        thread2.start();

        threadWithEnum1.start();
        threadWithEnum2.start();
    }
}
