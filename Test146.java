/*===================================================================
							Ŭ���� ���
	- �ڹٿ��� �⺻������ �����ϴ� �ֿ� Ŭ������
	- Random Ŭ����
===================================================================*/

/*
�� java.util.Random Ŭ������
	
	���� ������ ������ �߻����� �����ϴ� Ŭ�����̴�.
	Math Ŭ������ ���� �޼ҵ��� random() �޼ҵ嵵 ������ �����ϴ� �޼ҵ�������,
	0.0 ~ 1.0 ������ �Ǽ� ���¸� �߻���Ű�Ƿ�
	�ʿ��� ���� ������ ������ ������ ���ؼ��� �߰����� ������ �����ؾ� �Ѵ�.
	�׷��� �ڹٴ� ���� ������ ������ �߻������ִ� ����Ŭ������
	Random Ŭ������ ������ �����ϰ� �ִ�.
*/

// �ζ� ��ȣ ���� (���� �߻� ���α׷�)

// ���α׷��� ����Ǹ� �⺻������ �ζǸ� 5���� �����ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
// 3 5 12 24 31 41
// 1 2 8 36 41 42
// 4 9 12 13 22 30
// 5 10 13 14 22 40
// 22 31 36 40 43 44
// ����Ϸ��� �ƹ� Ű�� ��������...

import java.util.Random;
import java.util.Arrays;							// �߰�~!!!  check~!!!

class Lotto
{
	// �迭 ���� ���� �� �޸� �Ҵ� �� �ζ� ��ȣ�� ��Ƶ� �迭�� 6ĭ
	private int[] num;

	// ������
	Lotto()
	{
		num = new int[6];
	}

	// getter
	public int[] getNum()
	{
		return num;
	}

	// 6���� ������ �߻���Ű�� �޼ҵ� ����
	public void start()
	{
		// �� Ǯ�� --------------------------------------------------------------------------------

		/*
		Random random = new Random();
		
		// �迭�� ���� �ʱ�ȭ
		for (int i=0; i<num.length; i++)
		{
			num[i] = random.nextInt(45) +1;
			
		}

		// ������ �迭 ���� ���� ���� ���� ���� ��� ���ʱ�ȭ
		boolean flag = false;
		
		do
		{
			for (int i=0; i<num.length-1; i++)
			{
				for (int j=(i+1); j<num.length; j++)
				{
					if (num[i] == num[j])
					{
						flag = true;
						num[i] = random.nextInt(45) +1;
					}
				}
			}
		}
		while (flag);
		
		// ���
		for (int i : num)
			System.out.print(" " + i);
		*/


	// ������ Ǯ�� --------------------------------------------------------------------------------

		Random rd = new Random();
		int n;
		int cnt = 0;

		jump: 

		while (cnt<6)										// ���� �߻�
		{
			n = rd.nextInt(45) + 1;

			for (int i=0; i<cnt; i++)						// ��
			{
				if (num[i] == n)
					continue jump;
			}

			num[cnt++] = n;

			// ���� �޼ҵ� ȣ��
			//sorting();									// ��ġ�� �߸��� ��Ȳ~!!!
		}

		// ���� �޼ҵ� ȣ��
		sorting();											// ��ġ �̵�~!!!

	} // end start
	
	// ���� �޼ҵ� ����
	private void sorting()
	{
		Arrays.sort(num);
	}

} // end Lotto

public class Test146
{
	public static void main(String[] args)
	{	
		// Lotto Ŭ���� ��� �ν��Ͻ� ����
		Lotto lotto = new Lotto();
		
		// �⺻ 5 ����
		for (int i=1; i<=5; i++)
		{
			// �ζ� ���� ����
			lotto.start();

			// ��� ���
			//for (int n : lotto.getNum)			// ���⼭ ȣ���� ���� �޼ҵ�~!!!
			for (int n : lotto.getNum())
				System.out.printf("%4d", n);
			System.out.println();
		}
	}
}