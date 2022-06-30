/*=====================================
	■■■ 자바 기본 프로그래밍 ■■■
	변수와 자료형
	키워드 및 식별자
	printf()
=====================================*/

public class Test005
{
	public static void main(String[] args)
	{
		// 변수 선언(메모리 확보) 및 초기화(메모리에 값 할당)
		int a=10, b=5;

		// 변수 선언
		int c, d;

		// 연산 및 처리
		c = a + b;		// a + b 의 결과값을 변수 c 에 대입
		d = a - b;		// a - b 의 결과값을 변수 d 에 대입

		// 결과 출력 → 『10 + 5 = 15』의 형태
		System.out.println(a + " + " + b + " = " + c);
		// → 10 + 5 = 15
		// -- Java에서는 하나의 문자열로 출력
		// -- 즉, 문자열 결합 연산자로써 『+』


		// 다른 방법:
		// print() / println() / printf() / format()

		System.out.println("abcd");
		System.out.print("1234\n");
		// -- 문자열 영역 안에서 사용되는 『\n』은 개행

		// printf() / format()
		// -- ★JDK 1.5★ 부터 지원되는 메소드

		// System.out.printf("○ + ○ = ○", 10, 20, 30);
		// -- 파라미터(인자/인수) 4개
		System.out.printf("%d + %d = %d\n", 10, 20, 30);	// 『\n』 개행
		System.out.printf("%d + %d = %d%n", 10, 20, 30);	// 『%n』 개행
		// -- 『%d』: 10진수 정수형의 서식 지정 옵션
		// -- 『%』: printf()에서 옵션 전달
		// → 10 + 20 = 30

		// System.out.printf("○ 와 △\n", 10, 3.14);

		// System.out.printf("%d 와 %d\n", 10, 3.14);
		// → 런타임 에러 (컴파일은 문제 없음)		★주의★

		System.out.printf("%d 와 %f\n", 10, 3.14);
		// → 10 와 3.140000
		// -- 『%f』: 실수형 서식 지정 옵션

		System.out.printf("%d 와 %.2f\n", 10, 3.14);
		// → 10 와 3.14
		// -- 『%.2f』: 수수점 이하 두 번째 자리까지 표현

		System.out.printf("%f%n", 3.141592);
		// → 3.141592

		System.out.printf("%.4f%n", 3.141592);
		// → 3.1416
		// -- 『%.4f』: 소수점 이하 네 번째 자리까지 표현
		//				반올림 발생

		// 실행 결과
		/*
			10 + 5 = 15
			abcd
			1234
			10 + 20 = 30
			10 + 20 = 30
			10 와 3.140000
			10 와 3.14
			3.141592
			3.1416
		*/

	}
}