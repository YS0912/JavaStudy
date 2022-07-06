/*===================================================================
				■■■ 실행 흐름의 컨트롤 (제어문) ■■■
	if문
	if ~ else문
===================================================================*/

// ○ 과제
//		사용자로부터 임의의 문자를 하나 입력받아
//		대문자이면 소문자로, 소문자이면 대문자로
//		알파벳이 아닌 기타 문자이면 입력오류 처리하는 프로그램 구현

// 실행 예)
// 한 문자 입력 : A
// >> A → a
// 계속하려면 아무 키나...

// 한 문자 입력 : b
// >> b → B
// 계속하려면 아무 키나...

// 한 문자 입력 : 3
// >> 입력 오류~!!!
// 계속하려면 아무 키나...

import java.io.IOException;

public class Test040
{
	public static void main(String[] args) throws IOException
	{
		// 필수 변수 선언
		int ch;

		// 연산 및 처리
		System.out.print("한 문자 입력 : ");
		ch = System.in.read();

		if (ch>=65 && ch<=90)										// -- 대문자가 입력되었을 경우
			System.out.printf(">> %c → %c%n", ch, ch+32);
		else if(ch>=97 && ch<=122)									// -- 소문자가 입력되었을 경우
			System.out.printf(">> %c → %c%n", ch, ch-32);
		else
			System.out.printf(">> 입력 오류~!!%n");
	}
}