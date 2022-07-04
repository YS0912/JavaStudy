/*=========================================================
			 ■■■ 자바 기본 프로그래밍 ■■■
		자바의 기본 입출력: System.out.print()
=========================================================*/

public class Test016
{
	public static void main(String[] args)
	{
		System.out.print("AAA");
		System.out.print("BBB");
		System.out.print("CCC\n");				// 개행
		// → AAABBBCCC

		System.out.println();					// 개행

		// System.out.print();
		// → 컴파일 에러

		System.out.print("\n");					// 개행
		// System.out.print(\n)					→ 컴파일 에러
		
		System.out.printf("123456789");
		System.out.printf("123456789\n");
		System.out.printf("123456789%n");

		// System.out.printf();					 → 컴파일 에러
		
		System.out.printf("%d + %d = %d%n", 10, 20, 30);
		// → 10 + 20 = 30

		System.out.printf("%d\n", 123);
		System.out.printf("%10d\n", 123);		// 10만큼의 공간에 데이터를 정렬, 숫자라 우정렬
		System.out.printf("%8d\n", 1234);
		System.out.printf("%010d\n", 123);		// 공백을 0으로 채운다
		/* 
		123
		       123
		    1234
		0000000123
		*/
		
		System.out.printf("%+d\n", 365);
		System.out.printf("+%d\n", 365);
		// → +365

		System.out.printf("%d\n", +365);
		// → 365

		// System.out.printf("%-d\n", 365);
		// → 런타임 에러
		System.out.printf("-%d\n", 365);
		System.out.printf("%d\n", -365);
		// → -365

		// System.out.printf("%d\n", 'A');
		// → 런타임 에러
		System.out.printf("%c\n", 'A');
		// → A

		// System.out.printf("%c\n", "ABCD");
		// → 런타임 에러
		System.out.printf("%s\n", "ABCD");
		// → ABCD

		System.out.printf("%h\n", 365);
		// → 16d								// 16진수

		System.out.printf("%o\n", 365);
		// → 555

		System.out.printf("%b\n", true);
		System.out.printf("%b\n", false);
		// → true
		//	  false

		System.out.printf("%f\n", 123.23);
		// → 123.230000
		System.out.printf("%.2f\n", 123.23);
		// → 123.23

		System.out.printf("%.2f\n", 123.231);
		// → 123.23
		System.out.printf("%.2f\n", 123.235);
		// → 123.24
		// 소수점 이하 세 번째 자리 올림

		System.out.printf("%8.2f\n", 123.236);
		// 총 8자리 + 소수점 둘째 자리까지 표시
		// →   123.24
		System.out.printf("%2.2f\n", 123.236);
		// → 123.24
		// 총 2자리에 들어갈 수 없으므로 무시

		System.out.printf("%08.2f\n", 123.236);

		// 최종 결과값
		/*
			AAABBBCCC


			123456789123456789
			123456789
			10 + 20 = 30
			123
				   123
				1234
			0000000123
			+365
			+365
			365
			-365
			-365
			A
			ABCD
			16d
			555
			true
			false
			123.230000
			123.23
			123.23
			123.24
			  123.24
			123.24
			00123.24
			계속하려면 아무 키나 누르십시오 . . .
		*/
	}
}