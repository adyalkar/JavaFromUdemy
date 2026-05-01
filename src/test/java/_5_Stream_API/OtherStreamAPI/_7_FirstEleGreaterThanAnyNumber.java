package _5_Stream_API.OtherStreamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class _7_FirstEleGreaterThanAnyNumber {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10,11,32,12,13,14,15,16,17,18,19,20,33,34,35,36,37,38,39);

        // To find the first element greater than 20
        int first = list.stream().filter(n->n>20).findFirst().orElse(null);

        System.out.println(first);

        // To find the maximum element in the list
        int n= list.stream().max(Comparator.comparing(Integer::intValue)).get();
        System.out.println(n);
    }

}
