package Encapsulation_Programs;

class Qspider
{
	private String pin="soum3245";
	public String getpin()
	{
		return pin;
	}
	public void setpin(String pin)
	{
		this.pin=pin;
		
	}
}



public class Customer4 {
	public static void main(String[] args) {
		Qspider q1=new Qspider();
		System.out.println("The given pin by Qspider is " + q1.getpin());
		q1.setpin("Rick@1567");
		System.out.println("The newly entered pin by the User is " + q1.getpin());
	}

}
