package pack1;
import java.util.*;
public class Unhappy_Number {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number :");
		int n=s.nextInt();
		int result=n;
		int len = (int) (Math. log10(n) + 1);
		int sum=0;
		for(int i=len;i>0;i--){
			int r=n%10;
			sum=sum+(int)Math.pow(r,i);
			n=n/10;
		}
		if(sum==result)
			System.out.println("an Unhappy number");
		else
			System.out.println(" not an Unhappy number");
	}

}
