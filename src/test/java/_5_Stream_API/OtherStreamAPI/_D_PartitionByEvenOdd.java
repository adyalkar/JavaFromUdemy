package _5_Stream_API.OtherStreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class _D_PartitionByEvenOdd {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);

        Map<Boolean,List<Integer>> evenOdd = numbers.stream().collect(
                Collectors.partitioningBy(n->n%2==0)
        );

        System.out.println(evenOdd);

       for (Map.Entry<Boolean,List<Integer>>entry : evenOdd.entrySet()) {

           if (entry.getKey()) {
               System.out.println("Even numbers: " + entry.getValue());
           } else {
               System.out.println("Odd numbers: " + entry.getValue());
           }
       }
    }
}
