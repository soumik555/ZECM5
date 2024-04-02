package StringFunctions;

public class Stringspecialcharacters4 {
	public static void main(String[] args) {

		String s1="Java ! ! 3";
		int count=0;
		for(int i=0;i<s1.length();i++)
		{
			if(Character.isWhitespace(s1.charAt(i))&&!Character.isDigit(s1.charAt(i)))
			{
				count++;
				
			}
			
		}
		System.out.println(count);
	}

}
