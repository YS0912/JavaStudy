/*===================================================================
							Ŭ���� ���
	- �������̽�(Interface)
===================================================================*/

// �������̽�
interface ADemo
{
	public void write();
}

// �������̽�
interface BDemo
{
	public void print();
}

// �������̽��� 2�� �̻��� ����(implements)�� �� �ִ�.
//	�� Ŭ�������� ���� ����� ���� �ʴ� �κ��� ����(����)�ϴ� ����

// Ŭ����
// class DemoImpl
// class DemoImpl extends ADemo, BDemo
// class DemoImp1 implements ADemo, BDemo
//
// �߻� Ŭ���� - �� �������̽��� �����ϴ� �߻� Ŭ����
// abstract class DemoImp1 implements ADemo, BDemo

class DemoImpl implements ADemo, BDemo
{
	// JDK 1.5(5.0)������ �������̽� �޼ҵ带 �������̵�(Overriding)�� ��
	// ��@Override�� ������̼�(annoutation)�� ����� �� ����.
	// JDK 1.6 ���ĺ��� ���� ������ �����̴�.
	// ��, ��ӹ��� Ŭ������ �޼ҵ带 �������̵��� ������ 
	// JDK 1.5������ ��@Override�� ������̼�(annotation) ����� �����ϴ�.
	@Override
	public void write()
	{
		System.out.println("ADemo �������̽� �޼ҵ� write()");
	}

	@Override
	public void print()
	{
		System.out.println("BDemo �������̽� �޼ҵ� print()");
	}
}


// main() �޼ҵ带 �����ϴ� �ܺ��� �ٸ� Ŭ����
public class Test118
{
	public static void main(String[] args)
	{
		// ADemo ob = new ADemo();
		// BDemo ob = new BDemo();
		// �� �Ұ�: �������̽��� �ν��Ͻ� ���� X

		// ADemo, BDemo �������̽��� ����(implements)�� Ŭ����(DemoImpl) ����� �ν��Ͻ� ����
		DemoImpl ob1 = new DemoImpl();

		ob1.write();
		// �� ADemo �������̽� �޼ҵ� write()

		ob1.print();
		// �� BDemo �������̽� �޼ҵ� print()
		
		// �� �� ĳ����
		ADemo ob2 = new DemoImpl();
		BDemo ob3 = new DemoImpl();

		// ob2.print();
		// �� ������ ����: error: cannot find symbol

		// ob3.print();
		// �� ������ ����: error: cannot find symbol

		ob3.print();
		ob2.write();
		// �� BDemo �������̽� �޼ҵ� print()
		//    ADemo �������̽� �޼ҵ� write()

		((BDemo)ob2).print();
		((ADemo)ob3).write();
		// �� BDemo �������̽� �޼ҵ� print()
		//    ADemo �������̽� �޼ҵ� write()
		//		�� DemoImpl Ŭ������ ADemo�� BDemo �������̽��� ��� �����߱� ������ ����
		//		   ����, DemoImpl Ŭ������ �� �������̽��� �� �� �������̽��� �����ߴٸ�
		//		   �� ������ ��Ÿ�� ������ �߻��ϴ� ������ �ȴ�.
		
		// �� �ٿ� ĳ����
		((DemoImpl)ob3).write();
		// �� ADemo �������̽� �޼ҵ� write()
	}
}