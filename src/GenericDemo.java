
package assignedexample;

import java.util.Scanner;

public class GenericDemo {
    public static void main(String[] args) {
        

        Gen<Integer, String, Character> g1 = new Gen<>();
        System.out.println("Int: " + g1.getKey(1234));
        System.out.println("String: " + g1.getValue("evening"));
        System.out.println("Character: " + g1.getRandom('A'));

        Gen<Float, Double, String> g2 = new Gen<>();
        System.out.println("Float: " + g2.getKey(67.98f));
        System.out.println("Double: " + g2.getValue(12.96));
        System.out.println("String: " + g2.getRandom("Hello"));
        
        Gen<Float, Double, String> g3 = new Gen<>();
        System.out.println("Float: " + g2.getKey(67.98f));
        System.out.println("Double: " + g2.getValue(12.96));
        System.out.println("String: " + g2.getRandom("Hello"));
    }
}

// Generic interface
interface GenInt<A, B, C> {
    A getKey(A a);
    B getValue(B b);
    C getRandom(C c);
}

// Generic class implementing the interface
class Gen<A, B, C> implements GenInt<A, B, C> {
    @Override
    public A getKey(A a) {
        return a;
    }

    @Override
    public B getValue(B b) {
        return b;
    }

    @Override
    public C getRandom(C c) {
        return c;
    }
}



