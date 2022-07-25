/*===================================================================
							Ŭ���� ���
	- �ڹٿ��� �⺻������ �����ϴ� �ֿ� Ŭ������
	- Calendar Ŭ����
===================================================================*/

/*
�� java.util.Calendar Ŭ������ ��¥�� �ð��� ��ü �𵨸�ȭ �� Ŭ������,
   ��, ��, ��, ����, ��, ��, �ʱ����� �ð��� ��¥�� ���õ� ������ �����Ѵ�.
   �׸���, Calendar Ŭ������ �߻�Ŭ�����̹Ƿ� ���� ��ü�� ������ �� �����
   �������� �޼ҵ� ������ Calendar Ŭ������ ���� Ŭ������
   GregorianCalendar Ŭ������ ���ǵǾ� �ִ�.

   �ý������κ��� ���� �ý��� �ð� ������ ���� ��
   getInstance()��� ����(static) �޼ҵ带 �̿��Ͽ� ��ü�� ������ �� �ִ�.
   ������ Calendar Ŭ���� ��ü�� �ý����� ���� ��¥�� �ð� ������ ������,
   �� ��ü�� �����Ǹ� ���� �ִ� �ð� �������� get() �޼ҵ带 �̿��Ͽ�
   ���� ������(�����) �� �ִ�.

   getInstance() �޼ҵ�� ���������� GregorianCalendar ��ü�� �����Ͽ� �����ֱ� ������
   GregorianCalendar ��ü�� ���� �����Ͽ� �ð� ������ ���� ���� �ִ�.
*/

/*
�� �ǽ� ����
   ����ڷκ��� ��, ���� �Է¹޾� �޷��� �׷��ִ�(����ϴ�) ���α׷� ����
   ��, Calendar Ŭ������ Ȱ���Ͽ� �ۼ��� �� �ֵ��� �Ѵ�.
   �� API Document �����Ͽ� getActualMaximum() �޼ҵ��� Ȱ�� ��� ������ ��!

���� ��)
���� �Է� : 0
���� �Է� : 2023
�� �Է�	  : -20
�� �Է�   : 16
�� �Է�   : 7

		[ 2022�� 7�� ]
  ��  ��  ȭ  ��  ��  ��  ��
============================
					   1   2
   3   4   5   6   7   8   9
  10  11  12  13  14  15  16
  17  18  19  20  21  22  23
  24  25  26  27  28  29  30
  31=
============================
����Ϸ��� �ƹ� Ű�� ��������...
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Test143
{
	public static void main(String[] args) throws IOException
	{
		// �� Ǯ�� --------------------------------------------------------------------------------

		/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int year, month, maxDate;


		// ����� �Է°�: ���� ----------------------------------------------------------
		do
		{
			System.out.print("���� �Է� : ");
			year = Integer.parseInt(br.readLine());
		}
		while (year<=0);


		// ����� �Է°�: �� ------------------------------------------------------------
		do
		{
			System.out.print("�� �Է�   : ");
			month = Integer.parseInt(br.readLine());
		}
		while (month<1 || month>12);

		System.out.println();
		

		// Ķ���� �ν��Ͻ� ���� ---------------------------------------------------------
		Calendar rightnow = new GregorianCalendar();

		String[] week = {"��", "��", "ȭ", "��", "��", "��", "��"};
		

		// �Է¹��� ���� 1�Ͽ� �޷� ���� ------------------------------------------------
		rightnow.set(year, month-1, 1);


		// ��� ��� --------------------------------------------------------------------
		System.out.printf("\t[  %d�� %d��  ]\n", year, month);
		System.out.println("  ��  ��  ȭ  ��  ��  ��  ��");
		System.out.println("============================");
		
		// �� �ش� ���� ������ ����
		for (int i=1; i<rightnow.get(Calendar.DAY_OF_WEEK); i++)
			System.out.print("    ");
		
		// �� ���� �ִ� �ϼ�
		maxDate = rightnow.getActualMaximum(Calendar.DAY_OF_MONTH);

		// �� ��¥ ���
		Calendar temp = new GregorianCalendar();

		for (int i=1; i<=maxDate; i++)
		{
			temp.set(year, month-1, i);

			System.out.printf("%4d", i);

			if (temp.get(temp.DAY_OF_WEEK) == 7)
				System.out.println();

			// if (i == maxDate)
			//	System.out.println();
			
		} // end for

		if (temp.get(temp.DAY_OF_WEEK) != 7)
			System.out.println();

		System.out.println("============================");

		
		// �׽�Ʈ
		// System.out.println(Calendar.MONTH);
		// -- Calendar Ŭ������ MONTH �޼ҵ尡 ������ �ִ� �ѹ����� ����� ��
		*/


		// ������ Ǯ�� ----------------------------------------------------------------------------

		// BufferedReader Ŭ���� ��� �ν��Ͻ� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// Calendar Ŭ���� ��� �ν��Ͻ� ����
		Calendar cal = Calendar.getInstance();

		// �ֿ� ���� ����
		int y, m;			// ��, ��
		int w;				// ����
		int i;				// ���� ����

		do
		{
			System.out.print("���� �Է� : ");
			y = Integer.parseInt(br.readLine());
		}
		while (y<1);

		do
		{
			System.out.print("�� �Է�   : ");
			m = Integer.parseInt(br.readLine());
		}
		while (m<1 || m>12);

		// ����ڷκ��� �Է¹��� ��(y), ��(m)�� �̿��Ͽ� �޷��� ���� ����
		cal.set(y, m-1, 1);
		// -- �� ���� �� �Է°�(m)�� �״�� ����ϴ� ���� �ƴ϶� 
		//	  �Է°����� 1�� �� ������ ���� �����ؾ� �Ѵ�.
		// -- �� ���� �� �Է¹��� ��, ���� �ش��ϴ� 1�Ϸ� �����ؾ� �Ѵ�.
		//	  1���� ���� Ȯ�� �ʿ�!
		
		// ���õ� �޷��� ��¥�κ��� ���� ��������
		w = cal.get(Calendar.DAY_OF_WEEK);

		// �׽�Ʈ
		// System.out.println(w);
		// �� 6

		// ��� ��� �� �޷� �׸���
		System.out.println();
		System.out.println("\t\t[" + y + "�� " + m + "�� ]\n");
		System.out.println("  ��  ��  ȭ  ��  ��  ��  ��");
		System.out.println("============================");
		for (i=1; i<w; i++)
		{
			System.out.print("    ");
		}

		// �׽�Ʈ
		// System.out.printf("%4d", 1);			�� �ݿ��Ͽ� 1���� �� ������.
		
		// Calendar Ŭ���� ��getActualMaximum()�� �޼ҵ� Ȯ��!
		for (i=1; i<=cal.getActualMaximum(Calendar.DATE); i++)
		{
			System.out.pirntf("%4d", i);
			w++;

			if (w%7==1)
				System.out.println();
		}

		if (w%7!=1)
			System.out.println();
	}
}