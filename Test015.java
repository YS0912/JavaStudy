/*=========================================================
			 ���� �ڹ� �⺻ ���α׷��� ����
		�ڹ��� �⺻ �����: System.in.read()
=========================================================*/

/*
��System.in.read()�� �޼ҵ�� (�Է� ��⿭�κ���) �� ���ڸ� ����
��, �Է¹��� �ϳ��� ���ڸ� ���� �״�� �������� ���� �ƴ϶� ASCII Code ������ ��ȯ
*/

// ���� ��)
// �� ���� �Է�		 : A
// �� �ڸ� ���� �Է� : 9

// >> �Է��� ���� : A
// >> �Է��� ���� : 9
// ����Ϸ��� �ƹ� Ű�� ��������...

import java.io.IOException;

public class Test015
{
	public static void main(String[] args) throws IOException
	{
		/*
		// �ֿ� ���� ����
		char ch;				// -- ����
		

		// ���� �� ó��
		System.out.print("���� �ϳ� �Է��ϼ��� : ");			// A
		ch = (char)System.in.read();							// 65

		// ��� ���
		System.out.println(ch);
		*/


		// �� Ǯ�� --------------------------------------------------
		/*
		char ch;
		int num;

		System.out.print("�� ���� �Է�       : ");
		ch = (char)System.in.read();

		System.out.print("�� �ڸ� ���� �Է� : ");
		num = System.in.read();

		System.out.println();
		System.out.printf(">> �Է��� ���� : %c\n", ch);
		System.out.printf(">> �Է��� ���� : %d\n", num);

		?
		*/


		// ������ Ǯ�� --------------------------------------------------------

		// �ֿ� ���� ����
		char ch;											// �Է� ���� ����
		int n;												// �Է� ���� ����

		// �߰� ���� ����
		char temp;

		// ���� �� ó��
		// �� ����� �ȳ� �޽���
		System.out.print("�� ���� �Է�       : ");
		ch = (char)System.in.read();						// ����Ű = ��\r�� + ��\n��
															//		�� System.in.read(A + \r + \n);
															//							  -------- �ܷ�
		System.in.skip(2);									// �ܷ� �ڵ� 2�� ��ŵ

		System.out.print("�� �ڸ� ���� �Է�  : ");			
		// n = System.in.read();							   ���� �� �ƽ�Ű�ڵ�
		// temp = (char)System.in.read();					   temp�� ����ؼ� n�� ������ ó��
		n = System.in.read();
		n -= 48;

		// �� ��� ���
		System.out.println();
		System.out.println(">> �Է��� ���� : " + ch);
		// System.out.println(">> �Է��� ���� : " + temp);
		System.out.println(">> �Է��� ���� : " + n);

		// ���� ���
		/*
			�� ���� �Է�       : a
			�� �ڸ� ���� �Է�  : 1

			>> �Է��� ���� : a
			>> �Է��� ���� : 1
			����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
		*/
	}
}