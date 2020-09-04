package pack1;
import java.util.*;
public class Strong_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number");
		int n=s.nextInt();
		int r,sum=0,fact,num=n;
		while(n!=0)
		{
			fact=1;
			r=n%10;
			for(int i=1;i<=r;i++)
			{
				fact=fact*i;
				
			}
			sum=sum+fact;
			n=n/10;
		}
		if(num==sum)
			System.out.println(num+ "is a Strong number");
		else
			System.out.println(num+ "is a not Strong number");
	}

}
