/*=========================================================
			 ���� �ڹ� �⺻ ���α׷��� ����
	����
	����ڷκ��� �̸�, ��������, ��������, ���������� 
	�Է¹޾� �̸��� ������ ����ϴ� ���α׷� ����
=========================================================*/

// ���� ��)
// �̸��� �Է��ϼ��� : ������
// ���� ���� �Է� : 90
// ���� ���� �Է� : 80
// ���� ���� �Է� : 70

// =====[���]=====
// �̸� : ������
// ���� : 240
// ����Ϸ��� �ƹ� Ű�� ��������...


// �� Ǯ�� ------------------------------------------------------------------------------

/*
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test014
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String name;
		int kor, eng, mat;
		int sum;

		System.out.print("�̸��� �Է��ϼ��� : ");
		name = br.readLine();

		System.out.print("���� ���� �Է� : ");
		kor = Integer.parseInt(br.readLine());

		System.out.print("���� ���� �Է� : ");
		eng = Integer.parseInt(br.readLine());

		System.out.print("���� ���� �Է� : ");
		mat = Integer.parseInt(br.readLine());

		sum = kor + eng + mat;
		
		System.out.println();
		System.out.println("=====[���]=====");
		System.out.printf("�̸� : %s\n", name);
		System.out.printf("���� : %d\n", sum);
	}
}
*/



// ������ Ǯ�� --------------------------------------------------------------------------

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Test014
{
	public static void main(String[] args) throws IOException
	{
		// BufferedReader �ν��Ͻ� ����
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		// �ֿ� ���� ����
		String strName;					// -- �̸� ���� (�밡���� ǥ���)
		int nKor, nEng, nMat;			// -- ����, ����, ���� ���� ����
		int nTot;						// -- ���� ����
		String strTemp;					// -- ���ڿ� �ӽ� ���� ����


		// ���� �� ó��
		// �� ����� �ȳ� �޽��� ��� (�̸�)
		System.out.print("�̸��� �Է��ϼ��� : ");

		// �� ����ڰ� �Է��� ��(�ܺ� ������) ���� strName�� ��Ƴ���
		strName = br.readLine();

		// �� ����� �ȳ� �޽��� ��� (����)
		System.out.print("���� ���� : ");

		// �� ����ڰ� �Է��� ��(�ܺ� ������) nKor������ ��Ƴ���
		strTemp = br.readLine();
		nKor = Integer.parseInt(strTemp);

		// �� ����� �ȳ� �޽��� ��� (����)
		System.out.print("���� ���� : ");

		// �� ����ڰ� �Է��� ��(�ܺ� ������) nEng������ ��Ƴ���
		strTemp = br.readLine();
		nEng = Integer.parseInt(strTemp);

		// �� ����� �ȳ� �޽��� ��� (����)
		System.out.print("���� ���� : ");

		// �� ����ڰ� �Է��� ��(�ܺ� ������) nMat������ ��Ƴ���
		strTemp = br.readLine();
		nMat = Integer.parseInt(strTemp);

		// �� �� ���� ������ ��� ������(����� �Է� ������)�� ���� �����Ͽ� nTot ������ ��Ƴ���
		nTot = nKor + nEng + nMat;


		// ��� ���
		System.out.println("\n=====[���]=====");
		// System.out.println("�̸� : " + strName);
		System.out.printf("�̸� : %s\n", strName);
		// System.out.println("���� : " + nTot);
		System.out.printf("���� : %d\n", nTot);

		/*
			�̸��� �Է��ϼ��� : ����
			���� ���� : 90
			���� ���� : 80
			���� ���� : 70

			=====[���]=====
			�̸� : ����
			���� : 240
			����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
		*/
	}
}
