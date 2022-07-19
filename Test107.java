/*===================================================================
						정렬(Sort) 알고리즘
===================================================================*/

/*
○ 정렬
	: 데이터를 특정한 규칙(기준)에 맞게 순서대로 나열(오름차순, 내림차순)

○ 정렬의 목적
	: 데이터 처리 과정의 편의성이나 가독성을 높이기 위해
		→ 보기 좋게 검색하기 위함!

○ 정렬의 종류
	: 선택 정렬, 버블 정렬, 삽입 정렬, 힙 정렬, 퀵 정렬, 쉘 정렬, etc...
*/

// 선택 정렬(Selection Sort)
	
// 실행 예)
// Source Data : 52 42 12 62 60
// Sorted Data : 12 42 52 60 62
// 계속하려면 아무 키나 누르세요...

public class Test107
{
	public static void main(String[] args)
	{
		int[] a = {52, 42, 12, 62, 60};
		/*
			52, 42, 12, 62, 60
			==	--

			42, 52, 12, 62, 60
			==		--

			12, 52, 42, 62, 60
			==			--

			12, 52, 42, 62, 60
			==				--

			------------------- 1회전 웅~

			12, 52, 42, 62, 60
				==	--

			12, 42, 52, 62, 60
				==		--
					:
			------------------- 2회전 웅~

			12, 42, 52, 62, 60
					==	--
					:
		*/
		
		/*
		// Source data 출력
		System.out.print("Source Data : ");
		for (int i=0; i<a.length; i++)
			System.out.printf("%3d", a[i]);
		System.out.println();
		*/
		
		// 향상된 for문 (foreach 구문)
		System.out.print("Source Date : ");
		for (int n : a)
			System.out.print(n + " ");
		System.out.println();

		// 정렬
		for (int i=0; i<a.length-1; i++)			// -- 비교기준 데이터 (0     1    2   3)
		{
			for (int j=(i+1); j<a.length; j++)		// -- 비교대상 데이터 (1234  234  34  4)
			{
				if (a[i] > a[j])					// 오름차순 정렬
				{
					a[i] = a[i]^a[j];
					a[j] = a[j]^a[i];
					a[i] = a[i]^a[j];
				}
				else
					continue;
			}
		}
		
		/*
		// Sorted data 출력
		System.out.print("Sorted Data : ");
		for (int i=0; i<a.length; i++)
			System.out.printf("%3d", a[i]);
		System.out.println();
		*/

		// 향상된 for문 (foreach 구문)
		System.out.print("Sorted Data : ");
		for (int n : a)
			System.out.print(n + " ");
		System.out.println();
	}
}

// 최종결과
/*
	Source Data :  52 42 12 62 60
	Sorted Date :  12 42 52 60 62
	계속하려면 아무 키나 누르십시오 . . .
*/