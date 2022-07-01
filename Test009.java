/*============================================
	  ■■■ 자바의 개요 및 특징 ■■■
	변수와 자료형
	변수와 자료형 실습 및 테스트 : double
	나눗셈 연산 실습
============================================*/

public class Test009
{
	public static void main(String[] args)
	{
		// 정수와 정수의 나눗셈
		double a = 1 / 2;
		System.out.println("double a : " + a);
		// → double a : 0.0
		// 피연산자가 정수일 때 『\』 연산은 몫만

		double b = (double)1 / 2;
		// double b = 0.1 / 2;
		// double b = (double)0;		(X)	--- (double)의 연산 우선 순위 높음
		System.out.println("double b : " + b);
		// → double b : 0.5

		double c = 1/2 + 1/2;			// --- 『\』의 연산 우선 순위가 높음
		System.out.println("double c : " + c);
		// → double c : 0.0


		// 피 연산자로 실수가 포함되어 있는 나눗셈 연산
		double d = 1 / 2.0;
		System.out.println("double d : " + d);
		// → double d : 0.5
		// -- 나눗셈 연산에서 피 연산자에 실수가 포함되어 있으면 실수 기반의 연산을 수행
		// -- 결과값 역시 실수 형태로 반환

		double e = 3/2 + 1/2;
		System.out.println("double e : " + e);
		// → double e : 1.0

		double f = 3/2 + 1/2.0;
		System.out.println("double f : " + f);
		// → double f : 1.5

		// 최종 결과값
		/*
			double a : 0.0
			double b : 0.5
			double c : 0.0
			double d : 0.5
			double e : 1.0
			double f : 1.5
		*/
	}
}