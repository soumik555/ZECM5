package Collectionslogic;


import java.util.Map.Entry; 
import java.util.TreeMap;

public class Noofoccourancewithoutequalsto {
	public static void main(String[] args) {
		TreeMap<String, Integer> t1=new TreeMap();
		String arr[]= {"Hi","Hello","Bye","Hi","Bye","ok","Hello"};
		for(int i=0;i<arr.length;i++)
		{
			if(!t1.containsKey(arr[i]))
			{
				t1.put(arr[i], 1);
				
			}
			else
			{
				int x=t1.get(arr[i]);
				x++;
				t1.put(arr[i], x);
			}
			
		}
		
		for(Entry<String, Integer> r1:t1.entrySet())
		{
			
			if(r1.getValue()>1)
			{
				System.out.println(r1.getKey()+ " duplicated " + r1.getValue());
				
			}
			else
			{
				System.out.println(r1.getKey()+ " Unique " + r1.getValue());
				
			}
			
			
		}
		
	}

}
