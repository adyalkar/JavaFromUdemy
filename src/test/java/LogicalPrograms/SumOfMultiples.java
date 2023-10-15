package LogicalPrograms;

public class SumOfMultiples {
	
	public static void main(String[] args) {
		
		int answer = CalculateSumOfMultiple(33);
		System.out.println("Answer: "+ answer);
		
	}
	
	public static int CalculateSumOfMultiple(int n) {
		
		int sum = 0;
		for (int i=0;i<=n;i++) {
			
			if (i%3==0 || i%5==0) {
				sum=sum+i;
			}
			
		}
		return sum;
	}

}
