/*===================================================================
					�ڹ��� �⺻ �����(I/O)
	- Reader �ǽ�
===================================================================*/

import java.io.Reader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test174
{
	public static void main(String[] args) throws IOException
	{
		int data;
		char ch;

		// System.in		 : �ڹ� ǥ�� �Է� ��Ʈ�� (����Ʈ ��� ��Ʈ��)
		// InputStreamReader : ����Ʈ ����� ��Ʈ���� ���� ��� ��Ʈ������ ��ȯ
		// Reader			 : ���� ��� ��Ʈ�� ��ü
		Reader rd = new InputStreamReader(System.in);
		//				----------------- ---------
		//				   ���ڷ� ��ȯ	   ����Ʈ

		System.out.println("���ڿ� �Է�(����:Ctrl+z)");

		while ( (data = rd.read()) != -1)
		{
			ch = (char)data;

			// System.out.print(ch);						// ���� ��� ��Ʈ������ ���
			/* ��
				���ڿ� �Է�(����:Ctrl+z)
				abcd
				abcd
				1234
				1234
				�����ٶ�
				�����ٶ�
				^Z
				����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
			*/

			System.out.write(ch);							// ����Ʈ ��� ��Ʈ������ ���
			/* ��
				���ڿ� �Է�(����:Ctrl+z)
				abcd
				abcd
				1234
				1234
				�����ٶ�
				 ��|
				^Z
				����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
			*/
		}
	}
}