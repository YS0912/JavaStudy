/*=======================================================================================
								���� ������(Operator) ����
	���� ������ == ���� ������
	����:
	����ڷκ��� ������ ������ �Է¹޾�
	�Է� ���� ������ ������� �������� �����Ͽ� ����� ����ϴ� ���α׷��� ����
	��, �Է� �����ʹ� BufferedReader�� Ȱ��
	���� ������(���� �����ڸ� Ȱ���Ͽ� ����� ����
=======================================================================================*/

// ���� ��)
// ������ ���� �Է� : -12
// -12 �� ����
// ����Ϸ��� �ƹ� Ű�� ��������...

// ������ ���� �Է� : 257
// 257 �� ���
// ����Ϸ��� �ƹ� Ű�� ��������...

// ������ ���� �Է� : 0
// 0 �� ��
// ����Ϸ��� �ƹ� Ű�� ��������...

// ��Ʈ: ���� ������ ��ø


// �� Ǯ�� ------------------------------------------------------------------------------

/*
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test028
{
	public static void main(String[] args) throws IOException
	{
		// �ʼ� ���� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n;
		String strTemp, strResult;

		// ���� �� ó��
		System.out.print("������ ���� �Է� : ");
		n = Integer.parseInt(br.readLine());

		strTemp = n > 0 ? "���" : "����";
		strResult = n == 0 ? "��" : strTemp;

		// ��� ���
		System.out.printf("%d �� %s%n", n, strResult);

	}
}
*/


// ������ Ǯ�� --------------------------------------------------------------------------

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test028
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n;
		String strResult;

		System.out.print("������ ���� �Է� : ");
		n = Integer.parseInt(br.readLine());

		strResult = (n > 0) ? ("���") : ((n < 0) ? ("����") : ("��"));
		// -5
		// (-5 > 0) ? ("���") : ((-5 < 0) ? ("����") : ("��"));
		// (false) ? ("���") : ((true) ? ("����") : ("��"));
		// (false) ? ("���") : ("����");
		// "����"

		System.out.println(n + " �� " + strResult);

		// ���� ���
		/*
			������ ���� �Է� : -12
			-12 �� ����
			����Ϸ��� �ƹ� Ű�� ��������...

			������ ���� �Է� : 257
			257 �� ���
			����Ϸ��� �ƹ� Ű�� ��������...

			������ ���� �Է� : 0
			0 �� ��
			����Ϸ��� �ƹ� Ű�� ��������...
		*/ 
	}
}