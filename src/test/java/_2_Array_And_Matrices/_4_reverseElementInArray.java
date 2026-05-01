package _2_Array_And_Matrices;

public class _4_reverseElementInArray {

    public static void main(String[] args) {

        int [] arr = {10, 12 , 0 , 2 , 4 , -8 , -2};
//        reverseElement(arr);  // call the method to reverse

        reverseElement2(arr); // call the second method to reverse in place

    }

    public static void reverseElement(int [] numbs) {

        int size = numbs.length;               // find the size of the array
        
        System.out.println(size);

        int [] revNum = new int[size];         // create a new array to store reversed elements

        // copy elements from original array to new array in reverse order
        for (int i = 0; i < size; i++) {
            revNum[i] = numbs[size - 1 - i];   // take from the end and put into the front
        }

        // print the reversed array
        System.out.println("Reversed Array: ");
        for (int i = 0; i < size; i++) {
            System.out.println(revNum[i]);
        }
        
    }

    public static void reverseElement2(int[] arr) {
        int left = 0, right = arr.length - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        for (int x:arr){
            System.out.println(x);
        }
    }
}



