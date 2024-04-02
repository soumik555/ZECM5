package Object;//Method Overriding of Object Class
class Lemo extends Object
{
	public String toString()
	{
		return "Hello";
	}
}
class Memo extends Lemo
{
	public String toString()
	{
		super.toString();
		
		return "ok Bye";
		
	}
}










public class Main2 {
	public static void main(String[] args)
	{
		Memo m1=new Memo();
		System.out.println(m1.toString());
		
	}

}
