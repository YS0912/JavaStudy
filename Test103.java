/*===================================================================
							클래스와 인스턴스
	- 메소드 중복 정의(Method Overloading)
===================================================================*/

/*
○ 메소드 오버로딩(Method Overloading)의 개요

	메소드 오버로딩이란 메소드가 처리하는 기능은 같고
	메소드 괄호 속에 오는 인수(인자, 매개변수, 파라미터)의 갯수나 자료형(Data Type)이 다른 경우,
	메소드의 이름을 동일한 이름으로 부여하여 메소드를 정의할 수 있도록 문법적으로 허용하게 되는데
	이를 메소드 오버로딩(Method Overloading)이라고 한다.

	cf) 메소드 오버라이딩은 상속이라는 개념 하에서는 성립
*/

public class Test103
{
	public static void main(String[] args)
	{	
		/*
		Test103 ob = new Test103();
		ob.drawLine();

		→ 둘 다 static이 붙어있기 때문에 생략 가능(탄생시점)
		*/
		
		// Test103.drawLine();
		drawLine();

		drawLine('-');
		drawLine('<');

		drawLine('+', 40);
		drawLine('/', 30);
	}

	// 선을 그리는 메소드 정의
	public static void drawLine()
	{
		System.out.println("====================");
	}

	// 선을 그리는 메소드 정의 → 선의 형태를 바꾸어 그리는 메소드
	public static void drawLine(char c)
	{
		// System.out.println("\\\\\\\\\\\\\\\\\\\");	→ 아무런 차이 없이 이렇게는 불가
		
		for (int i=0; i<20; i++)
			System.out.print(c);
		System.out.println();
	}

	// 선을 그리는 메소드 정의 → 선의 형태와 길이를 바꾸어 그리는 메소드
	public static void drawLine(char c, int n)
	{
		for (int i=0; i<n; i++)
			System.out.print(c);
		System.out.println();
	}
}