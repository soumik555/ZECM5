package ScannerClassNonStaticMethod;
import java.util.Scanner;

public class StringReverse {
	
	void Reverse()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your String:");
		String s1=sc.nextLine();
		String s2="";
		for(int i=s1.length()-1;i>=0;i--)
		{
			s2=s2+s1.charAt(i);
			
		}
		System.out.println(s2);
		sc.close();
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		StringReverse s=new StringReverse();
		s.Reverse();
		
	}

}
