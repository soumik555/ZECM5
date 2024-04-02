package Collectionslogic;


import java.util.TreeMap;





public class Noofoccourence {
	public static void main(String[] args) {
		int arr[]= {60,80,70,60,50,50,60,70,80,90};
		TreeMap<Integer,Integer> s1=new TreeMap();
		for(int i=0;i<arr.length;i++)
		{
			if(!s1.containsKey(arr[i]))
			{
				s1.put(arr[i], 1);
				
			}
			else
			{
				int x=s1.get(arr[i]);
				x++;
				s1.put(arr[i], x);
				
				
				
	        }

         }
		System.out.println(s1);
	}
}
