package assignment_03;

import ignore.TestingUtils;

public class App {

	
	/**
	 * Given three ints, a b c, return true if it is possible to add two of 
	 * the ints to get the third. There should only be a single line of code in the method body.<br>
	 * <br> 
	 *
	 * <b>EXPECTATIONS:</b><br>
		twoSumOne(1, 2, 3)   <b>---></b> true <br>
		twoSumOne(3, 1, 2)    <b>---></b> true <br>
		twoSumOne(3, 2, 2) <b>---></b> false <br>
	 */
		//Personal Solution
		public static boolean twoSumOne(int a, int b, int c) {
			return  (a+b==c) || (c+a==b) || (b+c==a)    ;

		}
		
		//Instructor Solution
		public static boolean twoSumOne2(int a, int b, int c) {
			return  (a+b==c) || (c+a==b) || (b+c==a)    ;

		}

		
	
	
	
	
	
	
	
	
	
	//----------------------STARTING POINT OF PROGRAM. IGNORE BELOW --------------------//
		public static void main(String args[]){
			TestingUtils.runTests();
		}
			

}
