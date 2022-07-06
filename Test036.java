/*===================================================================
				���� ���� �帧�� ��Ʈ�� (���) ����
	if��
	if ~ else��
===================================================================*/

// 1. ���α׷��� �ۼ��� �� �־��� ���ǿ� ���� �б� ������ ���ϱ� ���� ����ϴ� �������
//	  if��, in ~ else��, ���� ������, ���� if��(if�� ��ø), switch���� �ִ�.

// 2. if���� if ������ ������ ���� ���, Ư�� ������ �����ϰ��� �� �� ���Ǵ� ����

// ����ڷκ��� ������ �� ������ �����ڸ� �Է¹޾�
// �ش� �������� ���� ó�� ����� ����ϴ� ���α׷��� ����
// ��, if ���ǹ��� Ȱ���Ͽ� ó���� �� �ֵ��� �ϸ�,
// ���� ����� ���ǻ� ���� ������� ó���� �� �ֵ��� �Ѵ�.

// ���� ��)
// ù ��° ���� �Է�    : 10
// �� ��° ���� �Է�    : 3
// ������ �Է�[+ - * /] : +

// >> 10 + 3 = 13


// �� Ǯ�� ------------------------------------------------------------------------------

/*
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test036
{
	public static void main(String[] args) throws IOException
	{
		// �ֿ� ���� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num1, num2;
		char opr;
		
		int res1, res2, res3, res4;

		// ���� �� ó��

		// ����� �Է°� �ޱ�
		System.out.print("ù ��° ���� �Է�    : ");
		num1 = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է�    : ");
		num2 = Integer.parseInt(br.readLine());

		System.out.print("������ �Է�[+ - * /] : ");
		opr = (char)System.in.read();
		

		// ��Ģ ���� ���� ����
		res1 = num1 + num2;
		res2 = num1 - num2;
		res3 = num1 * num2;
		res4 = num1 / num2;
		
		// if ���� ó��
		if (opr == '+')
		{
			System.out.printf("%n>> %d %c %d = %d%n", num1, opr, num2, res1);
		}
		else if (opr == '-')
		{
			System.out.printf(">> %d %c %d = %d%n", num1, opr, num2, res2);
		}
		else if (opr == '*')
		{
			System.out.printf(">> %d %c %d = %d%n", num1, opr, num2, res3);
		}
		else if (opr == '/')
		{
			System.out.printf(">> %d %c %d = %d%n", num1, opr, num2, res4);
		}
		else
		{
			System.out.println("������ ����");
		}

	}
}
*/


// ������ Ǯ�� --------------------------------------------------------------------------

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test036
{
	public static void main(String[] args) throws IOException
	{
		/*
		// �����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a, b;			// -- ù ��°, �� ��° ����
		char op;			// -- ������

		System.out.print("ù ���� ���� �Է�     : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է�     : ");
		b = Integer.parseInt(br.readLine());

		System.out.print("������ �Է� [+ - * /] : ");
		// op = (char)Integer.parseInt(br.readLine());		-- ���ڸ� �Է��ϴ� ���� �ƴ϶� int ��ȯ �Ұ���
		op = (char)System.in.read();
		
		if (op == '+')									// -- ����ڰ� �Է��� �����ڰ� '+' ���
		{
			// a �� b �� ���� ���� �����Ͽ� ���
			System.out.printf("\n>> %d + %d = %d\n", a, b, (a+b));
		}
		else if (op == '-')								// -- ����ڰ� �Է��� �����ڰ� '-' ���
		{
			// a �� b �� ���� ���� �����Ͽ� ���
			System.out.printf(">> %d - %d = %d\n", a, b, (a-b));
		}
		else if (op == '*')								// -- ����ڰ� �Է��� �����ڰ� '*' ��� 
		{
			// a �� b �� ���� ���� �����Ͽ� ���
			System.out.printf(">> %d * %d = %d\n", a, b, (a*b));
		}
		else if (op == '/')								// -- ����ڰ� �Է��� �����ڰ� '/' ��� 
		{
			// a �� b �� ������ ���� �����Ͽ� ���
			System.out.printf(">> %d / %d = %d\n", a, b, (a/b));
		}
		else
		{
			System.out.printf(">> �Է°����� ������ �����մϴ�.\n");
		}
		*/


		/*
		// �����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a, b, op;			// -- ù ��°, �� ��° ����					�� ������ ���� �����

		System.out.print("ù ���� ���� �Է�     : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է�     : ");
		b = Integer.parseInt(br.readLine());

		System.out.print("������ �Է� [+ - * /] : ");
		// op = (char)Integer.parseInt(br.readLine());
		op = System.in.read();
		
		if (op == 43)
		{
			System.out.printf("\n>> %d + %d = %d\n", a, b, (a+b));
		}
		else if (op == 45)
		{
			System.out.printf(">> %d - %d = %d\n", a, b, (a-b));
		}
		else if (op == 42)
		{
			System.out.printf(">> %d * %d = %d\n", a, b, (a*b));
		}
		else if (op == 47)
		{
			System.out.printf(">> %d / %d = %d\n", a, b, (a/b));
		}
		else
		{
			System.out.printf(">> �Է°����� ������ �����մϴ�.\n");
		}
		*/

		// �����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// check~!!!
		int a, b, result=0;
		char op;
		
		System.out.print("ù ��° ���� �Է�     : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է�     : ");
		b = Integer.parseInt(br.readLine());

		System.out.print("������ �Է� [+ - * /] : ");
		op = (char)System.in.read();

		if (op=='+')
			result = a + b;
		else if (op=='-')
			result = a - b;
		else if (op=='*')
			result = a * b;
		else if (op=='/')
			result = a / b;

		// ������~
		// ����� else �� ���� ��Ȳ����?
		// �׷� �ڹٰ� �������� ��� ������ �����ϴ� ��������
		// result �� ������� ���� ���� �ְڴ�... �ϴ� ������ �Ѵٰ�
		// �߾��ݾ�?
		// �׷���... �ڹپ�~ ���� ��� else ������ �������� �ʾ�����
		// result �� ����ϴµ� ���� ������ ó�����ٲ�~
		// �ؾ� �ϴ� ��Ȳ


		System.out.printf("\n>> %d %c %d = %d\n", a, op, b, result);
	}
}