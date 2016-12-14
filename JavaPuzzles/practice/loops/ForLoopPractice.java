package practice.loops;

public class ForLoopPractice {
	
	//Assignment 1: Print Characters in the String backwards

	public static void main(String[] args) {

	String name = "aksjbdkasjdnbkalbnd";
	
	for(int i=name.length()-1; i >-1;i--){
		System.out.println("char: " + name.charAt(i));
	}
	
	printEvenIntegers();
		
	}
	
	//Assignment 2: Print all even numbers between 0 and 100
	public static void printEvenIntegers(){
		for(int i = 0; i < 101;i+=2){
			System.out.println(i);
		}
	}

}
