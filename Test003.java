/*=====================================
	■■■ 자바 기본 프로그래밍 ■■■
	변수와 자료형
=====================================*/

public class Test003
{

	// ⓐ

	public static void main(String[] args)
	{
		// ⓑ

		//변수 선언
		int a;

		// 변수 a에 10 대입 (변수 초기화)
		a = 10;

		// 변수 선언 및 초기화 (선언과 대입을 한 번에 처리)
		int b = 20;

		// 변수 선언
		int c;

		// 테스트
		// System.out.println(c)
		// → 컴파일 에러 발생: c를 초기화하지 않았음

		// 연산 및 처리
		c = a + b;
		// -- c = 10 + 20;
		// -- c = 30;
		// -- 변수 c에 30을 대입

		// 결과 출력
		System.out.println(c);
		// → 30

		// 결과 출력
		// System.out.println(a b c);
		// → 컴파일 에러: 다중값이 넘어감

		// 결과 출력
		System.out.println(a + " " + b + " " + c);
		// → 10 20 30
		// " " 문자열이 결합되면서 "10 20 30" 이 하나의 문자열이 됨

		// 결과 출력
		System.out.println("a 의 값은 " + a + "입니다.");
		System.out.println("b 의 값은 " + b + "입니다.");
		System.out.println("c 의 값은 " + c + "입니다.");
		// -- 『+』 연산자를 사용하는 과정에서 피연산자 중 문자열이 포함되어 있을 경우,
		//		문자열 결합 연산자로 활용되어 처리의 최종 결과는 문자열의 형태로 반환
		/* →
			30
			10 20 30
			a 의 값은 10입니다.
			b 의 값은 20입니다.
			c 의 값은 30입니다.
		*/

		System.out.println(1 + 2);			// 산술연산자 +
		System.out.println("1" + 2);		// 문자열결합연산자 +
		System.out.println(1 + "2");		// 문자열결합연산자 +
		System.out.println("1" + "2");		// 문자열결합연산자 +
	}
}