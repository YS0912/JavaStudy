/*===================================================================
				■■■ 실행 흐름의 컨트롤 (제어문) ■■■
	반복문(while) 실습 및 관찰
===================================================================*/

// 사용자로부터 원하는 단(구구단)을 입력 받아
// 해당하는 구구단을 출력하는 프로그램을 구현
// 단, 1단 ~ 9단 사이의 수를 입력 받은 상황이 아니면,
// 이에 대한 안내를 한 후 프로그램을 종료할 수 있도록 처리

// 실행 예)
// 원하는 단(구구단) 입력 : 7
// 7 * 1 = 7
// 7 * 2 = 14
// 7 * 3 = 21
//	  :
// 7 * 9 = 63
// 계속하려면 아무 키나 누르세요...

// 원하는 단(구구단) 입력 : 11
// 1부터 9까지의 정수만 입력이 가능합니다.
// 계속하려면 아무 키나 누르세요...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test054
{
	public static void main(String[] args) throws IOException
	{
		// 내 풀이 --------------------------------------------------------------------------------
		
		/*
		// 필수 변수 선언 및 초기화
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int tab;						// 사용자 입력 변수
		int n=1;						// 루프 변수
		int result = 0;					// 연산 변수

		// 연산 및 처리
		System.out.print("원하는 단(구구단) 입력 : ");
		tab = Integer.parseInt(br.readLine());

		while (n<=9)
		{
			// 사용자 입력값이 9 이하인지 확인
			if (tab<=9)
			{
				result = tab * n;
				System.out.printf("%d * %d = %d%n", tab, n, result);
				n++;
			}
			else
			{
				System.out.println("1부터 9까지의 정수만 입력이 가능합니다.");
				break;
			}
		}
		*/


		// 선생님 풀이 ----------------------------------------------------------------------------

		// 필수 변수 선언 및 초기화
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int dan;			// 사용자 입력 변수


		// 연산 및 처리
		System.out.print("원하는 단(구구단) 입력 : ");
		dan = Integer.parseInt(br.readLine());

		if (dan<1 || dan>9)					// 사용자 입력값부터 확인해야 루프를 덜 돈다.
		{
			System.out.println("1부터 9까지의 정수만 입력이 가능합니다.");
			return;
		}

		int n = 0;

		// 결과 출력(반복 출력)
		while (n<9)
		{
			n++;
			System.out.printf("%d * %d = %d\n", dan, n, (dan*n));
		}
	}
}

// 최종 결과
/*
	원하는 단(구구단) 입력 : 4
	4 * 1 = 4
	4 * 2 = 8
	4 * 3 = 12
	4 * 4 = 16
	4 * 5 = 20
	4 * 6 = 24
	4 * 7 = 28
	4 * 8 = 32
	4 * 9 = 36
	계속하려면 아무 키나 누르십시오 . . .
*/