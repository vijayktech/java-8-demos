package org.demo.streams;

import java.util.Arrays;
import java.util.List;

public class NumberStartsWithOne {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,112,98,32);
        myList.stream()
                .map(i -> i + "") // convert int to String
                .filter(e -> e.startsWith("1"))
                .forEach(System.out::println);
    }
}
