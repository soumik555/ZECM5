package Logics;
import java.util.Scanner;

public class stringRepeated 
{
	static void Repeat()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the word: ");//jaava
		int count=0;
		String s1=sc.next();
		char[]ch=s1.toCharArray();
		System.out.println("enter the letter which should we count");//a
		String s2=sc.next();
		char ch2[]=s2.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			for(int j=0;j<ch2.length;j++)
			{
				if(ch[i]==ch2[j])
				{
					
					
					count++;
					
				}
				if(count>1)
				{
					System.out.println(ch[i]+" is repeated for "+count+" times");
					
				}
			}
			
			;
		}
		sc.close();
	}
	
	public static void main(String[] args) 
	{
		Repeat();
		
	}
}
