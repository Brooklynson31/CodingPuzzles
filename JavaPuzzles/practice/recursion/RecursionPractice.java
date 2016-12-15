package practice.recursion;

public class RecursionPractice {
	//Assignment
	//Recursively split a string with dollars signs, so every character is going to be split by $
	//Call method itself and recursively seperate each character in the String by dollar sign
	//Tools: substring char at
	public static void main(String[] args) {

		System.out.println(allDollars("hello")); //h$e$l$l$o
		System.out.println(allDollars("james"));  // c$a$k$e
		System.out.println(allDollars("sad")); //h$e$l$l$o

	}
	//Personal Solution
	public static String allDollars(String str){
		int i = str.length()-1; // start at the end of the string
		char d = str.charAt(i); //store last char in array before its parsed off
		if( i != 0){ //base case
			i--;  //decrement until you reach base case
			str = str.substring(0,i+1); //remove last character from the string
			str = allDollars(str); //pass parsed string to the next recursive
		}  else{
			return str; //you are at the first character in the array
		}
		char c = '$';
		return str +c + d; //return input string that has $ inserted between string and last character that was parsed earlier
		
	}
}



