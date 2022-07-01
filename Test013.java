/*=========================================================
			 ■■■ 자바의 개요 및 특징 ■■■
	퀴즈
	삼각형의 밑변의 길이와 높이를 사용자로부터 입력받아
	이 삼격형의 넓이를 구하는 프로그램을 구현
=========================================================*/

// 실행 예)
// ■ 삼각형 넓이 구하는 프로그램 ■
// - 삼각형의 밑변 입력 : 
// - 삼각형의 높이 입력 : 
// 
// >> 밑변이 3, 높이가 5인 삼각형의 넓이 : 
// 계속하려면 아무 키나 누르세요...

// 문제 인식 및 분석
//		삼각형의 넓이 = 밑변 * 높이 / 2
//		사용자로부터 데이터를 입력받아 처리 → BufferedReader 활용: 1개


// 내 풀이 ------------------------------------------------------------------------------
/*
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test013
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int x, y;
		double a;

		System.out.println("■ 삼각형 넓이 구하는 프로그램 ■");
		System.out.print("- 삼각형의 밑변 입력 : ");
		x = Integer.parseInt(br.readLine());

		System.out.print("- 삼각형의 높이 입력 : ");
		y = Integer.parseInt(br.readLine());

		a = (x * y) / 2;

		System.out.printf(">> 밑변이 %d, 높이가 %d인 삼각형의 넓이 : %.2f\n", x, y, a);
	}
}
*/


// 선생님 풀이 --------------------------------------------------------------------------
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test013
{
	public static void main(String[] args) throws IOException
	{
		// 주요 변수 선언
		// BufferedReader 인스턴스 생성 (키보드 생성)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int underLength, height;		// -- 밑변과 높이
		double area;					// -- 넓이

		// 연산 및 처리
		// ① 사용자 안내 메시지 출력
		System.out.println("■ 삼각형 넓이 구하는 프로그램 ■");
		System.out.print("- 삼각형의 밑변 입력 : ");

		// ② 사용자가 입력한 데이터(문자열)를 변수 underLength(정수)에 담아내기
		underLength = Integer.parseInt(br.readLine());
		
		// ③ 사용자 안내 메시지 출력
		System.out.print("- 삼각형의 높이 입력 : ");

		// ④ 사용자가 입력한 데이터(문자열)를 변수 height(정수)에 담아내기
		height = Integer.parseInt(br.readLine());

		// ⑤ 삼각형의 넓이 구하는 연산 처리
		// area = underLength * height / 2;			   → 정수 기반 연산이 되어 나머지 X
		area = underLength * height / 2.0;			// → 실수 기반 연산

		// area = (double)(underLength * height / 2);		-- (X)
		// area = (double)underLength * height / 2;			-- underLength만 double 형 변환
		// area = underLength * (double)height / 2);		-- height만 double 형 변환
		// area = (double)(underLength * height) / 2;		-- (height * height) double 형 변환

		// 결과 출력
		System.out.println();				// -- 개행
		// System.out.print();				   -- 컴파일 에러

		System.out.printf(">> 밑변이 %d, 높이가 %d인 삼각형의 넓이는 %.2f\n", underLength, height, area);

		/*
			■ 삼각형 넓이 구하는 프로그램 ■
			- 삼각형의 밑변 입력 : 3
			- 삼각형의 높이 입력 : 5

			>> 밑변이 3, 높이가 5인 삼각형의 넓이는 7.50
		*/
	}
}