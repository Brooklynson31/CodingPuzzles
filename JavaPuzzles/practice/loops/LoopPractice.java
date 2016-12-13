package practice.loops;

public class LoopPractice {

	public static void main(String[] args) {

		//Create a method that will extract part of a String
		//extract all categories from the String argument
		
		String str = "We have a large inventory of things in our warehouse"
		+ "the category:apparal and the slightly " 	
		+ "more in demand category:makeup along with the category:furniture and --";
		
		printCategories(str);
		
		//Tools : while loop, indexOf, substring
	}

	
	public static void printCategories(String str){
		int categoryEnd = str.indexOf("category:"); //get index or first occurence of "category:"
		while (categoryEnd != -1){ //continue to loop until pointer is 0
			str = str.substring(categoryEnd+9, str.length()-1); //cut string starting after category:
			categoryEnd = str.indexOf("category:"); //find index of next occurence of category
			System.out.println(extractWord(str));  //print word that follows category
		}
	}
	
	public static String extractWord(String word){ //extracts all characters before a blank space
		int iterator = 0; //beginning of string
		String cat = ""; 
		while( word.charAt(iterator) != ' '){ //continue to loop until you reach blank space
			cat += word.charAt(iterator);  //concatenate the letters until you reach empty space
			iterator++;
		}
		
		return cat;
	}
}
