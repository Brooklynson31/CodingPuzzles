package assignment_15;

import ignore.TestingUtils;

public class App {


	/**
	 * 
	Given a string, return the length of the longest streak of the same chars in the string. 

	<br>
	<br>

	 * <b>EXPECTATIONS:</b><br>
		longestStreak("hayyeu") <b>---></b> 2<br>
		longestStreak("XPNzzzddOOOxx")  <b>---></b> 3 <br>
		longestStreak("")  <b>---></b> 0 <br>
	 */
	
	//2 loops nested
	//loop over every character in the String
	//compare with every character in the String 
	//for every char in String compare with rest of String
	
	public static int longestStreak(String str) {
		int beststreak = 0;
		for(int i =0; i < str.length();i++){
				int newstreak = 0;
				for(int j = i; j < str.length();j++){
					if(str.charAt(j) == str.charAt(i) )
						newstreak++;
					else break; //ends loop once consecutive streak ends 
				}
				if(newstreak > beststreak)
					beststreak = newstreak;
		}
		return beststreak;
	}
	
	//Instructor Solution
	public static int longestStreak2(String str) {
		int max = 0;
		for(int i =0; i < str.length();i++){
				int count = 0;
				for(int j = i; j < str.length();j++){
					if(str.charAt(j) == str.charAt(i)) 
							count++;
					else
						break;
				}
				if(count > max){
					max = count;
				}
		}
		return max;
	}

	
	
	
	
	
	
	
	

	
	//----------------------STARTING POINT OF PROGRAM. IGNORE BELOW --------------------//
	public static void main(String args[]){
		TestingUtils.runTests();
		
	}
}

