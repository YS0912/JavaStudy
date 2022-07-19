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

// Aclass�� ��ӹ޴� Ŭ������ ����
class Bclass extends Aclass
{	
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
}


// main() �޼ҵ带 �����ϰ� �ִ� �ܺ��� �ٸ� Ŭ����
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