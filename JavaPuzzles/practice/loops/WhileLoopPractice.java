package practice.loops;

public class WhileLoopPractice {

	//Create a method that will method will only print the text following any occurence of "category
	//extract all categories from the String argument
	//Should print out: apparal, makeup, furniture
	//Must use while loop, indexOf, substring
	public static void main(String[] args) {
		String str = "We have a large inventory of things in our warehouse"
		+ "the category:apparal and the slightly " 	
		+ "more in demand category:makeup along with the category:furniture and --";
		
		printCategories(str);
		printCategories2(str);
		
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
	//instructor solution
	public static void printCategories2(String str){
		int i = 0;
		while(true){
			int found = str.indexOf("category:",i);
			if(found == -1){
				break;
			}
			int start = found+9; // start of the actual string we are looking for(after categories:)
			int end = str.indexOf(" ", start); //find index of first space after string we are looking
			System.out.println(str.substring(start,end));
			i = end+1; //move past string we've already found
		}
		
	}
}
