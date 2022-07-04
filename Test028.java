/*=======================================================================================
								■■■ 연산자(Operator) ■■■
	조건 연산자 == 삼항 연산자
	퀴즈:
	사용자로부터 임의의 정수를 입력받아
	입력 받은 정수가 양수인지 음수인지 구분하여 결과를 출력하는 프로그램을 구현
	단, 입력 데이터는 BufferedReader를 활용
	조건 연산자(삼항 연산자를 활용하여 기능을 구현
=======================================================================================*/

// 실행 예)
// 임의의 정수 입력 : -12
// -12 → 음수
// 계속하려면 아무 키나 누르세요...

// 임의의 정수 입력 : 257
// 257 → 양수
// 계속하려면 아무 키나 누르세요...

// 임의의 정수 입력 : 0
// 0 → 영
// 계속하려면 아무 키나 누르세요...

// 힌트: 조건 연산자 중첩


// 내 풀이 ------------------------------------------------------------------------------

/*
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test028
{
	public static void main(String[] args) throws IOException
	{
		// 필수 변수 선언
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n;
		String strTemp, strResult;

		// 연산 및 처리
		System.out.print("임의의 정수 입력 : ");
		n = Integer.parseInt(br.readLine());

		strTemp = n > 0 ? "양수" : "음수";
		strResult = n == 0 ? "영" : strTemp;

		// 결과 출력
		System.out.printf("%d → %s%n", n, strResult);

	}
}
*/


// 선생님 풀이 --------------------------------------------------------------------------

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test028
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n;
		String strResult;

		System.out.print("임의의 정수 입력 : ");
		n = Integer.parseInt(br.readLine());

		strResult = (n > 0) ? ("양수") : ((n < 0) ? ("음수") : ("영"));
		// -5
		// (-5 > 0) ? ("양수") : ((-5 < 0) ? ("음수") : ("영"));
		// (false) ? ("양수") : ((true) ? ("음수") : ("영"));
		// (false) ? ("양수") : ("음수");
		// "음수"

		System.out.println(n + " → " + strResult);

		// 최종 결과
		/*
			임의의 정수 입력 : -12
			-12 → 음수
			계속하려면 아무 키나 누르세요...

			임의의 정수 입력 : 257
			257 → 양수
			계속하려면 아무 키나 누르세요...

			임의의 정수 입력 : 0
			0 → 영
			계속하려면 아무 키나 누르세요...
		*/ 
	}
}