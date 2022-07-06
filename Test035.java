/*===================================================================
				■■■ 실행 흐름의 컨트롤 (제어문) ■■■
	if문
	if ~ else문
===================================================================*/

// 1. 프로그램을 작성할 때 주어진 조건에 따라 분기 반향을 정하기 위해 사용하는 제어문에는
//	  if문, in ~ else문, 조건 연산자, 복합 if문(if문 중첩), switch문이 있다.

// 2. if문은 if 다음의 조건이 참일 경우, 특정 문장을 수행하고자 할 때 사용되는 구문

// ○ 과제
//	  사용자로부터 임의의 연도를 입력받아
//	  입력받은 연도가 윤년인지, 평년인지 판별하여 그 결과를 출력하는 프로그램을 구현
//	  단, 입력은 BufferedReader 를 활용하고,
//	  if 조건문을 화룡ㅇ하여 연산을 수행할 수 있도록 한다.

// 실행 예)
// 임의의 연도 입력 : 2000
// 2000 → 윤년
// 계속하려면 아무 키나 누르세요...

// 임의의 연도 입력 : 2012
// 2012 → 윤년
// 계속하려면 아무 키나 누르세요...

// 임의의 연도 입력 : 2022
// 2022 → 평년
// 계속하려면 아무 키나 누르세요...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test035
{
	public static void main(String[] args) throws IOException
	{
		// 필수 변수 선언
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int year;
		
		// 연산 및 처리
		System.out.print("임의의 연도 입력 : ");
		year = Integer.parseInt(br.readLine());

		if (year%400==0)
		{
			System.out.printf("%d → 윤년%n", year);
		}
		else if (year%4==0 && year%100!=0)
		{
			System.out.printf("%d → 윤년%n", year);
		}
		else if (!(year%400==0))
		{
			System.out.printf("%d → 평년%n", year);
		}
		else if (!(year%4==0 && year%100!=0))
		{
			System.out.printf("%d → 평년%n", year);
		}

		// 최종 결과
		/*
			임의의 연도 입력 : 2000
			2000 → 윤년
			계속하려면 아무 키나 누르십시오 . . .

			임의의 연도 입력 : 2012
			2012 → 윤년
			계속하려면 아무 키나 누르십시오 . . .

			임의의 연도 입력 : 2022
			2022 → 평년
			계속하려면 아무 키나 누르십시오 . . .
		*/
	}
}