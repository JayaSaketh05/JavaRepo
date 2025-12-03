package strings;

public class StringExample {

	public static void main(String[] args) {
		// by using String literal
		String a = "hello";
		String b = "hello";
		
		// by using new keyword
		String c = new String("hello");
		String d = new String("hello");
		
		// == is used to compare objects
		System.out.println(a==b);
		System.out.println(c==d);
		
		// equals is used to compare values
		System.out.println(a.equals(b));
		System.out.println(a.equals(c));
		System.out.println(a.equals(d));
	}

}
