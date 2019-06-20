package com.maths.multi;

/**
 * Date- 20/06/2019
 * MultiplicationTable class gives the table from 2 to 10
 * @author Lakshmi.RC
 * version- 1.0
 */

public class MultiplicationTable {
	/**Multiplication method will perform multiplication of digits
	 * 
	 * @return the product
	 */
 int Multiplication() {
	 
	 /**
	  * res is a int type data that will hold the product value
	  */
	 int res=0;
	
	 for(int num1 = 2; num1<=10; num1++) {
		 for(int num2= 1; num2<=10; num2++) {
			 res=  (num1*num2);
		 }
	 }
	 return res;
 }
	

}
