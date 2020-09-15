package pack1;
import java.util.*;
public class karprekar_Number {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number :");
		int n = s.nextInt();
		int square=n*n,firstnumb=0,secondnumb=0,sum=0,count=0;
		int temp=square;
		while(temp!=0){
			count++;
			temp=temp/10;	
		}
		for(int i=count-1;i>0;i--){
			firstnumb=square/(int)Math.pow(10,i);    //2025/10=202
			secondnumb=square%(int)Math.pow(10, i);  //2025%10=5
			if(firstnumb==0 || secondnumb==0)
				continue;
			sum=firstnumb+secondnumb;
			if(sum==n){
				System.out.println(n+"is a karprekar number :");
			break;
			}
		}
			if(sum!=n)
				System.out.println(n+"is not a karprekar number :");	
		
	}
}
