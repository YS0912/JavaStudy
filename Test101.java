/*====================================
   ■■■ 클래스와 인스턴스 ■■■
   - 클래스와 인스턴스 활용
====================================*/

// 학생별로 국어점수, 영어점수, 수학점수를 입력받아
// 총점, 평균을 계산하는 프로그램을 구현한다.
// 단, 클래스의 개념을 활용하여 작성할 수 있도록 한다.
// 또한, 이 과정에서 배열을 적극적으로 활용할 수 있도록 한다.
// 클래스 설계는 다음의 가이드라인에 따라 진행할 수 있도록 한다.

// [가이드라인]
// 프로그램을 구성하는 클래스
// 1. Record 클래스
//	  - 속성만 존재하는 클래스로 설계할 것~!!!(값을 가지고 있는 클래스, 변수만 가진 클래스)

// 2. Sungjuk 클래스
//	  - 인원 수를 입력받아, 입력받은 인원 수 만큼
//		이름, 국어점수, 영어점수, 수학점수를 입력받고
//		총점과 평균을 산출하는 클래스로 설계할 것~!!!
//		·속성 : 인원수, Record 타입의 배열 (Record[] recArr;)
//		·기능 : 인원수 입력, 상세 데이터 입력, 총점 및 평균 연산, 결과 출력
// 3. Test101 클래스
//	  - main() 메소드가 존재하는 외부 클래스로 설계할 것~!!!

// 실행 예)
// 인원 수 입력(1~100) : 102
// 인원 수 입력(1~100) : -10
// 인원 수 입력(1~100) : 3

// 1번째 학생의 이름 입력 : 장현성
// 국어 점수 : 90
// 영어 점수 : 80
// 수학 점수 :70

// 2번째 학생의 이름 입력 : 정미경
// 국어 점수 :
// 영어 점수 :
// 수학 점수 :

// 3번째 학생의 이름 입력 :
// 국어 점수 : 
// 영어 점수 :
// 수학 점수 :

// 장현성 90 80 70 240 xx.xx 2
// 정미경 92 82 72 xxx xx.xx 1
// 조영관 82 72 62 xxx xx.xx 3

import java.util.Scanner;

public class Test101
{
	public static void main(String[] args)
	{
		Sungjuk sj = new Sungjuk();
		sj.set();
		sj.input();
		sj.print();
	}
}

/*
import java.util.Scanner;

class Sungjuk
{
	Scanner sc = new Scanner(System.in);
	int num;
	Record[] rec;

	void process()
	{
		input();
		score();
		compare();
		write();
	}

	void input()
	{
		do
		{
			System.out.print("인원 수 입력(1~100) : ");
			num = sc.nextInt();
		}
		while (num < 1 || num > 100);
	}

	void score()
	{
		rec = new Record[num];
		System.out.println();

		for (int i = 0; i < num; i++)
		{
			rec[i] = new Record();
			System.out.printf("%d번째 학생의 이름 입력 : ", i + 1);
			rec[i].name = sc.next();
			
			System.out.print("국어 점수 : ");
			rec[i].score[0] = sc.nextInt();
			
			System.out.print("영어 점수 : ");
			rec[i].score[1] = sc.nextInt();

			System.out.print("수학 점수 : ");
			rec[i].score[2] = sc.nextInt();

			rec[i].tot = rec[i].score[0] + rec[i].score[1] + rec[i].score[2];
			rec[i].avg = rec[i].tot / 3.0;

			System.out.println();
		}
	}

	void compare()
	{
		for (int i = 0; i < num; i++)
			rec[i].rank = 1;

		for (int i = 0; i < num; i++)
		{
			for (int j = i + 1; j < num; j++)
			{
				if (rec[i].tot > rec[j].tot)
					rec[j].rank++;
				else if (rec[i].tot < rec[j].tot)
					rec[i].rank++;
			}
		}
	}

	void write()
	{
		for (int i = 0; i < num; i++)
			System.out.printf("%3s%4d%4d%4d%5d%8.2f%4d\n", rec[i].name, rec[i].score[0], rec[i].score[1], rec[i].score[2], rec[i].tot, rec[i].avg, rec[i].rank);
	}
}

public class Test101
{
	public static void main(String[] args)
	{
		Sungjuk sj = new Sungjuk();

		sj.process();
	}
}
*/