package reversearr;

public class Newreverselogic {
	static void reverse(String s2)
	
	{
		String s3="";
		for(int j=s2.length()-1;j>=0;j--)
		{
			s3=s3+s2.charAt(j);
			
		}
		System.out.println(s3);
		
	}
	
	
	
	
	public static void main(String[] args) {
		String arr[]= {"Hello","Java","Jdbc"};
		for(int i=0;i<arr.length;i++)
		{
			reverse(arr[i]);
			
		}
		
	}

}
