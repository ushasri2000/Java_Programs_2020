package pack1;
import java.util.*;

public class Volume_of_Hemisphere {
	public static void main(String[] args) 
	{
	 Scanner obj = new Scanner(System.in);
	 System.out.println("enter radius :");
	 int r = obj.nextInt();
	 double v = (2.0/3.0)*(3.14)*(r*r*r);
System.out.println("Volume of Hemisphere = "+v);
	} }


