package Collectionslogic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class Collectionautosortedarraymix2 {
	public static void main(String[] args) {
		ArrayList<Integer> a1=new ArrayList();
		int fact=1;
		for(int i=7;i>=1;i--)
		{
			fact=fact*i;
			
		}
		System.out.println(fact);
		
		String s1=String.valueOf(fact);
		char arr[]=s1.toCharArray();
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i] + " ");
			
		}
		
		
	}
		
		
	 }


