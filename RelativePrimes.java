package pack1;
import java.util.*;
public class RelativePrimes {
		public static void main(String[] args) 
		{
		  Scanner sc = new Scanner(System.in);
		  System.out.println("enter 2 numbers:");
		  int n1 =sc.nextInt();  //35
		  int n2 = sc.nextInt(); //48
		  int gcd = 1;
		  
		  for(int i =1; i<=n1 && i<=n2; i++ )
		  {
			  if(n1%i==0  && n2%i==0)
				  gcd = i;  // 1
		  }
		  if (gcd == 1)
				  System.out.println("Relative Primes");
		  else
			  System.out.println("Not Relative Primes");	  
		} 	}
