public class Singleton {

    private static Singleton uniqueInstance = null;

    private int data = 0;

    private Singleton(){}

    // this is not thread safe because two calls could be made at the same time and two objects would be created
    public static Singleton getInstance() {
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
