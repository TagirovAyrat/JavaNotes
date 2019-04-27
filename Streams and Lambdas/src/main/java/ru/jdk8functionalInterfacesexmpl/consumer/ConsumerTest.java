package ru.jdk8functionalInterfacesexmpl.consumer;

import java.util.function.Consumer;

public class ConsumerTest {
    public static void main(String[] args) {
        Consumer<String> cons = (s -> System.out.println("Hello " + s));
        cons.accept("World");
    }
}
