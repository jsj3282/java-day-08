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
		System.out.print("나이 입력 : ");
		t.age = input.nextInt();
		System.out.print("이름 입력 : ");
		t.name = input.next();
		System.out.print("주소 입력 : ");
		t.addr = input.next();
		
		System.out.println("이름 : " + t.name);
		System.out.println("나이 : " + t.age);
		System.out.println("주소 : " + t.addr);
	}

}
