package reversearr;

public class Vowelconsonantsmethod {
	static void Vowels(String s1)
	{
		int count1=0;
		int count2=0;
		for(int j=0;j<=s1.length()-1;j++)
		{
			if(s1.charAt(j)=='a'||s1.charAt(j)=='e'||s1.charAt(j)=='i'||s1.charAt(j)=='o'||s1.charAt(j)=='u')
			{
				System.out.println("Vowels are " + s1.charAt(j));
				count1++;
				
				
			}
			if(s1.charAt(j)!='a'&& s1.charAt(j)!='e'&& s1.charAt(j)!='i'&& s1.charAt(j)!='o'&& s1.charAt(j)!='u')
			{
				System.out.println("Consonants are " + s1.charAt(j));
				count2++;
				
				
			}
			
			
			
		}
		System.out.println(" Total no of Vowels are " + count1);
		System.out.println("Total no of consonants are " + count2);
		
		
		
		
		
		
	}
	
	
	
	public static void main(String[] args) {
		String arr[]= {"Hi","Bye","Hello"};
		for(int i=0;i<arr.length;i++)
		{
			Vowels(arr[i]);
		
			
			
			
			
		}
		
		
	}

}
