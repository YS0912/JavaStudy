/*===================================================================
							Ŭ���� ���
	- ��ø Ŭ����
===================================================================*/

/*
�� Annonymous Ŭ����(�͸��� Ŭ���� : ���� Ŭ����)

	- AWT �� �ȵ���̵� �̺�Ʈ ó������ �Ϲ������� ���
	- ���� Ŭ���� �޼ҵ带 �ϳ� ���� �������� �ʿ伺�� ���� �� ���
	- Ŭ������ ��ü�� �ʿ��ϸ� �� �ٽ� Ŭ������ �����ؾ� �ϴ� ���ŷο����� ����
	  ����ϰ� ��ü ������ �ʿ��� ��� �͸��� Ŭ������ �����Ͽ� ó�� ����

�� ���� �� ����

	new ����Ŭ������ ������()
	{
		�������������� �ڷ��� �޼ҵ�()
		{
			����
		}
	};
	�� �����ݷ� �ʼ�
*/

// import java.lang.*;		�� String, System, etc

class Test3 // extends Object
{
	/*
	Object�� ��� ���� �� �޼ҵ�
	
	Ex)
	public String toString()
	{
	}
	*/

	public Object getString()
	{
		/*
		Object ob = new Object();
		ob.xxx();
		ob.xxxx();

		return ob;
		*/

		// return new Object();
		//			 ---------- Object ��

		// return new Object(){ Ư�� �޼ҵ� �籸�� };

		return new Object()
		{
			// Ư�� �޼ҵ� �籸��
			@Override
			public String toString()
			{
				return "�͸��� Ŭ����";
			}
		};
	}
}

public class Test125 // extends Object (���� ����� ���� �ʵ��� �ֻ��� Ŭ������ �ٴ´�)
{
	public static void main(String[] args)
	{
		Test3 ob1 = new Test3();

		System.out.println(ob1.toString());
		// �� Test3@15db9742
		
		System.out.println(ob1.getString());
		// �� �͸��� Ŭ����

	}
}