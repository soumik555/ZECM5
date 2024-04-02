package Splitfunction;

public class Split2 {
	public static void main(String[] args) {
		String s1="I am a developer";
		
		
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)==' ')
			{
				System.out.println( " ");
				
			}
			else
			{
				System.out.println( "  "  + s1.charAt(i));
			}
			
		}
	}

}
