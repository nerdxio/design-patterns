package hassan.io.singleton;
//other way to impl singleton
//singleton using enum and default thead save
public  enum  Singleton {
    INSTANCE;
    private int count =0;

    public  void addOne(){
        count++;
    }
    public int getCounter() {
        return count;
    }
}
