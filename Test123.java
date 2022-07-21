/*===================================================================
							Ŭ���� ���
	- ��ø Ŭ����
===================================================================*/

// outer
class Test2
{
	static int a = 10;
	int b = 20;

	void write()
	{
		System.out.println("write()...��");
		final int c = 20;
		int d = 40;
		
		// inner
		// �޼ҵ� �ȿ� �����ϴ� �Ǵٸ� Ŭ����(���� Ŭ����, ���� Ŭ����)
		class LocalTest
		{
			void write()
			{
				System.out.println("write()...��");
				System.out.println("a : " + a);
				System.out.println("b : " + b);
				System.out.println("c : " + c);
				// System.out.println("d : " + d);
			}
		}

		// ����  c�� ���� d�� �� �� ������������,
		// (ù ���� write() �޼ҵ� �ȿ��� ����� �����̱� ������)
		// c�� final �����̱� ������ �� ��° write() �޼ҵ忡�� ���� �����ϴ��� ������ ��
		// �� ��° write() �޼ҵ忡�� ���� �����ϴ��� ������ �� 20�� ������� �� �ִ�.
		// �ݸ鿡  d�� �� ���� ���÷� ���� �� �ִ� ��Ȳ�̹Ƿ�
		// LocalTest Ŭ������ �ν��Ͻ� ���� ������ �������� �� �� ���� ������
		// �̷� ���� �ν��Ͻ� ���� ������ d�� � ���� ����ִ��� ���� ���� �� ���� ������
		// ���� d �� �����ϴ� ���� ���� �� �ֵ��� ���������� ó��.

		// d += 10;

		d += 10;

		d += 20;

		LocalTest lt = new LocalTest();
		lt.write();										// �� �� ��° write() �޼ҵ�

		d += 30;

		d += 40;

		
	}
}


// main() �޼ҵ带 �����ϰ� �ִ� �ܺ��� �ٸ� Ŭ����
public class Test123
{
	public static void main(String[] args)
	{
		// Test2(outer) ����� �ν��Ͻ� ����
		Test2 ob = new Test2();
		ob.write();										// �� ù ��° write() �޼ҵ�

		// �� ������ ����:  error: local variables referenced from an inner class must be final or effectively final (d)
		// d = 10; �� �ּ� ó���� �� ��
		// write()...��
		// write()...��
		// a : 10
		// b : 20
		// c : 20
		// d : 40

		
	}
}

// ���� ���

/*
	write()...��
	write()...��
	a : 10
	b : 20
	c : 20
	����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/