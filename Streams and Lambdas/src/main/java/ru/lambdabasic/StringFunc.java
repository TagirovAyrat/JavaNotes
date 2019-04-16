package ru.lambdabasic;

@FunctionalInterface
public interface StringFunc {
    String func(String n) throws IllegalArgumentException;
}
