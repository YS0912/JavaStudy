/*=========================================================
					지역변수와 전역변수
		지역 변수의 초기화 테스트
		→ Test068.java 와 비교
=========================================================*/

// 전역 변수는 초기화 과정을 거치지 않아도 사용할 수 있다.
// → 자바가 자동으로 초기화를 시켜준다.

public class Test069
{
	// 클래스의 영역
	
	// -- 전역 변수, 글로벌 변수
	int a;

	boolean b;
	char c;
	double d;

	public static void main(String[] args)
	{
		// 메소드의 영역
		
		// System.out.println("a : " + a);
		// → 컴파일 에러
		//	  non-static variable a cannot be referenced from a static context

		// Test069 클래스 기반으로 인스턴스 생성
		// 메모리에 class Test069가 들어갈 자리를 할당하는 과정
		Test069 ob = new Test069();
		
		System.out.println("ob.a : " + ob.a);
		// → ob.a : 0

		System.out.println("ob.b :" + ob.b);
		// → ob.b :false
		System.out.println("ob.c :" + ob.c);
		// → ob.c :
		System.out.println("ob.d :" + ob.d);
		// → ob.d :0.0
	}
}