import java.util.*;
import acm.program.*;

public class StringProcessing {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.print("Enter a numeric string: ");
			String digits = scanner.nextLine();
			if (digits.length() == 0) {
				System.out.println("Thanks for playing.");
				break;
			}
			System.out.println(CommasToNumericString(digits));
		}
	}

	private static String CommasToNumericString(String input) {

		String empty = "";
		String x = reverseString(input);
		for (int i = x.length(); i >= 1; i--) {
			if (i % 3 == 0 && i != 0) {
				char com = ',';
				if(x.length() != i) {
				empty += com;
				}
		
			}
			empty += x.charAt(i - 1);

		}

		return empty;

	}

	private static String reverseString(String str) {
		String string = "";
		for (int i = str.length(); i >= 1; i--) {
			string += str.charAt(i - 1);

		}
		return string;
	}
	

}

