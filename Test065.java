/*===================================================================
				���� ���� �帧�� ��Ʈ�� (���) ����
	break �ǽ� �� ����
===================================================================*/

// break : ����� + "�׸��� ����������"

// ������ ���� ó���� �̷������ ���α׷��� ����
// ��, �Է� �޴� ������ 1 ~ 100 ���� �ȿ����� �����ϵ��� �ۼ�

// ���� ��)
// ������ ���� �Է� : -10

// ������ ���� �Է� : 0

// ������ ���� �Է� : 2022

// ������ ���� �Է� : 10
// >> 1 ~ 10������ �� : 55
// ����Ͻðڽ��ϱ�(Y/N)? : y

// ������ ���� �Է� : 100
// >> 1 ~100������ �� : 5050
// ����Ͻðڽ��ϱ�(Y/N)? : n
// ����Ϸ��� �ƹ� Ű�� ��������... (�� ���α׷� ����)


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test065
{
	public static void main(String[] args) throws IOException
	{
		// �� Ǯ�� --------------------------------------------------------------------------------

		
		// �ֿ� ���� ���� �� �ʱ�ȭ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num;						// ����� �Է� ���� ����
		char yn='y';					// ����� �Է� �� �ƴϿ�
		int l;							// ���� ����
		int sum;						// ��� ����

		// ���� �� ó��		
		do
		{
			System.out.print("������ ���� �Է� : ");
			num = Integer.parseInt(br.readLine());

			sum = 0;

			for (l=1; num>=1 && num<=100 && l<=num; l++)
					sum += l;
			
			if (sum>=1)
			{
				System.out.printf("1 ~ %d������ �� : %d\n", num, sum);

				System.out.print("����Ͻðڽ��ϱ�(Y/N)? : ");
				yn = (char)System.in.read();

				if (yn == 'n' || yn == 'N')
					break;

				System.out.println();

				System.in.skip(2);
			}
			else
				System.out.println();
		}
		while (yn == 'y' || yn == 'Y');
		

		// ������ Ǯ�� ----------------------------------------------------------------------------
		
		/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n, s, i;
		// -- n : ����� �Է°� ����
		// -- s : ������ ���� ����
		// -- i : ���� ����

		char ch;
		// -- ���μ����� ��� �������� ������ ���θ� ��Ƶ� ����
		
		while (true)
		{
			// ���� �ݺ�(���� ����)
			do
			{
				System.out.print("\n������ ���� �Է� : ");
				n = Integer.parseInt(br.readLine());
			}
			while (n<1 || n>100);

			// ������ �ʱ�ȭ
			s = 0;
			
			for (i=1; i<=n; i++)
				s += i
			
			System.out.printf(">> 1 ~ %d������ �� : %d\n", n, s);

			System.out.print("����Ͻðڽ��ϱ�(Y/N)? : ");
			ch = (char)System.in.read();
			// -- ������� ������ ���� ����(�ǻ�ǥ��)

			// N �� ��������
			if (ch!='Y' || ch!='y')						// Y�� y�� �ƴϴ� (&&)
				break;
				// -- ����� + "�׸��� ����������"
			
			// ���Ͱ�(\r\n) ó��
			System.in.skip(2);
		}
		*/
			

	}
}
