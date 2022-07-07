/*===================================================================
				���� ���� �帧�� ��Ʈ�� (���) ����
	�ݺ���(while) �ǽ� �� ����
===================================================================*/

// ����ڷκ��� ������ �� ������ �Է¹޾�
// �Է� ���� �� ���� �� ���� ������ ū �������� ���� ���Ͽ� ����� ����ϴ� ���α׷� ����

// ���� ��)
// ù ��° ���� �Է� : 100
// �� ��° ���� �Է� : 200
// >> 100 ~ 200 ������ �� : xxx
// ����Ϸ��� �ƹ� Ű�� ��������...

// ù ��° ���� �Է� : 1000
// �� ��° ���� �Է� : 2
// >> 2 ~ 1000 ������ �� : xxxx
// ����Ϸ��� �ƹ� Ű�� ��������...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test052
{
	public static void main(String[] args) throws IOException
	{
		// �� Ǯ�� --------------------------------------------------------------------------------
		
		/*
		// �ʼ� ���� ���� �� �ʱ�ȭ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = 0;									// ���� ����
		int min, max;								// �Է� ����
		int sum = 0;								// ���� ����

		// ���� �� ó��
		System.out.print("ù ���� ���� �Է� : ");
		min = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է� : ");
		max = Integer.parseInt(br.readLine());

		// �μ��� ũ�� �� �� ����
		if (min > max)
		{
			min = min ^ max;
			max = max ^ min;
			min = min ^ max;
		}
		else
		{
			min = min;
			max = max;
		}

		// ���� �� < n < ū �� ������ ���� ������
		n = min;

		while (n<=max)
		{
			sum += n;
			n++;
		}

		// ��� ���
		System.out.printf(">> %d ~ %d ������ �� : %d%n", min, max, sum);
		*/


		// ���������� Ǯ�� ------------------------------------------------------------------------
		/*
		�� �Է� ���� ���� �����ϰ� ũ�� ��
		*/
		
		
		// ������ Ǯ�� ----------------------------------------------------------------------------
		
		// �ֿ� ���� ���� �� �ʱ�ȭ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n;							// ���� ����
		int su1, su2;					// ����� �Է°� ����
		int result=0;					// ������ ����

		// ���� �� ó��
		System.out.print("ù ��° ���� �Է� : ");
		su1 = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է� : ");
		su2 = Integer.parseInt(br.readLine());

		// �Է� ���� �� ���� ũ�� �� �� �ڸ� �ٲ�
		// ��, su1�� su2���� ū ��� �� ���� �ڸ��� �ٲ� �� �ֵ��� ó��
		if (su1 > su2)
		{
			// �ڸ� �ٲ�
			su1 = su1 ^ su2;
			su2 = su2 ^ su1;
			su1 = su1 ^ su2;
		}

		// �ݺ� ���� ����
		n = su1;

		while (n <= su2)
		{
			// ����� ����� �� ���� �߻� (su1 ~ su2 ǥ�� �Ұ�)
			/*
			result += su1;
			su1++;
			*/
			
			result += n;
			n++;
		}
		
		// ��� ���
		System.out.printf(">> %d ~ %d ������ �� : %d%n", su1, su2, result);
	}
}

// ���� ���
/*
	ù ��° ���� �Է� : 100
	�� ��° ���� �Է� : 1
	>> 1 ~ 100 ������ �� : 5050
	����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

	ù ��° ���� �Է� : 100
	�� ��° ���� �Է� : 2
	>> 2 ~ 100 ������ �� : 5049
	����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/