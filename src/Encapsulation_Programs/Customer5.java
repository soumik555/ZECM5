package Encapsulation_Programs;

class Gmail
{
	private String suggestionemail="soumik@123";
	public String getemail()
	{
		return suggestionemail;
	}
	public void setmail(String suggestionemail)
	{
		this.suggestionemail=suggestionemail;
		
		
	}
}












public class Customer5 {
	public static void main(String[] args) {
		Gmail g=new Gmail();
		System.out.println("The default suggestion email by Gmail is " + g.getemail());
		g.setmail("soumik@7896");
		System.out.println("The given email by User is " + g.getemail());
	}

}
