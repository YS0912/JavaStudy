/*===================================================================
							Ŭ���� ���
	- �ڹٿ��� �⺻������ �����ϴ� �ֿ� Ŭ������
===================================================================*/

class Test // extends Object
{
	/*
	Object�� �����
	*/

	private int a = 10;

	public void write()
	{
		System.out.println("a : " + a);
	}
}


public class Test128
{
	public static void main(String[] args)
	{
		Test ob1 = new Test();
		Test ob2 = new Test();

		System.out.println("10 == 9 : " + (10 == 9));
		// �� 10 == 9 : false

		int a = 10;
		int b = 10;
		System.out.println("a == b : " + (a == b));
		// �� a == b : true

		// ------------------ ��==�� �� �����ڴ� �ǿ������� ũ�⸦ ���Ѵٴ� ���� Ȯ��

		System.out.println("ob1 == ob2 : " + (ob1 == ob2));
		// �� ob1 == ob2 : false

		// ------------- ��==�� �� �����ڴ� ��ü(Object)�� ũ�⸦ ���� �� �ּҸ� ��


	}
}