package Constructors;

public class ConstructorOverloading 
{
	
	ConstructorOverloading(String x,int y) 
	{
		System.out.println("Constructor Overloading 1 " + x + y);
		
	}
	ConstructorOverloading(int y,String x) 
	{
		System.out.println("Constructor Overloading 2 " + y + x);
	}
	
		
	
	
	
	
	
	
	public static void main(String[] args) 
	{
		ConstructorOverloading c=new ConstructorOverloading("Soumik ", 129);
		ConstructorOverloading c1=new ConstructorOverloading(5655, " Jaava");
	}

}
