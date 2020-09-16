package pack1;
import java.util.*;
public class Smith_NUmber {
	static int sum_digits(int n){
		int s=0;
		while(n>0){
			int r=n%10;   //r=6
			s=s+r;        //s=6+6+6=18
			n=n/10;       //n=66
			
		}
		return s;         //18
	}
	static int sum_prime_factors (int n){
		int i=2,sum=0;
		while(n>1){
			if(n%i==0){
				sum=sum+sum_digits(i);
				n=n/i;
			}
			else
				i++;
		}
		return sum;
		
	}
	static boolean composite(int n){
		int c=0;
		for(int i=1;i<n;i++){
			if(n%i==0)
				c++;
		}
		if(c>2)
			return true;
		else 
			return false;
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number :");
		int n=s.nextInt();  //666
		if(composite(n)==false)
			System.out.println("enter composite number");
		else
		{
		int a=sum_digits(n);
		int b=sum_prime_factors(n);
		System.out.println("sum of digits ="+a);
		System.out.println("sum of prime factors ="+b);
		if(a==b)
		System.out.println(n+"is a Smith NUmber");
		else{
			System.out.println(n+"is not a Smith Number");
		}

	}

}
	}

