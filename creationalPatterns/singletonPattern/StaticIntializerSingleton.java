package creationalPatterns.singletonPattern;

public class StaticIntializerSingleton {
    private static StaticIntializerSingleton obj = new StaticIntializerSingleton();

    private StaticIntializerSingleton() {}

    public static StaticIntializerSingleton getInstance() {
        return obj;
    }

    public static void main(String[] args) {
        StaticIntializerSingleton obj = StaticIntializerSingleton.getInstance();
        System.out.println(obj);
    }
}
