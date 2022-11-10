public class Singleton {

    private static Singleton uniqueInstance = null;

    private int data = 0;

    private Singleton(){}

    // adding synchronized it forces every thread to wait until the method is not in use
    // this can create a bottleneck where the program can be slowed by waiting for the availability
    // it is really only required for the creation and future access does not require synchronization
    public static synchronized Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
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
