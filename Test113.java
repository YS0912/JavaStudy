/*===================================================================
							Ŭ���� ���
	- ���(Inheritance)
===================================================================*/

// ������ ���� ���α׷��� �����Ѵ�.
// ��, ����� ������ �����Ͽ� �ۼ��� �� �ֵ��� �Ѵ�.

// ���� ��)
// ������ �� ���� �Է�(���� ����) : 20 15
// ������ �Է�(+ - * /) : -
// >> 20 - 15 = 5
// ����Ϸ��� �ƹ� Ű�� ��������...

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

// Aclass�� ��ӹ޴� Ŭ������ ����
class Bclass extends Aclass
{	
	/* Aclass�κ��� ��� ���� ����
	protected int x, y;
	protected String op;
	protected double result;

	void write(double result)
	{
		System.out.printf(">> %d %s %d = %.2f\n", x, op, y, result);
	}
	*/
	
	// ��Ǯ�� -----------------------------------------------------------------
	
	/*
	public void input()
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("������ �� ���� �Է�(���� ����) : ");
		x = sc.nextInt();
		y = sc.nextInt();

		System.out.print("������ �Է�(+ - * /) : ");
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


	// ������ Ǯ�� ------------------------------------------------------------
		
	public boolean input() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("������ �� ���� �Է�(���� ����) : ");
		String temp = br.readLine();

		// ���ڿ�.split("������");
		// ���ڿ�.split("\\s");		�� ������ ����
		//	�� {"10", "20", "30", "40"}
		
		String[] strArr = temp.split("\\s");
		
		if (strArr.length != 2)
			return false;
			// false �� ��ȯ�ϸ� input() �޼ҵ� ����
			// �� ������ �����Ͽ� if ���� �����ϰ� �� ��� �Ʒ� ������ �ڵ尡 ���Ҵ���
			// �����(false)�� ��ȯ�ϸ� �޼ҵ带 �����Ѵ�.

		x = Integer.parseInt(strArr[0]);
		y = Integer.parseInt(strArr[1]);

		System.out.print("������ �Է�(+ - * /) : ");
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


// main() �޼ҵ带 �����ϰ� �ִ� �ܺ��� �ٸ� Ŭ����
public class Test113
{
	public static void main(String[] args) throws IOException
	{
		Bclass ob = new Bclass();
		
		// �� Ǯ�� ------------------------------------------------------------
		
		/*
		ob.input();
		ob.result = ob.calc();
		ob.write(ob.result);
		*/


		// ������ Ǯ�� --------------------------------------------------------

		if (!ob.input())
		{
			System.out.println("Error");
			return;
		}
		
		double result = ob.calc();

		ob.write(result);
	}
}


