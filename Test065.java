/*===================================================================
				■■■ 실행 흐름의 컨트롤 (제어문) ■■■
	break 실습 및 관찰
===================================================================*/

// break : 멈춘다 + "그리고 빠져나간다"

// 다음과 같은 처리가 이루어지는 프로그램을 구현
// 단, 입력 받는 정수는 1 ~ 100 범위 안에서만 가능하도록 작성

// 실행 예)
// 임의의 정수 입력 : -10

// 임의의 정수 입력 : 0

// 임의의 정수 입력 : 2022

// 임의의 정수 입력 : 10
// >> 1 ~ 10까지의 합 : 55
// 계속하시겠습니까(Y/N)? : y

// 임의의 정수 입력 : 100
// >> 1 ~100까지의 합 : 5050
// 계속하시겠습니까(Y/N)? : n
// 계속하려면 아무 키나 누르세요... (→ 프로그램 종료)


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test065
{
	public static void main(String[] args) throws IOException
	{
		// 내 풀이 --------------------------------------------------------------------------------

		
		// 주요 변수 선언 및 초기화
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num;						// 사용자 입력 숫자 변수
		char yn='y';					// 사용자 입력 예 아니오
		int l;							// 루프 변수
		int sum;						// 계산 변수

		// 연산 및 처리		
		do
		{
			System.out.print("임의의 정수 입력 : ");
			num = Integer.parseInt(br.readLine());

			sum = 0;

			for (l=1; num>=1 && num<=100 && l<=num; l++)
					sum += l;
			
			if (sum>=1)
			{
				System.out.printf("1 ~ %d까지의 합 : %d\n", num, sum);

				System.out.print("계속하시겠습니까(Y/N)? : ");
				yn = (char)System.in.read();

				if (yn == 'n' || yn == 'N')
					break;

				System.out.println();

				System.in.skip(2);
			}
			else
				System.out.println();
		}
		while (yn == 'y' || yn == 'Y');
		

		// 선생님 풀이 ----------------------------------------------------------------------------
		
		/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n, s, i;
		// -- n : 사용자 입력값 변수
		// -- s : 누적합 연산 변수
		// -- i : 루프 변수

		char ch;
		// -- 프로세스를 계속 진행할지 말지의 여부를 담아둘 변수
		
		while (true)
		{
			// 무한 반복(무한 무프)
			do
			{
				System.out.print("\n임의의 정수 입력 : ");
				n = Integer.parseInt(br.readLine());
			}
			while (n<1 || n>100);

			// 누적합 초기화
			s = 0;
			
			for (i=1; i<=n; i++)
				s += i
			
			System.out.printf(">> 1 ~ %d까지의 합 : %d\n", n, s);

			System.out.print("계속하시겠습니까(Y/N)? : ");
			ch = (char)System.in.read();
			// -- 계속할지 말지에 대한 여부(의사표현)

			// N → 빠져나감
			if (ch!='Y' || ch!='y')						// Y도 y도 아니다 (&&)
				break;
				// -- 멈춘다 + "그리고 빠져나간다"
			
			// 엔터값(\r\n) 처리
			System.in.skip(2);
		}
		*/
			

	}
}
