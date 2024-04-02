package MethodOverriding;// Case1 subclass implementation

class Whatsapp_v1
{
	void sendstatus()
	{
		System.out.println("status for 30 secons");
	}
}
class Whatsapp_v2 extends Whatsapp_v1
{
	void sendstatus ()
	{
		
		System.out.println("status for 15 seconds");
		
		
	}
	
}
















public class Main3 {
	public static void main(String[] args) {
		Whatsapp_v2 a1=new Whatsapp_v2();
		a1.sendstatus();
		
		
	}

}
