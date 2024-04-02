package StringBufferandStringBuilder;

public class Strings2 {
	public static void main(String[] args) {
		StringBuffer s1=new StringBuffer("Jaava");
		char c[]= {'a','b'};
		System.out.println(s1.reverse());
		System.out.println(s1.append("Mava"));//concat
		System.out.println(s1.replace(0,2,"fb"));
		System.out.println(s1.append(c));
	}

}
