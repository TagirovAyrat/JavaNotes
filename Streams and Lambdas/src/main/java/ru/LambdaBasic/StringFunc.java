package ru.LambdaBasic;

@FunctionalInterface
public interface StringFunc {
    String func(String n) throws IllegalArgumentException;
}
