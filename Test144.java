/*===================================================================
							클래스 고급
	- 자바에서 기본적으로 제공하는 주요 클래스들
	- Calendar 클래스
===================================================================*/

// ○ 실습 문제
//		오늘을 기준으로 입력받는 날짜만큼 후의 연, 월, 일, 요일을 확인하여
//		결과를 출력하는 프로그램 구현

// 실행 예)
// 오늘 날짜 : 2022-07-26 화요일
// 몇 일 후의 날짜를 확인하고자 하십니까? : 200

// ==========[확인 결과]========
// 200일 후 : xxxx-xx-xx x요일
// =============================
// 계속하려면 아무 키나 누르세요...

// ★ Calendar와 관련한 API Document 참조
//	  『add()』
//		: 현재 날짜를 기준으로 날 수를 더하는 연산 메소드
//			▷ 『객체.add(Calendar.DATE, 날수)』

// import java.io.BufferedReader;
// import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.Calendar;

public class Test144
{
	public static void main(String[] args) throws IOException
	{
		// 내 풀이 --------------------------------------------------------------------------------
		
		/*
		// 주요 변수
		int year, month, date, days;
		String tWeek;

		String[] week = {"일", "월", "화", "수", "목", "금", "토"};

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 변수 초기화
		Calendar today = Calendar.getInstance();
		
		year = today.get(Calendar.YEAR);
		month = today.get(Calendar.MONTH) +1;
		date = today.get(Calendar.DATE);

		tWeek = week[today.get(Calendar.DAY_OF_WEEK)-1];
		

		// 오늘의 날짜 출력
		System.out.printf("오늘의 날짜 : %d-%d-%d %s요일%n", year, month, date, tWeek);

		// 사용자 값 입력
		System.out.print("몇 일 후의 날짜를 확인하고자 하십니까? : ");
		days = Integer.parseInt(br.readLine());

			// System.out.println(days);

		// add() 메소드 연산
		today.add(Calendar.DATE, days);
		
		// 연산한 내용으로 재초기화
		year = today.get(Calendar.YEAR);
		month = today.get(Calendar.MONTH) +1;
		date = today.get(Calendar.DATE);

		tWeek = week[today.get(Calendar.DAY_OF_WEEK)-1]; 
		
		// 결과 출력
		System.out.println("==========[확인 결과]==========");
		System.out.printf("%d일 후 : %d-%d-%d %s요일%n", days, year, month, date, tWeek);
		System.out.println("===============================");
		*/


		// 선생님 풀이 ----------------------------------------------------------------------------
		
		// Scanner 클래스 기반 인스턴스 생성
		Scanner sc = new Scanner(System.in);

		// Calendar 클래스 기반 인스턴스 생성
		// Calendar now = new Calendar();
		Calendar now = Calendar.getInstance();

		// 주요 변수 선언
		int nalsu;
		int y, m, d, w;
		String[] week = {"일", "월", "화", "수", "목", "금", "토"};

		// 현재의 연, 월, 일, 요일 확인 ▷ get() 메소드
		y = now.get(Calendar.YEAR);
		m = now.get(Calendar.MONTH) +1;
		d = now.get(Calendar.DATE);

		w = now.get(Calendar.DAY_OF_WEEK);

		// 현재의 연, 월, 일, 요일 확인결과 출력
		System.out.println("오늘 날짜 : " + y + "-" + m + "-" + d + " " + week[w-1] + "요일");
		
		do
		{
			System.out.print("몇 일 후의 날짜를 확인하고자 하십니까? : ");
			nalsu = sc.nextInt();
		}
		while (nalsu<1);

		now.add(Calendar.DATE, nalsu);

		// 결과 출력
		System.out.println("==========[확인 결과]==========");
		System.out.printf("%d일 후 : %tF %tA\n", nalsu, now, now);
		System.out.println("===============================");

		// String.format("%tF", 달력객체);
		//	→ 년-월-일 형태의 문자열 반환

		// String.format("%tA", 달력객체);
		//	→ 요일 형태의 문자열 반환
	}
}

// 최종 결과

/*
	오늘 날짜 : 2022-7-26 화요일
	몇 일 후의 날짜를 확인하고자 하십니까? : 200
	==========[확인 결과]==========
	200일 후 : 2023-02-11 토요일
	===============================
	계속하려면 아무 키나 누르십시오 . . .
*/