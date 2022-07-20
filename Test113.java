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

// import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Aclass
{
	protected int x, y;
	// protected String op;
	protected char op;
	// protected double result;

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
	/* Aclass로부터 상속 받은 내용
	protected int x, y;
	protected String op;
	protected double result;

	void write(double result)
	{
		System.out.printf(">> %d %s %d = %.2f\n", x, op, y, result);
	}
	*/
	
	// 내풀이 -----------------------------------------------------------------
	
	/*
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
	*/


	// 선생님 풀이 ------------------------------------------------------------
		
	public boolean input() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("임의의 두 정수 입력(공백 구분) : ");
		String temp = br.readLine();

		// 문자열.split("구분자");
		// 문자열.split("\\s");		◀ 구분자 공백
		//	→ {"10", "20", "30", "40"}
		
		String[] strArr = temp.split("\\s");
		
		if (strArr.length != 2)
			return false;
			// false 를 반환하며 input() 메소드 종료
			// 이 조건을 만족하여 if 문을 수행하게 될 경우 아래 수행할 코드가 남았더라도
			// 결과값(false)를 반환하며 메소드를 종료한다.

		x = Integer.parseInt(strArr[0]);
		y = Integer.parseInt(strArr[1]);

		System.out.print("연산자 입력(+ - * /) : ");
		op = (char)System.in.read();

		if (op!='+' && op!='-' && op!='*' && op!='/')
			return false;

		return true;

	} // clear input

	public double calc()
	{
		double result = 0;

		switch (op)
		{
			case '+' : result = x + y; break;
			case '-' : result = x - y; break;
			case '*' : result = x * y; break;
			case '/' : result = (double)x / y;
		}

		return result;

	} // clear calc
}


// main() 메소드를 포함하고 있는 외부의 다른 클래스
public class Test113
{
	public static void main(String[] args) throws IOException
	{
		Bclass ob = new Bclass();
		
		// 내 풀이 ------------------------------------------------------------
		
		/*
		ob.input();
		ob.result = ob.calc();
		ob.write(ob.result);
		*/


		// 선생님 풀이 --------------------------------------------------------

		if (!ob.input())
		{
			System.out.println("Error");
			return;
		}
		
		double result = ob.calc();

		ob.write(result);
	}
}


