/*===================================================================
							클래스 고급
	- 상속(Inheritance)
===================================================================*/

// 다음과 같은 프로그램을 구현한다.
// 단, 상속의 개념을 적용하여 작성할 수 있도록 한다.

// 실행 예)
// 임의의 두 정수 입력(공백 구분) : 20 15
// 연산자 입력(+ - * /) : -
// >> 20 - 15 = 5
// 계속하려면 아무 키나 누르세요...

import java.util.Scanner;

class Aclass
{
	protected int x, y;
	protected String op;
	protected double result;

	Aclass()
	{
	}

	void write(double result)
	{
		System.out.printf(">> %d %s %d = %.2f\n", x, op, y, result);
	}
}

// Aclass를 상속받는 클래스로 설계
class Bclass extends Aclass
{	
	public void input()
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("임의의 두 정수 입력(공백 구분) : ");
		x = sc.nextInt();
		y = sc.nextInt();

		System.out.print("연산자 입력(+ - * /) : ");
		op = sc.next();
	}
	
	public double calc()
	{
		// double result;

		switch (op)
		{
			case "+" : return result = x + y;
			case "-" : return result = x - y;
			case "*" : return result = x * y;
			default : return result = x / y;
		}
	}
}


// main() 메소드를 포함하고 있는 외부의 다른 클래스
public class Test113
{
	public static void main(String[] args)
	{
		Bclass ob = new Bclass();

		ob.input();
		ob.result = ob.calc();
		ob.write(ob.result);
	}
}