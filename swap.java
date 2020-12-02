package Strings;
import java.util.*;
public class swap {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 2 strings");
		String a = sc.next(); // suresh
		String b = sc.next(); // kolagadi
		System.out.println("Before Swapping a = "+a+" and b = "+b);

		//concatenate a and b values
		a = a+b; // sureshkolagadi
		
		b = a.substring(0,a.length() - b.length());
		// b = suresh - 6
		
		a = a.substring(b.length());
		// a = kolagadi
		
		System.out.println("After Swapping a= "+a+" and b= "+b);		
	}  }
