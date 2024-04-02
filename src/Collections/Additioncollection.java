package Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Additioncollection {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList a1=new ArrayList();
		System.out.println("Enter the 1st number:");
		int a=sc.nextInt();
		System.out.println("Enter the 2nd number: ");
		int b=sc.nextInt();
		int c=a+b;
		a1.add(c);
		System.out.println(a1);
	}

}
