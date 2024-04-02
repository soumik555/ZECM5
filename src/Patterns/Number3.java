package Patterns;

public class Number3 {
	public static void main(String[] args) {
		
		
		int n = 5; // Number of rows

        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n; j++)
            {
                if (j < n - i)
                {
                    System.out.print(j + 1);
                } 
                else
                {
                    System.out.print(n - i);
                }
            }
            System.out.println();
        }
	}

}
