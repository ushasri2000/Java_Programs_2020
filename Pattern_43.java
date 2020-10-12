package pack2;

public class Pattern_43 {

	public static void main(String[] args) {
		int n =5;
		int x=1;
				
		for(int i=1; i<=n; i++) // i = 1,2,3. 5 rows
		{
		 for(int j =n-1; j>= i; j--) // j = 4..0		
			System.out.print(" "); // 4 spaces
									
		 for(int k=x; k >= 1; k-- ) // k =1,3,5
			System.out.print(Math.abs(k-i)); // 3 row
		 //5-3=2, 4-3=1,  3-3 = 0, 2-3= -1, 1-3= -2  
								
		System.out.println();
		x= x+2; // x = 3,5,7,9		
		}
	}}
