/*===================================================================
							클래스 고급
	- 자바에서 기본적으로 제공하는 주요 클래스들
===================================================================*/

class Test // extends Object
{
	/*
	Object의 멤버들
	*/

	private int a = 10;

	public void write()
	{
		System.out.println("a : " + a);
	}
}


public class Test128
{
	public static void main(String[] args)
	{
		Test ob1 = new Test();
		Test ob2 = new Test();

		System.out.println("10 == 9 : " + (10 == 9));
		// → 10 == 9 : false

		int a = 10;
		int b = 10;
		System.out.println("a == b : " + (a == b));
		// → a == b : true

		// ------------------ 『==』 비교 연산자는 피연산자의 크기를 비교한다는 것을 확인

		System.out.println("ob1 == ob2 : " + (ob1 == ob2));
		// → ob1 == ob2 : false

		// ------------- 『==』 비교 연산자는 객체(Object)의 크기를 비교할 때 주소를 비교


	}
}