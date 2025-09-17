package _2_Array_And_Matrices;

import java.util.Arrays;

public class _2_EvenOddNumFromArray {

    public static void main(String[] args) {

        int [] number = {10,20,87,97};

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
