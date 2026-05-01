package _5_Stream_API.OtherStreamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class _9_SortStringByLength {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("java", "c", "python", "go");

        List<String> sortedList =  list.stream().sorted(Comparator.comparing(String::length)).
                collect(Collectors.toList());


        System.out.println(sortedList);


    }
}
