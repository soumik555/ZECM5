package reversearr;



public class Newreverselogic3 {
	static void array()
	{
		String arr[]= {"Hello","Hii","Bye","ok"};
		String acc[]=new String[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			
			
		}
		acc[3]=arr[1];
		acc[2]=arr[0];
		acc[0]=arr[3];
		acc[1]=arr[2];
		for(int j=0;j<acc.length;j++)
		{
			System.out.println(acc[j]);
			
		}
		
	}
	

	
		
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		array();
		
	}


}

