/*=========================================================
			 ■■■ 자바 기본 프로그래밍 ■■■
	퀴즈
	사용자로부터 이름, 국어점수, 영어점수, 수학점수를 
	입력받아 이름과 총점을 출력하는 프로그램 구현
=========================================================*/

// 실행 예)
// 이름을 입력하세요 : 한은영
// 국어 점수 입력 : 90
// 영어 점수 입력 : 80
// 수학 점수 입력 : 70

// =====[결과]=====
// 이름 : 한은영
// 총점 : 240
// 계속하려면 아무 키나 누르세요...


// 내 풀이 ------------------------------------------------------------------------------

/*
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test014
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String name;
		int kor, eng, mat;
		int sum;

		System.out.print("이름을 입력하세요 : ");
		name = br.readLine();

		System.out.print("국어 점수 입력 : ");
		kor = Integer.parseInt(br.readLine());

		System.out.print("영어 점수 입력 : ");
		eng = Integer.parseInt(br.readLine());

		System.out.print("수학 점수 입력 : ");
		mat = Integer.parseInt(br.readLine());

		sum = kor + eng + mat;
		
		System.out.println();
		System.out.println("=====[결과]=====");
		System.out.printf("이름 : %s\n", name);
		System.out.printf("총점 : %d\n", sum);
	}
}
*/



// 선생님 풀이 --------------------------------------------------------------------------

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Test014
{
	public static void main(String[] args) throws IOException
	{
		// BufferedReader 인스턴스 생성
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		// 주요 변수 선언
		String strName;					// -- 이름 변수 (헝가리안 표기법)
		int nKor, nEng, nMat;			// -- 국어, 영어, 수학 점수 변수
		int nTot;						// -- 총점 변수
		String strTemp;					// -- 문자열 임시 저장 변수


		// 연산 및 처리
		// ① 사용자 안내 메시지 출력 (이름)
		System.out.print("이름을 입력하세요 : ");

		// ② 사용자가 입력한 값(외부 데이터) 변수 strName에 담아내기
		strName = br.readLine();

		// ③ 사용자 안내 메시지 출력 (국어)
		System.out.print("국어 점수 : ");

		// ④ 사용자가 입력한 값(외부 데이터) nKor변수에 담아내기
		strTemp = br.readLine();
		nKor = Integer.parseInt(strTemp);

		// ⑤ 사용자 안내 메시지 출력 (영어)
		System.out.print("영어 점수 : ");

		// ⑥ 사용자가 입력한 값(외부 데이터) nEng변수에 담아내기
		strTemp = br.readLine();
		nEng = Integer.parseInt(strTemp);

		// ⑦ 사용자 안내 메시지 출력 (수학)
		System.out.print("수학 점수 : ");

		// ⑧ 사용자가 입력한 값(외부 데이터) nMat변수에 담아내기
		strTemp = br.readLine();
		nMat = Integer.parseInt(strTemp);

		// ⑨ 각 점수 변수에 담긴 데이터(사용자 입력 데이터)를 총점 산출하여 nTot 변수에 담아내기
		nTot = nKor + nEng + nMat;


		// 결과 출력
		System.out.println("\n=====[결과]=====");
		// System.out.println("이름 : " + strName);
		System.out.printf("이름 : %s\n", strName);
		// System.out.println("총점 : " + nTot);
		System.out.printf("총점 : %d\n", nTot);

		/*
			이름을 입력하세요 : 고연수
			국어 점수 : 90
			영어 점수 : 80
			수학 점수 : 70

			=====[결과]=====
			이름 : 고연수
			총점 : 240
			계속하려면 아무 키나 누르십시오 . . .
		*/
	}
}
