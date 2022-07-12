/*=========================================================
					클래스와 인스턴스
		CircleTest.java 와 세트
=========================================================*/

import java.io.IOException;

public class Test071
{
	public static void main(String[] args) throws IOException
	{	
		// 내 풀이 ----------------------------------------------------------------------

		/*
		// CircleTest 기반의 인스턴스 생성
		CircleTest ob = new CircleTest();

		// 생성한 인스턴스의 입력 메소드 호출
		ob.input();

		// 생성한 인스턴스의 넓이 연산 메소드 호출
		double area = ob.calArea();

		// 생성한 인스턴스의 둘레 연산 메소드 호출
		double length = ob.calLength();

		// 생성한 인스턴스의 결과 출력 메소드 호출
		ob.print(area, length);
		*/

		// 선생님 풀이 ------------------------------------------------------------------

		// CircleTest 클래스 기반 인스턴스 생성
		// CircleTest 인스턴스 생성
		// CircleTest 객체 생성
		CircleTest ob = new CircleTest();

		ob.input();
		// → 컴파일 오류
		//	  CircleTest에서 input 메소드 바깥으로 오류 가능성이 있는 구문을 던졌지만,
		//	  main을 벗어나지는 못했기 때문에 한 번 더 던져 줘야 한다.

		double num1 = ob.calArea();
		double num2 = ob.calLength();
		
		ob.print(num1, num2);
	}
}