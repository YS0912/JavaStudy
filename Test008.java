/*============================================
	  ■■■ 자바의 개요 및 특징 ■■■
	변수와 자료형
	변수와 자료형 실습 및 테스트 : char
============================================*/

public class Test008
{
	public static void main(String[] args)
	{
		// 주요 변수 선언
		char ch1, ch2, ch3;
		// 변수 이름이 숫자로 끝나는 것은 가능
		int a;																	// ★중요★
																				//	변수 선언 후 출력 구문만 입력하면 컴파일 에러!

		// 연산 및 처리
		ch1 = 'A';
		ch2 = '\n';		// 개행문자
						// -- 문자 형태의 『\』를 출력하려면 『\\』를 사용
		ch3 = '대';
		// a = ch1;																// 컴파일 에러 X : 자동 형 변환 규칙 적용
																				//				 : A 를 아스키 코드에 맞춰서 저장
		a = (int)ch1;
		// -- 명시적 형 변환 (강제 형 변환): 알려주는 경우

		// 결과 출력
		System.out.println("ch1 : " + ch1);
		// → ch1 : A
		System.out.println("ch2 : " + ch2);
		// → ch2 : (개행)
		System.out.println("ch3 : " + ch3);
		// → ch3 : 대
		System.out.println("a   : " + a);
		// → a   : 65

		System.out.printf("%c, %c, %c, %d%n", ch1, ch2, ch3, a);
		// → 런타임 에러: 문자타입 데이터는 %c 사용

		// 최종 결과값
		/*
			ch1 : A
			ch2 :

			ch3 : 대
			a   : 65
			A,
			, 대, 65
		*/
	}
}