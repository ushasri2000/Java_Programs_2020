package pack1;
import java.util.*;


public class Number_Rotation {
	static int no_of_digits(int num){
		int c=0;
		while(num>0)
		{
			c++;
			num=num/10;
		}
		return c;
	}
	static void rotation(int n){
		int digit=no_of_digits(n);
		int t=(int)Math.pow(10, digit-1);
		for (int i=0;i<digit-1;i++)
		{
		int first_digit=n/t;
		int last_pos=((n*10)+first_digit)-(first_digit*10*t);
		System.out.print(last_pos+",");
		n=last_pos;
		}
		
		
		
	}
	
	
	

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number");
		int n=s.nextInt();  //1224
		rotation(n);
		
	}

}
