/*=========================================================
					���������� ��������
		���� ������ �ʱ�ȭ �׽�Ʈ
		�� Test068.java �� ��
=========================================================*/

// ���� ������ �ʱ�ȭ ������ ��ġ�� �ʾƵ� ����� �� �ִ�.
// �� �ڹٰ� �ڵ����� �ʱ�ȭ�� �����ش�.

public class Test069
{
	// Ŭ������ ����
	
	// -- ���� ����, �۷ι� ����
	int a;

	boolean b;
	char c;
	double d;

	public static void main(String[] args)
	{
		// �޼ҵ��� ����
		
		// System.out.println("a : " + a);
		// �� ������ ����
		//	  non-static variable a cannot be referenced from a static context

		// Test069 Ŭ���� ������� �ν��Ͻ� ����
		// �޸𸮿� class Test069�� �� �ڸ��� �Ҵ��ϴ� ����
		Test069 ob = new Test069();
		
		System.out.println("ob.a : " + ob.a);
		// �� ob.a : 0

		System.out.println("ob.b :" + ob.b);
		// �� ob.b :false
		System.out.println("ob.c :" + ob.c);
		// �� ob.c :
		System.out.println("ob.d :" + ob.d);
		// �� ob.d :0.0
	}
}