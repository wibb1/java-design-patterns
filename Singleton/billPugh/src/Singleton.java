public class Singleton {

    private int data = 0;

    private Singleton() {}

    private static class SingletonHelper {
        // Nested class referenced after getInstance is called
        private static Singleton uniquInstance = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHelper.uniquInstance;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
