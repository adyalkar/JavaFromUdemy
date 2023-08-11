package _3_Array;

public class _7_ExDaysOfWeek {

	public static void main(String[] args) {
		
		String [] daysOfWeek = {"Sunday","Monday","Tuesday","Wednesday","Thusday","Friday","Saturday"};
		
		//FInd max no of character
		int length=0;
		String mostNumOfChar="";
		for(String x:daysOfWeek) {
			int lengthofDays=x.length();
			if(lengthofDays>=length) {
				length=lengthofDays;
				mostNumOfChar=x;
			}		
		}
		System.out.println("Max length of day is "+ length + "  which is "+ mostNumOfChar );
		
		//Print in Reverse order
		for (int i=daysOfWeek.length-1;i>=0;i--) {
			System.out.println(daysOfWeek[i]);
			
		}
		
		// other way to find most number of character
		String mostChar="";
		int reff = Integer.MIN_VALUE;
		for (String day:daysOfWeek ) {
			if(day.length()>=reff) {
				reff=day.length();
				mostChar=day;
			}
		}
		System.out.println("Most number of character is "+mostChar + " Having length "+reff);

	}

}
