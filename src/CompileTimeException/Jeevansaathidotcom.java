package CompileTimeException;
import java.util.Scanner;

public class Jeevansaathidotcom {
	
	static void condition() throws JeevanException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age:");
		int age=sc.nextInt();
		
		
		if(age>=18)
		{
			System.out.println("Mithaii kab khilao ge?");
			
		}
		else
		{
		  throw	 new JeevanException("Ghaar jaa bhaag ja site se");
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		try
		{
			condition();
			
		}
		catch(JeevanException j)
		{
			System.out.println(j.getmsg());
			
		}
		
		
		
		
	}
	

}
class JeevanException extends Exception
{
	private String msg;
	public JeevanException(String msg) 
	{
		this.msg=msg;
	
	}
	public String getmsg()
	{
		return msg;
	}
}
