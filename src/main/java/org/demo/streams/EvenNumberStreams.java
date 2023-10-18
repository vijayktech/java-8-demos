package org.demo.streams;

import java.util.Arrays;
import java.util.List;

public class EvenNumberStreams {

    // Given a list of integers, find out all the even numbers
    // that exist in the list using Stream functions?
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(10,15,8,49,25,98,32);
        list.stream().filter(e -> e%2 == 0).forEach(System.out::println);
    }

}
