/*===================================================================
							Ŭ���� ���
	- �ڹٿ��� �⺻������ �����ϴ� �ֿ� Ŭ������
	- Calendar Ŭ����
===================================================================*/

// �� �ǽ� ����
//		������ �������� �Է¹޴� ��¥��ŭ ���� ��, ��, ��, ������ Ȯ���Ͽ�
//		����� ����ϴ� ���α׷� ����

// ���� ��)
// ���� ��¥ : 2022-07-26 ȭ����
// �� �� ���� ��¥�� Ȯ���ϰ��� �Ͻʴϱ�? : 200

// ==========[Ȯ�� ���]========
// 200�� �� : xxxx-xx-xx x����
// =============================
// ����Ϸ��� �ƹ� Ű�� ��������...

// �� Calendar�� ������ API Document ����
//	  ��add()��
//		: ���� ��¥�� �������� �� ���� ���ϴ� ���� �޼ҵ�
//			�� ����ü.add(Calendar.DATE, ����)��

// import java.io.BufferedReader;
// import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.Calendar;

public class Test144
{
	public static void main(String[] args) throws IOException
	{
		// �� Ǯ�� --------------------------------------------------------------------------------
		
		/*
		// �ֿ� ����
		int year, month, date, days;
		String tWeek;

		String[] week = {"��", "��", "ȭ", "��", "��", "��", "��"};

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// ���� �ʱ�ȭ
		Calendar today = Calendar.getInstance();
		
		year = today.get(Calendar.YEAR);
		month = today.get(Calendar.MONTH) +1;
		date = today.get(Calendar.DATE);

		tWeek = week[today.get(Calendar.DAY_OF_WEEK)-1];
		

		// ������ ��¥ ���
		System.out.printf("������ ��¥ : %d-%d-%d %s����%n", year, month, date, tWeek);

		// ����� �� �Է�
		System.out.print("�� �� ���� ��¥�� Ȯ���ϰ��� �Ͻʴϱ�? : ");
		days = Integer.parseInt(br.readLine());

			// System.out.println(days);

		// add() �޼ҵ� ����
		today.add(Calendar.DATE, days);
		
		// ������ �������� ���ʱ�ȭ
		year = today.get(Calendar.YEAR);
		month = today.get(Calendar.MONTH) +1;
		date = today.get(Calendar.DATE);

		tWeek = week[today.get(Calendar.DAY_OF_WEEK)-1]; 
		
		// ��� ���
		System.out.println("==========[Ȯ�� ���]==========");
		System.out.printf("%d�� �� : %d-%d-%d %s����%n", days, year, month, date, tWeek);
		System.out.println("===============================");
		*/


		// ������ Ǯ�� ----------------------------------------------------------------------------
		
		// Scanner Ŭ���� ��� �ν��Ͻ� ����
		Scanner sc = new Scanner(System.in);

		// Calendar Ŭ���� ��� �ν��Ͻ� ����
		// Calendar now = new Calendar();
		Calendar now = Calendar.getInstance();

		// �ֿ� ���� ����
		int nalsu;
		int y, m, d, w;
		String[] week = {"��", "��", "ȭ", "��", "��", "��", "��"};

		// ������ ��, ��, ��, ���� Ȯ�� �� get() �޼ҵ�
		y = now.get(Calendar.YEAR);
		m = now.get(Calendar.MONTH) +1;
		d = now.get(Calendar.DATE);

		w = now.get(Calendar.DAY_OF_WEEK);

		// ������ ��, ��, ��, ���� Ȯ�ΰ�� ���
		System.out.println("���� ��¥ : " + y + "-" + m + "-" + d + " " + week[w-1] + "����");
		
		do
		{
			System.out.print("�� �� ���� ��¥�� Ȯ���ϰ��� �Ͻʴϱ�? : ");
			nalsu = sc.nextInt();
		}
		while (nalsu<1);

		now.add(Calendar.DATE, nalsu);

		// ��� ���
		System.out.println("==========[Ȯ�� ���]==========");
		System.out.printf("%d�� �� : %tF %tA\n", nalsu, now, now);
		System.out.println("===============================");

		// String.format("%tF", �޷°�ü);
		//	�� ��-��-�� ������ ���ڿ� ��ȯ

		// String.format("%tA", �޷°�ü);
		//	�� ���� ������ ���ڿ� ��ȯ
	}
}

// ���� ���

/*
	���� ��¥ : 2022-7-26 ȭ����
	�� �� ���� ��¥�� Ȯ���ϰ��� �Ͻʴϱ�? : 200
	==========[Ȯ�� ���]==========
	200�� �� : 2023-02-11 �����
	===============================
	����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/