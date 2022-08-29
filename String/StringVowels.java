package String;

public class StringVowels {

	public static void main(String[] args) {
		StringVowels rv=new StringVowels();
        System.out.println(rv.removeVowels("Meghauiaas"));
        	
	}
	private String removeVowels(String str) {
        
        char[] charArray = str.toCharArray();
        String returnStr = "";
        
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == 'a' || charArray[i] == 'e' || charArray[i] == 'i' || charArray[i] == 'o'
                    || charArray[i] == 'u') {
                charArray[i] = ' ';    
            }
        }
        for (char c : charArray) {
            if (c != ' ')
                returnStr += c;
        }
        return returnStr;
    }

}
