package reversearr;

public class Reversearr {
	public static void main(String[] args) {
		
	String arr[]= {"Hi","Hello","Bye","ok"};
	for(int i=0;i<arr.length;i++)
	{
		
		String s1=arr[i];
		String s2="";
		
		
		for(int j=s1.length()-1;j>=0;j--)
		{
			s2=s2+s1.charAt(j);
			
			
		}
		
		System.out.println(s2);
		
		
		
	}

}
}

