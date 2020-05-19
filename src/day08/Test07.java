package day08;

import java.util.Scanner;

class MethodTest_03{
	public void sumFunc(int num, int su) {
		int sum = 0;
		sum = num + su;
		System.out.print("두 수의 합 : " + (sum));
	}
}
public class Test07 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		MethodTest_03 mt = new MethodTest_03();
		int num, su;
		System.out.print("수 입력 : ");
		num = input.nextInt();
		System.out.print("수 입력 : ");
		su = input.nextInt();
		mt.sumFunc(num, su);
	}

}
