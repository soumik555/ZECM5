package CompileTimeException;

public class Votingsystem 
{
	static void condition() throws VotingException
	{
		int age=12;
		if(age>=18)
		{
			System.out.println("You can vote:");
			
		}
		else
		{
		  throw	new VotingException("Not eligible to vote go to home:");
			
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		try
		{
			condition();
			
		}
		catch(VotingException v)
		{
			System.out.println(v.getmsg());
			
		}
		
	}

}

class VotingException extends Exception
{
	private String msg;
	
	 VotingException(String msg) 
	 {
		 this.msg=msg;
		
	}
	 public String getmsg()
	 {
		 return msg;
		 
	 }
	
}

