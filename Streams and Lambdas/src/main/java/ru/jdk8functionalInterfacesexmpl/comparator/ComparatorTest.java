package ru.jdk8functionalInterfacesexmpl.comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class ComparatorTest {
    private static List<Worker> getWorkers(){
        List<Worker> workers = new ArrayList<>();
        workers.add(new Worker(22, "Petr"));
        workers.add(new Worker(54, "Vasya"));
        workers.add(new Worker(19, "Kirill"));
        workers.add(new Worker(36, "Ilya"));
        return workers;
    }

    public static void main(String[] args) {
        List<Worker> workers = getWorkers();
        System.out.println("Unsorted");
        System.out.println(workers);

        System.out.println("Sort By age");
        Function<Worker, Integer> fc = (s) -> s.getAge();
        workers.sort(Comparator.comparing(fc));
        System.out.println(workers);
        workers.sort(Comparator.comparing(Worker::getName));
        System.out.println("Sorted by Name");
        System.out.println(workers);
    }
}
