package firstreview;

public class MethodOverloading {
	
	public int sum() {
		int a = 10;
		int b = 20;
		int c = a+b;
		return c;
		//System.out.println("Sum of a & b is "+c);
	}
	
	public int sum(int a, int b) {
		int c = a+b;
		return c;
	}
	
	int a = 5;
	

	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();
		System.out.println("Sum of a & b is "+obj.sum());
		System.out.println("Sum of a & b is "+obj.sum(10,20));

	}

}
