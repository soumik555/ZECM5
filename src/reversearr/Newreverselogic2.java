package reversearr;//i/p={"Hello","Java","Jdbc"}
                   //o/p= {"avaJ","cbdJ","olleH"}

public class Newreverselogic2 {
	static void array()
	{
		String arr[]= {"Hello","Java","Jdbc"};	
		String acc[]=new String[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=reverse(arr[i]);
			
		}
		acc[0]=arr[1];
		acc[1]=arr[2];
		acc[2]=arr[0];

		for(int i=0;i<acc.length;i++)
		{
			System.out.println(acc[i]);
			
			
		}
	}
	
	
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
		array();
		
	}
}
	


	
	
	
	
	
	
	


