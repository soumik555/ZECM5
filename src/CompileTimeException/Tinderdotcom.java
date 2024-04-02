package CompileTimeException;

public class Tinderdotcom 
{
	static void criteria() throws TinderException
	{
		int age=16;
		if(age>=18)
		{
			System.out.println("Beta Badha Ho Gayaa");
			
		}
		else
		{
	      throw new TinderException("Abhi tu school me ja padhaii kar le");
		}
		
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) 
	{
		try
		{
			criteria();
		}
		catch(TinderException t)
		{
			System.out.println(t.getmsg());
			
		}
		
		
	}

}
  class TinderException extends Exception
{
	  private String msg;
	  
	  public TinderException(String msg) 
	  {
		  this.msg=msg;
		
	}
	  public String getmsg()
	  {
		  return msg;
	  }
	
}
