package thiskeyword;

public class ThisConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisConstructor obj = new ThisConstructor();

	}
	
	ThisConstructor() {
		this(10); //this keyword should be declared in the first line of constructors
		System.out.println("First Constructors");
	}
	ThisConstructor(int a){
		System.out.println(a);
	}

}
