package creationalPatterns.singletonPattern;

public class DoubleCheckedLockingSingleton {
    public static volatile DoubleCheckedLockingSingleton obj = null;

    private DoubleCheckedLockingSingleton() {}

    public static DoubleCheckedLockingSingleton getInstance() {
        if (obj == null) {
            synchronized (DoubleCheckedLockingSingleton.class) {
                if (obj == null) {
                    obj = new DoubleCheckedLockingSingleton();
                }
            }
        }
        return obj;
    }

    public static void main(String[] args) {
        DoubleCheckedLockingSingleton obj = DoubleCheckedLockingSingleton.getInstance();
        System.out.println(obj);
    }
}
