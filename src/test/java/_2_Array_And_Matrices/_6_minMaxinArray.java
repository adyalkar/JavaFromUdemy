package _2_Array_And_Matrices;

public class _6_minMaxinArray {
	
	public static void main(String[] args) {
        int[] arr = {13, 12, 0, 2, 4, -8, 13};
        minMaxNumber(arr);

		
	}
	
	public static void minMaxNumber(int [] numbs) {
		
//		int tempMax = 0 ;
//		int tempMin = 0 ;
//		
//		tempMax and tempMin both start at 0
//
//		This fails if all numbers are negative or if the smallest number is positive but less than 0.
//
//		Example: array { -8, -2 } → will give max=0, min=0 (wrong).
		
		
//		Correct approach:
//
//			Initialize both tempMax and tempMin with the first element of the array (numbs[0]).
//
//			Then compare remaining elements with these.
		
		int tempMax = numbs[0];
        int tempMin = numbs[0];

		
		for (int i = 0 ; i< numbs.length ; i++) {
			if (numbs[i] > tempMax) {
				
				tempMax = numbs[i];
				
			} else if (numbs[i] < tempMin) {
				tempMin = numbs[i];
			}
		}
		
		System.out.println("Max value :" + tempMax);
		System.out.println("Min value :" + tempMin);

	}

}
