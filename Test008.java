/*============================================
	  ���� �ڹ��� ���� �� Ư¡ ����
	������ �ڷ���
	������ �ڷ��� �ǽ� �� �׽�Ʈ : char
============================================*/

public class Test008
{
	public static void main(String[] args)
	{
		// �ֿ� ���� ����
		char ch1, ch2, ch3;
		// ���� �̸��� ���ڷ� ������ ���� ����
		int a;																	// ���߿��
																				//	���� ���� �� ��� ������ �Է��ϸ� ������ ����!

		// ���� �� ó��
		ch1 = 'A';
		ch2 = '\n';		// ���๮��
						// -- ���� ������ ��\���� ����Ϸ��� ��\\���� ���
		ch3 = '��';
		// a = ch1;																// ������ ���� X : �ڵ� �� ��ȯ ��Ģ ����
																				//				 : A �� �ƽ�Ű �ڵ忡 ���缭 ����
		a = (int)ch1;
		// -- ������ �� ��ȯ (���� �� ��ȯ): �˷��ִ� ���

		// ��� ���
		System.out.println("ch1 : " + ch1);
		// �� ch1 : A
		System.out.println("ch2 : " + ch2);
		// �� ch2 : (����)
		System.out.println("ch3 : " + ch3);
		// �� ch3 : ��
		System.out.println("a   : " + a);
		// �� a   : 65

		System.out.printf("%c, %c, %c, %d%n", ch1, ch2, ch3, a);
		// �� ��Ÿ�� ����: ����Ÿ�� �����ʹ� %c ���

		// ���� �����
		/*
			ch1 : A
			ch2 :

			ch3 : ��
			a   : 65
			A,
			, ��, 65
		*/
	}
}