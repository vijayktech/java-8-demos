package org.demo.streams.functional;

import java.util.Optional;

public class OptionalDemos {
    public static void main(String[] args) {

        // Create Optional object
        String str = "Vijay";
        Optional<String> optStr = Optional.of(str);
        System.out.println("isPresent:"+optStr.isPresent());

        // demo for isEmpty()
        System.out.println("optStr - isEmpty:"+optStr.isEmpty());

        //Demo for isPresent()
        optStr.ifPresent( s -> System.out.println("length of optStr:"+s.length()));

        //Demo for get()
        String st = optStr.get();
        System.out.println("get():"+st);

        // Demo for NullPointerException if pass null value to Optional,
        // to avoid NPE then use Optional.ofNullable(name)

        String nullStr = null;
//        Optional<String> nullOpt = Optional.of(nullStr);
//        System.out.println("null isPresent:"+nullOpt.isPresent());

        Optional<String> nullableOpt = Optional.ofNullable(nullStr);
        System.out.println("ofNullable() demo - isPresent:"+nullableOpt.isPresent());

        System.out.println("ofNullable - isEmpty:"+nullableOpt.isEmpty());

        // orElse() demo
        String nullString = null;
        String elseName = Optional.ofNullable(nullString).orElse("Hello");
        System.out.println("elseName - orElse:"+elseName);

        //orElseGet() function takes Supplier
        String orElseGetStr = Optional.ofNullable(nullString).orElseGet(() -> "Konkata" );
        System.out.println("orElseGet():"+orElseGetStr);

        String elseThrowStr = Optional.ofNullable(nullString).orElseThrow(IllegalArgumentException::new);
        System.out.println("orElseThrow():"+elseThrowStr);
    }
}
