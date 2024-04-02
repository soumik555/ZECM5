package RangedPrime;

import java.util.ArrayList;

public class Rangedprimecollections {
	public static void main(String[] args) {
		ArrayList a1 =new ArrayList();
		
		for(int i=2;i<=100;i++)
		{
			boolean flag=true;
			
			
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					flag=false;
					break;
					
				}
				
			}
			if(flag==true)
			{
				a1.add(i);
				
				
			}
			
		}
		System.out.println(a1);
		
	}

}
