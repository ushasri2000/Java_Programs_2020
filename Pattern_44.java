package pack2;

public class Pattern_44 {

	public static void main(String[] args) {
		int n =5;
		int x=1;
		int m=1;
		for(int i=1; i<=n; i++) // i = 1,2,3. 5 rows
		{
		 for(int j =n-1; j>= i; j--) // j = 4..0		
			System.out.print(" "); // 4 spaces
									
		 for(int k=1; k <= x; k++ ) // k =1,3,5,7,9
			System.out.print((char)(Math.abs(k-m)+65));  // BAB
		  // (1-2)= 1+65=66, 2-2=0+65 =65, 3-2= 1+65 = 66
								
		System.out.println();
		x= x+2; // x = 3,5,7,9		
		m++; // m=2,3
		}
	}}
