/*===============================================
						배열
	- 배열의 배열(2차원 배열)
===============================================*/

// ○ 과제
//	  배열의 배열(다차원 배열)을 활용하여
//	  다음과 같은 데이터를 요소로 취하는 배열을 구성하고 그 결과를 출력하는 프로그램을 구현

// 실행 예)
/*
  A   
  C   B   
  D   E   F   
  J   I   H   G
  K   L   M   N   O
  
  계속하려면 아무 키나 누르세요...
*/

/*
문제 분석
	짝수와 홀수 행으로 나눠서 짝수 행에서는 순서대로, 홀수 행에서는 역순으로 알파벳을 초기화한다.
*/

public class Test094
{
	public static void main(String[] args)
	{
		// 배열의 배열 선언 및 메모리 할당
		char[][] arr = new char[5][5];

		// 변수 선언
		char ch = 'A';

		// 배열의 배열 초기화
		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<=i; j++)
			{
				if (i%2==0)								// i 가 짝수면,
					arr[i][j] = ch++;
				else									// i 가 홀수면,
					arr[i][i-j] = ch++;
			}
		}

		// 전체 요소 출력
		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr[i].length; j++)
				System.out.printf("%3c", arr[i][j]);
			System.out.println();
		}
	}
}

// 최종 결과
/*
	  A
	  C  B
	  D  E  F
	  J  I  H  G
	  K  L  M  N  O
	계속하려면 아무 키나 누르십시오 . . .
*/