package pack1;
import java.util.*;

public class Unique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number");
		int no=s.nextInt();
		int c,flag=0,n=no;
		for(int i=0;i<=9;i++){
			no=n;
			c=0;
			while(no!=0){
				int r=no%10;
				if(r==i){
					c++;
				}
				no=no/10;
					
			}
			if(c>1){
				flag=1;
				break;
			}
	
		}
		if(flag==0)
			System.out.println("a unique number");
			else
		System.out.println("not a unique number");//1123
			
	}

}
