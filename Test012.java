/*===============================================
		  ■■■ 자바의 개요 및 특징 ■■■
	변수와 자료형
	자바 기본 입출력: BufferedReader 클래스
=================================================*/

import java.io.BufferedReader;
import java.io.InputStreamReader;					// → (계약서) 불러오기 Input Output
import java.io.IOException;

public class Test012
{
	public static void main(String[] args) throws IOException							// 문제가 생기면 던져라 (Input Output Exception)
	{
		// 키보드 장착(생성)
		// (→  BufferedReader 클래스 기반의 인스턴스(객체) 생성)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//															------------		바이트 입력값 (문자 인식 X)
		//									  -----------------------					바이트 → 문자 번역기		
		// -----------------------------------											문자 입력을 읽어들이는 장치


		// 주요 변수 선언
		int r;							// -- 반지름
		final double PI = 3.141592;		// -- 원주율 → 변수의 상수화 『final』
		double a, b;					// -- 원의 넓이, 둘레

		// 연산 및 처리
		// ① 사용자에게 안내 메시지 출력
		// System.out.println("원의 반지름 입력 : ");
		System.out.print("원의 반지름 입력 : ");

		// ② 사용자가 입력한 값을 받아 반지름 변수 r 지정
		r = Integer.parseInt(br.readLine());
		//					---------------			BufferedReader 의 readLine() → 입력 대기열의 문자열 반환: 숫자 형태가 아님
		//  ----------------						문자열을 있는 그대로의 숫자 형태로 변환
		// r = Integer.parseInt(br.readLine(2546));		← 입력
		// r = Integer.parseInt("2546");
		// r = 2546;
													// -- readLine() 은 입력 대기열에 값이 들어올 때까지 대기

		// ③ 넓이 및 둘레 계산(연산) → 변수 a, b 지정
		a = r * r * PI;
		b = 2 * r * PI;

		// 결과 출력
		// → 변수 a, b 값 출력
		// System.out.println(">> 넓이 : " + a);
		// System.out.println(">> 둘레 : " + b);
		/*
			원의 반지름 입력 : 42
			>> 넓이 : 5541.768288
			>> 둘레 : 263.893728
		*/
		
		// 추가
		// 반지름이 45인 원의 넓이는 6361.72 이며,
		// 반지름이 45인 원의 둘레는 282.74 이다.

		System.out.printf(">> 반지름이 %d인 원의 넓이는 %.2f 이며,\n", r, a);
		System.out.printf(">> 반지름이 %d인 원의 둘레는 %.2f 이다.\n", r, b);
		
		// 최종 실행 결과
		/*
			원의 반지름 입력 : 45
			>> 반지름이 45인 원의 넓이는 6361.72 이며,
			>> 반지름이 45인 원의 둘레는 282.74 이다.
		*/
	}
}