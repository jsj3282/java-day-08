package day08;


class MethodTest_05{
	public double avrg(int j, int k) {
		double avr = (j + k)/2.0;
		return avr;
	}
	public void showAvrg(int a, int b, double c) {
		System.out.println(a + "�� " + b + "�� ���");
		System.out.println("���� : " + c + "�Դϴ�.");
	}
}
public class Test09 {

	public static void main(String[] args) {
		MethodTest_05 mt = new MethodTest_05();
		int su1 = 10, su2 = 20;
		double avr = mt.avrg(su1, su2);
		mt.showAvrg(su1, su2, avr);

	}

}
