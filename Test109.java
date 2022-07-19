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

// 향상된 버블 정렬(Bubble Sort)

// Selection Sort(Test107)와 Bubble Sort(Test108)의 성능은 동일
//	∵ 반목문 수행한 횟수가 같기 때문
// 하지만 향상된 Bubble Sort는 대상 데이터의 구조에 따라 둘보다 성능이 좋을 수도 있음

// 원본 데이터 : 61 15 20 22 30
//				 15 20 22 30 61		→ 1회전: 스왑 발생   ▶ 다음 회전 진행
//				 15 20 22 30 61		→ 2회전: 스왑 발생 X ▶ 다음 회전 진행 X

// → 추가 연산이 무의미하다고 판단할 경우 그 이상의 비교를 수행하지 X

// 실행 예)
// Source Data : 10 50 20 30 40
// Sorted Data : 10 20 30 40 50
// 계속하려면 아무 키나 누르세요...

public class Test109
{
	public static void main(String[] args)
	{
		int[] a = {10, 50, 20, 30, 40};
		/*
			10, 50, 20, 30, 40
			==	--

			10, 50, 20, 30, 40
				==	--
			
			10, 20, 50, 30, 40
					==	--

			10, 20, 30, 50, 40
						==	--

			-------------------- 1회전 종료

			10, 20, 30, 40, 50
			==	--

			10, 20, 30, 40, 50
				==	--
					: 
			-------------------- 2회전 종료 → 스왑 발생 X ▶ 추가 연산 X
		*/

		boolean check;
		int pass=0;

		System.out.print("Source Data : ");
		for (int n : a)
			System.out.printf("%3d", n);
		System.out.println();

		// 연산
		/*
		for (int i=1; i<a.length; i++)
		{
			check = false;

			for (int j=0; j<a.length-i; j++)
			{
				if (a[j] > a[j+1])
				{
					a[j] = a[j]^a[j+1];
					a[j+1] = a[j+1]^a[j];
					a[j] = a[j]^a[j+1];

					check = true;
				}
			}

			if (check = false)
				return;
		}
		*/

		// 선생님 풀이
		do
		{
			check = false;
			pass++;
			
			for (int i=0; i<a.length-pass; i++)
			{
				if (a[i] > a[i+1])
				{
					a[i] = a[i]^a[i+1];
					a[i+1] = a[i+1]^a[i];
					a[i] = a[i]^a[i+1];

					check = true;
					// 한 번이라도 스왑이 발생하면 check 변수는 true로 변경
				}
			}
		}
		while (check);
		// check 변수가 false라는 것은 회전이 발생하는 동안 스왑이 발생하지 않은 경우로, 더 이상의 반복문 수행은 무의미

		System.out.print("Source Data : ");
		for (int n : a)
			System.out.printf("%3d", n);
		System.out.println();

	}
}