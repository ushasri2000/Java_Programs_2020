package pack1;
import java.util.*;

public class Fully_even_Odd_Mixed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number");
		int n=s.nextInt(); //n=1234
		int r,ce=0,co=0;
		while(n>0)
		{
			r=n%10; //1234%10=4
			if(r%2==0) //4 is even
				ce=ce+1; //ce=1
			else if(r%2!=0)
				co=co+1;
			n=n/10;		
		}
		if(ce==0)
			System.out.println("number is fully odd");
		else if(co==0)
			System.out.println("number is fully even");
		else if(ce==co || ce>co || ce<co)
			System.out.println("number is mixed");
		

	}

}
