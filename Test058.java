/*===================================================================
				■■■ 실행 흐름의 컨트롤 (제어문) ■■■
	반복문(for) 실습 및 관찰
===================================================================*/

// 1부터 100까지의 정수 중에서 4의 배수만 출력하는 프로그램을 구현
// 단, for 문을 활용해야 하며
// 한 줄에 5개씩만 출력할 수 있도록 한다.

// 실행 예)
//	4	 8	12	16	20
//	24	28	32	36	40
//			:
// 계속하려면 아무 키나 누르세요...

public class Test058
{
	public static void main(String[] args)
	{
		// 내 풀이 ----------------------------------------------------------------------
		
		/*
		// 주요 변수 선언 및 초기화
		int n;			// 루프 변수
		
		// 연산 및 처리
		for (n=4; n<=100; n+=4)
		{
			if (n%10!=0)
				System.out.printf("%d	", n);
			else if (n%10==0)
				System.out.printf("%d%n", n);
			else
				System.out.print("시스템 오류");
		*/


		// 선생님 풀이 ------------------------------------------------------------------

		for (int n=4; n<=100; n+=4)
		{
			System.out.printf("%4d", n);
			if (n%(4*5)==0)						// 출력 구문이 4*5의 배수가 될 때마다
			{
				System.out.println();			// 개행
			}
		}
	}
}

// 최종 결과
/*
	   4   8  12  16  20
	  24  28  32  36  40
	  44  48  52  56  60
	  64  68  72  76  80
	  84  88  92  96 100
	계속하려면 아무 키나 누르십시오 . . .
*/