/*===================================================================
					�ڹ��� �⺻ �����(I/O)
	- Reader Writer �ǽ�
===================================================================*/

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.io.IOException;

public class Test176
{
	public void process(InputStream is)						// System.in ����
	{
		int data;

			System.out.println("���ڿ� �Է�(����:Ctrl+z)");

			try
			{
				// �Ű����� is��� ����Ʈ ��� ��ü(InputStream)�� ���� ��Ʈ������ ��ȯ�Ͽ�
				// (�� InputStreamReader�� ����)
				// Reader Ÿ���� rd���� ������ �� �ֵ��� ó��
				Reader rd = new InputStreamReader(is);				
				
				// ����Ʈ ��� ��Ʈ���� �ڹ� �⺻ ��� ��Ʈ��(Sytem.out)�� ���� ��Ʈ������ ��ȯ�Ͽ�
				// (�� OuputStreamWriter�� ����)
				// Writer Ÿ���� wt���� ������ �� �ֵ��� ó��
				Writer wt = new OutputStreamWriter(System.out);

				// ��, rd�� wt�� ��� ���� ��� ��Ʈ��! (���� �Է�, ����� ���)

				while ( (data = rd.read()) != -1)
				{
					wt.write(data);					// �������� ��Ʈ���� data�� ���
					wt.flush();						// ����� ��Ʈ���� �о ������
				}
			}
			catch (IOException e)
			{
				System.out.println(e.toString());
			}
	}
	
	public static void main(String[] args)
	{
		Test176 ob = new Test176();
		ob.process(System.in);
	}
}

// ���� ���
/*
	���ڿ� �Է�(����:Ctrl+z)
	12345
	12345
	abcde
	abcde
	�����ٶ�
	�����ٶ�
	^Z
	����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/