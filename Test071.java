/*=========================================================
					클래스와 인스턴스
		CircleTest.java 와 세트
=========================================================*/

import java.io.IOException;

public class Test071
{
	public static void main(String[] args) throws IOException
	{
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
	}
}