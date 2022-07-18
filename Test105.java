/*===================================================================
								만년 달력
	- 다음과 같은 기능의 프로그램을 구현한다.
===================================================================*/

// 실행 예)
// 『연도』를 입력하세요 : 2022
// 『월』을 입력하세요   : 7

/*
     [ 2022년 7월 ]

  일  월  화  수  목  금  토
==============================
					   1   2
  3    4   5   6   7   8   9
  10  11  12  13  14  15  16
  17  18  19  20  21  22  23
  24  25  26  27  28  29  30
  31
==============================
계속하려면 아무 키나 누르세요...
*/

// 내 풀이 --------------------------------------------------------------------
/*
import java.util.Scanner;

class Calender
{
	// 변수 선언
	int y, m, d;
	int days;

	int[] month = {31, 0, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	char[] wd = {'일', '월', '화', '수', '목', '금', '토'};

	// 주요 기능
	// 사용자 입력값
	public void input()
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("『연도』를 입력하세요 : ");
		y = sc.nextInt();

		System.out.print("『월』을 입력하세요   : ");
		m = sc.nextInt();
	}
	
	// 입력 월의 시작 요일 구하기
	void WeekDay()
	{
		// 연
		days = (y-1)*365 + (y-1)/4 - (y-1)/100 + (y-1)/400;

		// 월
		if (y%4==0 && y%100!=0 || y%400==0)
			month[1] = 29;
		else
			month[1] = 28;
		
		for (int i=0; i<(m-1); i++)
			days += month[i];
	}

	// 출력
	public void print()
	{
		System.out.println();

		System.out.printf("        [ %d년 %d월 ]%n", y, m);
		System.out.println();
		
		for (int i=0; i<wd.length; i++)
			System.out.printf("%3c", wd[i]);
		
		System.out.printf("%n==============================%n");

		for (int i=0; i<=days%7; i++)
			System.out.print("    ");
		
		days++;

		for (int i=1; i<=month[(m-1)]; i++)
		{
			System.out.printf("%4d", i);

			days++;

			if (days%7==0)
				System.out.println();
		}
		
		System.out.printf("%n==============================%n");
	}
}

public class Test105
{	
	public static void main(String[] args)
	{
		Calender cal = new Calender();

		cal.input();
		cal.WeekDay();
		cal.print();

		// System.out.println(cal.arr[0]);
	}
}
*/


// 선생님 풀이

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test105
{
	public static void main(String[] args) throws IOException
	{
		// BufferedReader 인스턴스 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 배열 선언 및 초기화
		// -- 각 달의 마지막 날짜 (매 월의 최대 날짜)
		int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		// 배열인덱스 0   1   2   3   4   5   6   7   8   9   10  11
		// 월		  1   2   3   4   5   6   7   8   9  10   11  12

		// 주요 변수 선언
		int nalsu, y, m, w;		// 날수, 년, 월, 요일

		do
		{
			System.out.print("『연도』를 입력하세요 : ");
			y = Integer.parseInt(br.readLine());
		}
		while (y<1);
		// 입력받은 연도가 1보다 작을 경우 재입력

		do
		{
			System.out.print("『월』을 입력하세요   : ");
			m = Integer.parseInt(br.readLine());
		}
		while (m<1 || m>12);
		// 입력받은 월이 1보다 작거나 12보다 크면 재입력

		// --------------- 여기까지 수행하면 유효한 연도와 월을 사용자로부터 입력받은 상태

		// 입력받은 연도에 해당하는 2월의 마지막 날 계산
		if (y%4==0 && y%100!=0 || y%400==0)					// 윤년이라면...
			days[1] = 29;
		// 현재 days[1]이 28로 초기화되어 있기 때문에 else 생략 가능

		// 1년 1월 1일 ~ 입력받은 연도의 이전 년도 12월 31일까지의 날 수 계산
		nalsu = (y-1)*365 + (y-1)/4 - (y-1)/100 + (y-1)/400;

		// 입력받은 연도(해당 연도) 1월 1일 ~ 입력한 월 이전까지의 날 수 계산
		for (int i=0; i<(m-1); i++)
			nalsu += days[i];

		// 입력받은 월의 1일을 날 수 누적 연산
		++nalsu;		// nalsu += 1;

		// ---------------------------- 여기까지 수행하면 모든 날 수에 대한 종합 처리 완료

		// 요일 확인
		// -- 입력받은 연의 입력받은 월의 1일이 무슨 요일인지 확인하기 위한 연산
		w = nalsu % 7;
		// w:0 → 일요일
		// w:1 → 월요일
		// w:2 → 화요일
		// w:3 → 수요일
		//		:

		// 테스트
		// System.out.println("w : " + w);
		// →
		/*
			『연도』를 입력하세요 : 2022
			『월』을 입력하세요   : 7
			w : 5
				→ 2022년 7월 1일은 금요일(5)이라는 의미
		*/

		// ----------- 여기까지 수행하면 해당 연도 해당 월의 1일이 무슨 요일인지 확인 완료

		// 출력 (달력 그리기)

		System.out.println();
		System.out.printf("\t[  %d년 %d월  ]\n", y, m);
		System.out.println();
		System.out.println("  일  월  화  수  목  금  토");		// 하루 4칸
		System.out.println("============================");

		// 특정 요일부터 1일이 출발할 수 있도록 공백 발생(지정)
		for (int i=1; i<=w; i++)
			System.out.print("    ");		// 공백 4칸
		
		// 테스트
		// System.out.printf("%4d", 1);

		// 해당 월(입력한 월)의 날짜만 출력될 수 있도록 반복문 구성
		for (int i=1; i<=days[m-1]; i++)
		{
			System.out.printf("%4d", i);
			w++;
			// 반복문을 통해 날짜를 처리하는 만큼 요일도 함께 반복되며 증가할 수 있도록 처리

			// 이번에 출력하는 날짜가 일요일이라면 개행
			if (w%7==0)
				System.out.println();
		}
		// 달의 마지막 날짜가 출력 형식을 모두 채웠을 경우(토요일) 추가 개행을 하지 말아라
		if (w%7!=0)
			System.out.println();

		System.out.println("============================");
	}
}

// 최종 결과
/*
	『연도』를 입력하세요 : 2022
	『월』을 입력하세요   : 12

			[  2022년 12월  ]

	  일  월  화  수  목  금  토
	============================
					   1   2   3
	   4   5   6   7   8   9  10
	  11  12  13  14  15  16  17
	  18  19  20  21  22  23  24
	  25  26  27  28  29  30  31
	============================
	계속하려면 아무 키나 누르십시오 . . .
*/