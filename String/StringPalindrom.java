package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringPalindrom {
	  private static boolean isStringPalindrom(String string) {
	        String reverse = "";
	        for (int i = string.length() - 1; i >= 0; i--) {
	            reverse = reverse + string.charAt(i);
	        }
	        if (string.equals(reverse)) {
	            System.out.println(reverse);
	            return true;
	        } else {
	            return false;
	        }
	  }


	public static void main(String[] args){
		
		String []str= {"aba","megha","mam"};
		 for (String string : str) {
	            if (StringPalindrom.isStringPalindrom(string)) {
	                continue;
	            }
	        }
		/*
		 * BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 * String s = new String(); System.out.println("Enter String"); s=br.readLine();
		 * int i=0,j=s.length()-1; int flag=0; while(i<j && flag==0){
		 * if(s.charAt(i)!=s.charAt(j)){ flag=1; } i++; j--; } if(flag==0)
		 * System.out.println("Palindrome"); else
		 * System.out.println("Not a Palindrome");
		 */
	    
	}

}
