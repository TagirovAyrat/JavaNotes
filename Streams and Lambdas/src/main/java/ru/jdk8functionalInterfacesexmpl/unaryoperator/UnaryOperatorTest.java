package ru.jdk8functionalInterfacesexmpl.unaryoperator;

import java.util.Arrays;
import java.util.function.UnaryOperator;

public class UnaryOperatorTest {
    public static void main(String[] args) {
        UnaryOperator<Integer> uOper = i -> i * i;
        Integer mas[] = {1, 2, 3, 4, 5, 6, 7, 8};
        Arrays.stream(mas)
                .map(uOper)
                .forEach(System.out::println);
    }
}
