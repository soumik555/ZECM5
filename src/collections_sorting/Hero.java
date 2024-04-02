package collections_sorting;

import java.util.Arrays;

public class Hero implements Comparable {

	
	
	String name;
	double income;
	int age;
	
	Hero(String name,double income,int age)
	{
		
		this.name=name;
		this.income=income;
		this.age=age;
		
	}
	
	
	
	
	
	
	public int compareTo(Object obj) 
	{
		Hero a=(Hero) obj ;//downcasting
		
		
		return this.name.compareTo(a.name);
		
	}
	public String toString()
	{
		return  name+ " " + income + "  " + age +  " " ;
	}
	
	
	
		
	
	public static void main(String[] args)
	{
		Hero h1=new Hero("dboss", 777.77, 24);
		Hero h2=new Hero("Soumik", 555.5, 23);
		Hero h3=new Hero("Yash", 444.44, 25);
		Hero arr[]= {h1,h2,h3};
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
			
		}
		
	}

	

}
