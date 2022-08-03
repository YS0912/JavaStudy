/*===================================================================
							�÷���(Collection)
===================================================================*/

// Test163 Ŭ������ �ϼ��Ͽ� ���� ����� ���� ���α׷��� �����Ѵ�.

/*
���� ��)

	[ �޴� ���� ]====
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ���� 
	6. ����
	==================
>> �޴� ���� (1~6) : 1

1��° ��� �Է� : ������
1��° ��� �Է� ����!
��� �Է� ���(Y/N)? : y

2��° ��� �Է� : ���ҿ�
2��° ��� �Է� ����!
��� �Է� ���(Y/N)? : N

	[ �޴� ���� ]====
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	==================
>> �޴� ���� (1~6) : 2

[���� ��ü ���]
������
���ҿ�
���� ��ü ��� �Ϸ�!

	[ �޴� ���� ]====
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	==================
>> �޴� ���� (1~6) : 3

>> �˻��� ��� �Է� : ������

[�˻� ��� ���]
�׸��� �����մϴ�.

	[ �޴� ���� ]====
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	==================
>> �޴� ���� (1~6) : 3

>> �˻��� ��� �Է� : �ݺ���

[�˻� ��� ���]
�׸��� �������� �ʽ��ϴ�.

	[ �޴� ���� ]====
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	==================
>> �޴� ���� (1~6) : 4

>> ������ ��� �Է� : �躸��

[���� ��� ���]
�׸��� �������� �ʾ� ������ �� �����ϴ�.

	[ �޴� ���� ]====
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	==================
>> �޴� ���� (1~6) : 4

>> ������ ��� �Է� : ������

[���� ��� ���]
������ �׸��� �����Ǿ����ϴ�.

	[ �޴� ���� ]====
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	==================
>> �޴� ���� (1~6) : 5

>> ������ ��� �Է� : ������

[���� ��� ���]
������ ����� �������� �ʽ��ϴ�.

	[ �޴� ���� ]====
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	==================
>> �޴� ���� (1~6) : 5

>> ������ ��� �Է� : ���ҿ�
>> ������ ���� �Է� : ������

[���� ��� ���]
������ �Ϸ�Ǿ����ϴ�.

	[ �޴� ���� ]====
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	==================
>> �޴� ���� (1~6) : 2

[���� ��ü ���]
������
���� ��ü ��� �Ϸ�!

	[ �޴� ���� ]====
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	==================
>> �޴� ���� (1~6) : 6

���α׷� ����
����Ϸ��� �ƹ� Ű�� ��������...
*/

import java.util.Vector;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Menus		// �� �ϼ�
{
	public static final int E_ADD = 1;		// ��� �߰�
	public static final int E_DISP = 2;		// ��� ���
	public static final int E_FIND = 3;		// ��� �˻�
	public static final int E_DEL = 4;		// ��� ����
	public static final int E_CHA = 5;		// ��� ����
	public static final int E_EXIT = 6;		// ����
}

public class Test163
{
	// �ֿ� �Ӽ� ���� �� �ϼ�
	private static final Vector<Object> vt;		// �ڷᱸ��
	private static BufferedReader br;			// �Է� �� Ȱ��
	private static Integer sel;					// ���� ��
	private static String con;					// ��� ���� ����

	// static �ʱ�ȭ ��
	static
	{
		// Vector �ڷ� ���� ����
		vt = new Vector<Object>();

		// BufferedReader Ŭ���� �ν��Ͻ� ����
		br = new BufferedReader(new InputStreamReader(System.in));

		// ����� �Է°� �ʱ�ȭ
		sel = 1;
		con = "Y";
	}

	// �޴� ��� �޼ҵ�
	public static void menuDisp()
	{
		System.out.println("\n\t[�޴� ����]====");
		System.out.println("\t1. ��� �߰�");
		System.out.println("\t2. ��� ���");
		System.out.println("\t3. ��� �˻�");
		System.out.println("\t4. ��� ����");
		System.out.println("\t5. ��� ����");
		System.out.println("\t6. ����");
		System.out.println("\t==================");
	}

	// �޴� ���� �޼ҵ�
	public static void menuSelect() throws IOException, NumberFormatException
	{
		do
		{
			System.out.print(">> �޴� ����(1~6) : ");
			sel = Integer.parseInt(br.readLine());
		}
		while (sel<1 || sel>6);
	}


	// ���õ� �޴� ���࿡ ���� ��� ȣ�� �޼ҵ�
	public static void menuRun() throws IOException
	{
		switch (sel)
		{
			case Menus.E_ADD : addElement(); break;
			case Menus.E_DISP : dispElement(); break;
			case Menus.E_FIND : findElement(); break;
			case Menus.E_DEL : delElement(); break;
			case Menus.E_CHA : chaElement(); break;
			case Menus.E_EXIT : exit(); break;
			default : System.out.println("�߸��� �޴� �����Դϴ�."); break;
		}
	}


	// �ڷ� ������ ��� �߰�(�Է�) �޼ҵ�
	public static void addElement() throws IOException
	{
		do
		{
			System.out.printf("\n%d��° ��� �Է� : ", vt.size()+1);
			// ���� vt.add()
			vt.add( br.readLine() );
			System.out.printf("%d��° ��� �Է� ����!%n", vt.size());

			System.out.print("��� �Է� ���(Y/N)? : ");
			con = br.readLine();
		}
		while (con.equals("Y") || con.equals("y"));
		// while (con!="N" || con!="n") �� String �̶� �� �����ڷ� ���� �� ����
		
	}

	// �ڷ� ���� ��ü ��� ��� �޼ҵ�
	public static void dispElement()
	{
		System.out.println("\n[���� ��ü ���]");
		for (Object str : vt)
			System.out.println(str.toString());
		System.out.println("���� ��ü ��� �Ϸ�!");
	}


	// �ڷᱸ�� �� ��� �˻� �޼ҵ�
	public static void findElement() throws IOException
	{
		// ���� vt.contains(�Է¹��� ��)�� true���
		// �׸��� �����մϴ�. ���

		System.out.print("\n>> �˻��� ��� �Է� : ");
		String temp = br.readLine();
		
		if (vt.contains(temp))
		{
			System.out.println("\n[�˻� ��� ���]");
			System.out.println("�׸��� �����մϴ�.");
		}
		else
		{
			System.out.println("\n[�˻� ��� ���]");
			System.out.println("�׸��� �������� �ʽ��ϴ�.");
		}

		/* �α��� �ڵ�

			String name = "";

			System.out.print("\n>> �˻��� ��� �Է� : ");
			String name = br.readLine();
			
			int flag = vt.indexOf(name);

			System.out.println("\n[�˻� ��� ���]")
			
			if (flag <0)
				System.out.println("\n[�˻� ��� ���]");
				System.out.println("�׸��� �������� �ʽ��ϴ�.");
			else
				System.out.println("\n[�˻� ��� ���]");
				System.out.println("�׸��� �������� �ʽ��ϴ�.");

		*/
	}


	// �ڷᱸ�� �� ��� ���� �޼ҵ�
	public static void delElement() throws IOException
	{
		// ���� v.contains(�Է� ���� ��) �ؼ� �ִٸ�
		// vt.indexOf(�Է¹��� ��)�� �ε��� i�� ã�� �Ŀ�
		// vt.remove(i)

		System.out.print("\n>> ������ ��� �Է� : ");
		String temp = br.readLine();

		if (vt.contains(temp))
		{
			int i = vt.indexOf(temp);
			vt.remove(i);

			System.out.println("\n[���� ��� ���]");
			System.out.printf("%s �׸��� �����Ǿ����ϴ�.\n", temp);
		}
		else
		{
			System.out.println("\n[���� ��� ���]");
			System.out.println("�׸��� �������� �ʾ� ������ �� �����ϴ�.\n");
		}
		
	}


	// �ڷᱸ�� �� ��� ����(����) �޼ҵ�
	public static void chaElement() throws IOException
	{
		// ���� v.contains(�Է� ���� ��) �ؼ� �ִٸ�
		// vt.indexOf(�Է¹��� ��)�� �ε��� i�� ã�� �Ŀ�
		// vt.set(i)
		
		System.out.print("\n>> ������ ��� �Է� : ");
		String temp = br.readLine();
		
		if (vt.contains(temp))
		{
			System.out.print(">> ������ ���� �Է� : ");

			int i = vt.indexOf(temp);
			vt.set(i, br.readLine());

			System.out.println("\n[���� ��� ���]");
			System.out.println("������ �Ϸ�Ǿ����ϴ�.");
		}
		else
		{
			System.out.println("\n[���� ��� ���]");
			System.out.println("������ ����� �������� �ʽ��ϴ�.");
		}

	}

	// ���α׷� ���� �޼ҵ� �� �ϼ�
	public static void exit()
	{
		System.out.println("\n���α׷� ����");
		System.exit(-1);
		// � ���ڸ� �־ ��� ����! ��������� PDA �� ���� �ƹ��� ���� ���� ����Ǿ��ٴ� �� -1�� ǥ������ ��!
	}

	// main() �޼ҵ� �� �ϼ�
	public static void main(String[] args) throws IOException, NumberFormatException
	{
		do
		{
			menuDisp();
			menuSelect();
			menuRun();
		}
		while (true);
	}
}