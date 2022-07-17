package creationalPatterns.factoryPattern.factoryImplementation;

import creationalPatterns.factoryPattern.factoryImplementation.aircrafts.*;

public class Client {
    public static void main(String[] args) {
        F16 f16A = new F16A();
        System.out.println();
        F16 f16B = new F16B();
        System.out.println();

        System.out.println("fly F16A");
        f16A.fly();
        System.out.println();

        System.out.println("fly F16A");
        f16B.fly();
        System.out.println();
    }
}
