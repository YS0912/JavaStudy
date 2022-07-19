/*===================================================================
						정렬(Sort) 알고리즘
===================================================================*/

// ○ 과제
//		사용자로부터 여러 학생의 성적 데이터를 입력받아
//		점수가 높은 학생부터 낮은 순으로 등수를 부여하여 결과를 출력하는 프로그램을 구현
//		단, 배열과 정렬 알고리즘을 활용하여 작성할 수 있도록 한다.

// 실행 예)
// 인원 수 입력 : 5
// 이름 점수 입력(1, 공백 구분) : 장현성 90
// 이름 점수 입력(2, 공백 구분) : 정미경 80
// 이름 점수 입력(3, 공백 구분) : 최동현 85
// 이름 점수 입력(4, 공백 구분) : 조현하 75
// 이름 점수 입력(5, 공백 구분) : 박원석 95

// -------------
// 1등 박원석 95
// 2등 장현성 90
// 3등 최동현 85
// 4등 정미경 80
// 5등 조현하 75
// -------------
// 계속하려면 아무 키나 누르세요...

/*
○ 문제 분석
	
	1. 이름과 점수를 변수로 가진 Record 클래스를 생성
	2. Record 클래스를 기반으로 하는 배열에 반복문을 통해 인원수만큼의 배열방에 이름과 점수 저장
	3. 저장한 점수를 각각 비교하여 Record 배열방 째로 데이터 소팅

*/

import java.util.Scanner;

class Record
{
	String name;
	int score;
}

public class Test110
{
	public static void main(String[] args)
	{
		// 변수 선언: 인원 수, 향상된 버블정렬용 플래그
		int inwon, pass=0;
		boolean flag;

		// Record 기반의 배열 생성
		Record[] rec;

		// 사용자 입력값 : 인원 수
		Scanner sc = new Scanner(System.in);

		System.out.print("인원 수 입력 : ");
		inwon = sc.nextInt();

		// Record 기반의 배열에 입력받은 인원 수만큼의 배열방 부여
		rec = new Record[inwon+1];

		// rec 배열에 이름과 점수를 각각 초기화
		for (int i=0; i<inwon; i++)
		{	
			// Record 클래스 기반의 인스턴스 생성 (rec 한칸에 Record 값을 담을 거라고 선언)
			rec[i] = new Record();
			
			System.out.printf("이름 점수 입력(%d, 공백 구분) : ", i+1);
			rec[i].name = sc.next();
			rec[i].score = sc.nextInt();
		}

		// 초기화한 데이터 중 rec[i].score 데이터를 각각 비교하여 정렬
		// 향상된 버블정렬을 이용
		do
		{
			flag = false;
			pass++;

			for (int i=0; i<inwon-pass; i++)
			{
				if (rec[i].score < rec[i+1].score)
				{
					rec[inwon] = rec[i];
					rec[i] = rec[i+1];
					rec[i+1] = rec[inwon];

					flag = true;
				}
			}
		}
		while (flag);

		// 테스트
		// for (int i=0; i<inwon; i++)
		//	System.out.println(rec[i].name + rec[i].score);

		// 출력
		System.out.println();
		System.out.println("-------------");
		for (int i=0; i<inwon; i++)
			System.out.printf("%d등 %s %d%n", i+1, rec[i].name, rec[i].score);
		System.out.println("-------------");


	}
}

// 최종 결과
/*
	인원 수 입력 : 5
	이름 점수 입력(1, 공백 구분) : 장현성 90
	이름 점수 입력(2, 공백 구분) : 정미경 80
	이름 점수 입력(3, 공백 구분) : 최동현 85
	이름 점수 입력(4, 공백 구분) : 조현하 75
	이름 점수 입력(5, 공백 구분) : 박원석 95

	-------------
	1등 박원석 95
	2등 장현성 90
	3등 최동현 85
	4등 정미경 80
	5등 조현하 75
	-------------
	계속하려면 아무 키나 누르십시오 . . .
*/