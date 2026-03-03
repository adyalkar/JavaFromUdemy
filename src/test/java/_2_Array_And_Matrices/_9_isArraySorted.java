package _2_Array_And_Matrices;

public class _9_isArraySorted {
	
	public static void main(String[] args) {
        int[] arr = { 0, 2, 4, 8, 13};
        boolean b = isSorted(arr);
        System.out.println(b);
		
	}
	
	public static boolean isSorted(int[] arr) {
	    
		for (int i=1;i<arr.length;i++) {
			
			if (arr[i]<arr[i-1]) {
				return false;
			}
			}
		
		return true;
		}

}
