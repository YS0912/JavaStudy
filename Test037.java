/*===================================================================
				���� ���� �帧�� ��Ʈ�� (���) ����
	if��
	if ~ else��
===================================================================*/

// 1. ���α׷��� �ۼ��� �� �־��� ���ǿ� ���� �б� ������ ���ϱ� ���� ����ϴ� �������
//	  if��, in ~ else��, ���� ������, ���� if��(if�� ��ø), switch���� �ִ�.

// 2. if���� if ������ ������ ���� ���, Ư�� ������ �����ϰ��� �� �� ���Ǵ� ����

// ����ڷκ��� ������ ���� �� ���� �Է¹޾�
// ���� ������ ū �� ������ ����ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
// ù ��° ���� �Է� : 753
// �� ���� ���� �Է� : 42
// �� ��° ���� �Է� : 127

// >> ���� ��� : 42 127 753
// ����Ϸ��� �ƹ� Ű�� ��������...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test037
{
	public static void main(String[] args) throws IOException
	{
		// �� Ǯ�� --------------------------------------------------------------------------------
		
		/*
		// �ֿ� ���� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a, b, c;

		// ���� �� ó��
		System.out.print("ù ��° ���� �Է� : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է� : ");
		b = Integer.parseInt(br.readLine());

		System.out.print("�� ���� ���� �Է� : ");
		c = Integer.parseInt(br.readLine());

		if (a>b && b>c)
			System.out.printf("%n>> ���� ��� : %d %d %d%n", c, b, a);
		else if (a>c && c>b)
			System.out.printf("%n>> ���� ��� : %d %d %d%n", b, c, a);
		else if (b>a && a>c)
			System.out.printf("%n>> ���� ��� : %d %d %d%n", c, a, b);
		else if (b>c && c>a)
			System.out.printf("%n>> ���� ��� : %d %d %d%n", a, c, b);
		else if (c>a && a>b)
			System.out.printf("%n>> ���� ��� : %d %d %d%n", b, a, c);
		else if (c>a && b>a)
			System.out.printf("%n>> ���� ��� : %d %d %d%n", a, b, c);
		else
			System.out.printf("�Է� ����%n");
		*/

		// �ݺ����� Ǯ�� --------------------------------------------------------------------------
		
		/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a, b, c;
		int max=0, mid=0, min=0;

		System.out.print("ù ��° ���� �Է� : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է� : ");
		b = Integer.parseInt(br.readLine());

		System.out.print("�� ���� ���� �Է� : ");
		c = Integer.parseInt(br.readLine());

		// a�� ���� Ŭ ��
		if (a>b && a>c && b>c)
		{
			max = a;
			mid = b;
			min = c;
		}
		else if (a>b && a>c && c>b)
		{
			max = a;
			mid = c;
			min = b;
		}
		else if (b>a && b>c && a>c)
		{
			max = b;
			mid = a;
			min = c;
		}
		else if (b>a && b>c && c>a)
		{
			max = b;
			mid = c;
			min = a;
		}
		else if (c>a && c>b && a>b)
		{
			max = c;
			mid = a;
			min = b;
		}
		else if (c>a && c>b && b>a)
		{
			max = c;
			mid = b;
			min = a;
		}

		System.out.printf("%n>> ���� ��� : %d %d %d%n", max, mid, min);
		*/

		// ������ Ǯ�� ----------------------------------------------------------------------------
		
		// �� ù ��° ���� vs �� ��° ���� ũ�� ��
		//		�� ù ��° ������ �� ��° �������� Ŭ ���... �ڸ� �ٲ�

		// �� ù ��° ���� vs �� ��° ���� ũ�� ��
		//		�� ù ��° ������ �� ��° �������� Ŭ ���... �ڸ� �ٲ�

		// �� �� ��° ���� vs �� ��° ���� ũ�� ��
		//		�� �� ��° ������ �� ��° �������� Ŭ ���... �ڸ� �ٲ�

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a, b, c;		// -- ����� �Է� ���� ��Ƶ� ����

		System.out.print("ù ��° ���� �Է� : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("�� ���� ���� �Է� : ");
		b = Integer.parseInt(br.readLine());

		System.out.print("�� ���� ���� �Է� : ");
		c = Integer.parseInt(br.readLine());
		
		if (a > b)
		{
			a=a^b;
			b=b^a;
			a=a^b;
		}
		if (a > c)
		{
			a=a^c;
			c=c^a;
			a=a^c;
		}
		if (b > c)
		{
			b=b^c;
			c=c^b;
			b=b^c;
		}
	}
}