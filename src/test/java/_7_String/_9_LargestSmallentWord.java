package _7_String;

public class _9_LargestSmallentWord {
	
	public static void main(String[] args) {
		String str = "Anup Chandrabhan Adyalkar";
		method1(str);
		
	}
	
	public static void method1(String str) {
		
		String largest = "";
		String smallest = "";
		
		int tempL = Integer.MIN_VALUE; 
		int tempS = Integer.MAX_VALUE;
		
		for (String s : str.split(" ")) {
			
			
			if (s.length()>tempL) {
				tempL = s.length(); 
				largest = s;
			} 
		    if (s.length()<tempS) {
				tempS = s.length();
				smallest = s;
			}
		}
		
		System.out.println(largest +" ---- " + smallest);
	}

}
