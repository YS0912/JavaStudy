/*=========================================================
			 ■■■ 자바 기본 프로그래밍 ■■■
		자바의 기본 입출력: System.in.read()
=========================================================*/

/*
『System.in.read()』 메소드는 (입력 대기열로부터) 한 문자만 저장
단, 입력받은 하나의 문자를 문자 그대로 가져오는 것이 아니라 ASCII Code 값으로 반환
*/

// 실행 예)
// 한 문자 입력		 : A
// 한 자리 정수 입력 : 9

// >> 입력한 문자 : A
// >> 입력한 정수 : 9
// 계속하려면 아무 키나 누르세요...

import java.io.IOException;

public class Test015
{
	public static void main(String[] args) throws IOException
	{
		/*
		// 주요 변수 선언
		char ch;				// -- 문자
		

		// 연산 및 처리
		System.out.print("문자 하나 입력하세요 : ");			// A
		ch = (char)System.in.read();							// 65

		// 결과 출력
		System.out.println(ch);
		*/


		// 내 풀이 --------------------------------------------------
		/*
		char ch;
		int num;

		System.out.print("한 문자 입력       : ");
		ch = (char)System.in.read();

		System.out.print("한 자리 정수 입력 : ");
		num = System.in.read();

		System.out.println();
		System.out.printf(">> 입력한 문자 : %c\n", ch);
		System.out.printf(">> 입력한 정수 : %d\n", num);

		?
		*/


		// 선생님 풀이 --------------------------------------------------------

		// 주요 변수 선언
		char ch;											// 입력 받은 문자
		int n;												// 입력 받은 정수

		// 추가 변수 선언
		char temp;

		// 연산 및 처리
		// ① 사용자 안내 메시지
		System.out.print("한 문자 입력       : ");
		ch = (char)System.in.read();						// 엔터키 = 『\r』 + 『\n』
															//		→ System.in.read(A + \r + \n);
															//							  -------- 잔류
		System.in.skip(2);									// 잔류 코드 2개 스킵

		System.out.print("한 자리 정수 입력  : ");			
		// n = System.in.read();							   문자 → 아스키코드
		// temp = (char)System.in.read();					   temp를 사용해서 n의 오류를 처리
		n = System.in.read();
		n -= 48;

		// ② 결과 출력
		System.out.println();
		System.out.println(">> 입력한 문자 : " + ch);
		// System.out.println(">> 입력한 정수 : " + temp);
		System.out.println(">> 입력한 정수 : " + n);

		// 최종 결과
		/*
			한 문자 입력       : a
			한 자리 정수 입력  : 1

			>> 입력한 문자 : a
			>> 입력한 정수 : 1
			계속하려면 아무 키나 누르십시오 . . .
		*/
	}
}