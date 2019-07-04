package ru.streams.flatMap;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class flatMapTest {
    public static void main(String[] args) {
        List<Integer> collect = Stream.of(Arrays.asList(1, 2, 3), Arrays.asList(4, 5, 6))
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
        System.out.println(collect);
    }
}
