package assignment_04;

import ignore.TestingUtils;

public class App {

	/**
	The birds in Florida like to sing during favorable temperatures. 
	In particular, they sing if the temperature is between 60 and 90 (inclusive). 
	Unless it is summer, then the upper limit is 100 instead of 90. 
	Given an int temperature and a boolean isSummer, 
	return true if the birds are singing and false otherwise. <br>
	<br>

	 * <b>EXPECTATIONS:</b><br>
		birdsSinging(70, false)   <b>---></b> true <br>
		birdsSinging(95, false)    <b>---></b> false <br>
		birdsSinging(95, true) <b>---></b> true <br>
	 */
	//personal solution
	public static boolean birdsSinging(int temp, boolean isSummer) {
		boolean birdsSinging = false;
		int minTemp = 60;
		int maxTemp = 90;
		if(isSummer){
			maxTemp+= 10;
		}
		
		if(temp >= minTemp && temp <= maxTemp){
			birdsSinging = true;
		} else{
			birdsSinging = false;
		}
		
		
		return birdsSinging;		
	}
	
	//Instructor Solution
	public static boolean birdsSinging2(int temp, boolean isSummer){
		
		if(isSummer){
			return(temp >= 60 && temp <= 100);
		}
		return(temp >= 60 && temp <- 90);
	}
	
	//Ternanry Operator Example
	public static boolean birdsSinging3(int temp, boolean isSummer){
		return(isSummer) ? (temp >= 60 && temp <= 100): (temp >= 60 && temp <= 90);
	}
	
	
	
	
	
	
	
	//----------------------STARTING POINT OF PROGRAM. IGNORE BELOW --------------------//
	public static void main(String args[]){
		TestingUtils.runTests();
	}
}


