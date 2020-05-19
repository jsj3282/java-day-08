package day08;

import java.util.Scanner;

class MethodTest_02{
	public void sumFunc() {
		Scanner input = new Scanner(System.in);
		int num, su;
		System.out.print("수 입력 : ");
		num = input.nextInt();
		System.out.print("수 입력 : ");
		su = input.nextInt();
		System.out.print("두 수의 합 : " + (num+su));
	}
}
public class Test06 {

	public static void main(String[] args) {
		MethodTest_02 mt = new MethodTest_02();
		mt.sumFunc();

	}

}
