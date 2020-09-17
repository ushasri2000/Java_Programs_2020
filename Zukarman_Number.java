package pack1;
import java.util.*;
public class Zukarman_Number {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number :");
		int n=s.nextInt();
		int temp=n;
		int pro=1;
		while(n>1){
			int r=n%10;
			pro=pro*r;
			n=n/10;
		}
		if(temp%pro==0)
			System.out.println("is a Zukarman number :");
		else
			System.out.println("is not a Zukarman number :");
	}

}
