package Object;

public class Strings {
	public static void main(String[] args) {
		String s1="Java";
		String s2="Java";
		
		String s3=new String("Hello");
		String s4=new String("Hello");
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s3==s4);
		System.out.println(s3.equals(s4));
	}


}
