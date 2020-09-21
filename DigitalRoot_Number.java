package pack1;
import java.util.*;
class DigitalRoot {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter number");
		int n = sc.nextInt(); // n = 99999
		int sum=0;
		while(n>0 || sum>10){
			if(n==0){
				n=sum;
				sum=0;
			}
			int r=n%10;
			sum=sum+r;
			n=n/10;
		}
		System.out.println("Digital Root of"+n+"is"+sum);
	}
}