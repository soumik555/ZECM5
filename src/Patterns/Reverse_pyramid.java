package Patterns;

public class Reverse_pyramid {
	public static void main(String[] args) {
		for(int i=6;i>=1;i--)
		{
			for(int j=1;j<=6-i;j++)
			{
				System.err.print(" ");
				
			}
			for(int k=1;k<=2*i;k++)
			{
				System.err.print("*");
			}
			System.err.println();
			
		}
	}

}
