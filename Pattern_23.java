package pack2;

public class Pattern_23 {

	public static void main(String[] args) {
		for(int i='A'; i <= 'E';i++) // 5 rows
		{
			for(int j= 'E'; j >= i; j--) // 5,4 cols
			{
				System.out.print((char)j+" "); 
			}
			System.out.println(); //nextline
		}
} }
