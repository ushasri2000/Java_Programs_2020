package pack1;
import java.util.*;

public class Collatz_Sequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number");
		int n=s.nextInt();
		int even=n/2,odd=(3*n)+1;
		while(n!=1)
		{
			System.out.print(n+" ");
			if(n%2==0)
				n=n/2;
			else 
			    n=(3*n)+1;
			
			
		}
		System.out.println(n);
		
		
		
		
		

	}

}
