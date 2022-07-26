/*===================================================================
					���� ó��(Exception Handling)
===================================================================*/

// �ٸ� ���� �ٽ� ������

public class Test153
{
	public int getValue(int value) throws Exception				// �� ���� ������
	{
		int a = 0;

		try
		{
			a = getData(-2);									// �� ���� �߻�
		}
		catch (Exception e)										// �� ���� ��Ƴ���
		{
			// �� ���� ó��
			System.out.println("printStackTrace...");
			e.printStackTrace();

			// �� ���� �߻� (��new!)
			throw new Exception("value�� �����Դϴ�.");
		}

		return a;
	}

	public int getData(int data) throws Exception				// �� ���� ������
	{
		if (data < 0)
		{
			throw new Exception("data�� 0���� �۽��ϴ�.");		// �� ���� �߻�
		}

		return data + 10;
	}

	public static void main(String[] args)
	{
		Test153 ob = new Test153();
		
		try
		{
			int a = ob.getValue(-2);								// �� ���� �߻�
			System.out.println("a : " + a);
		}
		catch (Exception e)											// �� ���� ��Ƴ���
		{
			// �� ���� ó��
			System.out.println("printStackTrace...");
			e.printStackTrace();
		}
	}
}

// ���� ���

/*
	// �� ù ��° ���� ó��
	printStackTrace...
	java.lang.Exception: data�� 0���� �۽��ϴ�.
			at Test153.getData(Test153.java:34)
			at Test153.getValue(Test153.java:15)
			at Test153.main(Test153.java:46)
	// �� �� ���� ���� ó��
	printStackTrace...
	java.lang.Exception: value�� �����Դϴ�.
			at Test153.getValue(Test153.java:24)
			at Test153.main(Test153.java:46)
	����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/