package String;

public class RepeatedCharacter {

	public static void main(String[] args) {

		String string1 = "kjhyuhjjkk";
		int count;

		char string[] = string1.toCharArray();
		System.out.println("Duplicate characters in a given string:");

		for (int i = 0; i < string.length; i++) {
			count = 1;
			for (int j = i + 1; j < string.length; j++) {
				if (string[i] == string[j] && string[i] != ' ') {
					count++;
					// set string[j] to 0 avoid printing visited character
					string[j] = '0';
				}
			}

			// A character is consider as duplicate if count is greater than 1
			if (count > 1 && string[i] != '0')
				System.out.println(string[i]);
			/*
			 * int count=0; char[] ch=s1.toCharArray(); for (int i = 0; i < ch.length-1;
			 * i++) { for (int j = i+1; j < ch.length; j++) { if(ch[i]==ch[j]) { count++; }
			 * break; }
			 * 
			 * } System.out.println(count);
			 */
		}
	}

}
