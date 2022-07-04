/*================================================================================
						 ���� �ڹ� �⺻ ���α׷��� ����
	����: ��� ������,  BufferedReader, printf()
		
	����ڷκ��� ������ ������ �� �� �Է� �޾�
	��Ģ ���� �� ������ ������ �����Ͽ� �� ����� ����ϴ� ���α׷� ����
	��, �Է� �޴� ������ BufferedReader �� Ȱ���ϰ�
	����ϴ� ������ printf() �޼ҵ带 Ȱ��
	���� ������ ������ ���ǻ� ���� ������� ó��
=============================================================================*/

// ���� ��)
// ù ��° ���� �Է� : 10
// �� ��° ���� �Է� : 2

// ==== [���] ====
// 10 + 2 = 12
// 10 - 2 = 8
// 10 * 2 = 20
// 10 / 2 = 5
// 10 % 2 = 0
// =================

// �� Ǯ�� --------------------------------------------------------------------------------------------------

/*
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test021
{
	public static void main(String[] args) throws IOException			// throw �� ���� ����ų �Ŷ�� ����
	{


		// �ֿ� ���� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num1, num2;
		int sum, sub, mul, div, rem;

		// ���� �� ó��
		System.out.print("ù ��° ���� �Է� : ");
		num1 = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է� : ");
		num2 = Integer.parseInt(br.readLine());

		sum = num1 + num2;
		sub = num1 - num2;
		mul = num1 * num2;
		div = num1 / num2;
		rem = num1 % num2;

		// ��� ���
		System.out.printf("\n==== [���] ====\n");
		System.out.printf("%d + %d = %d\n", num1, num2, sum);
		System.out.printf("%d - %d = %d\n", num1, num2, sub);
		System.out.printf("%d * %d = %d\n", num1, num2, mul);
		System.out.printf("%d / %d = %d\n", num1, num2, div);
		System.out.printf("%d %% %d = %d\n", num1, num2, rem);
		System.out.printf("=================\n");
	}
}
*/



// ������ Ǯ�� ---------------------------------------------------------------------------

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test021
{
	public static void main(String[] args) throws IOException
	{
		// �ֿ� ���� ����
		int num1, num2;								// -- ������� �Է°�
		int res1, res2, res3, res4, res5;			// -- ���� ����� ���� ����

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// ���� �� ó��
		System.out.print("ù ���� ���� �Է� : ");
		num1 = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է� : ");
		num2 = Integer.parseInt(br.readLine());

		res1 = num1 + num2;
		res2 = num1 - num2;
		res3 = num1 * num2;
		res4 = num1 / num2;
		res5 = num1 % num2;

		// ��� ���
		System.out.printf("\n==== [���] ====\n");

		System.out.printf("%d + %d = %d\n", num1, num2, res1);
		System.out.printf("%d - %d = %d\n", num1, num2, res2);
		System.out.printf("%d * %d = %d\n", num1, num2, res3);
		System.out.printf("%d / %d = %d\n", num1, num2, res4);
		System.out.printf("%d %% %d = %d\n", num1, num2, res5);

		System.out.printf("=================\n");
	}
}