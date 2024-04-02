package MethodOverloading;

public class Sample1 {
	static void fo(int a)
	{
		System.out.println("ok"+ a);
		
	}
	int fo(String b)
	{
		System.out.println("ok" + b);
		return 23;
		
	}
	String fo(int a,String b)
	{
		System.out.println("ok" + a + b);
		return "Hello";
		
	}
	public static void main(String[] args) {
		Sample1 s1=new Sample1();
		fo(90);
		s1.fo("okok");
		s1.fo(20,"bye");
		
	}
}

