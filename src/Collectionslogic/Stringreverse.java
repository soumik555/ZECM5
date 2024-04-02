package Collectionslogic;

import java.util.ArrayList;

public class Stringreverse {
	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		
		
		String s1="Jaava";
		String s2="";
		for(int i=s1.length()-1;i>=0;i--)
		{
			s2=s2+s1.charAt(i);
			
			
			
		}
		a1.add(s2);
		System.out.println(a1);
	}

}
