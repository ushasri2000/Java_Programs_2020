package pack2;

public class Pattern_13 {

	public static void main(String[] args) {
		char i;
		char j;
		for( i ='A'; i<='E';i++) // rows
		{
			for( j='A'; j<=i;j++) // cols
			{
				System.out.print(i); //A
			}
			System.out.println();
		}
	} }
