/*=========================================================
					Ŭ������ �ν��Ͻ�
		Test071.java ���ϰ� ��Ʈ
=========================================================*/

// ���� ���̿� �ѷ� ���ϱ�
// ���� ���̿� �ѷ��� ���� �� �ִ� Ŭ������ ����
// Ŭ������ : CircleTest �� CircleTest.java
// BufferedReader �� readLine();

// ���� ���� = ������ * ������ * 3.141592
// ���� �ѷ� = ������ * 2 * 3.141592

// ���� ��)
// ������ �Է� : xxx

// >> �������� xxx�� ����
// >> ���� : xxx.xx
// >> �ѷ� : xxx.xx
// ����Ϸ��� �ƹ� Ű�� ��������...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class CircleTest
{
	// �� Ǯ�� ------------------------------------------------------------------------------------
	
	/*
	// ���� ����
	int r;

	// �޼ҵ� �Է�
	void input() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("������ �Է� : ");
		r = Integer.parseInt(br.readLine());
	}

	// �޼ҵ� ����
	double calArea()
	{
		double result;

		result = r * r * 3.141592;
		return result;
	}

	// �޼ҵ� �ѷ�
	double calLength()
	{
		double result;

		result = 2 * r * 3.141592;
		return result;
	}

	// �޼ҵ� ��� ���
	void print(double a, double l)
	{
		System.out.println();
		System.out.println("�������� " + r + "�� ����");
		System.out.println(">> ���� : " + a);
		System.out.println(">> �ѷ� : " + l);
	}
	*/


	// ������ Ǯ�� --------------------------------------------------------------------------------

	// �ֿ� �Ӽ�(������) �� ��� ����
	int r;								// ������
	final double PI = 3.141592;			// ������ (������ ���ȭ)
	
	// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		-- �޸� ����

	// �ֿ� ���(����, ����) �� ��� �޼ҵ�

	// ������ �Է� ��� �� �޼ҵ� ����
	void input() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("������ �Է� : ");
		r = Integer.parseInt(br.readLine());
	}

	// ���� ��� ��� �� �޼ҵ� ����
	double calArea()
	{
		// ���� ���� = ������ * ������ * 3.141592
		return r * r * PI;
	}

	// �ѷ� ��� ��� �� �޼ҵ� ����
	double calLength()
	{
		// ���� �ѷ� = 2 * ������ * 3.141592
		double result;

		result = 2 * r * PI;

		return result;

	}

	// ��� ��� ��� �� �޼ҵ� ����
	void print(double a, double l)
	{
		/*
		>> �������� xxx�� ����				// ���� ����(��������)
		>> ���� : xxx.xx					// �� ���� ����(��������)
		>> �ѷ� : xxx.xx
		*/

		System.out.printf(">> �������� %d �� ����\n", r);
		System.out.printf(">> ���� : %.2f\n", a);
		System.out.printf(">> �ѷ� : %.2f\n", l);
	}
}