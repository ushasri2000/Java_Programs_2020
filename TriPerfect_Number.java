package pack1;
import java.util.*;
public class TriPerfect_Number {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number:");
		int n=s.nextInt();
		int sum=1+n;
		int i=2;
		while(i*i<120){
			if(n%i==0){
				sum=sum+i+(n/i);
			}
			i=i+1;
		}
		if(sum==(3*n)){
			System.out.println(n+"is a TriPerfect Number");
		}
		else
			System.out.println(n+"is not a TriPerfect Number");

	}

}
