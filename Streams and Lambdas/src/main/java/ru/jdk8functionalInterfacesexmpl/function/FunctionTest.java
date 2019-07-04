package ru.jdk8functionalInterfacesexmpl.function;

import java.util.function.Function;

public class FunctionTest {
    public static void main(String[] args) {
        Function<Integer, Long> func = x -> x * 2L;
        System.out.printf("Double: " + func.apply(4) + "\n");
    }


}
