/*===================================================================
				���� ���� �帧�� ��Ʈ�� (���) ����
	if��
	if ~ else��
===================================================================*/

// 1. ���α׷��� �ۼ��� �� �־��� ���ǿ� ���� �б� ������ ���ϱ� ���� ����ϴ� �������
//	  if��, in ~ else��, ���� ������, ���� if��(if�� ��ø), switch���� �ִ�.

// 2. if���� if ������ ������ ���� ���, Ư�� ������ �����ϰ��� �� �� ���Ǵ� ����

// ����ڷκ��� ������ ������ �Է¹޾�
// Ȧ���� ¦���� �Ǻ��ϴ� ���α׷��� ����
// ��, ���� if ������ Ȱ���Ͽ� ó���� �� �ֵ��� �Ѵ�.

// ���� ��)
// ������ ���� �Է� : 20
// >> 20��(��) ¦���Դϴ�.
// ����Ϸ��� �ƹ� Ű�� ��������...

// ������ ���� �Է� : 47
// >> 47��(��) Ȧ���Դϴ�.
// ����Ϸ��� �ƹ� Ű�� ��������...


// �� Ǯ�� ------------------------------------------------------------------------------

/*
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test032
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n;
		String temp;

		System.out.print("������ ���� �Է� : ");
		n = Integer.parseInt(br.readLine());
		temp = "Ȧ��";

		if (n % 2 == 0)
		{
			temp = "¦��";
		}

		System.out.printf(">> %d��(��) %s�Դϴ�.%n", n, temp);
	}
}
*/


// ������ Ǯ�� --------------------------------------------------------------------------

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test032
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n;

		System.out.print("������ ���� �Է� : ");
		n = Integer.parseInt(br.readLine());

		if (n % 2 == 0)
		{
			System.out.printf(">> %d��(��) ¦���Դϴ�.%n", n);
		}

		if (n % 2 != 0)
		{
			System.out.printf(">> %d��(��) Ȧ���Դϴ�.%n", n);
		}
	}
}