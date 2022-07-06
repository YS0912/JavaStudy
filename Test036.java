/*===================================================================
				■■■ 실행 흐름의 컨트롤 (제어문) ■■■
	if문
	if ~ else문
===================================================================*/

// 1. 프로그램을 작성할 때 주어진 조건에 따라 분기 반향을 정하기 위해 사용하는 제어문에는
//	  if문, in ~ else문, 조건 연산자, 복합 if문(if문 중첩), switch문이 있다.

// 2. if문은 if 다음의 조건이 참일 경우, 특정 문장을 수행하고자 할 때 사용되는 구문

// 사용자로부터 임의의 두 정수와 연산자를 입력받아
// 해당 연산자의 연산 처리 결과를 출력하는 프로그램을 구현
// 단, if 조건문을 활용하여 처리할 수 있도록 하며,
// 연산 결과는 편의상 정수 기반으로 처리될 수 있도록 한다.

// 실행 예)
// 첫 번째 정수 입력    : 10
// 두 번째 정수 입력    : 3
// 연산자 입력[+ - * /] : +

// >> 10 + 3 = 13


// 내 풀이 ------------------------------------------------------------------------------

/*
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test036
{
	public static void main(String[] args) throws IOException
	{
		// 주요 변수 선언
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num1, num2;
		char opr;
		
		int res1, res2, res3, res4;

		// 연산 및 처리

		// 사용자 입력값 받기
		System.out.print("첫 번째 정수 입력    : ");
		num1 = Integer.parseInt(br.readLine());

		System.out.print("두 번째 정수 입력    : ");
		num2 = Integer.parseInt(br.readLine());

		System.out.print("연산자 입력[+ - * /] : ");
		opr = (char)System.in.read();
		

		// 사칙 연산 변수 선언
		res1 = num1 + num2;
		res2 = num1 - num2;
		res3 = num1 * num2;
		res4 = num1 / num2;
		
		// if 구문 처리
		if (opr == '+')
		{
			System.out.printf("%n>> %d %c %d = %d%n", num1, opr, num2, res1);
		}
		else if (opr == '-')
		{
			System.out.printf(">> %d %c %d = %d%n", num1, opr, num2, res2);
		}
		else if (opr == '*')
		{
			System.out.printf(">> %d %c %d = %d%n", num1, opr, num2, res3);
		}
		else if (opr == '/')
		{
			System.out.printf(">> %d %c %d = %d%n", num1, opr, num2, res4);
		}
		else
		{
			System.out.println("연산자 오류");
		}

	}
}
*/


// 선생님 풀이 --------------------------------------------------------------------------

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test036
{
	public static void main(String[] args) throws IOException
	{
		/*
		// 방법①
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a, b;			// -- 첫 번째, 두 번째 정수
		char op;			// -- 연산자

		System.out.print("첫 번재 정수 입력     : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("두 번째 정수 입력     : ");
		b = Integer.parseInt(br.readLine());

		System.out.print("연산자 입력 [+ - * /] : ");
		// op = (char)Integer.parseInt(br.readLine());		-- 숫자를 입력하는 것이 아니라 int 변환 불가능
		op = (char)System.in.read();
		
		if (op == '+')									// -- 사용자가 입력한 연산자가 '+' 라면
		{
			// a 와 b 의 덧셈 연산 수행하여 출력
			System.out.printf("\n>> %d + %d = %d\n", a, b, (a+b));
		}
		else if (op == '-')								// -- 사용자가 입력한 연산자가 '-' 라면
		{
			// a 와 b 의 뺄셈 연산 수행하여 출력
			System.out.printf(">> %d - %d = %d\n", a, b, (a-b));
		}
		else if (op == '*')								// -- 사용자가 입력한 연산자가 '*' 라면 
		{
			// a 와 b 의 곱셈 연산 수행하여 출력
			System.out.printf(">> %d * %d = %d\n", a, b, (a*b));
		}
		else if (op == '/')								// -- 사용자가 입력한 연산자가 '/' 라면 
		{
			// a 와 b 의 나눗셈 연산 수행하여 출력
			System.out.printf(">> %d / %d = %d\n", a, b, (a/b));
		}
		else
		{
			System.out.printf(">> 입력과정에 오류가 존재합니다.\n");
		}
		*/


		/*
		// 방법②
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a, b, op;			// -- 첫 번째, 두 번째 정수					★ 연산자 형태 변경★

		System.out.print("첫 번재 정수 입력     : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("두 번째 정수 입력     : ");
		b = Integer.parseInt(br.readLine());

		System.out.print("연산자 입력 [+ - * /] : ");
		// op = (char)Integer.parseInt(br.readLine());
		op = System.in.read();
		
		if (op == 43)
		{
			System.out.printf("\n>> %d + %d = %d\n", a, b, (a+b));
		}
		else if (op == 45)
		{
			System.out.printf(">> %d - %d = %d\n", a, b, (a-b));
		}
		else if (op == 42)
		{
			System.out.printf(">> %d * %d = %d\n", a, b, (a*b));
		}
		else if (op == 47)
		{
			System.out.printf(">> %d / %d = %d\n", a, b, (a/b));
		}
		else
		{
			System.out.printf(">> 입력과정에 오류가 존재합니다.\n");
		}
		*/

		// 방법③
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// check~!!!
		int a, b, result=0;
		char op;
		
		System.out.print("첫 번째 정수 입력     : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("두 번째 정수 입력     : ");
		b = Integer.parseInt(br.readLine());

		System.out.print("연산자 입력 [+ - * /] : ");
		op = (char)System.in.read();

		if (op=='+')
			result = a + b;
		else if (op=='-')
			result = a - b;
		else if (op=='*')
			result = a * b;
		else if (op=='/')
			result = a / b;

		// 연수야~
		// 여기는 else 가 없는 상황이지?
		// 그럼 자바가 마지막에 출력 구문을 수행하는 과정에서
		// result 를 출력하지 못할 수도 있겠다... 하는 생각을 한다고
		// 했었잖아?
		// 그래서... 자바야~ 내가 비록 else 구문을 만들지는 않았지만
		// result 를 출력하는데 문제 없도록 처리해줄께~
		// 해야 하는 상황


		System.out.printf("\n>> %d %c %d = %d\n", a, op, b, result);
	}
}