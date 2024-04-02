package Encapsulation_Programs;

class SBI_Bank
{
	private String password="soumik@3634";
	public String getpassword()
	{
		return password;
	}
	public void setpassword(String password)
	{
		this.password=password;
		
	}
}









public class Customer2 {
	public static void main(String[] args) {
		SBI_Bank b1=new SBI_Bank();
		System.out.println("The default net banking password by the bank is " + b1.getpassword());
		b1.setpassword("Soumik@6755");
		System.out.println("The net banking new password set by the user is " + b1.getpassword());
	}

}
