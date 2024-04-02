package Logics;
import java.util.Scanner;

public class Logic {
	
     static void repeat()
     {
    	 Scanner sc=new Scanner(System.in);
    	 System.out.println("Enter the word :");
    	 String s=sc.next();
    	 char arr[]=s.toCharArray();
    	 System.out.println("Enter the character that you want to count:");
    	 String s2=sc.next();
    	 char arr2[]=s2.toCharArray();
    	 int count=0;
    	 
    	 for(int i=0;i<arr.length;i++)
    	 {
    		 for(int j=0;j<arr2.length;j++)
    		 {
    			 if(arr[i]==arr2[j])
    			 {
    				 count++;
    				 
    			 }
    			 
    		 }
    		 
    	System.out.println(arr[i]+ " counted for " + count + " times");
    		 
    	 }
    	 
    	 
    	 
    	 sc.close();
     }
	
	
	
	public static void main(String[] args) {
		repeat();
		
	}

}
