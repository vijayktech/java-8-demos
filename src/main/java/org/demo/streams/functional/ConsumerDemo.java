package org.demo.streams.functional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

// Print each citi name in seperate line
public class ConsumerDemo {
    public static void main(String[] args) {
        Consumer<String> consumerStr = citi -> System.out.println(citi);

        List<String> cities = Arrays.asList("Hyderabad", "Delhi", "Pune");

        cities.stream().forEach(consumerStr);
    }
}
