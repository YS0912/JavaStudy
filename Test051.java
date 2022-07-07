/*===================================================================
				■■■ 실행 흐름의 컨트롤 (제어문) ■■■
	반복문(while) 실습 및 관찰
===================================================================*/

// 사용자로부터 임의의 정수를 입력받아
// 입력받은 정수가 소수인지 아닌지를 판별하여 결과를 출력하는 프로그램을 구현

// ★ 소수 : 1 또는 자기 자신의 값 이외에 어떤 수로도 나누어 떨어지지 않는 수
//			 단, 1은 소수 아님

// 실행 예)
// 임의의 정수를 입력 : 10
// 10 → 소수 아님
// 계속하려면 아무 키나 누르세요...

// 임의의 정수를 입력 : 11
// 11 → 소수

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test051
{
	public static void main(String[] args) throws IOException
	{
		// 내 풀이 ----------------------------------------------------------------------------------------------------

		/*
		// 주요 변수 선언 및 초기화
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = 2;											// 루프 변수
		int n;												// 입력 받은 수
		String result = "소수";

		// 연산 및 처리
		System.out.print("임의의 정수를 입력 : ");
		n = Integer.parseInt(br.readLine());
		
		if(n == 1)
			result = "소수 아님";

		while (a < n)
		{	
			if(n%a==0)										// 입력 받은 수를 루프 변수로 나눠서 0이 나오면
				result = "소수 아님";

			a++;
		}


		// 결과 출력
		System.out.printf("%d → %s%n", n, result);
		*/


		// 보영님 풀이 ------------------------------------------------------------------------------------------------
		/*
		짝수 제외
		*/


		// 선생님 풀이 ------------------------------------------------------------------------------------------------

		//주요 변수 선언 및 초기화
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num;											// -- 입력 받은 변수
		int n=2;											// -- 입력 받을 대상으로 나눗셈 연산을 수행할 변수
															//	  2 부터 시작해서 1씩 증가
															//	  ex) 입력값 27 → n:2 3 4 5 6 7 8 ... 26

		// 연산 및 처리
		System.out.print("임의의 정수 입력 : ");
		num = Integer.parseInt(br.readLine());

		// num 이 뭔지는 모르지만 이 입력 값을 소수로 간주
		//String result = "소수";
		boolean flag = true;			// "num 은 소수일 것이다."

		while (n<num)
		{
			// 테스트
			// System.out.println("반복문 수행");

			// 확인 연산
			// -- n으로 num이 나누어 떨어지는지 확인
			if (num % n ==0)								// 나누어 떨어진다면,
			{
				// "num 은 소수가 아니다."
				flag = false;
				break;										// n으로 num 을 나누어 0이 되면 중단 (그리고 while을 빠져나간다)
			}
			
			n++;
		}

		// 결과 출력
		if (flag && num!=1)									// 출력 전에 수행해야 할 추가 확인: num 의 1 여부 검토
															// flag는 true / false 둘 중 하나이기 때문에 단독 사용 가능
			// 최종적으로 소수
			System.out.printf("%d → 소수\n", num);
		else
			// 최종적으로 소수 아님
			System.out.printf("%d → 소수 아님\n", num);
	}
}

// 최종 결과
/*
	임의의 정수 입력 : 13
	13 → 소수
	계속하려면 아무 키나 누르십시오 . . .

	임의의 정수 입력 : 10
	10 → 소수 아님
	계속하려면 아무 키나 누르십시오 . . .

	임의의 정수 입력 : 1
	1 → 소수 아님
	계속하려면 아무 키나 누르십시오 . . .
*/