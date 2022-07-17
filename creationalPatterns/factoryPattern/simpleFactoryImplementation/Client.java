package creationalPatterns.factoryPattern.simpleFactoryImplementation;

import creationalPatterns.factoryPattern.simpleFactoryImplementation.aircrafts.F16;

public class Client {
    public static void main(String[] args) {
        F16SimpleFactory factory = new F16SimpleFactory();

        System.out.println("create F16");
        F16 f16 = factory.makeF16("default");
        System.out.println();

        System.out.println("create F16A");
        F16 f16A = factory.makeF16("A");
        System.out.println();

        System.out.println("create F16B");
        F16 f16B = factory.makeF16("B");
        System.out.println();

        f16.fly();
        f16A.fly();
        f16B.fly();
    }
}
