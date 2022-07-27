/*===================================================================
							컬렉션(Collection)
===================================================================*/

import java.util.Stack;

public class Test155
{
	// 정적 문자열 배열 선언 및 초기화
	private static final String[] colors
		= {"검정", "노랑", "초록", "파랑", "빨강", "연두"};

	// 생성자
	public Test155()
	{
		// st라는 Stack 자료구조 생성
		// 제네릭을 활용하여 자료구조에 담기는 데이터 표현 → 『<String>』
		Stack<String> st = new Stack<String>();


		// st라는 Stack 자료구조에 데이터(colors) 담기
		// st = colors;			-- (X)
		for (String i : colors)
			st.add(i); // = st.push(i)
		
			/*
				for (int i=0; i<colors.length; i++)
					st.push(colors[i]);
			*/


		// 추가
		st.push("보라");

		// st.push(10);
		// → 컴파일 에러 발생: error: incompatible types
		//		-- 제네릭 표현식을 통해 선언한 String이 아닌 다른 자료형을
		//		   스택 자료구조 st에 push() 하려고 했기 때문


		// 출력 메소드 호출
		popStack(st);
	}

	// 출력 메소드
	private void popStack(Stack<String> st)
	{
		System.out.print("pop : ");
		while (!st.empty())		// isEmpty()
		{
			System.out.print(st.pop() + " ");
		}
		System.out.println();
	}

	public static void main(String[] args)
	{
		new Test155();
	}
}

// 최종 결과
/*
	pop : 보라 연두 빨강 파랑 초록 노랑 검정
	계속하려면 아무 키나 누르십시오 . . .
*/