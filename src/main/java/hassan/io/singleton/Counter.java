package hassan.io.singleton;
//singleton impl with save thead using synchronized
public class Counter {
    private int count = 0;
    private  static Counter instance = null;
    private Counter() {
    }

    public static Counter getInstance() {
        if (instance == null) {
            synchronized (Counter.class) {
                if (instance == null) {
                    instance = new Counter();
                }
            }
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

