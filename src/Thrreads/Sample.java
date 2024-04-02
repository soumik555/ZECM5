package Thrreads;

 class Demo implements Runnable 
 {
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			try
			{
				Thread.sleep(2000);
				System.out.println(i);
				
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
				
				
			}
			
			
		}
		
	}
	
}





public class Sample 
{
	public static void main(String[] args) {
		Demo d1=new Demo();
		Thread t1=new Thread(d1);
		System.out.println(t1.getName());
		
		
		t1.setName("Dinga");
		System.out.println(" T1 is Alive  " + t1.isAlive() + t1.getName());
		t1.start();
		System.out.println(" T1 is Alive  " + t1.isAlive() + t1.getName());
	
	}

}
