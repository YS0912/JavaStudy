/*===================================================================
				���� ���� �帧�� ��Ʈ�� (���) ����
	�ݺ���(for) �ǽ� �� ����
===================================================================*/

/*
�� ����

	��for������ ������ Ƚ����ŭ �ݺ��ؾ� �ϴ� ��� �����ϰ� ����ϴ� �ݺ���
	��while������ ���������� �ݺ� ���๮�� ���ǿ� ���� ���� ��� �� ���� �������� ���� �� ������,
	���� ������ �ʱⰪ, ���ǽ�, ������ ���� �� �������� Ȯ�� ����
	�� ������ ����

�� ���� �� ����

	for (����1; ����2; ����3)
	{
		���๮;
	}

	����1: ���� ������ �ʱ�ȭ�� ���� ���
		   ���� �� �� ���� ����
	����2: ���ǽ��� ��Ÿ���� ������ �� ���ǽ��� �����ϸ� ������ �ݺ��ؼ� ����
		   ��for������ ���� ������ ����2�� ���̸� �ݺ����� �����ϰ�
		   ����3�� ������ �� ����2�� ���ǽ��� �ٽ� �˻��ϴ� ������ ����
		   ���� ó���� ���ǽ��� ó�� ����� ������ ���,
		   ��for�������� �� ���� �������� �ʰ� ��
	����3: ���� ������ ���ʱ�ȭ�� ���� ���Ǹ�,
		   �ݺ����� ���ǽ��� ���ʶ߸��� �Ǵ� ���������� ó���ϴ� ���� �Ϲ���
		   �ĸ���,���� �̿��Ͽ� ���� ������ ���ÿ� ���� ����
*/

public class Test057
{
	public static void main(String[] args)
	{
		int n = 1;				// while ���� ����� ���� ����
		int m;					// for ���� ����� ���� ����

		while (n <= 10)
		{
			System.out.println("n=" + n);
			n++;
		}

		System.out.println();

		// ���� while ���� for ������ ���ۼ�

		for (m = 1; m <= 10; m++)
			System.out.println("m=" + m);
	}
}