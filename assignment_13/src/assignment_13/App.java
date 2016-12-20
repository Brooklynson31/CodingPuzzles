package assignment_13;

import ignore.TestingUtils;

public class App {


	/**
	 * 
	Given an array of strings, return the count of the number of strings with the given length	<br>
	<br>

	 * <b>EXPECTATIONS:</b><br>
		wordsCount({"a", "bb", "b", "ccc"}, 1) <b>---></b> 2<br>
		wordsCount({"a", "bb", "b", "ccc"}, 3) <b>---></b> 1 <br>
		wordsCount({"a", "bb", "b", "ccc"}, 4) <b>---></b> 0 <br>
	 */
	//Personal Solution
	public static int wordsCount(String[] words, int len) {
		int result = 0;
		for(String a: words){
			if (a.length() == len){
				result++;
			}
		}
		return result;
	}
	
	//Instrutor Solution
	public static int wordsCount2(String[] words, int len) {
		int count = 0;
		for(int i =0; i < words.length;i++){
			if(words[i].length() == len){
				count++;
			}
		}
		return count;
	}

	
	
	
	
	
	
	
	

	
	//----------------------STARTING POINT OF PROGRAM. IGNORE BELOW --------------------//
	public static void main(String args[]){
		TestingUtils.runTests();
		
	}
}
