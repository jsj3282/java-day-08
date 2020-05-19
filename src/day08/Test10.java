package day08;

class TestMethod{
	public void test1() {
		int a = 10, b = 20;
		test2(a, b);
		System.out.println("test1 => a : " + a);
		System.out.println("test1 => b : " + b);
	}
	public void test2(int a, int b) {
		a+=100; b+=200;
		System.out.println("test2 => a : " + a);
		System.out.println("test2 => b : " + b);
	}
}
public class Test10 {

	public static void main(String[] args) {
		TestMethod t = new TestMethod();
		t.test1();

	}

}
