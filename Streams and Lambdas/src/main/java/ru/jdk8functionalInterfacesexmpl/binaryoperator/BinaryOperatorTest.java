package ru.jdk8functionalInterfacesexmpl.binaryoperator;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BinaryOperator;

public class BinaryOperatorTest {
    public static void main(String[] args) {
        BinaryOperator<String> bOper = (s, v) -> {
            s = s.toUpperCase();
            v = v.toUpperCase();
            System.out.println(s + v);
            return s + v;
        };
        Map<String, String> map = new HashMap<>();
        map.put("Best", "Practice");
        map.forEach(bOper::apply);
    }
}
