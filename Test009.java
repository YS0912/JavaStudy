/*============================================
	  ���� �ڹ��� ���� �� Ư¡ ����
	������ �ڷ���
	������ �ڷ��� �ǽ� �� �׽�Ʈ : double
	������ ���� �ǽ�
============================================*/

public class Test009
{
	public static void main(String[] args)
	{
		// ������ ������ ������
		double a = 1 / 2;
		System.out.println("double a : " + a);
		// �� double a : 0.0
		// �ǿ����ڰ� ������ �� ��\�� ������ ��

		double b = (double)1 / 2;
		// double b = 0.1 / 2;
		// double b = (double)0;		(X)	--- (double)�� ���� �켱 ���� ����
		System.out.println("double b : " + b);
		// �� double b : 0.5

		double c = 1/2 + 1/2;			// --- ��\���� ���� �켱 ������ ����
		System.out.println("double c : " + c);
		// �� double c : 0.0


		// �� �����ڷ� �Ǽ��� ���ԵǾ� �ִ� ������ ����
		double d = 1 / 2.0;
		System.out.println("double d : " + d);
		// �� double d : 0.5
		// -- ������ ���꿡�� �� �����ڿ� �Ǽ��� ���ԵǾ� ������ �Ǽ� ����� ������ ����
		// -- ����� ���� �Ǽ� ���·� ��ȯ

		double e = 3/2 + 1/2;
		System.out.println("double e : " + e);
		// �� double e : 1.0

		double f = 3/2 + 1/2.0;
		System.out.println("double f : " + f);
		// �� double f : 1.5

		// ���� �����
		/*
			double a : 0.0
			double b : 0.5
			double c : 0.0
			double d : 0.5
			double e : 1.0
			double f : 1.5
		*/
	}
}