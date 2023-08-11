package _3_Array;

import java.math.BigDecimal;

public class _3_ExStudent {

	private String name;
	private int [] mark;
	
	_3_ExStudent(String name,int [] mark){
		this.name=name;
		this.mark=mark;		
	}
	
	public int getNumberOfMark() {
		int numberOfMark = mark.length;
		return numberOfMark ;
	}
	
	public int getTotalSumOfMark() {
		int sum=0;
		for(int x:mark) {
			sum=sum+x;
		}
		return sum;
	}
	
	public int getMaxMark() {
		int max = Integer.MIN_VALUE;
		for(int x : mark) {
			if(x>max) {
				max=x;
			}
		}
		return max;
	}
	
	public int getMinMark() {
		int min = Integer.MAX_VALUE;
		for(int x:mark) {
			if(x<min) {
				min=x;
			}
		}
		return min;
	}
	
	public BigDecimal getAvgMark() {
		int sum = getTotalSumOfMark();
		int num = getNumberOfMark();
		return new BigDecimal(sum).divide(new BigDecimal(num));
	}
	
}
