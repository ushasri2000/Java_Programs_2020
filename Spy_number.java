package pack1;
import java.util.*;
public class Spy_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println(" enter a number:");
		int n=s.nextInt();
		int sum=0,pro=1,num=n;
		while(n!=0)
		{
			int r;
			r=n%10;
			sum=sum+r;
			pro=pro*r;
			n=n/10;
		}
		if(sum==pro)
			System.out.println(num+"is a Spy number");
		else
			System.out.println(num+"is a not Spy number");
	}

}
