package strings;

public class StrBuffer {

	public static void main(String[] args) {
		
		StringBuffer s = new StringBuffer("Variable");
		System.out.println(s);
		
		//Method-1 append
		s.append(" buffer");
		System.out.println(s);
		
		//Method-2 insert
		s.insert(8, 's');
		System.out.println(s);
		
		//Method-3 replace
		s.replace(10, 16, "java");
		System.out.println(s);
		
		//Method-4 substring
		System.out.println(s.substring(10));
		System.out.println(s.substring(0, 4));
		
		//Method-5 delete
		//s.delete(10, 14);
		System.out.println(s.delete(10,14));
		//System.out.println(s);
		
		//Method-6 charAt
		System.out.println(s.charAt(2));
		
		//Method-7 capacity
		System.out.println(s.capacity());
		StringBuffer b = new StringBuffer();
		System.out.println(b.capacity());
		
		//Method-8 length
		System.out.println(s.length());
		
		//Method-9 reverse
		System.out.println(s.reverse());
		
		
	}

}
