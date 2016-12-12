package practice.strings;

public class StringPractice2 {

	public static void main(String[] args) {

		String a = "hello";
		String b = "there";
		
		if(a == "hello"){
			//this si a trap dont do this
		}
		
		if(a.equals("hello")){
			//use this!!
		}
		
		if(b.equalsIgnoreCase("there")){
			System.out.println();
		}
		
		a.charAt(3);
	}

}
