/*=========================================================
			 ���� �ڹ� �⺻ ���α׷��� ����
		�ڹ��� �⺻ �����: System.util.Scanner
=========================================================*/

// �ܶ� ���� ������ ����Ͽ� �Է��� ��ū�� ���� �����ϸ�, ����Ʈ(default)�� ���Ǵ� �ܶ����ڴ� �����̴�.
// �� ������ �������� ���� ������ ����
// �ۼ��� ���� ��ū�� ��next()�� �޼ҵ带 ����Ͽ� �ٸ� ����(�ڷ���)�� ������ ��ȯ�� �� �ִ�.

import java.util.Scanner;

public class Test017
{
	public static void main(String[] args)
	{
		// Scanner Ŭ���� ����� �ν��Ͻ� ����
		Scanner sc = new Scanner(System.in);
		// BufferdeReader br = new BufferedReader(new InputStreamReader(System.in));
		// Scanner�� ������(InputStreamReader) �ʿ� X

		// �ֿ� ���� ����
		String name;
		int kor, eng, mat;

		// ���� �� ó��
		System.out.print("�̸��� �Է��ϼ��� : ");
		name = sc.next();
		

		// �׽�Ʈ(Ȯ��)
		// System.out.println("�Է��� �̸� : " + name);
		// ��� �� IOException ���� ó�� �ʿ� X

		System.out.print("���� ���� �Է� : ");
		// Integer.parseInt(); �� ��ȯ �ʿ� X
		kor = sc.nextInt();

		System.out.print("���� ���� �Է� : ");
		eng = sc.nextInt();

		System.out.print("���� ���� �Է� : ");
		mat = sc.nextInt();
		
		// ��� ���
		System.out.println();
		System.out.println(">> �̸� : " + name);
		// System.out.println(">> ���� : " + kor + eng + mat);
		// �� >> ���� : 909090
		// ���ڿ� ���� �������̱� ������
		System.out.println(">> �̸� : " + (kor + eng + mat));

		// ���� ���
		/*
			�̸��� �Է��ϼ��� : ����
			���� ���� �Է� : 90
			���� ���� �Է� : 80
			���� ���� �Է� : 70

			>> �̸� : ����
			>> �̸� : 240����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
		*/

	}
}