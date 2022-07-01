/*===============================================
		  ���� �ڹ��� ���� �� Ư¡ ����
	������ �ڷ���
	�ڹ� �⺻ �����: BufferedReader Ŭ����
=================================================*/

import java.io.BufferedReader;
import java.io.InputStreamReader;					// �� (��༭) �ҷ����� Input Output
import java.io.IOException;

public class Test012
{
	public static void main(String[] args) throws IOException							// ������ ����� ������ (Input Output Exception)
	{
		// Ű���� ����(����)
		// (��  BufferedReader Ŭ���� ����� �ν��Ͻ�(��ü) ����)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//															------------		����Ʈ �Է°� (���� �ν� X)
		//									  -----------------------					����Ʈ �� ���� ������		
		// -----------------------------------											���� �Է��� �о���̴� ��ġ


		// �ֿ� ���� ����
		int r;							// -- ������
		final double PI = 3.141592;		// -- ������ �� ������ ���ȭ ��final��
		double a, b;					// -- ���� ����, �ѷ�

		// ���� �� ó��
		// �� ����ڿ��� �ȳ� �޽��� ���
		// System.out.println("���� ������ �Է� : ");
		System.out.print("���� ������ �Է� : ");

		// �� ����ڰ� �Է��� ���� �޾� ������ ���� r ����
		r = Integer.parseInt(br.readLine());
		//					---------------			BufferedReader �� readLine() �� �Է� ��⿭�� ���ڿ� ��ȯ: ���� ���°� �ƴ�
		//  ----------------						���ڿ��� �ִ� �״���� ���� ���·� ��ȯ
		// r = Integer.parseInt(br.readLine(2546));		�� �Է�
		// r = Integer.parseInt("2546");
		// r = 2546;
													// -- readLine() �� �Է� ��⿭�� ���� ���� ������ ���

		// �� ���� �� �ѷ� ���(����) �� ���� a, b ����
		a = r * r * PI;
		b = 2 * r * PI;

		// ��� ���
		// �� ���� a, b �� ���
		// System.out.println(">> ���� : " + a);
		// System.out.println(">> �ѷ� : " + b);
		/*
			���� ������ �Է� : 42
			>> ���� : 5541.768288
			>> �ѷ� : 263.893728
		*/
		
		// �߰�
		// �������� 45�� ���� ���̴� 6361.72 �̸�,
		// �������� 45�� ���� �ѷ��� 282.74 �̴�.

		System.out.printf(">> �������� %d�� ���� ���̴� %.2f �̸�,\n", r, a);
		System.out.printf(">> �������� %d�� ���� �ѷ��� %.2f �̴�.\n", r, b);
		
		// ���� ���� ���
		/*
			���� ������ �Է� : 45
			>> �������� 45�� ���� ���̴� 6361.72 �̸�,
			>> �������� 45�� ���� �ѷ��� 282.74 �̴�.
		*/
	}
}