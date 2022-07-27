/*===================================================================
							�÷���(Collection)
===================================================================*/

/*
�� ť(Queue)

	ť(Queue)�� ���Լ����� FIFO(First Input, First Output) ���ַ� ���� �Էµ� �ڷḦ ���� ����ϸ�,
	Queue �������̽��� ������ Ŭ������ ť�� ������ �پ��� ����� �����Ѵ�.

�� Queue �������̽� �ν��Ͻ��� �����ϱ� ���ؼ��� new �����ڸ� �̿��Ͽ�
   Queue �������̽��� ������(implements) Ŭ������ �����ڸ� ȣ���Ѵ�.

   ex) Queue ob = new LinkedList();


�� �ֿ� �޼ҵ�
	
	- E element()
		ť�� head ��Ҹ� ��ȯ�ϸ� �������� �ʴ´�.

	- boolean offer(E o)
		������ ��Ҹ� ť�� �����Ѵ�.

	- E peek()
		ť�� head ��Ҹ� ��ȯ�ϰ� �������� ������ ť�� �ڷᱸ���� empty�� ��� null�� ��ȯ�Ѵ�.

	- E poll()
		ť�� head ��Ҹ� ��ȯ�ϰ� �����ϸ� ť �ڷᱸ���� empty�� ��� null�� ��ȯ�Ѵ�.

	- E remove()
		ť�� head ��Ҹ� ��ȯ�ϰ� �����Ѵ�.
*/

import java.util.Queue;
import java.util.LinkedList;

public class Test156
{
	public static void main(String[] args)
	{
		// Queue �ڷᱸ�� ����
		// Queue myQue = new Queue();		-- X
		Queue<Object> myQue = new LinkedList<Object>();


		// ������ ����
		String str1 = "�ֵ���";
		String str2 = "������";
		String str3 = "���¹�";
		String str4 = "������";


		// myQue��� Queue �ڷᱸ���� ������ �߰�
		myQue.offer(str1);
		myQue.offer(str2);
		myQue.offer(str3);
		// myQue.offer(str4);
		boolean test = myQue.offer(str4);

		System.out.println("test : " + test);
		// �� test : true

		// �׽�Ʈ
		// System.out.println(myQue);
		// �� [�ֵ���, ������, ���¹�, ������]		-- ����


		// Queue �ڷᱸ�� myQue���� ��Ҹ� �������� �ʰ� head ��� ��ȯ
		System.out.println("��1 : " + (String)myQue.element());
		System.out.println("��2 : " + (String)myQue.element());
		// �� ��1 : �ֵ���
		//	  ��2 : �ֵ���

		System.out.println();

		String val;

		/* ��
		// peek()
		// -- ť�� head ��� ����, ���� ����
		//	  ť�� empty�� ��� null�� ��ȯ
		while (myQue.peek() != null)
		{
			// poll()
			// -- ť�� head ��� ��ȯ�ϰ� ����
			//	  ť�� empty�� ��� null�� ��ȯ
			val = (String)myQue.poll();
			System.out.println("��� : " + val);
		}
		System.out.println();
		// �� ��� : �ֵ���
		//	  ��� : ������
		//	  ��� : ���¹�
		//	  ��� : ������
		*/

		/* ����
		while (myQue.poll() != null)
		{
			// poll()
			// -- ť�� head ��� ��ȯ�ϰ� ����
			//	  ť�� empty�� ��� null�� ��ȯ
			val = (String)myQue.poll();
			System.out.println("��� : " + val);
		}
		System.out.println();
		// �� ��� : ������
		//	  ��� : ������
		*/


		/* ��
		while (true)
		{
			val = (String)myQue.poll();

			if (val==null)
				break;
			else
				System.out.println("��� : " + val);
		}
		System.out.println();
		// �� ��� : �ֵ���
		//	  ��� : ������
		//	  ��� : ���¹�
		//	  ��� : ������
		*/

		/* ��
		while (!myQue.isEmpty())
		{
			val = (String)myQue.poll();
			System.out.println("��� : " + val);
		}
		System.out.println();
		// �� ��� : �ֵ���
		//	  ��� : ������
		//	  ��� : ���¹�
		//	  ��� : ������
		*/


	}
}