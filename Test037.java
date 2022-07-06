/*===================================================================
				■■■ 실행 흐름의 컨트롤 (제어문) ■■■
	if문
	if ~ else문
===================================================================*/

// 1. 프로그램을 작성할 때 주어진 조건에 따라 분기 반향을 정하기 위해 사용하는 제어문에는
//	  if문, in ~ else문, 조건 연산자, 복합 if문(if문 중첩), switch문이 있다.

// 2. if문은 if 다음의 조건이 참일 경우, 특정 문장을 수행하고자 할 때 사용되는 구문

// 사용자로부터 임의의 정수 세 개를 입력받아
// 작은 술에서 큰 수 순으로 출력하는 프로그램을 구현한다.

// 실행 예)
// 첫 번째 정수 입력 : 753
// 두 번재 정수 입력 : 42
// 세 번째 정수 입력 : 127

// >> 정렬 결과 : 42 127 753
// 계속하려면 아무 키나 누르세요...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test037
{
	public static void main(String[] args) throws IOException
	{
		// 내 풀이 --------------------------------------------------------------------------------
		
		/*
		// 주요 변수 선언
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a, b, c;

		// 연산 및 처리
		System.out.print("첫 번째 정수 입력 : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("두 번째 정수 입력 : ");
		b = Integer.parseInt(br.readLine());

		System.out.print("세 번재 정수 입력 : ");
		c = Integer.parseInt(br.readLine());

		if (a>b && b>c)
			System.out.printf("%n>> 정렬 결과 : %d %d %d%n", c, b, a);
		else if (a>c && c>b)
			System.out.printf("%n>> 정렬 결과 : %d %d %d%n", b, c, a);
		else if (b>a && a>c)
			System.out.printf("%n>> 정렬 결과 : %d %d %d%n", c, a, b);
		else if (b>c && c>a)
			System.out.printf("%n>> 정렬 결과 : %d %d %d%n", a, c, b);
		else if (c>a && a>b)
			System.out.printf("%n>> 정렬 결과 : %d %d %d%n", b, a, c);
		else if (c>a && b>a)
			System.out.printf("%n>> 정렬 결과 : %d %d %d%n", a, b, c);
		else
			System.out.printf("입력 오류%n");
		*/

		// 반보영님 풀이 --------------------------------------------------------------------------
		
		/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a, b, c;
		int max=0, mid=0, min=0;

		System.out.print("첫 번째 정수 입력 : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("두 번째 정수 입력 : ");
		b = Integer.parseInt(br.readLine());

		System.out.print("세 번재 정수 입력 : ");
		c = Integer.parseInt(br.readLine());

		// a가 가장 클 때
		if (a>b && a>c && b>c)
		{
			max = a;
			mid = b;
			min = c;
		}
		else if (a>b && a>c && c>b)
		{
			max = a;
			mid = c;
			min = b;
		}
		else if (b>a && b>c && a>c)
		{
			max = b;
			mid = a;
			min = c;
		}
		else if (b>a && b>c && c>a)
		{
			max = b;
			mid = c;
			min = a;
		}
		else if (c>a && c>b && a>b)
		{
			max = c;
			mid = a;
			min = b;
		}
		else if (c>a && c>b && b>a)
		{
			max = c;
			mid = b;
			min = a;
		}

		System.out.printf("%n>> 정렬 결과 : %d %d %d%n", max, mid, min);
		*/

		// 선생님 풀이 ----------------------------------------------------------------------------
		
		// ① 첫 번째 정수 vs 두 번째 정수 크기 비교
		//		→ 첫 번째 정수가 두 번째 정수보다 클 경우... 자리 바꿈

		// ② 첫 번째 정수 vs 세 번째 정수 크기 비교
		//		→ 첫 번째 정수가 세 번째 정수보다 클 경우... 자리 바꿈

		// ③ 두 번째 정수 vs 세 번째 정수 크기 비교
		//		→ 두 번째 정수가 세 번째 정수보다 클 경우... 자리 바꿈

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a, b, c;		// -- 사용자 입력 값을 담아둘 변수

		System.out.print("첫 번째 정수 입력 : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("두 번재 정수 입력 : ");
		b = Integer.parseInt(br.readLine());

		System.out.print("세 번재 정수 입력 : ");
		c = Integer.parseInt(br.readLine());
		
		if (a > b)
		{
			a=a^b;
			b=b^a;
			a=a^b;
		}
		if (a > c)
		{
			a=a^c;
			c=c^a;
			a=a^c;
		}
		if (b > c)
		{
			b=b^c;
			c=c^b;
			b=b^c;
		}
	}
}