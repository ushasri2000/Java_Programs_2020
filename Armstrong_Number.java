package pack1;
import java.util.*;
public class Armstrong_Number {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number :");
		int n=s.nextInt();
		int d=0,temp=n;
		while(n>0){
			d++;
			n=n/10;
		}
		int n1=temp;
		int sum=0;
		while(n1>0){
			int r=n1%10;
			sum=sum+((int)Math.pow(r,d));
			n1=n1/10;
		}
		if(sum==temp)
			System.out.println("Armstrong number");
		else
			System.out.println("Not an Armstrong Number");
			

	}

}
