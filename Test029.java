/*=======================================================================================
							■■■ 연산자(Operator) ■■■
	조건 연산자 == 삼항 연산자
	퀴즈:
	사용자로부터 임의의 문자 하나를 입력 받아
	대문자이면 소문자로, 소문자이면 대문자로
	알파벳이 아닌 기타 문자라면 그 문자 그대로 출력하는 프로그램 구현
=======================================================================================*/

// 실행 예)
// 한 문자 입력 : A
// A → a
// 계속하려면 아무 키나 누르세요...

// 한 문자 입력 : a
// b → B
// 계속하려면 아무 키나 누르세요...

// 한 문자 입력 : 7
// 7 → 7
// 계속하려면 아무 키나 누르세요...

// 내 풀이 ------------------------------------------------------------------------------
/*
import java.io.IOException;

public class Test029
{
	public static void main(String[] args) throws IOException
	{

		// 주요 변수 선언
		int n;
		char ch, result;

		// 연산 및 처리
		System.out.print("한 문자 입력 : ");
		n = System.in.read();

		ch = (char)n;

		result = (n < 60) ? (ch) : ((n <= 90) ? ((char)(n+32)) : ((char)(n-32)));

		// 결과 출력
		System.out.printf("%c → %c\n", ch, result);

		// 최종 결과

			한 문자 입력 : A
			A → a
			계속하려면 아무 키나 누르세요...

			한 문자 입력 : a
			b → B
			계속하려면 아무 키나 누르세요...

			한 문자 입력 : 7
			7 → 7
			계속하려면 아무 키나 누르세요...
	}
}
*/

// 선생님 풀이 --------------------------------------------------------------------------

import java.io.IOException;

public class Test029
{
	public static void main(String[] args) throws IOException
	{
		/*
		char temp;

		System.out.print("한 문자 입력 : ");
		temp = (char)System.in.read();

		// System.out.println("입력받은 값 확인 : " + temp);

		// 대문자 여부 확인
		String result = (temp >= 65 && temp <= 90) ? "대문자" : "대문자아님";			-- char 는 int 로 자동변환이 가능
		System.out.println("결과 : " + result);

		String result = (temp >= 'A' && temp <= 'Z') ? "대문자" : "대문자아님";
		System.out.println("결과 : " + result);
		*/
		
		// 대문자 → 소문자
		// 'A'(65) → 'a'(97)	-- +32
		// 'B'(66) → 'b'(98)	-- +32
		// 'C'(67) → 'c'(99)	-- +32
		//			:

		// 소문자 → 대문자
		// 'a'(97) → 'A'(65)	-- -32
		// 'b'(98) → 'B'(66)	-- -32
		// 'c'(99) → 'C'(67)	-- -32
		//			:

		char ch, result;

		System.out.print("한 문자 입력 : ");
		ch = (char)System.in.read();

		// result = () ? () : ();
		// result = (입력값대문자) ? (소문자로변환) : ((입력값소문자) ? 대문자로변환 : 그대로));
		result = (ch >= 'A' && ch <= 'Z') ? ((char)(ch+32)) : ((ch >= 'a' && ch <= 'z') ? ((char)(ch-32)) : ch);		// -- char 를 연산하려면 int 로 자동 형 변환

		System.out.println(ch + " → " + result);

		// 최종 결과
		/*
			한 문자 입력 : E
			E → e
			계속하려면 아무 키나 누르십시오 . . .

			한 문자 입력 : g
			g → G
			계속하려면 아무 키나 누르십시오 . . .

			한 문자 입력 : 7
			7 → 7
			계속하려면 아무 키나 누르십시오 . . .
		*/


	}
}
