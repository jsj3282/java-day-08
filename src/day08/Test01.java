package day08;

import java.util.Scanner;
/*
class Test{
	int age;
	String name;
	String addr;
}
*/
public class Test01 {
	static class Test{
		int age;
		String name;
		String addr;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Test t = new Test();
		System.out.print("���� �Է� : ");
		t.age = input.nextInt();
		System.out.print("�̸� �Է� : ");
		t.name = input.next();
		System.out.print("�ּ� �Է� : ");
		t.addr = input.next();
		
		System.out.println("�̸� : " + t.name);
		System.out.println("���� : " + t.age);
		System.out.println("�ּ� : " + t.addr);
	}

}
