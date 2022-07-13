/*===============================================
						배열
	- 배열의 배열(2차원 배열)
===============================================*/

// 배열의 배열(다차원 배열)을 활용하여
// 다음과 같은 데이터를 요소로 취하는 배열을 구성하고 그 결과를 출력하는 프로그램을 구현

// 실행 예)
/*
  1  2  3  4  5
  2  3  4  5  6
  3  4  5  6  7
  4  5  6  7  8
  5  6  7  8  9
계속하려면 아무 키나 누르세요...
*/

public class Test087
{
	public static void main(String[] args)
	{
		// 내 풀이 ------------------------------------------------------------
		
		/*
		// 배열의 배열 선언 및 메모리 할당
		int arr[][] = new int[5][5];

		// 변수 선언 및 초기화
		int n = 1;

		// 연산 및 배열의 배열 초기화
		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr[i].length; j++)
				arr[i][j] = (n+i+j);
		}

		// 배열의 배열 요소 출력
		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr[i].length; j++)
				System.out.printf("%3d", arr[i][j]);
			System.out.println();
		}
		*/


		// 선생님 풀이 --------------------------------------------------------
		
		// 배열의 배열 선언 및 메모리 할당
		int[][] arr = new int[5][5];

		// 주요 변수 선언
		int n;

		for (int i=0; i<arr.length; i++)			// 웅~
		{
			n=i+1;

			for (int j=0; j<arr[i].length; j++)		// 쑝~
			{
				// 테스트(확인)
				// System.out.print("i: " + i ", j: " + j + "-");
				// System.out.print("[" + n + "]");
				// n++;

				arr[i][j] = n;
				n++;
			}
		}

		// 배열의 배열 전체 요소 출력
		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr[i].length; j++)
				System.out.printf("%3d", arr[i][j]);
			System.out.println();
		}
	}
}

// 최종 출력
/*
	  1  2  3  4  5
	  2  3  4  5  6
	  3  4  5  6  7
	  4  5  6  7  8
	  5  6  7  8  9
	계속하려면 아무 키나 누르십시오 . . .
*/