package day08;

import java.util.Scanner;

class MethodTest_02{
	public void sumFunc() {
		Scanner input = new Scanner(System.in);
		int num, su;
		System.out.print("�� �Է� : ");
		num = input.nextInt();
		System.out.print("�� �Է� : ");
		su = input.nextInt();
		System.out.print("�� ���� �� : " + (num+su));
	}
}
public class Test06 {

	public static void main(String[] args) {
		MethodTest_02 mt = new MethodTest_02();
		mt.sumFunc();

	}

}
