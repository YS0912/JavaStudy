/*=========================================================
			 ■■■ 자바 기본 프로그래밍 ■■■
		자바의 기본 입출력: System.util.Scanner
=========================================================*/

// 단락 문자 패턴을 사용하여 입력을 토큰에 따라 분할하며, 디폴트(default)로 사용되는 단락문자는 공백이다.
// → 공백을 기준으로 문자 단위를 구분
// 작성된 다음 토큰은 『next()』 메소드를 사용하여 다른 형태(자료형)의 값으로 변환할 수 있다.

import java.util.Scanner;

public class Test017
{
	public static void main(String[] args)
	{
		// Scanner 클래스 기반의 인스턴스 생성
		Scanner sc = new Scanner(System.in);
		// BufferdeReader br = new BufferedReader(new InputStreamReader(System.in));
		// Scanner는 번역기(InputStreamReader) 필요 X

		// 주요 변수 선언
		String name;
		int kor, eng, mat;

		// 연산 및 처리
		System.out.print("이름을 입력하세요 : ");
		name = sc.next();
		

		// 테스트(확인)
		// System.out.println("입력한 이름 : " + name);
		// 출력 시 IOException 예외 처리 필요 X

		System.out.print("국어 점수 입력 : ");
		// Integer.parseInt(); 로 변환 필요 X
		kor = sc.nextInt();

		System.out.print("영어 점수 입력 : ");
		eng = sc.nextInt();

		System.out.print("수학 점수 입력 : ");
		mat = sc.nextInt();
		
		// 결과 출력
		System.out.println();
		System.out.println(">> 이름 : " + name);
		// System.out.println(">> 총점 : " + kor + eng + mat);
		// → >> 총점 : 909090
		// 문자열 결합 연산자이기 때문에
		System.out.println(">> 이름 : " + (kor + eng + mat));

		// 최종 결과
		/*
			이름을 입력하세요 : 고연수
			국어 점수 입력 : 90
			영어 점수 입력 : 80
			수학 점수 입력 : 70

			>> 이름 : 고연수
			>> 이름 : 240계속하려면 아무 키나 누르십시오 . . .
		*/

	}
}