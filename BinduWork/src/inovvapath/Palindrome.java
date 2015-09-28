package inovvapath;
import java.util.*;

public class Palindrome {
	public static boolean isPalindrome(String s){
		String s1 = "";
		for ( int i = s.length() - 1; i >= 0; i-- )
		       s1 = s1 + s.charAt(i);

		    if (s.equals(s1))
		    {
		    	System.out.println("Yes,It is a palindrome");
		       return true;
		    }
		    else{
		    	System.out.println("No,It is not a palindrome");
		       return false;
		    }

		
	}
public static void main(String[] args){
	isPalindrome("madam");
//	String s, s1 = "";
//    Scanner in = new Scanner(System.in);
//
//    System.out.println("Enter a string : ");
//    s = in.nextLine();

//    for ( int i = s.length() - 1; i >= 0; i-- )
//       s1 = s1 + s.charAt(i);
//
//    if (s.equals(s1))
//       System.out.println("Yes, It is a palindrome.");
//    else
//       System.out.println("No, It is not a palindrome.");

}
}
