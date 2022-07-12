/*=========================================================
					클래스와 인스턴스
		Test071.java 파일과 세트
=========================================================*/

// 원의 넓이와 둘레 구하기
// 원의 넓이와 둘레를 구할 수 있는 클래스를 설계
// 클래스명 : CircleTest → CircleTest.java
// BufferedReader 의 readLine();

// 원의 넓이 = 반지름 * 반지름 * 3.141592
// 원의 둘레 = 반지름 * 2 * 3.141592

// 실행 예)
// 반지름 입력 : xxx

// >> 반지름이 xxx인 원의
// >> 넓이 : xxx.xx
// >> 둘레 : xxx.xx
// 계속하려면 아무 키나 누르세요...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class CircleTest
{
	// 내 풀이 ------------------------------------------------------------------------------------
	
	/*
	// 변수 선언
	int r;

	// 메소드 입력
	void input() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("반지름 입력 : ");
		r = Integer.parseInt(br.readLine());
	}

	// 메소드 넓이
	double calArea()
	{
		double result;

		result = r * r * 3.141592;
		return result;
	}

	// 메소드 둘레
	double calLength()
	{
		double result;

		result = 2 * r * 3.141592;
		return result;
	}

	// 메소드 결과 출력
	void print(double a, double l)
	{
		System.out.println();
		System.out.println("반지름이 " + r + "인 원의");
		System.out.println(">> 넓이 : " + a);
		System.out.println(">> 둘레 : " + l);
	}
	*/


	// 선생님 풀이 --------------------------------------------------------------------------------

	// 주요 속성(데이터) → 멤버 변수
	int r;								// 반지름
	final double PI = 3.141592;			// 원주율 (변수의 상수화)
	
	// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		-- 메모리 낭비

	// 주요 기능(동작, 행위) → 멤버 메소드

	// 반지름 입력 기능 → 메소드 정의
	void input() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("반지름 입력 : ");
		r = Integer.parseInt(br.readLine());
	}

	// 넓이 계산 기능 → 메소드 정의
	double calArea()
	{
		// 원의 넓이 = 반지름 * 반지름 * 3.141592
		return r * r * PI;
	}

	// 둘레 계산 기능 → 메소드 정의
	double calLength()
	{
		// 원의 둘레 = 2 * 반지름 * 3.141592
		double result;

		result = 2 * r * PI;

		return result;

	}

	// 결과 출력 기능 → 메소드 정의
	void print(double a, double l)
	{
		/*
		>> 반지름이 xxx인 원의				// 갖고 있음(전역변수)
		>> 넓이 : xxx.xx					// 안 갖고 있음(지역변수)
		>> 둘레 : xxx.xx
		*/

		System.out.printf(">> 반지름이 %d 인 원의\n", r);
		System.out.printf(">> 넓이 : %.2f\n", a);
		System.out.printf(">> 둘레 : %.2f\n", l);
	}
}