/*===================================================================
				���� ���� �帧�� ��Ʈ�� (���) ����
	�ݺ���(while) �ǽ� �� ����
===================================================================*/

// �� ����
//	  ����ڷκ��� ������ ������ �Է� �޾�
//	  1���� �Է� ���� �� ���������� ��ü �� / ¦�� �� / Ȧ�� ����
//	  ���� ��������� ����ϴ� ���α׷��� ����

// ���� ��)
// ������ ���� �Է� : 284
// >> 1 ~ 284 ������ ������ �� : xxxx
// >> 1 ~ 284 ������ ¦���� �� : xxxx
// >> 1 ~ 284 ������ Ȧ���� �� : xxxx
// ����Ϸ��� �ƹ� Ű�� ��������...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test053
{
	public static void main(String[] args) throws IOException
	{
		// �ʼ� ���� ���� �� �ʱ�ȭ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n;									// ����� �Է� ����
		int l=0;								// ���� ����
		int sum, even, odd;						// ������ ������ ����
		sum = even = odd =0;

		// ���� �� ó��
		System.out.print("������ ���� �Է� : ");
		n = Integer.parseInt(br.readLine());

		while (l<=n)
		{
			if (l % 2 == 0)								// ¦����,
			{
				sum += l;
				even += l;
			}
			else if (l % 2 != 0)						// Ȧ����,
			{
				sum += l;
				odd += l;
			}
			else
				System.out.print("�Է� ����");			// Ȥ�� �� ���� ���� ���´ٸ�,

			l++;
		}

		// ��� ���
		System.out.printf("1 ~ %d ������ ������ �� : %d%n", n, sum);
		System.out.printf("1 ~ %d ������ ¦���� �� : %d%n", n, even);
		System.out.printf("1 ~ %d ������ Ȧ���� �� : %d%n", n, odd);
	}
}

// ���� ���
/*
	������ ���� �Է� : 284
	1 ~ 284 ������ ������ �� : 40470
	1 ~ 284 ������ ¦���� �� : 20306
	1 ~ 284 ������ Ȧ���� �� : 20164
	����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/