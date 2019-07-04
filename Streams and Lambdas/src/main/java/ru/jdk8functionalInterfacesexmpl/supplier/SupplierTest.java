package ru.jdk8functionalInterfacesexmpl.supplier;

import java.util.function.Supplier;

public class SupplierTest {
    public static void main(String[] args) {
        Supplier<Integer> supplier = (() -> {return 10;});
        System.out.println(supplier.get());
    }
}
