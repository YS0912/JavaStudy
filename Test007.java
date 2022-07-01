/*============================================
	  ■■■ 자바의 개요 및 특징 ■■■
	변수와 자료형
	변수와 자료형 실습 및 테스트 : boolean
============================================*/

public class Test007
{
	public static void main(String[] args)
	{
		// 주요 변수 선언
		boolean a = true;	// boolean a = "true";		(X)
		boolean b;
		// boolean a, b;

		int c =10, d = 5;

		// 연산 및 처리
		//b = c < d;
		// → b = 10 < 5;
		// → b = false;
		b = 200 > c;
		// → b = true;

		// 결과 출력
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		/*
			a = true
			b = true
		*/
	}
}