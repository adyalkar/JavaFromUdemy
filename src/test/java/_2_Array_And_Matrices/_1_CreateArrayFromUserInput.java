package _2_Array_And_Matrices;

import java.util.Scanner;

public class _1_CreateArrayFromUserInput {

    public static void main(String[] args) {

         Scanner sc= new Scanner(System.in);
         System.out.println("Enter the size of array :");
         int n = sc.nextInt();
         int [] arr = new int [n];

        System.out.println("Enter value of array");
        for (int i = 0; i<n;i++){
            arr[i] = sc.nextInt();
        }

        for(int j=0 ; j<arr.length ; j++){
            System.out.println(arr[j]);
        }

    }
}
