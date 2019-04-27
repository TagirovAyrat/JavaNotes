package ru.jdk8functionalInterfacesexmpl.optional;

import java.util.Optional;
import java.util.function.Function;

public class OptionalTest {
    public static void main(String[] args) {
        Optional<String> something = Optional.of("Hello");
        Function<String, String> func =  (s) -> s + "World";
        something = something.map(func);
        something.ifPresent(System.out::println);
//        something.flatMap()
        System.out.println(something
                .filter(s -> s.length() > 4)
                .filter(s -> s.length() < 15)
                .isPresent());

        Person person = new Person("john", 26);

        Optional<Person> personOptional = Optional.of(person);

        Optional<Optional<String>> nameOptionalWrapper
                = personOptional.map(Person::getName);
        Optional<String> nameOptional
                = nameOptionalWrapper.orElseThrow(IllegalArgumentException::new);

        String s1 = nameOptional.isPresent();
        System.out.println("name" + s1);

        String s = personOptional
                .flatMap(Person::getName)
                .get();
        System.out.println("name " + s);

    }
}
