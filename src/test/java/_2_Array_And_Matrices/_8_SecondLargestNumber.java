package _2_Array_And_Matrices;

public class _8_SecondLargestNumber {
	
	public static void main(String[] args) {
        int[] arr = {13, 12, 0, 2, 4, -8, 13};
        int num = secondLargest(arr);
        System.out.println(num);
		
	}
	
	public static int secondLargest(int[] arr) {
	    int max = Integer.MIN_VALUE;
	    int second = Integer.MIN_VALUE;

	    for (int num : arr) {
	        if (num > max) {
	            second = max;
	            max = num;
	        } else if (num > second && num != max) {
	            second = num;
	        }
	    }
	    return second;
	}

}
