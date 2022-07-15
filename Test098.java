/*===============================================
				클래스와 인스턴스
	- 정보 은닉과 접근 제어 지시자
===============================================*/

import java.util.Scanner;

class CircleTest2
{
	// 멤버 변수, 인스턴스 변수, 전역 변수
	// int num;

	// ↓

	private int num;
	// 정보 은닉(Information Hiding)
	// 『private』접근제어지시자의 선언은 클래스 내부에서만 접근 및 참조할 수 있게 하겠다는 의미
	// int 형 전역 변수 → 자동으로 0 초기화 지원

	// num 변수 초기화 불가 → getter / setter 구성
	/*
	int getNum()
	{
		return num;
	}

	void setNum(int num)
	{
		this.num = num;
		// CircleTest2.num = num;
	}
	*/
	
	void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("반지름 입력 : ");
		num = sc.nextInt();
	}
	
	double calArea()
	{
		return num * num * 3.141592;
	}

	void write(double area)
	{
		System.out.println("반지름 : " + num);
		System.out.println("넓이 : " + area);
	}
}



public class Test098
{
	public static void main(String[] args)
	{
		// CircleTest2 인스턴스 생성
		CircleTest2 ob1 = new CircleTest2();

		// ob1.num = 10;
		//		↓
		// ob1.setNum(10);

		// System.out.println("원의 반지름 : " + ob1.num);
		//						↓
		// System.out.println("원의 반지름 : " + ob1.getNum());
		
		// 현재로써는 유일하게 CircleTest2의 num에 데이터를 전달할 수 있는 방법
		ob1.input();
		// → ob1.num = 500

		double result = ob1.calArea();

		ob1.write(result);
	}
}

// 최종 결과
/*
	반지름 입력 : 500
	반지름 : 500
	넓이 : 785398.0
	계속하려면 아무 키나 누르십시오 . . .
*/