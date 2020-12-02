package Strings;
import java.util.*;
public class Camel_Count {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter String: ");
		String input = in.next(); // thisIsJavaCoding
		
		int len = input.length();  // len = 16
		
		if(len == 0)
		{
			System.out.println(0);
		}
		
		int count = 1;
		
		for(int i =0; i<len; i++)
		{
			char c = input.charAt(i);
			if( 'A' <= c && c <='Z')
				count++; // 2
			else if(c == ' ')
				break;				
		}
		System.out.println(count);
	} }
