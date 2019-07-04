package ru.streams.reduce;

import java.util.stream.Stream;

public class ReduceTest {
    public static void main(String[] args) {
        Integer reduce = Stream.of(1, 2, 3, 5, 2, 14)
                .reduce(0, (acc, element) -> acc * element);
        System.out.println(reduce);
    }
}
