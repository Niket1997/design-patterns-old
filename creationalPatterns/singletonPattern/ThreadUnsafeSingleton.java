package creationalPatterns.singletonPattern;

public class ThreadUnsafeSingleton {
    private static ThreadUnsafeSingleton obj;

    private ThreadUnsafeSingleton() {}

    public static ThreadUnsafeSingleton getInstance() {
        if (obj == null) {
            obj = new ThreadUnsafeSingleton();
        }
        return obj;
    }

    public static void main(String[] args) {
        ThreadUnsafeSingleton obj = ThreadUnsafeSingleton.getInstance();
        System.out.println(obj);
    }
}
