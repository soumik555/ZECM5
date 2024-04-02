package StringFunctions;

public class Stringspecialcharacters {
	public static void main(String[] args) {
		
		
		String s1="Java #@*$123";
		for(int i=0;i<s1.length();i++)
		{
			if(!Character.isAlphabetic(s1.charAt(i))&&!Character.isDigit(s1.charAt(i)))
			{
				System.out.print(s1.charAt(i));
				
			}
			
		}
	}

}
