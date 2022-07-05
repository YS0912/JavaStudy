/*===================================================================
				■■■ 실행 흐름의 컨트롤 (제어문) ■■■
	if문
	if ~ else문
===================================================================*/

// 1. 프로그램을 작성할 때 주어진 조건에 따라 분기 반향을 정하기 위해 사용하는 제어문에는
//	  if문, in ~ else문, 조건 연산자, 복합 if문(if문 중첩), switch문이 있다.

// 2. if문은 if 다음의 조건이 참일 경우, 특정 문장을 수행하고자 할 때 사용되는 구문

// 사용자로부터 임의의 정수를 입력받아
// 홀수와 짝수, 0을 판별하는 프로그램을 구현
// 단, 단일 if 구문 중첩을 활용하여 처리할 수 있도록 한다.


// 내 풀이 ------------------------------------------------------------------------------

/*
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test033
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n;

		System.out.print("임의의 정수 : ");
		n = Integer.parseInt(br.readLine());

		if (n == 0)
		{
			System.out.printf(">> %d은(는) 영입니다.%n", n);
		}
		else if (n % 2 == 0)
		{
			System.out.printf(">> %d은(는) 짝수입니다.%n", n);
		}
		else
		{
			System.out.printf(">> %d은(는) 홀수입니다.%n", n);
		}
	}
}
*/


// 선생님 풀이 --------------------------------------------------------------------------

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test033
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n;

		System.out.print("임의의 정수 : ");
		n = Integer.parseInt(br.readLine());

		/*
		// 0이 마지막으로 가지 않도록 주의 (짝수가 됨)
		if (n != 0)
		{
			System.out.println(n + " → " + "홀수");
		}
		else if (n == 0)
		{
			System.out.printf(n + " → " + "영");
		}
		else if ()
		{
			System.out.printf(n + " → " + "짝수");
		}

		// 결론을 바로 출력했기 때문에 else 구문 필요 X
		*/

		String result;
		
		if (n==0)
		{
			result = "영";
		}
		else if (n%2==0)
		{
			result = "짝수";
		}
		else
		{
			result = "홀수";
		}

		System.out.println(n + " → " + result);

		// 이 경우에는 else 가 없으면 컴파일 오류
		// result 값에 대한 보장을 받을 수 없기 때문
	}
}