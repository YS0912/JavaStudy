/*============================================
	  ���� �ڹ��� ���� �� Ư¡ ����
	������ �ڷ���
	������ �ڷ��� �ǽ� �� �׽�Ʈ : boolean
============================================*/

public class Test007
{
	public static void main(String[] args)
	{
		// �ֿ� ���� ����
		boolean a = true;	// boolean a = "true";		(X)
		boolean b;
		// boolean a, b;

		int c =10, d = 5;

		// ���� �� ó��
		//b = c < d;
		// �� b = 10 < 5;
		// �� b = false;
		b = 200 > c;
		// �� b = true;

		// ��� ���
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		/*
			a = true
			b = true
		*/
	}
}