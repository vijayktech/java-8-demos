package org.demo.streams.functional;

import java.util.function.BiPredicate;

public class BiPredicateDemo {

    public static void main(String[] args) {
        BiPredicate<Integer, Integer> isDivisable = (a, b) -> a % b == 0;

        System.out.println("10 divisible by 2: "+isDivisable.test(10,2));
        System.out.println("5 divisable by 4: "+ isDivisable.test(5, 4));
    }
}
