package pack2;

public class Pattern_22 {

	public static void main(String[] args) {
		for(int i='E'; i>='A';i--) // 5 rows
		{
			for(int j= 'A';j<=i; j++) // 5,4 cols
			{
				System.out.print((char)i+" "); 
			}
			System.out.println(); //nextline
		}
	} }
