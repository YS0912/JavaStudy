/*================================================================================
						 ■■■ 자바 기본 프로그래밍 ■■■
	퀴즈: 산술 연산자,  BufferedReader, printf()
		
	사용자로부터 임의의 정수를 두 번 입력 받아
	사칙 연산 및 나머지 연산을 수행하여 그 결과를 출력하는 프로그램 구현
	단, 입력 받는 과정은 BufferedReader 를 활용하고
	출력하는 과정은 printf() 메소드를 활용
	또한 나눗셈 연산은 편의상 정수 기반으로 처리
=============================================================================*/

// 실행 예)
// 첫 번째 정수 입력 : 10
// 두 번째 정수 입력 : 2

// ==== [결과] ====
// 10 + 2 = 12
// 10 - 2 = 8
// 10 * 2 = 20
// 10 / 2 = 5
// 10 % 2 = 0
// =================

// 내 풀이 --------------------------------------------------------------------------------------------------

/*
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test021
{
	public static void main(String[] args) throws IOException			// throw 는 문제 일으킬 거라는 선언
	{


		// 주요 변수 선언
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num1, num2;
		int sum, sub, mul, div, rem;

		// 연산 및 처리
		System.out.print("첫 번째 정수 입력 : ");
		num1 = Integer.parseInt(br.readLine());

		System.out.print("두 번째 정수 입력 : ");
		num2 = Integer.parseInt(br.readLine());

		sum = num1 + num2;
		sub = num1 - num2;
		mul = num1 * num2;
		div = num1 / num2;
		rem = num1 % num2;

		// 결과 출력
		System.out.printf("\n==== [결과] ====\n");
		System.out.printf("%d + %d = %d\n", num1, num2, sum);
		System.out.printf("%d - %d = %d\n", num1, num2, sub);
		System.out.printf("%d * %d = %d\n", num1, num2, mul);
		System.out.printf("%d / %d = %d\n", num1, num2, div);
		System.out.printf("%d %% %d = %d\n", num1, num2, rem);
		System.out.printf("=================\n");
	}
}
*/



// 선생님 풀이 ---------------------------------------------------------------------------

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test021
{
	public static void main(String[] args) throws IOException
	{
		// 주요 변수 선언
		int num1, num2;								// -- 사용자의 입력값
		int res1, res2, res3, res4, res5;			// -- 연산 결과를 담을 변수

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 연산 및 처리
		System.out.print("첫 번재 정수 입력 : ");
		num1 = Integer.parseInt(br.readLine());

		System.out.print("두 번째 정수 입력 : ");
		num2 = Integer.parseInt(br.readLine());

		res1 = num1 + num2;
		res2 = num1 - num2;
		res3 = num1 * num2;
		res4 = num1 / num2;
		res5 = num1 % num2;

		// 결과 출력
		System.out.printf("\n==== [결과] ====\n");

		System.out.printf("%d + %d = %d\n", num1, num2, res1);
		System.out.printf("%d - %d = %d\n", num1, num2, res2);
		System.out.printf("%d * %d = %d\n", num1, num2, res3);
		System.out.printf("%d / %d = %d\n", num1, num2, res4);
		System.out.printf("%d %% %d = %d\n", num1, num2, res5);

		System.out.printf("=================\n");
	}
}