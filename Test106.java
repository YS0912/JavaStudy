/*===================================================================
						�ֹε�Ϲ�ȣ ��ȿ�� �˻�
===================================================================*/

/*
�� �ֹε�Ϲ�ȣ ���� ����

	�� ������ �ڸ��� ������ ���ڸ� ���� ��Ģ�� �°� ���Ѵ�
		
		123456-1234567	(�ֹι�ȣ)
		****** ******	----------------------- �� �ڸ����� ���ϱ�
		234567 892345	(�� �ڸ��� ������ ��)

	�� ��Ģ�� �°� ���� ������ ������ ����� ��� ���Ѵ�

	ex) 7 5 0 6 1 5 - 1 8 6 2 1 3 3
		* * * * * *   * * * * * *
		2 3 4 5 6 7   8 9 2 3 4 5
		---------------------------
		�� 14 + 15 + 0 + 30 + 6 + 35 + 8 + 72 + 12 + 6 + 4 + 15
		   == 217
	
	�� ���� ������� 11�� ������ ������������ ���Ѵ�.

			   1 9
			-------
		11 | 2 1 7
			 1 1
			-------
			 1 0 7
			   9 9
			-------
				 8		�� ������

	�� 11���� ������ 8�� �� ������� ���Ѵ�.

		11 - 8 �� 3

		if ���� ó�� �������� �������� 0�� ��� �� 11 - 0 = 11
							  �������� 1�� ��� �� 11 - 1 = 10
		
		�̸� �ٽ� 10���� ������ �������� ����	11 �� 1
												10 �� 0

	�� ���� ���� ����� �ֹι�ȣ�� �����ϴ� ������ ���ڿ� ��ġ�ϴ��� ���θ� ���Ͽ� Ȯ��
		��ġ	�� ��ȿ�� �ֹι�ȣ
		����ġ	�� �߸��� �ֹι�ȣ
*/

// ���� ��)
// �ֹι�ȣ�Է� (xxxxxx-xxxxxxx) : 123456-12345678 �� �Է� ���� �ʰ�
// >> �Է� ����
// ����Ϸ��� �ƹ� Ű�� ��������...

// �ֹι�ȣ�Է� (xxxxxx-xxxxxxx) : 123456-123456 �� �Է� ���� �̴�
// >> �Է� ����
// ����Ϸ��� �ƹ� Ű�� ��������...

// �ֹι�ȣ�Է� (xxxxxx-xxxxxxx) : 750615-1252085 �� ��ȿ�� �ֹι�ȣ
// >> ��Ȯ�� �ֹι�ȣ
// ����Ϸ��� �ƹ� Ű�� ��������...

// �ֹι�ȣ�Է� (xxxxxx-xxxxxxx) : 750615-1252086 �� �߸��� �ֹι�ȣ
// >> �߸��� �ֹι�ȣ
// ����Ϸ��� �ƹ� Ű�� ��������...

// ��Hint
//		�迭.length				�� �迭�� ����(�迭���� ����) ��ȯ
//		���ڿ�.length()			�� ���ڿ��� ���� ��ȯ
//		���ڿ�.substring()		�� ���ڿ� ����
//		���ڿ�.substring(m, n)	�� ���ڿ� m��° ��ġ���� n-1��° ��ġ���� ����(�ε����� 0����)
//		���ڿ�.substring(m)		�� ���ڿ� n��° ��ġ���� ���ڿ��� ������ ����(�ε����� 0����)

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test106
{
	public static void main(String[] args) throws IOException
	{
		/*
		// �׽�Ʈ
		String strTemp = "���¹�";
		System.out.println(strTemp.length());
		// �� 3

		strTemp = "���ع��� ��λ���";
		System.out.println(strTemp.length());
		// �� 9

		strTemp = "study-hard";
		System.out.println(strTemp.length());
		// �� 10

		// ------------------------------------------------------------------------------

		strTemp = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println(strTemp.substring(13, 17));
		// �� NOPQ

		// System.out.println(strTemp.substring(13, 57));
		// �� ������ ����
		//		StringIndexOutOfBoundsException

		System.out.println(strTemp.substring(13));
		// �� NOPQRSTUVWXYZ
		*/
		
		// �� Ǯ�� ----------------------------------------------------------------------
		
		// ���� ����
		String code;
		int result=0;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// ����� �Է°�
		System.out.print("�ֹι�ȣ�Է� (xxxxxx-xxxxxxx) : ");
		code = br.readLine();

		// ��� ���
		// -- �Է� ���� �ʰ� �Ǵ� �̴��� ���
		if (code.length()<14 || code.length()>14)
			System.out.println(">> �Է� ����");

		// "-"�� ������ ���ڰ��� �����Ͽ� code�� ��Ƴ���
		code = code.substring(0, 6) + code.substring(7);

		// System.out.println(code);

		// System.out.println(result);
		
		// �ֹε�Ϲ�ȣ ��ȿ�� �˻� ����
		// �� ������ �ڸ��� ������ ���ڸ� ���� ��Ģ�� �°� ���ϰ� ���Ѵ�
		for (int i=0; i<(code.length()-1); i++)
		{
			if (i<=7)
				result += Integer.parseInt(code.substring(i, i+1)) * (i+2);
			else
				result += Integer.parseInt(code.substring(i, i+1)) * (i-6);
		}


		/*
		for (int i=1; i<=6; i++)
		{
			if (i<=9)
				result += Integer.parseInt(code.substring(i-1,i)) * i;
		}

		for (int i=8; i<=13; i++)
		{	
			if (i<=11)
				result += Integer.parseInt(code.substring(i-1,i)) * i;
			else
				result += Integer.parseInt(code.substring(i-1,i)) * i;
		}
		*/

		// �� result�� 11�� ���� ������
		result = result%11;

		// �� ���� ���� 10���� ū ��� 10���� �ٽ� ������
		if (result>=10)
			result = result%10;

		// �� 11���� result ���� �� ������� ���Ѵ�
		result = 11 - result;

		// System.out.println(result);

		// ��� ���
		// -- ��ȿ�� �˻� ���
		if (result==Integer.parseInt(code.substring(12)))
			System.out.println(">> ��Ȯ�� �ֹι�ȣ");
		else
			System.out.println(">> �߸��� �ֹι�ȣ");

		// System.out.println(Integer.parseInt(code.substring(2, 3))*5);


	}
}