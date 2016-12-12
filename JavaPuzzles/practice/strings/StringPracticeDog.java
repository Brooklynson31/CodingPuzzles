package practice.strings;

public class StringPracticeDog {

	public static void main(String[] args) {

	
		System.out.println(dogTrouble(true,6));
		System.out.println(dogTrouble(true,7));
		System.out.println(dogTrouble(false,6));

		
	}
	//Assignment: Write a method so that it return true when the dog is barking before 7 or after 20 on a scale
	//that ranges for 0-23
	public static boolean dogTrouble(boolean barking, int hour){
		boolean inTrouble = false;
		
		if(barking & (hour < 7)){
			inTrouble = true;
		}
		else if(barking & (hour > 20)){
			inTrouble = true;
		}
		
		return inTrouble;
	}
//more concise way writing method
//return (barking && (hour < 7 || hour > 20 ));
}
