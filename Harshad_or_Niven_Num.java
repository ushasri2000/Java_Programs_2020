package pack1;
import java.util.*;
public class Harshad_or_Niven_Num {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=s.nextInt();
		int rem,sum=0,c=n;
		while(n>0){
			rem=n%10;
			sum=sum+rem;
			n=n/10;
		}
		if(c%sum==0)
			System.out.println("Harshad Number");
		else
			System.out.println("Not a Harshad Number");
		
	}

}
