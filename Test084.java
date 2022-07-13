/*===============================================
						배열
	- 배열의 선언과 초기화
	- 배열의 기본적 활용
===============================================*/

// ○ 과제
//	  사용자로부터 임의의 학생 수를 입력받고
//	  그만큼의 점수(정수 형태)를 입력받아
//	  전체 학생 점수의 합, 평균, 편차를 구해서 결과를 출력하는 프로그램 구현

// 실행 예)
// 학생 수 입력 : 5
// 1번 학생의 점수 입력 : 90
// 2번 학생의 점수 입력 : 82
// 3번 학생의 점수 입력 : 64
// 4번 학생의 점수 입력 : 36
// 5번 학생의 점수 입력 : 98

// >> 합 : 370
// >> 평균 : 74.0
// >> 편차
// 90 : -16.0
// 82 : -8.0
// 64 : 10.0
// 36 : 38.0
// 98 : -24.0
// 계속하려면 아무 키나 누르세요...

import java.util.Scanner;

public class Test084
{
	public static void main(String[] args)
	{	
		// 변수 선언
		int stuNum, sum=0;							// -- 학생수, 합
		double avg;									// -- 평균

		Scanner sc = new Scanner(System.in);
		

		// 사용자 입력값 - 학생 수
		System.out.print("학생 수 입력 : ");
		stuNum = sc.nextInt();
		
		int arr[] = new int[stuNum];


		// 사용자 입력값 반복 연산 - 점수
		for (int i=0; i<stuNum; i++)
		{
			System.out.printf("%d번 학생의 점수 입력 : ", i+1);
			arr[i] = sc.nextInt();
		}
		System.out.println();

		
		// 전체 합
		for (int i=0; i<stuNum; i++)
		{
			sum += arr[i];
		}
		

		// 평균
		avg = (double)sum/stuNum;
		
		
		// 결과 출력
		System.out.println(">> 합 : " + sum);
		System.out.println(">> 평균 : " + avg);
		System.out.println(">> 편차");
		for (int i=0; i<stuNum; i++)
			System.out.printf("%d : %.1f%n", arr[i], (avg-arr[i]));
	}
}

// 최종 결과
/*
	학생 수 입력 : 5
	1번 학생의 점수 입력 : 90
	2번 학생의 점수 입력 : 82
	3번 학생의 점수 입력 : 64
	4번 학생의 점수 입력 : 36
	5번 학생의 점수 입력 : 98

	>> 합 : 370
	>> 평균 : 74.0
	>> 편차
	90 : -16.0
	82 : -8.0
	64 : 10.0
	36 : 38.0
	98 : -24.0
	계속하려면 아무 키나 누르십시오 . . .
*/