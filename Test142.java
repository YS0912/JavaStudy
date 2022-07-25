/*===================================================================
							클래스 고급
	- 자바에서 기본적으로 제공하는 주요 클래스들
	- Calendar 클래스
===================================================================*/

/*
★ Calendar 클래스는 추상 클래스!!
					 -----------
				   미완성된 클래스

	Calendar ob = new Calendar();	◀ 불가


○ Calender 클래스 객체(인스턴스)를 생성할 수 있는 방법

	1. Calendar ob1 = Calendar.getInstance();				◀ 정적 / 클래스 / static 메소드

	2. Calendar ob2 = new GregorianCalendar();				◀ 업캐스팅
						  -------------------
					 Calender 클래스의 하위 클래스
	
	3. GregorianCalendar ob3 = new GregorianCalendar();

*/

// 연, 월, 일, 요일을 Calendar 객체로부터 가져와서 출력

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Test142
{
	public static void main(String[] args)
	{
		// Calendar 클래스 기반 인스턴스 생성
		// Calendar ob = new Calendar();
		Calendar rightNow = Calendar.getInstance();

		// 생성된 달력(Calendar) 인스턴스를 통해 달력 관련 정보를 얻어낼 수 있는 메소드
		//	▶ 『get()』

		int y = rightNow.get(Calendar.YEAR);
		System.out.println("y : " + y);
		// → y : 2022


		int m = rightNow.get(Calendar.MONTH) + 1;		// ▷ 『+1』이 필요!
														//	  달은 배열 형태로 저장되어 있기 때문
		System.out.println("m : " + m);
		// → m : 7

		
		int d = rightNow.get(Calendar.DATE);
		System.out.println("d : " + d);
		// → d : 25


		int w = rightNow.get(Calendar.DAY_OF_WEEK);
		System.out.println("w : " + w);
		// → w : 2

		// 테스트
		/*
		System.out.println(Calendar.SUNDAY);			// → 1
		System.out.println(Calendar.MONDAY);			// → 2
		System.out.println(Calendar.TUESDAY);			// → 3
		System.out.println(Calendar.WEDNESDAY);			// → 4
		System.out.println(Calendar.THURSDAY);			// → 5
		System.out.println(Calendar.FRIDAY);			// → 6
		System.out.println(Calendar.SATURDAY);			// → 7
		*/

		System.out.println(y + "-" + m + "-" + d + " " + w);
		// → 2022-7-25 2

		String week = "";
		switch (w)
		{
			/*
			case Calender.SUNDAY: week = "일요일"; break;
			case Calender.MONDAY: week = "월요일"; break;
			case Calender.TUESDAY: week = "화요일"; break;
			case Calender.WENDESDAY: week = "수요일"; break;
			case Calender.THURSDAY: week = "목요일"; break;
			case Calender.FRIDAY: week = "금요일"; break;
			case Calender.SATURDAY: week = "토요일"; break;
			*/

			case 1: week = "일요일"; break;
			case 2: week = "월요일"; break;
			case 3: week = "화요일"; break;
			case 4: week = "수요일"; break;
			case 5: week = "목요일"; break;
			case 6: week = "금요일"; break;
			case 7: week = "토요일"; break;
		}

		System.out.println(y + "-" + m + "-" + d + " " + week);
		// → 2022-7-25 월요일

		
		System.out.println("////////////////////////////////////////////////////////////////////");

		// Calendar 클래스 기반 인스턴스 생성
		Calendar rightNow2 = new GregorianCalendar();

		String[] week2 = {"일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일"};

		// 달력의 날짜 세팅 → 『set()』 메소드 활용
		rightNow2.set(2023, 0, 16);		// 2023년 1월 16일

		System.out.println(rightNow2.get(Calendar.DAY_OF_WEEK));
		// → 2

		System.out.println(week2[rightNow2.get(Calendar.DAY_OF_WEEK)-1]);
		// → 월요일
	}
}