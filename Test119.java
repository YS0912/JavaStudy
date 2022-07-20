/*===================================================================
							Ŭ���� ����
	- �������̽�(Interface)
===================================================================*/

// �������̽�
interface Demo
{
	public void write();
	public void print();
}

// �������̽��� �����ϴ� �߻� Ŭ����
abstract class DemoImpl implements Demo
{
	@Override
	public void write()
	{
		System.out.println("write() �޼ҵ� ������");
	}

	// public abstract void print();		�� �̰� ���� ������ X
}

// �߻� Ŭ������ ��ӹ޴� �߻� Ŭ����
// abstract class DemoImplSub extends DemoImpl
//				��
// �߻� Ŭ������ ��ӹ޴� Ŭ����
class DemoImplSub extends DemoImpl
{
	public void test()
	{
		System.out.println("test");
	}

	@Override
	public void print()
	{
		System.out.println("print() �޼ҵ� ������");
	}
}

public class Test119
{
	public static void main(String[] args)
	{
		// Demo ob1 = new Demo();		�� �Ұ���: �������̽� �ν��Ͻ� ���� X
		
		// DemoImpl ob2 = new DemoImpl();
		// �� �ν��Ͻ� ���� �Ұ�: �߻� Ŭ����

		DemoImplSub ob3 = new DemoImplSub();

		ob3.write();
		ob3.print();
		// �� write() �޼ҵ� ������
		//	  print() �޼ҵ� ������
	}
}

// ���� ���

/*
	write() �޼ҵ� ������
	print() �޼ҵ� ������
	����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/