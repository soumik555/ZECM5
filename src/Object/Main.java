package Object;//Multi-level Inheritence using Object class
 
class Sample extends Object
{
	void call()
	{
		System.out.println("Soumik calling!!");
		
	}
}
class Demo extends Sample
{
	void receive()//void call()
	{
		System.out.println("Receving the call!!");
		
	}
}
class Subclass extends Demo
{
	void sub()//void receive()
	{
		System.out.println("Testing purpose!!");
	}
}










public class Main
{
	public static void main(String[] args)
{
	Subclass d1=new Subclass();
	d1.receive();
	d1.call();
	d1.sub();
}
	

}
