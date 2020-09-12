package pack1;
import java.util.*;
public class Happy_Number {
	static int print(int num){
		int sum=0;
		while(num>0){
			int r=num%10;
			sum=sum+(r*r);
			num=num/10;
			
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number :");
		int n=s.nextInt();
		while(n!=1 && n!=4){
			n=print(n);
		}
		if(n==1)
			System.out.println("is a Happy number");
		else
			System.out.println("is not a number");
		
	}

}
