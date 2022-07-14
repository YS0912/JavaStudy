/*===============================================
						배열
	- 배열의 배열(2차원 배열)
===============================================*/

// 배열의 배열(다차원 배열)을 활용하여
// 다음과 같은 데이터를 요소로 취하는 배열을 구성하고 그 결과를 출력하는 프로그램을 구현

// 실행 예)
/*
  1  8   9  16  17
  2  7  10  15  18
  3  6  11  14  19
  4  5  12  13  20
계속하려면 아무 키나 누르세요...
*/

public class Test089
{
	public static void main(String[] args)
	{
		// 내 풀이 ----------------------------------------------------------------------
		
		/*
		// 배열의 배열 선언 및 메모리 할당
		int[][] arr = new int[4][5];
		
		// 변수 선언
		int n = 1;

		// 배열의 배열 초기화
		for (int i=0; i<5; i++)							// arr[0].length
		{
			if (i%2==0)
			{
				for (int j=0; j<arr.length; j++)
				{
					arr[j][i] = n;
					n++;
				}
			}
			else
			{
				for (int j=arr.length-1; j>=0; j--)
				{
					arr[j][i] = n;
					n++;
				}
			}
		}

		// 배열의 배열 전체 요소 출력
		for (int j=0; j<arr.length; j++)
		{
			for (int i=0; i<arr[j].length; i++)
				System.out.printf("%3d",arr[j][i]);
			System.out.println();
		}
		*/


		// 선생님 풀이 ------------------------------------------------------------------

		// 배열의 배열 선언 및 메모리 할당
		int[][] arr = new int[4][5];

		int n=0;

		for (int i=0; i<5; i++)					// outer 웅 i → 0 1 2 3 4
		{
			for (int j=0; j<4; j++)				// inner 쑝 j → 0 1 2 3
			{
				// 테스트(확인)
				// System.out.print(j + "" + j + " ");	

				n++;

				if (i%2==0)						// i 가 짝수 → 0 2 4
					arr[j][i] = n;				//		00 10 20 30		02 12 22 32		04 14 24 34
				else							// i 가 홀수 → 1 3
					arr[3-j][i] = n;			//		31 21 11 01		33 23 13 03

			}
			// System.out.println();
		}

		// 전체 요소 출력
		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr[i].length; j++)
				//System.out.printf("%3d", arr[j][i]);	//-- 얘가 문제~!!! ㅎ
				System.out.printf("%3d", arr[i][j]);
			System.out.println();
		}
	}
}

// ArrayIndexOutOfBoundsException → 이 에러는
// 배열에서 할당된 방보다 더 큰 방 번호에 접근하려고 했을 때 발생하는 에러~!!!