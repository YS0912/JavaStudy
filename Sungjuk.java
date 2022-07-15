/*===================================================================
							클래스와 인스턴스
	- 클래스와 인스턴스 활용
	- Test101과 세트
===================================================================*/

// 2. Sungjuk 클래스
//		- 인원수를 입력받아, 입력받은 인원 수 만큼
//		  이름, 국어점수, 영어점수, 수학점수를 입력받고
//		  총점과 평균을 산출하는 클래스로 설계할 것
//		- 속성 : 인원수, Record 타입의 배열
//		- 기능 : 인원수 입력, 상세 데이터 입력, 총점 및 평균 연산, 결과 출력

import java.util.Scanner;

public class Sungjuk
{
	Scanner sc = new Scanner(System.in);

	int n;				// 입력한 학생 수

	// 인원수 입력
	public void input()
	{
		do
		{
			System.out.print("인원 수 입력(1~100) : ");
			n = sc.nextInt();
		}
		while (n<1 || n>100);
	}

	// 상세 데이터 입력
	public stu()
	{
		Record rec = new Record();

		// 학생들의 점수 기록이 들어갈 배열
		Record[] arr = new Record[3];

		for (int i=0; i<arr.length; i++)
		{
			System.out.printf("%d번째 학생의 이름 입력 : ", i);
			rec.name = sc.next();
			System.out.printf("국어 점수 : ");
			rec.score[0] = sc.nextInt();
			System.out.printf("영어 점수 : ");
			rec.score[1] = sc.nextInt();
			System.out.printf("수학 점수 : ");
			rec.score[2] = sc.nextInt();
		}
		
	}
	
	
}