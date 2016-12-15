package practice.recursion;

public class RecursionPractice {
	//Assignment
	//Recursively split a string with dollars signs, so every character is going to be split by $
	//Call method itself and recursively seperate each character in the String by dollar sign
	//Tools: substring char at
	public static void main(String[] args) {

		System.out.println(allDollars2("hello")); //h$e$l$l$o
		System.out.println(allDollars("james"));  // c$a$k$e
		System.out.println(allDollars("sad")); //h$e$l$l$o

	}
	//Personal Solution
	public static String allDollars(String str){
		int i = str.length()-1; // start at the end of the string
		char d = str.charAt(i); //store last char in string before its parsed off
		if( i != 0){ //base case
			i--;  //decrement until you reach base case
			str = str.substring(0,i+1); //remove last character from the string
			str = allDollars(str); //pass parsed string to the next recursive call
		}  else{
			return str; //base case reached and return first char in String
		}
		return str +"$" + d; //return input string that has $ inserted between string and last character that was parsed earlier
		
	}
	
	//Instructor Solution
	
	public static String allDollars2(String str){
		
		if(str.length() <= 1) return str;
		
		return str.charAt(0) + "$" + allDollars2(str.substring(1));
		
	}
}



