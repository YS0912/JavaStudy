/*===================================================================
				■■■ 실행 흐름의 컨트롤 (제어문) ■■■
	반복문(while) 실습 및 관찰
===================================================================*/

// ○ 과제
//	  사용자로부터 임의의 정수를 입력 받아
//	  1부터 입력 받은 그 정수까지의 전체 합 / 짝수 합 / 홀수 합을
//	  각각 결과값으로 출력하는 프로그램을 구현

// 실행 예)
// 임의의 정수 입력 : 284
// >> 1 ~ 284 까지의 정수의 합 : xxxx
// >> 1 ~ 284 까지의 짝수의 합 : xxxx
// >> 1 ~ 284 까지의 홀수의 합 : xxxx
// 계속하려면 아무 키나 누르세요...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test053
{
	public static void main(String[] args) throws IOException
	{
		// 필수 변수 선언 및 초기화
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n;									// 사용자 입력 변수
		int l=0;								// 루프 변수
		int sum, even, odd;						// 각각의 누적합 변수
		sum = even = odd =0;

		// 연산 및 처리
		System.out.print("임의의 정수 입력 : ");
		n = Integer.parseInt(br.readLine());

		while (l<=n)
		{
			if (l % 2 == 0)								// 짝수면,
			{
				sum += l;
				even += l;
			}
			else if (l % 2 != 0)						// 홀수면,
			{
				sum += l;
				odd += l;
			}
			else
				System.out.print("입력 오류");			// 혹시 그 외의 것이 나온다면,

			l++;
		}

		// 결과 출력
		System.out.printf("1 ~ %d 까지의 정수의 합 : %d%n", n, sum);
		System.out.printf("1 ~ %d 까지의 짝수의 합 : %d%n", n, even);
		System.out.printf("1 ~ %d 까지의 홀수의 합 : %d%n", n, odd);
	}
}

// 최종 결과
/*
	임의의 정수 입력 : 284
	1 ~ 284 까지의 정수의 합 : 40470
	1 ~ 284 까지의 짝수의 합 : 20306
	1 ~ 284 까지의 홀수의 합 : 20164
	계속하려면 아무 키나 누르십시오 . . .
*/