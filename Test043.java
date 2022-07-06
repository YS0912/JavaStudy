/*===================================================================
				���� ���� �帧�� ��Ʈ�� (���) ����
	switch ��
===================================================================*/

// ����ڷκ��� ������ �� ������ �����ڸ� �Է� �޾�
// �ش� �������� ���� ó�� ����� ����ϴ� ���α׷��� �����Ѵ�.
// ��, switch ���� Ȱ���Ͽ� ó���� �� �ֵ��� �ϸ�
// ���� ����� ���ǻ� ���� ���·� ó���� �� �ֵ��� �Ѵ�.

// ���� ��)
// ù ��° ���� �Է�     : 3
// �� ��° ���� �Է�     : 17
// ������ �Է� [+ - * /] : -

// >> 3 - 17 = -14
// ����Ϸ��� �ƹ� Ű��...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test043
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		

		/* ��
		int num1, num2;
		int op;
		int result;

		System.out.print("ù ���� ���� �Է�     : ");
		num1 = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է�     : ");
		num2 = Integer.parseInt(br.readLine());

		System.out.print("������ �Է� [+ - * /] : ");
		op = System.in.read();

		switch (op)
		{
		case 43:
			result = num1 + num2;
			break;
		case 45:
			result = num1 - num2;
			break;
		case 42:
			result = num1 * num2;
			break;
		case 47:
			result = num1 / num2;
			break;
		default: return;				// 1. ���� ��ȯ			-- return "�Է¿���"
										// 2. �޼ҵ� ����		-- main() �޼ҵ� ����: ���α׷� ����
		}
		
		System.out.printf("%n>> %d %c %d = %d%n", num1, op, num2, result);		// op ���� ��ȯ �ʿ� X
		*/


		// ��
		int a, b, result;
		char op;

		System.out.print("ù ��° ���� �Է�     : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("�� ���� ���� �Է�     : ");
		b = Integer.parseInt(br.readLine());

		System.out.print("������ �Է� [+ - * /] : ");
		op = System.in.read();

		switch (op)
		{
		case '+': result = a + b; break;
		case '=': result = a - b; break;
		case '*': result = a * b; break;
		case '/': result = a / b; break;
		}

		System.out.printf("%n>> %d %c %d = %d%n", a, op, b, result);
	}
}