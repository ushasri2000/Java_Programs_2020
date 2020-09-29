package pack2;

public class Pattern_15 {

	public static void main(String[] args) {
		for(int i =1; i<=5;i++) // 5 rows, i=2
		{
			for(int j=5; j>=i;j--) // 5 cols
			{
				System.out.print("*"); //*****
			}
			System.out.println();
		}
	} }
