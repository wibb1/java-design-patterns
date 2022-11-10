public class Singleton {

    // create the new instance at the formation of the class
    // problem is that the class is created before you need it
    private static Singleton uniqueInstance = new Singleton();

    private int data = 0;

    private Singleton() {}

    public static Singleton getInstance() {
        return uniqueInstance;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
