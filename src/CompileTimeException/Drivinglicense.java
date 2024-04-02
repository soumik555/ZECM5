package CompileTimeException;
import java.util.Scanner;

public class Drivinglicense {
	
	
	
	
	
	static void criteria() throws Drivingabort
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age:");
		int age=sc.nextInt();
		if(age>=18)
		{
			System.out.println(" Congratulations: Car ka naam kya he BMW ?");
			
		}
		else
		{
		  throw	 new Drivingabort("Beta abhi tu khilone ka gaari se khel le abhi tu choota he!!");
		}
		
		
		
	}
	
	
	
	public static void main(String[] args) {
		try
		{
			criteria();
		}
		catch(Drivingabort d)
		{
			System.out.println(d.getmsg());
			
		}
		
	}

}

class Drivingabort extends Exception
{
	private String msg;//null
	 Drivingabort(String msg) 
	{
		 this.msg=msg;//"Beta abhi...."
		 
		
	}
	public  String getmsg()
	 {
		 return msg;
	 }
}
	
