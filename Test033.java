/*===================================================================
				���� ���� �帧�� ��Ʈ�� (���) ����
	if��
	if ~ else��
===================================================================*/

// 1. ���α׷��� �ۼ��� �� �־��� ���ǿ� ���� �б� ������ ���ϱ� ���� ����ϴ� �������
//	  if��, in ~ else��, ���� ������, ���� if��(if�� ��ø), switch���� �ִ�.

// 2. if���� if ������ ������ ���� ���, Ư�� ������ �����ϰ��� �� �� ���Ǵ� ����

// ����ڷκ��� ������ ������ �Է¹޾�
// Ȧ���� ¦��, 0�� �Ǻ��ϴ� ���α׷��� ����
// ��, ���� if ���� ��ø�� Ȱ���Ͽ� ó���� �� �ֵ��� �Ѵ�.


// �� Ǯ�� ------------------------------------------------------------------------------

/*
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test033
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n;

		System.out.print("������ ���� : ");
		n = Integer.parseInt(br.readLine());

		if (n == 0)
		{
			System.out.printf(">> %d��(��) ���Դϴ�.%n", n);
		}
		else if (n % 2 == 0)
		{
			System.out.printf(">> %d��(��) ¦���Դϴ�.%n", n);
		}
		else
		{
			System.out.printf(">> %d��(��) Ȧ���Դϴ�.%n", n);
		}
	}
}
*/


// ������ Ǯ�� --------------------------------------------------------------------------

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test033
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n;

		System.out.print("������ ���� : ");
		n = Integer.parseInt(br.readLine());

		/*
		// 0�� ���������� ���� �ʵ��� ���� (¦���� ��)
		if (n != 0)
		{
			System.out.println(n + " �� " + "Ȧ��");
		}
		else if (n == 0)
		{
			System.out.printf(n + " �� " + "��");
		}
		else if ()
		{
			System.out.printf(n + " �� " + "¦��");
		}

		// ����� �ٷ� ����߱� ������ else ���� �ʿ� X
		*/

		String result;
		
		if (n==0)
		{
			result = "��";
		}
		else if (n%2==0)
		{
			result = "¦��";
		}
		else
		{
			result = "Ȧ��";
		}

		System.out.println(n + " �� " + result);

		// �� ��쿡�� else �� ������ ������ ����
		// result ���� ���� ������ ���� �� ���� ����
	}
}