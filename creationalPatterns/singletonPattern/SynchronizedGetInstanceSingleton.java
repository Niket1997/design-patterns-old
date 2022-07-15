package creationalPatterns.singletonPattern;

public class SynchronizedGetInstanceSingleton {
    private static SynchronizedGetInstanceSingleton obj;

    private SynchronizedGetInstanceSingleton() {}

    public static synchronized SynchronizedGetInstanceSingleton getInstance() {
        if (obj == null) {
            obj = new SynchronizedGetInstanceSingleton();
        }
        return obj;
    }

    public static void main(String[] args) {
        SynchronizedGetInstanceSingleton obj = SynchronizedGetInstanceSingleton.getInstance();
        System.out.println(obj);
    }
}
