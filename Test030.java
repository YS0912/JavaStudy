/*=======================================================================================
							���� ������(Operator) ����
	���� ������ == ���� ������
	����:
	����ڷκ��� ������ ������ �Է¹޾�
	�Է� ���� ������ �������� ������� �Ǻ��Ͽ� ����� ����ϴ� ���α׷��� ����
	��, �Է��� BufferedReader �� Ȱ���ϰ�
	���� �����ڸ� Ȱ���Ͽ� ������ ������ �� �ֵ��� �Ѵ�
=======================================================================================*/

// �� ������ �Ǻ� ���� ��
// ��4�� ����̸鼭 100�� ����� �ƴϰų� ��400�� ����̸� ����
// �������� ���

// ���� ��)
// ������ ���� �Է� : 2000
// 2000 �� ����
// ����Ϸ��� �ƹ� Ű�� ��������...

// ������ ���� �Է� : 2012
// 2012 �� ����
// ����Ϸ��� �ƹ� Ű�� ��������...

// ������ ���� �Է� : 2022
// 2022 �� ���
// ����Ϸ��� �ƹ� Ű�� ��������...

// �� Ǯ�� --------------------------------------------------------------------------------------------------

/*
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test030
{
	public static void main(String[] args) throws IOException
	{
		// �ֿ� ���� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int year;
		String result;

		// ���� �� ó��
		System.out.print("������ ���� �Է� : ");
		year = Integer.parseInt(br.readLine());

		// result = (400�� ���) ? "����" : (4�� ����̸鼭 100�� ����� �ƴ� ? "����" : "���");
		result = (year % 400 == 0) ? "����" : ((year % 4 == 0 && !(year % 100 == 0)) ? "����" : "���");

		// result = (year % 400 == 0) ? "����" : ((year % 4 == 0 && year % 100 != 0) ? "����" : "���");

		System.out.println(year + " �� " + result);
	}
}
*/


// ������ Ǯ�� ----------------------------------------------------------------------------------------------

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test030
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int year;				// -- ����ڰ� �Է��� ������ ��Ƴ� ����
		String strResult;		// -- �Ǻ� ����� ��Ƴ� ����

		System.out.print("������ ���� �Է� : ");
		year = Integer.parseInt(br.readLine());

		// ������ 4�� ���		������ 100�� ����� �ƴ�		������ 400�� ���
		// year % 4 == 0		year % 100 != 0					year % 400 == 0
		// year % 4 == 0 �̸鼭 year % 100 != 0		�Ǵ�	year % 400 == 0
		// year % 4 == 0 && year % 100 != 0		||	year % 400 == 0
		
		strResult = (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0) ? "����" : "���";

		System.out.printf("%d�� �� %s\n", year, strResult);

		/*
			������ ���� �Է� : 2000
			2000 �� ����
			����Ϸ��� �ƹ� Ű�� ��������...

			������ ���� �Է� : 2012
			2012 �� ����
			����Ϸ��� �ƹ� Ű�� ��������...

			������ ���� �Է� : 2022
			2022 �� ���
			����Ϸ��� �ƹ� Ű�� ��������...
		*/
	}
}