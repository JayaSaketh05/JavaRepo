package strings;

public class StringMethods {

	public static void main(String[] args) {
		// create a string by using String literal
		String a = "java";
		System.out.println(a);
		
		//1 calculate the length
		System.out.println(a.length());
		
		//2 charAt return the character at the specified index
		System.out.println(a.charAt(0));
		
		//3 equals (case sensitive)
		String b = "Java";
		System.out.println(b.equals(b));
		
		//4 equals ignore case .. it will compare only the word
		System.out.println(a.equalsIgnoreCase(b));
		
		//5 to convert various datatypes into String
		int num = 2025;
		String d = String.valueOf(num);
		System.out.println(d);
		
		//6 isEmpty it checks if the string is empty or not
		System.out.println(a.isEmpty());
		
		//7 upper case
		System.out.println(a.toUpperCase());
		
		//8 lower case
		System.out.println(a.toLowerCase());
		
		//9 contains to check if the string contains the given sequence
		System.out.println(a.contains("j"));
		
		//10 concat to join two strings
		String s = a.concat(d);
		System.out.println(s);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
