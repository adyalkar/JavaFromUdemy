package _2_Array_And_Matrices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class _2_EvenOddNumFromArray {

    public static void main(String[] args) {

        int [] number = {10,20,87,97};

        List<Integer> list = new ArrayList<>();

        for (int i : number){
            list.add(i);
        }

        Map<Boolean,List<Integer>> map = list.stream().collect(Collectors.partitioningBy(
                x -> x% 2==0 ,Collectors.toList()
        ));

        System.out.println("Even Number :"+ map.get(true));
        System.out.println("Odd Number :"+ map.get(false));

        evenOddNum(number);

    }

    public static void evenOddNum (int [] numbs){
        int [] evenNum ;
        for ( int i=0;i<numbs.length;i++){
            if (numbs[i] % 2== 0){
                System.out.println("Even Number :"+ numbs[i]);
            } else {
                System.out.println("Odd Number :"+numbs[i]);
            }
        }
    }
}
