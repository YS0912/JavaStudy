/*===============================================
						배열
	- 배열의 배열(2차원 배열)
===============================================*/

// ○ 과제
//	  배열의 배열(다차원 배열)을 활용하여
//	  다음과 같은 데이터를 요소로 취하는 배열을 구성하고 그 결과를 출력하는 프로그램을 구현

// 실행 예)
/*
  A   B   C   D   E
  F   G   H   I   J
  K   L   M   N   O
  P   Q   R   S   T
  U   V   W   X   Y
계속하려면 아무 키나 누르세요...
*/

public class Test092
{
	public static void main(String[] args)
	{
		// 배열의 배열 선언 및 메모리 할당
		char[][] arr = new char[5][5];

		// 변수 선언
		char ch = 'A';

		// 배열 초기화
		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr[i].length; j++)
				arr[i][j] = ch++;
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
	  A  B  C  D  E
	  F  G  H  I  J
	  K  L  M  N  O
	  P  Q  R  S  T
	  U  V  W  X  Y
	계속하려면 아무 키나 누르십시오 . . .
*/