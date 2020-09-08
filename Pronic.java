package pack1;
import java.util.*;
public class Pronic {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number");
		int n=s.nextInt();
		int flag=0;
		for(int i=0;i<n;i++){
			if((i*(i+1))==n){
				flag=1;
			}
		}
		if(flag==1)
			System.out.println("pronic number");
		else
			System.out.println("not a pronic number");
	}

}
