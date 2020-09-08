package pack1;
import java.util.*;
public class Adam_Number {
	static int square(int num){
		return (num*num);
	}
	static int reverse(int num){
		int rev=0;
		while(num>0){
			int rem=num%10;
			rev=rev*10+rem;
			num=num/10;	
		}
		return rev;
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number");
		int n=s.nextInt();
		int a=square(n);
		int b=square(reverse(n));
		if(a==reverse(b))
			System.out.println("An Adam number");
		else
				System.out.println("Not an Adam number");
	}
	
	

}
