package StringFunctions;

public class String1 {
	public static void main(String[] args) {
		String s1="Jaava";
		String s2="Jaava";
		System.out.println(s1.charAt(3));
		System.out.println(s1.contains("a"));
		System.out.println(s1.length());
		System.out.println(s1.startsWith("J"));
		System.out.println(s1.endsWith("a"));
		System.out.println(s1.replace("a", "b"));
		System.out.println(s1.substring(0,2));
		System.out.println(s1.substring(2));
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toCharArray());
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
	

}
  }