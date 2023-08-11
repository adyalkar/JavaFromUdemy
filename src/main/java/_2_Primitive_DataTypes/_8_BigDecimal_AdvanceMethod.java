package _2_Primitive_DataTypes;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class _8_BigDecimal_AdvanceMethod {

	public static void main(String[] args) {
		//Rounding Mode :-
		BigDecimal a = new BigDecimal("23.128999");
		BigDecimal b = a.setScale(2, RoundingMode.HALF_EVEN);
		System.out.println(b);//23.13
		
		
	}

}
