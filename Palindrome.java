package Strings;
import java.util.*;
public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter string:");
		String str = sc.next(); // str = madam
		String rev ="";
		
		int len = str.length(); // len = 5
		for(int i = len-1; i>=0; i--)
			rev = rev + str.charAt(i); // rev = madam
		
		if(str.equals(rev))
		System.out.println("Palindrome");
		else
			System.out.println("Not a Palindrome");
} }

