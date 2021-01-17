package String;
/*
 * Leetcode Practice: #1119. Remove Vowels from a String
 */
public class RemoveVowelsFromAString {

	public static void main(String[] args) {
		System.out.println(removeVowels("Hello World"));
		System.out.println(removeVowels("Welcome to university."));
	}

	public static String removeVowels(String string) {
		String removed = "";
		for(int i = 0; i < string.length(); i++) {
			if(String.valueOf(string.charAt(i)).toUpperCase().equals("A") ||
					String.valueOf(string.charAt(i)).toUpperCase().equals("E") ||
					String.valueOf(string.charAt(i)).toUpperCase().equals("I") ||
					String.valueOf(string.charAt(i)).toUpperCase().equals("O") ||
					String.valueOf(string.charAt(i)).toUpperCase().equals("U")) {
				continue;
			}
			removed += string.charAt(i);
		}
		return removed;
	}
}
