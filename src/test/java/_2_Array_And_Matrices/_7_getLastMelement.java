package _2_Array_And_Matrices;

public class _7_getLastMelement {
	
	public static void main(String[] args) {
		  int[] arr = {13, 12, 0, 2, 4, -8, 13,12,9,87}; 
		  getLastMelement(arr , 5);
	}
	
	public static void getLastMelement (int [] numbs , int M) {
		
		int size = numbs.length;
		
		for(int i = size -1; i>=size-M;i-- ) {
			System.out.println(numbs[i]);
		}
	}

}
