package MethodOverriding;

class Whatsapp_v11
{
	void status()
	{
		System.out.println(" Status for 30 seconds ");
		
	}
}
class Whatsapp_v22 extends Whatsapp_v11
{
	void status()
	{
		super.status();
		System.out.println(" Status for 15 seconds ");
		
	}
}














public class Main {
	public static void main(String[] args) 
	{
		Whatsapp_v22 w1=new Whatsapp_v22();
		w1.status();
		
	}

}
