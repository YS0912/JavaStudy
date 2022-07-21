/*===================================================================
							Ŭ���� ���
	- ��ø Ŭ����
===================================================================*/

// Outer
class InnerOuterTest
{
	static int a = 10;
	int b = 20;
	
	// Inner
	class InnerNested
	{
		int c =30;

		void write()		// inner�� write() �޼ҵ�
		{
			System.out.println("inner�� write()");
			System.out.println("a : " + a);
			System.out.println("b : " + b);
			System.out.println("c : " + c);
		}

	} // end InnerNested


	void write()		 // outer�� write() �޼ҵ�
	{
		System.out.println("outer�� write()");

		InnerNested ob1 = new InnerNested();
		ob1.write();	// inner�� wirte() �޼ҵ� ȣ��
	}

} // end InnerOuterTest


// main() �޼ҵ带 �����ϰ� �ִ� �ܺ��� �ٸ� Ŭ����
public class Test124
{
	public static void main(String[] args)
	{
		// InnerOuterTest(outer) Ŭ���� ��� �ν��Ͻ� ����
		InnerOuterTest ob2 = new InnerOuterTest();
		ob2.write();	// outer�� write() �޼ҵ� ȣ��
		/* ��
			outer�� write()
			inner�� write()
			a : 10
			b : 20
			c : 30
		*/

		// InnerNested(inner) Ŭ���� ����� �ν��Ͻ� ����
		// InnerNested ob3 = new InnerNested();
		// �� ������ ����: error: cannot find symbol

		// InnerOuterTest(outer) Ŭ������ ���� InnerNested(inner) Ŭ���� ��� �ν��Ͻ� ����
		// InnerOuterTest.InnerNested ob4 = new InnerOuterTest.InnerNested();
		// InnerNested() Ŭ������ static�� �ƴϱ� ������ ��Test122�ڿ� ���� ������� ó�� �Ұ�

		// ��ø ���� Ŭ����(static ��ø Ŭ����)�ʹ� �޸�,
		// �ܺ� Ŭ������ �ν��Ͻ�(��ü)�� ������� �ʰ� �ܵ����� ���� Ŭ������ �ν��Ͻ��� ���� �Ұ�
		//	�� �ܺ� Ŭ������ ��ü�� ����ϸ� ���� Ŭ������ ��ü�� �����ϴ� ���� �����ϴ�.

		InnerOuterTest.InnerNested ob5 = ob2.new InnerNested();
		ob5.write();
		/* ��
			inner�� write()
			a : 10
			b : 20
			c : 30
		*/

		InnerOuterTest.InnerNested ob6 = new InnerOuterTest().new InnerNested();
		ob6.write();
		/* ��
			inner�� write()
			a : 10
			b : 20
			c : 30
		*/


	}
}

// outerŬ������.innerŬ������ ���������� = new outer������().new inner������();

// cf) static �� ��ø ���� Ŭ����
// outerŬ������.innerŬ������ ���������� = new outerŬ������.inner������();