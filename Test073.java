/*=========================================================
					클래스와 인스턴스
=========================================================*/

// 사용자로부터 임의의 두 정수와 연산자를 입력받아
// 해당 연산을 수행하는 프로그램을 구현
// 단, 클래스와 인스턴스의 개념을 활용하여 작성할 수 있도록 한다.
// (Calculate 클래스 설계)

// 실행 예)
// 임의의 두 정수 입력(공백 구분) : 10 5
// 임의의 연산자(+ - * /)         : +
// >> 10 + 5 = 15
// 계속하려면 아무 키나 누르세요...

import java.util.Scanner;
import java.io.IOException;

class Calculate
{
	// 내 풀이 ------------------------------------------------------------------------------------
	
	/*
	// 주요 속성
	int num1, num2;
	char ch=' ';
	int result;

	// 주요 기능
	// 정수 입력 기능
	void input() throws IOException
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("임의의 두 정수 입력(공백 구분) : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();

		System.out.print("임의의 연산자(+ - * /)         : ");
		ch = (char)System.in.read();
	}

	// 연산 기능
	void Cal()
	{
		if (ch == '+')
			result = num1 + num2;
		else if (ch == '-')
			result = num1 - num2;
		else if (ch == '*')
			result = num1 * num2;
		else if (ch == '/')
			result = num1 / num2;
	}

	// 결과 출력 기능
	void print()
	{
		System.out.printf(">> %d %c %d = %d%n", num1, ch, num2, result);
	}
	*/

	// 선생님 풀이 --------------------------------------------------------------------------------

	// 주요 변수 선언
	int su1, su2;				// -- 사용자로부터 입력받은 두 정수
	char op;					// -- 사용자로부터 입력받은 연산자

	// 메소드 정의(기능 : 입력)
	void input() throws IOException
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("임의의 두 정수 입력(공백 구분) : ");
		su1 = sc.nextInt();
		su2 = sc.nextInt();

		System.out.print("임의의 연산자(+ - * /)         : ");
		op = (char)System.in.read();
	}

	// 메소드 정의(기능 : 연산) (정수 기반)
	int cal()
	{
		int result = 0;
		
		switch (op)
		{
		case '+': result = su1 + su2; break;
		case '-': result = su1 - su2; break;
		case '*': result = su1 * su2; break;
		case '/': result = su1 / su2; break;
		}

		return result;
	}

	// 메소드 정의(기능 : 출력)
	void print(int s)
	{
		System.out.printf(">> %d %c %d = %d\n", su1, op, su2, s);
	}
	
}

public class Test073
{
	public static void main(String[] args) throws IOException
	{
		// 내 풀이 --------------------------------------------------------------------------------

		/*
		// 인스턴스 생성
		Calculate ob = new Calculate();

		// 입력 메소드 호출
		ob.input();

		// 연산 메소드 호출
		ob.Cal();
		
		// 출력 메소드 호출
		ob.print();
		*/

		// 선생님 풀이 ----------------------------------------------------------------------------

		// Calculate 인스턴스 생성
		Calculate cal = new Calculate();

		cal.input();						// -- 생성한 인스턴스를 통한 입력 메소드 호출
		int r = cal.cal();					// -- 생성한 인스턴스를 통한 연산 메소드 호출
		cal.print(r);						// -- 생성한 인스턴스를 통한 결과 메소드 호출
	}
}

// 최종 결과 출력

/*
	임의의 두 정수 입력(공백 구분) : 10 5
	임의의 연산자(+ - * /)         : +
	>> 10 + 5 = 15
	계속하려면 아무 키나 누르십시오 . . .
*/