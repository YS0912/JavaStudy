/*===================================================================
							�÷���(Collection)
===================================================================*/

import java.util.Stack;

public class Test155
{
	// ���� ���ڿ� �迭 ���� �� �ʱ�ȭ
	private static final String[] colors
		= {"����", "���", "�ʷ�", "�Ķ�", "����", "����"};

	// ������
	public Test155()
	{
		// st��� Stack �ڷᱸ�� ����
		// ���׸��� Ȱ���Ͽ� �ڷᱸ���� ���� ������ ǥ�� �� ��<String>��
		Stack<String> st = new Stack<String>();


		// st��� Stack �ڷᱸ���� ������(colors) ���
		// st = colors;			-- (X)
		for (String i : colors)
			st.add(i); // = st.push(i)
		
			/*
				for (int i=0; i<colors.length; i++)
					st.push(colors[i]);
			*/


		// �߰�
		st.push("����");

		// st.push(10);
		// �� ������ ���� �߻�: error: incompatible types
		//		-- ���׸� ǥ������ ���� ������ String�� �ƴ� �ٸ� �ڷ�����
		//		   ���� �ڷᱸ�� st�� push() �Ϸ��� �߱� ����


		// ��� �޼ҵ� ȣ��
		popStack(st);
	}

	// ��� �޼ҵ�
	private void popStack(Stack<String> st)
	{
		System.out.print("pop : ");
		while (!st.empty())		// isEmpty()
		{
			System.out.print(st.pop() + " ");
		}
		System.out.println();
	}

	public static void main(String[] args)
	{
		new Test155();
	}
}

// ���� ���
/*
	pop : ���� ���� ���� �Ķ� �ʷ� ��� ����
	����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/