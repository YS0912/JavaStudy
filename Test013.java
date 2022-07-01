/*=========================================================
			 ���� �ڹ��� ���� �� Ư¡ ����
	����
	�ﰢ���� �غ��� ���̿� ���̸� ����ڷκ��� �Է¹޾�
	�� ������� ���̸� ���ϴ� ���α׷��� ����
=========================================================*/

// ���� ��)
// �� �ﰢ�� ���� ���ϴ� ���α׷� ��
// - �ﰢ���� �غ� �Է� : 
// - �ﰢ���� ���� �Է� : 
// 
// >> �غ��� 3, ���̰� 5�� �ﰢ���� ���� : 
// ����Ϸ��� �ƹ� Ű�� ��������...

// ���� �ν� �� �м�
//		�ﰢ���� ���� = �غ� * ���� / 2
//		����ڷκ��� �����͸� �Է¹޾� ó�� �� BufferedReader Ȱ��: 1��


// �� Ǯ�� ------------------------------------------------------------------------------
/*
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test013
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int x, y;
		double a;

		System.out.println("�� �ﰢ�� ���� ���ϴ� ���α׷� ��");
		System.out.print("- �ﰢ���� �غ� �Է� : ");
		x = Integer.parseInt(br.readLine());

		System.out.print("- �ﰢ���� ���� �Է� : ");
		y = Integer.parseInt(br.readLine());

		a = (x * y) / 2;

		System.out.printf(">> �غ��� %d, ���̰� %d�� �ﰢ���� ���� : %.2f\n", x, y, a);
	}
}
*/


// ������ Ǯ�� --------------------------------------------------------------------------
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test013
{
	public static void main(String[] args) throws IOException
	{
		// �ֿ� ���� ����
		// BufferedReader �ν��Ͻ� ���� (Ű���� ����)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int underLength, height;		// -- �غ��� ����
		double area;					// -- ����

		// ���� �� ó��
		// �� ����� �ȳ� �޽��� ���
		System.out.println("�� �ﰢ�� ���� ���ϴ� ���α׷� ��");
		System.out.print("- �ﰢ���� �غ� �Է� : ");

		// �� ����ڰ� �Է��� ������(���ڿ�)�� ���� underLength(����)�� ��Ƴ���
		underLength = Integer.parseInt(br.readLine());
		
		// �� ����� �ȳ� �޽��� ���
		System.out.print("- �ﰢ���� ���� �Է� : ");

		// �� ����ڰ� �Է��� ������(���ڿ�)�� ���� height(����)�� ��Ƴ���
		height = Integer.parseInt(br.readLine());

		// �� �ﰢ���� ���� ���ϴ� ���� ó��
		// area = underLength * height / 2;			   �� ���� ��� ������ �Ǿ� ������ X
		area = underLength * height / 2.0;			// �� �Ǽ� ��� ����

		// area = (double)(underLength * height / 2);		-- (X)
		// area = (double)underLength * height / 2;			-- underLength�� double �� ��ȯ
		// area = underLength * (double)height / 2);		-- height�� double �� ��ȯ
		// area = (double)(underLength * height) / 2;		-- (height * height) double �� ��ȯ

		// ��� ���
		System.out.println();				// -- ����
		// System.out.print();				   -- ������ ����

		System.out.printf(">> �غ��� %d, ���̰� %d�� �ﰢ���� ���̴� %.2f\n", underLength, height, area);

		/*
			�� �ﰢ�� ���� ���ϴ� ���α׷� ��
			- �ﰢ���� �غ� �Է� : 3
			- �ﰢ���� ���� �Է� : 5

			>> �غ��� 3, ���̰� 5�� �ﰢ���� ���̴� 7.50
		*/
	}
}