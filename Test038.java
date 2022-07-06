/*===================================================================
				■■■ 실행 흐름의 컨트롤 (제어문) ■■■
	if문
	if ~ else문
===================================================================*/

// 사용자로부터 임의의 정수 5개를 입력 받아
// 짝수별, 홀수별 합계를 출력하는 프로그램을 구현
// 단, Scanner를 활용하여 데이터를 입력받을 수 있도록 한다.

// 실행 예)
// 임의의 정수 5개 입력(공백 구분) : 1 2 3 4 5

// >> 짝수의 합은 6 이고, 홀수의 합은 9 입니다.
// 계속하려면 아무 키나 누르세요...

import java.util.Scanner;

public class Test038
{
	public static void main(String[] args)
	{
		/*
		// 주요 변수 선언
		Scanner sc = new Scanner(System.in);
		
		int a, b, c, d, e;
		int sum1=0, sum2=0;

		// 연산 및 처리
		System.out.print("임의의 정수 5개 입력(공백 구분) : ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		e = sc.nextInt();
		
		
		if (a%2==0)
			sum1 += a;
		else
			sum2 += a;

		
		if (b%2==0)
			sum1 += b;
		else
			sum2 += b;


		if (c%2==0)
			sum1 += c;
		else
			sum2 += c;


		if (d%2==0)
			sum1 += d;
		else
			sum2 += d;


		if (e%2==0)
			sum1 += e;
		else
			sum2 += e;

		System.out.printf("%n>> 짝수의 합은 %d 이고, 홀수의 합은 %d 입니다.%n", sum1, sum2);
		*/


		// 선생님 풀이 ----------------------------------------------------------------------------
		
		Scanner sc = new Scanner(System.in);

		// ★ 누적합을 담아낼 변수 초기화 ★
		int evenSum = 0;
		int oddSum= 0;
		int num1, num2, num3, num4, num5;

		System.out.print("임의의 정수 5개 입력(공백 구분) : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		num4 = sc.nextInt();
		num5 = sc.nextInt();

		if (num1%2==0)
			evenSum += num1;
		else
			oddSum += num1;
			
		if (num2%2==0)
			evenSum += num2;
		else
			oddSum += num2;

		if (num3%2==0)
			evenSum += num3;
		else
			oddSum += num3;

		if (num4%2==0)
			evenSum += num4;
		else
			oddSum += num4;

		if (num5%2==0)
			evenSum = num5;
		else
			oddSum = num5;
		
		System.out.printf("%n>> 짝수의 합은 %d 이고, 홀수의 합은 %d 입니다.%n", evenSum, oddSum);

		
		// 최종결과
		/*
			임의의 정수 5개 입력(공백 구분) : 24 25 26 27 28

			>> 짝수의 합은 28 이고, 홀수의 합은 52 입니다.
			계속하려면 아무 키나 누르십시오 . . .
		*/
		

	}
}