/*===================================================================
				■■■ 실행 흐름의 컨트롤 (제어문) ■■■
	반복문(while) 실습 및 관찰
===================================================================*/

// 사용자로부터 임의의 두 정수를 입력받아
// 입력 받은 두 정수 중 작은 수부터 큰 수까지의 합을 구하여 결과를 출력하는 프로그램 구현

// 실행 예)
// 첫 번째 정수 입력 : 100
// 두 번째 정수 입력 : 200
// >> 100 ~ 200 까지의 합 : xxx
// 계속하려면 아무 키나 누르세요...

// 첫 번째 정수 입력 : 1000
// 두 번째 정수 입력 : 2
// >> 2 ~ 1000 까지의 합 : xxxx
// 계속하려면 아무 키나 누르세요...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test052
{
	public static void main(String[] args) throws IOException
	{
		// 내 풀이 --------------------------------------------------------------------------------
		
		/*
		// 필수 변수 선언 및 초기화
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = 0;									// 루프 변수
		int min, max;								// 입력 변수
		int sum = 0;								// 연산 변수

		// 연산 및 처리
		System.out.print("첫 번재 정수 입력 : ");
		min = Integer.parseInt(br.readLine());

		System.out.print("두 번째 정수 입력 : ");
		max = Integer.parseInt(br.readLine());

		// 두수의 크기 비교 및 정렬
		if (min > max)
		{
			min = min ^ max;
			max = max ^ min;
			min = min ^ max;
		}
		else
		{
			min = min;
			max = max;
		}

		// 작은 수 < n < 큰 수 사이의 정수 누적합
		n = min;

		while (n<=max)
		{
			sum += n;
			n++;
		}

		// 결과 출력
		System.out.printf(">> %d ~ %d 까지의 합 : %d%n", min, max, sum);
		*/


		// 보영동현님 풀이 ------------------------------------------------------------------------
		/*
		값 입력 변수 따로 선언하고 크기 비교
		*/
		
		
		// 선생님 풀이 ----------------------------------------------------------------------------
		
		// 주요 변수 선언 및 초기화
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n;							// 루프 변수
		int su1, su2;					// 사용자 입력값 변수
		int result=0;					// 누적합 변수

		// 연산 및 처리
		System.out.print("첫 번째 정수 입력 : ");
		su1 = Integer.parseInt(br.readLine());

		System.out.print("두 번째 정수 입력 : ");
		su2 = Integer.parseInt(br.readLine());

		// 입력 받은 두 수의 크기 비교 및 자리 바꿈
		// 즉, su1이 su2보다 큰 경우 두 수의 자리를 바꿀 수 있도록 처리
		if (su1 > su2)
		{
			// 자리 바꿈
			su1 = su1 ^ su2;
			su2 = su2 ^ su1;
			su1 = su1 ^ su2;
		}

		// 반복 연산 수행
		n = su1;

		while (n <= su2)
		{
			// 결과를 출력할 때 문제 발생 (su1 ~ su2 표기 불가)
			/*
			result += su1;
			su1++;
			*/
			
			result += n;
			n++;
		}
		
		// 결과 출력
		System.out.printf(">> %d ~ %d 까지의 합 : %d%n", su1, su2, result);
	}
}

// 최종 결과
/*
	첫 번째 정수 입력 : 100
	두 번째 정수 입력 : 1
	>> 1 ~ 100 까지의 합 : 5050
	계속하려면 아무 키나 누르십시오 . . .

	첫 번째 정수 입력 : 100
	두 번째 정수 입력 : 2
	>> 2 ~ 100 까지의 합 : 5049
	계속하려면 아무 키나 누르십시오 . . .
*/