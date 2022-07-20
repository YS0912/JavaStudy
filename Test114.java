/*===================================================================
							Ŭ���� ���
	- ���(Inheritance)
===================================================================*/

/*
�� �޼ҵ� �������̵�(Method Overriding)�� Ư��
	- �޼ҵ� �̸�, ����Ÿ��, �Ķ���� ���� Ÿ���� ������ ��ġ�ؾ� ��
	- �ݵ�� ��� ���谡 �־�� �Ѵ�.
	- �����ǵ� ���� Ŭ������ �޼ҵ� �������������ڴ�
	  ����Ŭ������ �޼ҵ� �������������ں��� ������ ũ�ų� ���ƾ� �Ѵ�.
	  ���� ���, ���� Ŭ���� �޼ҵ��� �������������ڰ� ��protected���� ���
	  ���� Ŭ������ �� �޼ҵ带 �������̵�(Overriding)�Ѵٸ�
	  �������������ڴ� ��public�� �Ǵ� ��protected������ �Ѵ�.
	- ��static�� ��final�� ��private�� �޼ҵ�� �������̵�(Overriding)�� �� ����.
	- Exceptional�� �߰��� �Ұ����ϴ�.
	  ��, ���� �޼ҵ尡 ������ �ִ� ���� ���� ���� ���ο� Exceptional�� �߰��ϴ� ���� �Ұ���
*/

// �θ� Ŭ����
class SuperTest114
{
	private int a = 5;
	protected int b = 10;
	public int c = 20;
	
	public void write()
	{
		System.out.println("Super write() �޼ҵ� : " + a + " : " + b + " : " + c);
	}
}

// �ڽ� Ŭ����(���� Ŭ����, sub class)
class SubTest114 extends SuperTest114
{
	protected int b = 100;

	public void print()
	{
		// System.out.println("Sub print() �޼ҵ� : " + a + " : " + b + " : " + c);
		// �� ������ ����: ����Ŭ�������� ����� ���� a�� ������ �� X

		System.out.println("Sub print() �޼ҵ� : " + b + " : " + c);

		System.out.println("Sub print() �޼ҵ� : " + b);
		System.out.println("Sub print() �޼ҵ� : " + this.b);	// SubTest114.b
		System.out.println("Sub print() �޼ҵ� : " + super.b);	// SuperTest114.b
		// �� Sub print() �޼ҵ� : 100
		//	  Sub print() �޼ҵ� : 100
		//	  Sub print() �޼ҵ� : 10
		// -- ����b�� ���� ����� ���� �ٸ� b�� ���� �� ����� �̷������.
		//	  ����Ŭ�������� ����� b, ����Ŭ�������� ����� b

		System.out.println("Sub print() �޼ҵ� : " + c);
		System.out.println("Sub print() �޼ҵ� : " + this.c);
		System.out.println("Sub print() �޼ҵ� : " + super.c);
		// �� Sub print() �޼ҵ� : 20
		//	  Sub print() �޼ҵ� : 20
		//	  Sub print() �޼ҵ� : 20
		// -- ���� c�� �����ϴµ� �ƹ��� ����� ������ ����.
		//	  ����Ŭ�������� ����� c
	
	} // end print

	@Override
	public void write()
	{
		System.out.println("Sub print() �޼ҵ� : " + b + " : " + c);
	}
}


// main() �޼ҵ带 �����ϴ� �ܺ��� �ٸ� Ŭ����
public class Test114
{
	public static void main(String[] args)
	{
		// ���� Ŭ����(SubTest114) �ν��Ͻ� ����
		SubTest114 ob = new SubTest114();

		ob.print();
		// �� Sub print() �޼ҵ� : 100 : 20
		//		������ �޼ҵ�ó�� ����⸦ ���� ó���� ���� �ʴ´�.
		//		�޼ҵ�� �θ��ڽ��� ���� ������ ������ ������,
		//		������ ���� �ٸ� ������ ����Ǳ� ������ ������ ����ؾ� �ϱ� ����.
		//		��, �θ� Ŭ�������� ������ ������� �ص� �ڽ� Ŭ�������� �����ϰ� ������ �� �ִ�.
		//		�ڽ� Ŭ�������� ���� ���� ������ ȣ���� ���� �ڽ� Ŭ���� ������ ȣ��ǰ�,
		//		super.������ ���� ȣ���ϸ� �θ� Ŭ���� ������ ȣ��ȴ�.

		ob.write();
		// �� Super write() �޼ҵ� : 5 : 10 : 20
		// ������ ��
		// �� ������ ����: ����Ŭ�������� ����� ���� a�� ������ �� X
		// ���� ��
		// �� Sub print() �޼ҵ� : 100 : 20 

		System.out.println("------------------------------------ ���м�");

		System.out.println(ob.b);
		// �� 100

		System.out.println( ((SuperTest114)ob).b);
		// �� 10
		// �� ���� �θ�

		((SuperTest114)ob).write();
		// �� Sub print() �޼ҵ� : 100 : 20
		//		�̹� �޼ҵ�� �����Ǹ� ���� ����� �߱� ������ ���� �θ��� �ص�
		//		������ ���¸� �ҷ��� �� ����.
	}
}