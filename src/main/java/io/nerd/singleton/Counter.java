package io.nerd.singleton;

//singleton impl with save thead using synchronized
public class Counter {
    private int count = 0;
    private static Counter instance = null;

    private Counter() {
        System.out.println("Creating a new instance of Counter");
    }

    public static synchronized Counter getInstance() {
        if (instance == null) {
            instance = new Counter();
        }
        return instance;
    }

    public void addOne() {
        count++;
    }

    public int getCount() {
        return count;
    }

}

