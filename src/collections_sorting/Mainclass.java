package collections_sorting;

import java.util.Arrays;
import java.util.Comparator;

final class Zero extends Object
{
	String name;
	double income;
	int age;
	
	public 	Zero(String name,double income,int age)
	{
		this.name=name;
		this.income=income;
		this.age=age;
		
	}
	public String toString()
	{
		return name + " " + income + " " + age + " ";
	}
	
}


class Demo implements Comparator
{

	


	public int compare(Object o1, Object o2) {
		Zero z1=(Zero) o1;
		Zero z2=(Zero) o2;
		
		return (int)(z1.income-z2.income);
	}

	
	
}




public class Mainclass {
	public static void main(String[] args) 
	{
		Zero z3=new Zero("Soumik", 33.44, 23);
		Zero z4=new Zero("Saheb", 22.67, 45);
		Zero z5=new Zero("Sunil", 98.21, 33);
		Zero arr[]= {z3,z4,z5};
		Arrays.sort(arr,new Demo());
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
			
		}
		
	}

}

