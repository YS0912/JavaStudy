/*===================================================================
				■■■ 실행 흐름의 컨트롤 (제어문) ■■■
	반복문(while) 실습 및 관찰
===================================================================*/

// 실행 예)
// 1부터 100까지의 정수의 합 : 5050
// 1부터 100까지의 짝수의 합 : 2550
// 1부터 100까지의 홀수의 합 : 2500
// 계속하려면 아무 키나 누르세요...

public class Test047
{
	public static void main(String[] args)
	{
		// 내 풀이 --------------------------------------------------------------------------------
		
		/*
		// 주요 변수 선언
		int n=0;
		int sum=0;
		int even=0;
		int odd=0;

		// 연산 및 처리
		while (n<=100)
		{
			sum += n;

			if(n%2==0)
				even += n;
			else if(n%2!=0)
				odd += n;
			else
			{
				System.out.println("판별 불가");
				return;
			}

			n++;
		}

		// 결과 출력
		System.out.println("1부터 100까지의 정수의 합 : " + sum);
		System.out.println("1부터 100까지의 짝수의 합 : " + even);
		System.out.println("1부터 100까지의 홀수의 합 : " + odd);
		*/


		// 선생님 풀이 ----------------------------------------------------------------------------

		// 주요 변수 선언
		int n=1, sum, odd, even;
		sum=odd=even=0;					// -- even은 0이고 odd에 대입되고, 다시 sum에 대입된다.

		// 연산 및 처리
		while (n<=100)
		{
			sum += n;
			
			if(n%2==0)
				even += n;
			else if(n%2!=0)
				odd += n;
			else
			{
				System.out.println("판별할 수 없는 데이터");
				return;
			}

			n++;
		}

		// 결과 출력
		System.out.println("1부터 100까지의 정수의 합 : " + sum);
		System.out.println("1부터 100까지의 짝수의 합 : " + even);
		System.out.println("1부터 100까지의 홀수의 합 : " + odd);
	}
}

// 최종 결과
/*
	1부터 100까지의 정수의 합 : 5050
	1부터 100까지의 짝수의 합 : 2550
	1부터 100까지의 홀수의 합 : 2500
	계속하려면 아무 키나 누르십시오 . . .
*/