package pack2;

public class Pattern_14 {

	public static void main(String[] args) {
		char i;
		char j;
		for( i ='A'; i<='E';i++) //5 rows
		{
			for( j='A'; j<=i;j++) // cols
			{
				System.out.print(j); //A
			}
			System.out.println();
		}
	} }
