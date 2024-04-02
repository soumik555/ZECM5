package CompileTimeException;

public class Stockmarket {
	
	static void criteria() throws StockException
	{
		int age=12;
		if(age>=18)
		{
			System.out.println("Congrats: Demat Account Created");
			
		}
		else
		{
			 throw new StockException("Sorry you are not eligible to open a demat account");
		}
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		try
		{
			criteria();
			
		}
		catch(StockException s)
		{
			System.out.println(s.getmsg());
			
		}
		
	}

}
class StockException extends Exception
{
	private String msg;
	public StockException(String msg) 
	{
		this.msg=msg;
		
	}
	public String getmsg()
	{
		return msg;
		
	}
}
