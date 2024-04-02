package reversearr;

public class NewvowelsLogic {
	
	static void vowels(String s)
	{
		int count=0;
		for(int j=0;j<s.length();j++)
		{
			if(s.charAt(j)=='a'||s.charAt(j)=='e'||s.charAt(j)=='i'||s.charAt(j)=='o'||s.charAt(j)=='u')
			{
				count++;
				
			}
			
			
		}
		System.out.println("No of vowels is " + count);
		int fact=1;
		for(int k=0;k>=count;k--)
		{
			fact=fact*k;
			
		}
		System.out.println(fact);
		
	}
	public static void main(String[] args) {
		String arr[]= {"Hi","Hello","Bye","Hii","Hey"};
		for(int i=0;i<arr.length;i++)
		{
			vowels(arr[i]);
			
		}
		
	}

}
