package pack1;
import java.util.*;
public class counting_digits {

	
		public static void main(String[] args) 
		{
		Scanner obj = new Scanner(System.in);
		System.out.println("enter number:");
		int num = obj.nextInt();  // n = 1234	
		int count =0;
		 //count=(int)Math.log10(num)+1 ;
		while(num != 0 ) // n = 0 != 0 -> f
		{
			num = num/10;  // num = 1/10 -> 0(quot)	
			if (num == 0)
				count++;
			++count;  // count = 4
		} 
	System.out.println("number of digits: "+ count);
		} }
	


