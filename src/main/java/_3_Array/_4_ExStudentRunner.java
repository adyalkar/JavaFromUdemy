package _3_Array;

import java.math.BigDecimal;

public class _4_ExStudentRunner {

	public static void main(String[] args) {
		//int [] anupMarks = {98,95,96,94}
		//		_3_ExStudent student = new _3_ExStudent("Anup",anupMarks);
		
		// refactor --> Inline
		_3_ExStudent student = new _3_ExStudent("Anup",new int[] {98,95,96,94});
		System.out.println("NumberOfMark : "+student.getNumberOfMark());
		System.out.println("TotalSumOfMark : "+student.getTotalSumOfMark());
		System.out.println("Max Mark : "+student.getMaxMark());
		System.out.println("Min Mark : "+student.getMinMark());
		System.out.println("AvgMark : "+student.getAvgMark());// answer should be 95.75 as it is returning integer value
		// hence need to convert to BigDecimal to get acurate value
		
		System.out.println("---------------------------------------------------------------------------");
		
		// variable argument:
		
		_6_ExStudentVR student1= new _6_ExStudentVR("Anup" , 91,92,93);
		System.out.println("NumberOfMark : "+student1.getNumberOfMark());
		System.out.println("TotalSumOfMark : "+student1.getTotalSumOfMark());
		System.out.println("Max Mark : "+student1.getMaxMark());
		System.out.println("Min Mark : "+student1.getMinMark());
		System.out.println("AvgMark : "+student1.getAvgMark());
		
		System.out.println("---------------------------------------------------------------------------");

		
		_6_ExStudentVR student2= new _6_ExStudentVR("Kalpana" , 101,92,36,98);
		System.out.println("NumberOfMark : "+student2.getNumberOfMark());
		System.out.println("TotalSumOfMark : "+student2.getTotalSumOfMark());
		System.out.println("Max Mark : "+student2.getMaxMark());
		System.out.println("Min Mark : "+student2.getMinMark());
		System.out.println("AvgMark : "+student2.getAvgMark());
	
	}

}
