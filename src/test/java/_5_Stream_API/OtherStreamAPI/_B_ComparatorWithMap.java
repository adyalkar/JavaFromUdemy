package _5_Stream_API.OtherStreamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class _B_ComparatorWithMap {

    public static void main(String[] args) {

        Map<String, Integer> salaryMap = Map.of(
                "Amit", 60000,
                "Ravi", 50000,
                "Neha", 70000
        );


        Map<String, Integer> salaryMap2 =
                salaryMap.entrySet()
                        .stream()
                        .sorted(Map.Entry.comparingByValue())
                        .limit(2)
                        .collect(Collectors.toMap(
                                Map.Entry::getKey,
                                Map.Entry::getValue));

        System.out.println(salaryMap2);

//
//        salaryMap.entrySet()
//                .stream()
//                .sorted(Map.Entry.comparingByValue()).forEach(System.out::println);

        salaryMap.entrySet()
                .stream()
                .sorted(Comparator.comparing(Map.Entry::getValue)).forEach(System.out::println);

        List<String> names = Arrays.asList("Ravi", "Amit", "Neha", "Priya");

        names.stream()
                .sorted()
                .forEach(System.out::println);


        names.stream()
                .sorted(Comparator.comparing(String::length).reversed())
                .forEach(System.out::println);


        salaryMap.entrySet()
                .stream()
                .sorted(Comparator.comparing(Map.Entry<String, Integer>::getValue).reversed())
                .forEach(System.out::println);
    }
}
