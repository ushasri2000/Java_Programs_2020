package pack2;

public class Pattern_8 {

	public static void main(String[] args) {
		char i;
		char j;
		for( i ='E'; i>='A';i--) // rows
		{
			for( j='E'; j>='A';j--) // cols
			{
				System.out.print(i); //EEEEE
			}
			System.out.println();
		}
	} }
