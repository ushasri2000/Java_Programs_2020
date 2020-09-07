package pack1;
import java.util.*;
public class Ugly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter number");
		int n=s.nextInt();
		if(n%2==0 || n%3==0 || n%5==0){
			System.out.println("an ugly number");
		}
		else{
				System.out.println("not an ugly number");
		}
	}

}

