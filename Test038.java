/*===================================================================
				���� ���� �帧�� ��Ʈ�� (���) ����
	if��
	if ~ else��
===================================================================*/

// ����ڷκ��� ������ ���� 5���� �Է� �޾�
// ¦����, Ȧ���� �հ踦 ����ϴ� ���α׷��� ����
// ��, Scanner�� Ȱ���Ͽ� �����͸� �Է¹��� �� �ֵ��� �Ѵ�.

// ���� ��)
// ������ ���� 5�� �Է�(���� ����) : 1 2 3 4 5

// >> ¦���� ���� 6 �̰�, Ȧ���� ���� 9 �Դϴ�.
// ����Ϸ��� �ƹ� Ű�� ��������...

import java.util.Scanner;

public class Test038
{
	public static void main(String[] args)
	{
		/*
		// �ֿ� ���� ����
		Scanner sc = new Scanner(System.in);
		
		int a, b, c, d, e;
		int sum1=0, sum2=0;

		// ���� �� ó��
		System.out.print("������ ���� 5�� �Է�(���� ����) : ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		e = sc.nextInt();
		
		
		if (a%2==0)
			sum1 += a;
		else
			sum2 += a;

		
		if (b%2==0)
			sum1 += b;
		else
			sum2 += b;


		if (c%2==0)
			sum1 += c;
		else
			sum2 += c;


		if (d%2==0)
			sum1 += d;
		else
			sum2 += d;


		if (e%2==0)
			sum1 += e;
		else
			sum2 += e;

		System.out.printf("%n>> ¦���� ���� %d �̰�, Ȧ���� ���� %d �Դϴ�.%n", sum1, sum2);
		*/


		// ������ Ǯ�� ----------------------------------------------------------------------------
		
		Scanner sc = new Scanner(System.in);

		// �� �������� ��Ƴ� ���� �ʱ�ȭ ��
		int evenSum = 0;
		int oddSum= 0;
		int num1, num2, num3, num4, num5;

		System.out.print("������ ���� 5�� �Է�(���� ����) : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		num4 = sc.nextInt();
		num5 = sc.nextInt();

		if (num1%2==0)
			evenSum += num1;
		else
			oddSum += num1;
			
		if (num2%2==0)
			evenSum += num2;
		else
			oddSum += num2;

		if (num3%2==0)
			evenSum += num3;
		else
			oddSum += num3;

		if (num4%2==0)
			evenSum += num4;
		else
			oddSum += num4;

		if (num5%2==0)
			evenSum = num5;
		else
			oddSum = num5;
		
		System.out.printf("%n>> ¦���� ���� %d �̰�, Ȧ���� ���� %d �Դϴ�.%n", evenSum, oddSum);

		
		// �������
		/*
			������ ���� 5�� �Է�(���� ����) : 24 25 26 27 28

			>> ¦���� ���� 28 �̰�, Ȧ���� ���� 52 �Դϴ�.
			����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
		*/
		

	}
}