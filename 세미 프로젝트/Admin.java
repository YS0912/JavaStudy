import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class AdminMenu
{
	public static final int M_MANAGE  = 1;	// �󿵿�ȭ����
	public static final int S_MANAGE  = 2;	// �󿵰� ����
	public static final int B_ADMIN  = 0;	// ������ �޴��� ���ư���
}

class MConMenu
{
	public static final int M_ADD  = 1;	// ��ȭ ���
	public static final int M_DEL  = 2;	// ��ȭ ����
	public static final int M_DISP = 3;	// ��� ��ȭ Ȯ��
}

class SConMenu
{
	public static final int UP_SCREEN = 1;	// �� ��ȭ ���
	public static final int UP_ROUND = 2;	// �󿵰� ȸ�� ����
	public static final int S_DISP  = 3;	// �󿵰� �̿� ����
}

class ReservMenu
{
	public static final int R_MPICK = 1;	// ��ȭ �������� ����
	public static final int R_TPICK  = 2;	// �ð� �������� ����
	public static final int B_MENU  = 0;	// �������� ���ư���
}

public class Admin
{
	// �ֿ� �Ӽ� ����
	// private static final Vector<Object> vt;
	private static Integer sel;
	private static BufferedReader br;
	private static char answer;

	// static �ʱ�ȭ ��
	static
	{
		// BufferedReader �ν��Ͻ� ����
		br = new BufferedReader(new InputStreamReader(System.in));

		// ����� �Է°� �ʱ�ȭ
		sel = 1;

	}

	
	// ������ �޴� ��� �޼ҵ�
	public static void AmenuDisp() throws IOException
	{
		System.out.println("\n[������ ���]==================");
		System.out.println("1. �� ��ȭ ����");
		System.out.println("2. �󿵰� ����");
		System.out.println();
		System.out.println("0. ���� �޴��� ���ư���");
		System.out.println("===============================");
	
		do
		{
			System.out.print("\n�޴� ���� : ");
			sel = Integer.parseInt(br.readLine());
		}
		while (sel<1 || sel>2);
		
		System.out.println();
	}

	/* 
	// ������ �޴� ���� �޼ҵ�
	public static void AmenuSelect() throws IOException
	{
		�ݺ��ؼ� ����� �� �ִ� ����� ã�� �������� �ּ�
	}
	*/

	// ������ �޴� ���ÿ� ���� ��� ȣ�� �޼ҵ�
	public static void AmenuRun() throws IOException
	{
		switch (sel)
		{
			case AdminMenu.M_MANAGE : movieManage(); break;
			case AdminMenu.S_MANAGE : screenManage(); break;
			case ReservMenu.B_MENU  : bMenu(); break;
			default : System.out.println(">> �߸��� �޴� �����Դϴ�."); break;
		}

		System.out.println();
	}
	
	// 1. �� ��ȭ ���� �޴� ���
	public static void  movieManage() throws IOException
	{
		System.out.println("\n[�� ��ȭ ����]==================");
		System.out.println("1. ��ȭ ���� ���");
		System.out.println("2. ��ϵ� ��ȭ ����");
		System.out.println("3. ��ȭ ��� Ȯ��");
		System.out.println();
		System.out.println("0. ���� �޴��� ���ư���");
		System.out.println("==================================");
		
		do
		{
			System.out.print("\n�޴� ���� : ");
			sel = Integer.parseInt(br.readLine());
		}
		while (sel<1 || sel>3);
		
		System.out.println();	
	}

	// 1. �� ��ȭ ���� �޴� ���ÿ� ���� ��� ȣ�� �޼ҵ�
	public static void movieManageRun() throws IOException
	{
		switch (sel)
		{
			case MConMenu.M_ADD    : addMovie(); break;
			case MConMenu.M_DEL    : delMovie(); break;
			case MConMenu.M_DISP   : dispMovie(); break;
			case ReservMenu.B_MENU : bMenu(); break;
			default : System.out.println(">> �߸��� �޴� �����Դϴ�."); break;
		}

		System.out.println();
	}

	// 2. �󿵰� ���� �޴� ���
	public static void  screenManage() throws IOException
	{
		System.out.println("\n[�󿵰� ����]==================");
		System.out.println("1. ���� ��ȭ ���");
		System.out.println("2. ȸ�� ����");
		System.out.println("3. �� ���� ��ȭ ����");
		System.out.println();
		System.out.println("0. ���� �޴��� ���ư���");
		System.out.println("=================================");
		
		do
		{
			System.out.print("\n�޴� ���� : ");
			sel = Integer.parseInt(br.readLine());
		}
		while (sel<1 || sel>3);
		
		System.out.println();	
	}

	// 2. �󿵰� ���� �޴� ��¿��� ������ ��� ȣ��
	public static void screenManageRun() throws IOException
	{
		switch (sel)
		{
			case SConMenu.UP_SCREEN : updateScreen(); break;
			case SConMenu.UP_ROUND  : updateRound(); break;
			case SConMenu. S_DISP   : dispScreen(); break;
			case ReservMenu.B_MENU  : bMenu(); break;
			default : System.out.println(">> �߸��� �޴� �����Դϴ�."); break;
		}

		System.out.println();
	}

	// ====================================================================== �޴���
	
	// �󿵰����� ���� ��ȭ ���
	public void updateScreen()
	{
		do
		{
			System.out.println("[���� ��ȭ ���] =========");
			// ���� ��ϵ� ��ȭ ����Ʈ ��ü ���
			for (int i=0; i<vt.size; i++)
				System.out.println( (i+1) + ". " + vt.get(i));
			System.out.println();

			System.out.println("0. ���� �޴��� ���ư���");
			System.out.println("=======================");

			System.out.pirntln();

			System.out.print("��ȭ ���� : ");
			br = Integer.parseInt(br.readLine());
		}
		while (br<0 || br>vt.length);

		if (br = 0)
			bMenu();
	}


	public static void main(String[] args) throws IOException
	{
		AmenuDisp();
		AmenuRun();

		movieManage();
		movieManageRun();

	}
}

