public class Singleton {

    // volatile synchronizes data across all threads
    private volatile static Singleton uniqueInstance = null;

    private int data = 0;

    private Singleton() {}

    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            synchronized (Singleton.class) {  // we are only synchronizing the first time through
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
