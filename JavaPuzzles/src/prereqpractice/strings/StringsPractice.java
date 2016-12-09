package prereqpractice.strings;

public class StringsPractice {

	public static void main(String[] args) {
	//	System.out.println("Hello World");
		
		String a = "hello";
		System.out.println(a);
		System.out.println(a.length());
		
		String str = "ABCDEFG";
		System.out.println(str.charAt(3));

		String extractedString = str.substring(2);  //substring cuts off characters until you get input index
		System.out.println(extractedString);
		
		String str2 = str.substring(3, 6); // starts at 1st argument and goes up to but not including the 2nd argument
		System.out.println(str2);

		//Assignment:

	}

}
