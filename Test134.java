/*===================================================================
							Ŭ���� ���
	- �ڹٿ��� �⺻������ �����ϴ� �ֿ� Ŭ������
	- Wrapper Ŭ����
===================================================================*/

public class Test134
{
	public static void main(String[] args)
	{
		byte b =3;
		int i = 256;
		float f = 1.2f;

		Byte b2 = new Byte(b);
		Integer i2 = new Integer(i);
		Float f2 = new Float(f);

		System.out.println(b2);
		System.out.println(i2);
		// �� 3
		//	  256

		print(b2);
		print(i2);
		print(f2);
	}

	// print(Object obj) ���� b2�� i2�� �Ѱ� ���� �� �ִ� ����� ã�ƶ�
	
	/*
	static void print(double x)
	{
		System.out.println(x);
	}
	*/
	
	// java.lang.Number Ŭ����(�߻� Ŭ����)�� ��� ������ Wrapper Ŭ������ �θ� Ŭ�����̴�.
	// b2, i2 �ڷ����� Number �� �Ѿ���鼭 �� ĳ������ �Ͼ�� �ȴ�.
	public static void print(Number nb)
	{
		System.out.println(nb);
		
		/*
		if (n.instanceof Integer)
		{
			System.out.println(n.intValue());
		}
		else if (n.instanceof Double)
		{
			...
		}
		*/
	}
	
}
