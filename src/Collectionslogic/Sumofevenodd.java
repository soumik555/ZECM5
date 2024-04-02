package Collectionslogic;

import java.util.ArrayList;



public class Sumofevenodd {
	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		ArrayList a2=new ArrayList();
		
		int sumeven=0;
		int sumodd=0;
		for(int i=15;i<=20;i++)
		{
			if(i%2==0)
			{
				sumeven=sumeven+i;
				
				
			}
			if(i%2==1)
			{
				sumodd=sumodd+i;
				
				
			}
			
			
			
		}
		a1.add(sumeven);
		a2.add(sumodd);
		System.out.println("Sum of even "  + a1);
		System.out.println("Sum of even "  + a2);
		
		
		
	}
	

}
