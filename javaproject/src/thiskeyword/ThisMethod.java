package thiskeyword;

public class ThisMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisMethod obj = new ThisMethod();
		obj.display();

	}
	
	public void display() {
		System.out.println("Instance method");
		this.print(1);
	}
	
	public void print(int a) {
		System.out.println(a);
	}

}
