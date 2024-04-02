package Multipleinheritance;


	
	
	interface Sample
	{
		void eat();
	}
	
	interface Lample
	{
		void sleep();
	}
	
	class Dample implements Sample, Lample
	{
		 public void eat()
		{
			 System.out.println("Eaattttt");
			
		}
		 public void sleep()
		 {
			 System.out.println("Sleeppppppp");
			 
		 }
	}
	 
	
	
	
	
	
	
	
	
	 public class Multiple
	{
		
	
	
	public static void main(String[] args) 
	{
		Dample d1=new Dample();
		d1.sleep();
		d1.eat();
		
	}
	  }


