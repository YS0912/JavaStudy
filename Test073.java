/*=========================================================
					Ŭ������ �ν��Ͻ�
=========================================================*/

// ����ڷκ��� ������ �� ������ �����ڸ� �Է¹޾�
// �ش� ������ �����ϴ� ���α׷��� ����
// ��, Ŭ������ �ν��Ͻ��� ������ Ȱ���Ͽ� �ۼ��� �� �ֵ��� �Ѵ�.
// (Calculate Ŭ���� ����)

// ���� ��)
// ������ �� ���� �Է�(���� ����) : 10 5
// ������ ������(+ - * /)         : +
// >> 10 + 5 = 15
// ����Ϸ��� �ƹ� Ű�� ��������...

import java.util.Scanner;
import java.io.IOException;

class Calculate
{
	// �� Ǯ�� ------------------------------------------------------------------------------------
	
	/*
	// �ֿ� �Ӽ�
	int num1, num2;
	char ch=' ';
	int result;

	// �ֿ� ���
	// ���� �Է� ���
	void input() throws IOException
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("������ �� ���� �Է�(���� ����) : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();

		System.out.print("������ ������(+ - * /)         : ");
		ch = (char)System.in.read();
	}

	// ���� ���
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

	// ��� ��� ���
	void print()
	{
		System.out.printf(">> %d %c %d = %d%n", num1, ch, num2, result);
	}
	*/

	// ������ Ǯ�� --------------------------------------------------------------------------------

	// �ֿ� ���� ����
	int su1, su2;				// -- ����ڷκ��� �Է¹��� �� ����
	char op;					// -- ����ڷκ��� �Է¹��� ������

	// �޼ҵ� ����(��� : �Է�)
	void input() throws IOException
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("������ �� ���� �Է�(���� ����) : ");
		su1 = sc.nextInt();
		su2 = sc.nextInt();

		System.out.print("������ ������(+ - * /)         : ");
		op = (char)System.in.read();
	}

	// �޼ҵ� ����(��� : ����) (���� ���)
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

	// �޼ҵ� ����(��� : ���)
	void print(int s)
	{
		System.out.printf(">> %d %c %d = %d\n", su1, op, su2, s);
	}
	
}

public class Test073
{
	public static void main(String[] args) throws IOException
	{
		// �� Ǯ�� --------------------------------------------------------------------------------

		/*
		// �ν��Ͻ� ����
		Calculate ob = new Calculate();

		// �Է� �޼ҵ� ȣ��
		ob.input();

		// ���� �޼ҵ� ȣ��
		ob.Cal();
		
		// ��� �޼ҵ� ȣ��
		ob.print();
		*/

		// ������ Ǯ�� ----------------------------------------------------------------------------

		// Calculate �ν��Ͻ� ����
		Calculate cal = new Calculate();

		cal.input();						// -- ������ �ν��Ͻ��� ���� �Է� �޼ҵ� ȣ��
		int r = cal.cal();					// -- ������ �ν��Ͻ��� ���� ���� �޼ҵ� ȣ��
		cal.print(r);						// -- ������ �ν��Ͻ��� ���� ��� �޼ҵ� ȣ��
	}
}

// ���� ��� ���

/*
	������ �� ���� �Է�(���� ����) : 10 5
	������ ������(+ - * /)         : +
	>> 10 + 5 = 15
	����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/