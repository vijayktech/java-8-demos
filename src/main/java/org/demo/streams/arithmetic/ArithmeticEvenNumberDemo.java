package org.demo.streams.arithmetic;


import java.util.*;

public class ArithmeticEvenNumberDemo {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        OptionalDouble averageNum = num.stream().filter(n -> n % 2 == 0).mapToInt(x -> x).average();
        System.out.println("Average even number:"+ averageNum);

        OptionalInt maxNum = num.stream().mapToInt(x -> x).max();
        System.out.println("Max number:"+maxNum);

        OptionalInt minNum = num.stream().mapToInt(x -> x).min();
        System.out.println("Min number:"+minNum);

        int sumNum = num.stream().mapToInt(x -> x).sum();
        System.out.println("Sum of the numbers:"+sumNum);

        //Using Collections
        System.out.println("Using Collections");
        System.out.println(Collections.max(num));
        System.out.println(Collections.min(num));
    }
}
