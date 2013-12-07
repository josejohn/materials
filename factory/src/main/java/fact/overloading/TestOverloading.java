package fact.overloading;

public class TestOverloading {

	public static void main(String[] args) {
		TestOverloading test = new  TestOverloading();
		A a = new B();
		test.fn(a);
	}
	
	public void fn(A a){
		System.out.println("a");
	}
	
	public void fn(B b){
		System.out.println("b");
	}
}
