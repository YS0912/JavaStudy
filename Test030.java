/*=======================================================================================
							■■■ 연산자(Operator) ■■■
	조건 연산자 == 삼항 연산자
	퀴즈:
	사용자로부터 임의의 연도를 입력받아
	입력 받은 연도가 윤년인지 평년인지 판별하여 결과를 출력하는 프로그램을 구현
	단, 입력은 BufferedReader 를 활용하고
	조건 연산자를 활용하여 연산을 수행할 수 있도록 한다
=======================================================================================*/

// ◇ 윤년의 판별 조건 ◇
// ①4의 배수이면서 100의 배수가 아니거나 ②400의 배수이면 윤년
// 나머지는 평년

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

// 내 풀이 --------------------------------------------------------------------------------------------------

/*
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test030
{
	public static void main(String[] args) throws IOException
	{
		// 주요 변수 선언
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int year;
		String result;

		// 연산 및 처리
		System.out.print("임의의 연도 입력 : ");
		year = Integer.parseInt(br.readLine());

		// result = (400의 배수) ? "윤년" : (4의 배수이면서 100의 배수는 아님 ? "윤년" : "평년");
		result = (year % 400 == 0) ? "윤년" : ((year % 4 == 0 && !(year % 100 == 0)) ? "윤년" : "평년");

		// result = (year % 400 == 0) ? "윤년" : ((year % 4 == 0 && year % 100 != 0) ? "윤년" : "평년");

		System.out.println(year + " → " + result);
	}
}
*/


// 선생님 풀이 ----------------------------------------------------------------------------------------------

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test030
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int year;				// -- 사용자가 입력한 연도를 담아낼 변수
		String strResult;		// -- 판변 결과를 담아낼 변수

		System.out.print("임의의 연도 입력 : ");
		year = Integer.parseInt(br.readLine());

		// 연도가 4의 배수		연도가 100의 배수가 아님		연도가 400의 배수
		// year % 4 == 0		year % 100 != 0					year % 400 == 0
		// year % 4 == 0 이면서 year % 100 != 0		또는	year % 400 == 0
		// year % 4 == 0 && year % 100 != 0		||	year % 400 == 0
		
		strResult = (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0) ? "윤년" : "평년";

		System.out.printf("%d년 → %s\n", year, strResult);

		/*
			임의의 연도 입력 : 2000
			2000 → 윤년
			계속하려면 아무 키나 누르세요...

			임의의 연도 입력 : 2012
			2012 → 윤년
			계속하려면 아무 키나 누르세요...

			임의의 연도 입력 : 2022
			2022 → 평년
			계속하려면 아무 키나 누르세요...
		*/
	}
}