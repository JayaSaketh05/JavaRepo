package thiskeyword;

public class ThisVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisVariable obj = new ThisVariable(3);

	}
	int a=20;
	public ThisVariable(int a) {
		//this.a = a;
		System.out.println(a+" "+this.a);	
	}

}
