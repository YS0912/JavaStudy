/*===============================================
						배열
	- 배열의 배열(2차원 배열)
===============================================*/

// 배열의 배열(다차원 배열)을 활용하여
// 다음과 같은 데이터를 요소로 취하는 배열을 구성하고 그 결과를 출력하는 프로그램을 구현

// 실행 예)
/*
  1   2   3   4   10
  5   6   7   8   26
  9  10  11  12   42
 13  14  15  16   58
 28  32  36  40  136
계속하려면 아무 키나 누르세요...
*/

public class Test091
{
	public static void main(String[] args)
	{
		// 내 풀이 ----------------------------------------------------------------------

		/*
		// 배열의 배열 선언 및 초기화
		int[][] arr1 = new int[4][5];
		int[] arr2 = new int[5];

		// 변수 선언
		int n=1;
		int m =28;

		// 배열1 초기화
		for (int i=0; i<arr1.length; i++)
		{
			for (int j=0; j<arr1[i].length; j++)
			{
				if (j<4)
				{
					arr1[i][j] = n;
					n++;
				}
				else
				{
					for (j=0; j<4; j++)
						arr1[i][4] += arr1[i][j];
						// sum += arr1[i][j];
						// arr1[i][j] = sum;
						// n++;
				}
			}
		}

		// 배열2 초기화
		for (int i=0; i<arr2.length; i++)
		{
			if (i<4)
			{
				arr2[i] = m;
				m+=4;
			}
			else
			{
				for (i=0; i<4; i++)
					arr2[4] += arr2[i];
			}
				
		}

		// 전체 요소 출력
		for (int i=0; i<arr1.length; i++)
		{
			for (int j=0; j<arr1[i].length; j++)
			{
				System.out.printf("%4d",arr1[i][j]);
			}
			System.out.println();
		}
		
		for (int i=0; i<arr2.length; i++)
		{
			System.out.printf("%4d", arr2[i]);
		}
		System.out.println();
		*/


		// 선생님 풀이 ------------------------------------------------------------------
		
		// 배수의 배수 선언 및 메모리 할당
		int[][] arr = new int[5][5];
		int n=0;

		// 테스트 변수
		int sum=0;

		// 각 for문 수식 2회 -1 → 반복문의 처리가 필요하지 않은 영역
		for (int i=0; i<arr.length-1; i++)			// 웅 i → 0 1 2 3
		{
			for (int j=0; j<arr[i].length-1; j++)		// 쑝 j → 0 1 2 3
			{
				n++;
				arr[i][j] = n;

				arr[i][arr[i].length-1] += arr[i][j];
				// arr[0][4] += arr[0][0]
				//			 += arr[0][1]
				//			 += arr[0][2]
				//			 += arr[0][3]

				arr[arr.length-1][j] += arr[i][j];
				// arr[4][0] += arr[0][0]
				//			 += arr[1][0]
				//			 += arr[2][0]
				//			 += arr[3][0]

				arr[arr.length-1][arr[i].length-1]  += arr[i][j];
				// arr[4][4] += arr[0][0]
				//			 += arr[0][1]
				//			 += arr[0][2]
				//			 += arr[0][3]
				//			:
			}
		}


		// 전체 요소 출력
		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr[i].length; j++)
			{
				System.out.printf("%4d",arr[i][j]);
			}
			System.out.println();
		}
	}
}

// 최종 결과
/*
	   1   2   3   4  10
	   5   6   7   8  26
	   9  10  11  12  42
	  13  14  15  16  58
	  28  32  36  40 136
	계속하려면 아무 키나 누르십시오 . . .
*/