package reversearr;

public class Newreverselogic4 {
	
	
	static String reverse(String s1)
	{
		String s2="";
		for(int j=s1.length()-1;j>=0;j--)
		{
			s2=s2+s1.charAt(j);
			
		}
		return s2;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		String arr[]= {"Hello","Hii","Bye","Lye"};
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.println(reverse(arr[i]));
		
			
		}
		
	}

}
