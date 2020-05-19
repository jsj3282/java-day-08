package day08;

import java.util.Scanner;

class MethodTest_04{
	public int sumFunc(int num, int su) {
		int sum = 0;
		sum = num + su;
		return sum;
	}
}
public class Test08 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		MethodTest_04 mt = new MethodTest_04();
		int num, su;
		System.out.print("수 입력 : ");
		num = input.nextInt();
		System.out.print("수 입력 : ");
		su = input.nextInt();
		int sum = mt.sumFunc(num, su);
		System.out.println(num + "+" + su + "=" + sum + "입니다.");

	}

}
