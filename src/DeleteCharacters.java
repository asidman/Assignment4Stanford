import java.util.*;
import acm.program.*;


public class DeleteCharacters {
	
	public static void main(String [] args) {
		
		removeAllOccurrences("This is a test", 't'); 
		removeAllOccurrences("Summer is here!", 'e'); 
		removeAllOccurrences("---0---", '-');
	}
	public static void removeAllOccurrences(String str, char ch) {
		String x = " ";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ch) {
				  x = x + str.charAt(i);
		}
		}
		System.out.println(x);
	}
}
		
		
		
		
		
		
		

