package pack1;
import java.util.*;

public class Area_of_Rhombus {
	public static void main(String[] args) 
	{
	  Scanner sc = new Scanner (System.in);
	  System.out.println("enter 2 diagonals :");
	  int d1 = sc.nextInt();
	  int d2 = sc.nextInt();
	  double a = (1.0/2.0)*d1*d2;
	  System.out.println("Area of Rhombus = "+a);
	}
}


