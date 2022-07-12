/*=========================================================
					클래스와 인스턴스
	- 생성자(Constructor)
=========================================================*/

public class Test076
{
	int x;

	Test076()
	{
		// ★생성자 내부에서 다른 생성자 호출하는 것은 가능★
		//	 단, 생성자 내부에서 가장 먼저 실행되어야 함

		// 생성자 내부에서 또다른 생성자를 호출하는 구조
		// Test076(100);									// -- Test076으로 이름이 같기 때문에 X
		this(100);											// -- 얘 말고 int x를 가진 Test076 메소드

		x = 10;												// 전역변수 x

		System.out.println("인자 없는 생성자");
		// System.out.println("Test076이 갖고 있는 x : " + this.x)
		System.out.println("Test076이 갖고 있는 x : " + x);			// 전역변수 x
	}

	// Test076(int num)
	Test076(int x)
	{
		// x = num;
		//x = x;											// -- 둘 다 지역변수 x

		// 『this』키워드가 필요

		// Test076.x = x;
		this.x = x;											// 전역변수 x = int x이다.

		System.out.println("인자가 하나인 생성자");
		System.out.println("Test076이 갖고 있는 x : " + this.x);
	}

	// 메소드는 이름이 같더라도 매개변수의 타입이나 갯수가 다르면 식별자로서 기능을 하기 때문에 괜찮다
	// → 메소드 오버로딩 (메소드 중복 정의)

	public static void main(String[] args)
	{
		// Test076 클래스 기반 인스턴스 생성
		Test076 ob1 = new Test076();					// → 인자 없는 생성자
		Test076 ob2 = new Test076(100);					// → 인자가 하나인 생성자

		// 출력 결과
		/*
			인자가 하나인 생성자								// line 17			// line 47
			Test076이 갖고 있는 x : 100							// line 17			// line 47
			인자 없는 생성자														// line 47
			Test076이 갖고 있는 x : 10												// line 47
			인자가 하나인 생성자													// line 48
			Test076이 갖고 있는 x : 100												// line 48
			계속하려면 아무 키나 누르십시오 . . .
		*/

		System.out.println();
		System.out.println("main 에서 ob1.x : " + ob1.x);
		System.out.println("main 에서 ob2.x : " + ob2.x);
		
	}
}

