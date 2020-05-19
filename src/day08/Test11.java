package day08;


class MethodTest_06{
	public String big(int x, int y) {
		if(x>y)	return x+"이 " + y +"보다 크다";
		else if(y>x)	return y+"이 " + x + "보다 크다";
		else	return x+"과 " + y + "는 같다.";
	}
}
public class Test11 {

	public static void main(String[] args) {
		MethodTest_06 mt = new MethodTest_06();
		String str = null;
		str = mt.big(100, 200);
		System.out.println("결과 값 : " + str);

	}

}
