/*===================================================================
							Ŭ������ �ν��Ͻ�
	- Ŭ������ �ν��Ͻ� Ȱ��
===================================================================*/

// 1~3 ������ ������ �߻����Ѽ� ���� ���� �� ���� ���α׷��� ����
// ��, Ŭ������ ������ Ȱ���Ͽ� ó���� �� �ֵ��� �Ѵ�.
// ���� �迭�� Ȱ���Ͽ� ó���� �� �ֵ��� �Ѵ�.
// ���������� RpsGame Ŭ������ �ϼ��� �� �ֵ��� �Ѵ�.

// ���� ������ �� 1: ����, 2: ����, 3: ��

// ���� ��)
// 1: ����, 2: ����, 3: �� �� �Է�(1~3) : 4
// 1: ����, 2: ����, 3: �� �� �Է�(1~3) : -2
// 1: ����, 2: ����, 3: �� �� �Է�(1~3) : 2

// - ����   : ����
// - ��ǻ�� : ��

// >> �º� ���� ��� : ��ǻ�Ͱ� �̰���ϴ�!
// ����Ϸ��� �ƹ� Ű�� ��������...

import java.util.Scanner;
import java.util.Random;

class RpsGame
{
	// ���� ����
	private int user, com;
	String[] arr = {"����", "����", "��"};

	Random rd = new Random();
	
	// �ֿ� ���
	// ����� �Է°�
	public void input()
	{
		com = rd.nextInt(3) +1;

		do
		{
			Scanner sc = new Scanner(System.in);

			System.out.print("1: ����, 2: ����, 3: �� �� �Է�(1~3) : ");
			user = sc.nextInt();
		}
		while (user>3 || user<1);
	}

	// �������� �� ��
	public String choose()
	{
		String choose = "���º� ��Ȳ�Դϴ�!";

		// (����=="����" && ��=="��") || (����=="����" && ��=="����") || (����=="��" && ��=="����")
		if ((user==1 && com==3) || (user==2 && com==1) || (user==3 && com==2))
			choose = "����� �¸��Դϴ�!";
		// (����=="����" && ��=="����") || (����=="����" && ��=="��") || (����=="��" && ��=="����")
		else if ((user==1 && com==2) || (user==2 && com==3) || (user==3 && com==1))
			choose = "��ǻ���� �¸��Դϴ�!";

		return choose;
	}

	// ��� ���
	public void print(String str)
	{	
		System.out.printf("- ����   : %s%n", arr[user-1]);
		System.out.printf("- ��ǻ�� : %s%n", arr[com-1]);

		System.out.println();

		System.out.printf(">> �º� ���� ��� : %s%n", str);

	}
}

public class Test102
{
	public static void main(String[] args)
	{
		RpsGame rg = new RpsGame();

		rg.input();
		String result = rg.choose();
		rg.print(result);
	}
}