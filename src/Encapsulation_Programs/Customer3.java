package Encapsulation_Programs;

class UTS_Rail_Application
{
	private int pin=3679;
	public int getpin()
	{
		return pin;
	}
	public void setpin(int pin)
	{
		this.pin=pin;
		
	}
}






public class Customer3 {
	public static void main(String[] args) {
		UTS_Rail_Application a1=new UTS_Rail_Application();
		System.out.println("The default pin by UTS Railway is " + a1.getpin());
		a1.setpin(8789);
		System.out.println("The new pin entered by the user is " + a1.getpin());
	}

}
