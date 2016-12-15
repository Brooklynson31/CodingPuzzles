package assignment_02;

import ignore.TestingUtils;

public class App {

	
	/**
	 * You are driving a little too fast, and a police officer stops you. 
	 * Write code to compute the fine you would have to pay. 
	 * If your speed is 60 or less, the result is 0 since there is no fine. 
	 * If speed is between 61 and 80 inclusive, the fine is 100 dollars. 
	 * If speed is 81 or more, the result is 200. 
	 * Unless it is a holiday -- on that day, your speed can be 5 higher in all cases. <br>
	 * <br> 
	 *
	 * <b>EXPECTATIONS:</b><br>
		speedingFine(60, false)  <b>---></b> 0 <br>
		speedingFine (65, false)   <b>---></b> 100 <br>
		speedingFine (65, true) <b>---></b> 0 <br>
	 */
	
	//Personal Solution
		public static int speedingFine(int speed, boolean isHoliday) {
			if(isHoliday){
				if(speed <= 65 ){
					return 0;
				} else if (speed > 65 && speed <= 85){
					return 100;
				} else{
					return 200;
				}
			} else {
				if(speed <= 60 ){
					return 0;
				} else if (speed > 60 && speed <= 80){
					return 100;
				} else{
					return 200;
				}
			}
	
		}
		
		//Personal Solution Optimized
		public static int speedingFine2(int speed, boolean isHoliday){
			int minSpeed;
			int maxSpeed;
			if(isHoliday){
				minSpeed = 65;
				maxSpeed = 85;
				if(minSpeed < speed && speed < maxSpeed){
					return 100;
				} else if (speed > maxSpeed){
					return 200;
				}
				else{
					return 0;
				}
			}
			else{
				minSpeed = 60;
				maxSpeed = 80;
				if(minSpeed < speed && speed < maxSpeed){
					return 100;
				} else if (speed > maxSpeed){
					return 200;
				}
				else{
					return 0;
				}
			}
			
		}
		
		//Instructor Solution 
		public static int speedingFine3(int speed, boolean isHoliday){
			int minSpeed = 60;
			int maxSpeed = 80;
			int fine = 0;
			if(isHoliday){
				minSpeed +=5;
				maxSpeed +=5;
				
			}
			
			if(speed >= maxSpeed)
					fine = 200;
			if(speed <= minSpeed)
					fine = 0;
			if(speed > minSpeed && speed <= maxSpeed)
					fine = 100;
			return fine;
		}
		
		//Instructor Solution optimized
		public static int speedingFine4(int speed, boolean isHoliday){
			
			if(isHoliday){
				speed -=5;
				}
			
			if(speed <= 60)
					return 0;
			if(speed > 60 && speed <= 80)
					return 100;
			else{
				return 200;
			}
		}

	
	
	
	
	
	
	
	
	
	//----------------------STARTING POINT OF PROGRAM. IGNORE BELOW --------------------//
		public static void main(String args[]){
			TestingUtils.runTests();
		}
			

}
