package org.demo.streams.functional;

import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
        Supplier<Double> randomSupplier = Math::random;
        System.out.println("Next Random number!!");
        System.out.println(randomSupplier.get());
    }
}
