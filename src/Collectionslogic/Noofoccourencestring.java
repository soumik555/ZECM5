package Collectionslogic;

import java.util.TreeMap;

public class Noofoccourencestring {
	public static void main(String[] args) {
	  TreeMap<Character, Integer> t1=new TreeMap();
	  char arr[]= {'H','E','L','L','O'};
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
	  System.out.println(t1);
	}
}
	  



