import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.Vector;

// Vector ������ ������ Ŭ����
class MovieData
{
	private String title;
	private int grade;
	private int playTime;

	public String getTitle()
	{
		retrun title;
	}
	public void setTitle(String title)
	{
		this.title = title;
	}

	public int getGrade()
	{
		return grade;
	}
	public void setGrade()
	{
		this.grade = grade;
	}

	public int getPlayTime()
	{
		return playTime;
	}
	public void setPlayTime()
	{
		this.playTime = playTime;
	}

	// ������(�Ű����� 3��)
	public MovieData(String title, int grade, int playTime)
	{
		this.tilte = title;
		this.grade = grade;
		this.playTime = playTime;
	}

	// ������(�Ű�����X)
	public MovieData()
	{
		title = "";
		grade = 0;
		playTime = 0;
	}
}

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

	private static Vector<MovieData> vt;
	MovieData[3] screen = new MovieData();	// �� ������ ���� ��ȭ ������ ���� �迭
	int[3] sTime = new int();				// �� ���� ��ũ�� Ÿ��

	// static �ʱ�ȭ ��
	static
	{
		// Vector �ڷ� ���� ����
		vt = new Vector<MovieData>();
		screen = new Vector<MovieData>();

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
				System.out.println( (i+1) + ". " + vt.get(i).getTitle());
			System.out.println();

			System.out.println("0. ���� �޴��� ���ư���");
			System.out.println("=======================");

			System.out.pirntln();

			System.out.print("��ȭ ���� : ");
			sel = Integer.parseInt(br.readLine());
		}
		while (br<0 || br>vt.length);

		if (sel = 0)
			bMenu();
	}

	// ���⼭���� ���� �� �� =======================================================

	public void updateScreen()
	{
		// ���� ��ȭ ���� ȭ��
		int i = 0;
		System.out.println("[���� ��ȭ ���] ============");

		for (Object temp : vt)
		{
			System.out.printf( "%d. %s\n", (i+1), ( (MovieData)temp ).getTilte() );

			i++;
		}

		System.out.println("0. ���� �޴��� ���ư���");
		System.out.println("===============================");

		System.out.print("��ȭ ����(���� �Է�) : ");
		String tempTitle = br.readLine();

		if (sel = 0)
			bMenu();

		// ������ ��ȭ �󿵰� ����
		System.out.println("[���� ��ȭ ���] ==============================");
		System.out.println();
		
		System.out.printf("������ ��ȭ�� %s�Դϴ�.\n", tempTitle);
		
		System.out.println();

		System.out.println("���� �󿵰� �̿볻���� ������ �����ϴ�.");

		System.out.println();

		System.out.println("1��");
		System.out.println(sTime[0]);

		System.out.println();

		System.out.println("2��");
		System.out.println(sTime[1]);

		System.out.println();

		System.out.println("2��");
		System.out.println(sTime[2]);

		System.out.println();

		System.out.println("0. ���� �޴��� ���ư���");
		System.out.println("==============================================");

		System.out.println();

		System.out.println("�̹� ��� ���� �󿵰��� ������ �� �� ��ȭ�� ����˴ϴ�.");
		System.out.print("�󿵰� ���� : ");
		sel = Integer.parseInt(br.readLine());

		if (sTime[se1-1] >= vt.get(sel-1).getPlayTime())
		{
			// �Է¹��� �󿵰��� �ش��ϴ� �迭�� ���� �ڷᱸ���� ����� ������ ����
			screen[sel-1].title = vt.get(sel-1).getTitle();
			screen[sel-1].grade = vt.get(sel-1).getGrade();
			screen[sel-1].playTime = vt.get(sel-1).getPlayTime();
			
			// ���� ��ȭ ��� �Ϸ� �޽��� ��� ȭ��
			System.out.println("[���� ��ȭ ���] =====================");

			System.out.println();

			System.out.println("%d������ %s��(��) %dȸ������ �󿵵˴ϴ�.", sel, vt.get(sel-1).getTitle(), 15/sTime[sel-1]);

			System.out.println();
			
			System.out.println("0. ���� �޴��� ���ư���");
			System.out.println("========================================");
		}
		else
		{
			System.out.println("[���� ��ȭ ���] =======================");
			
			System.out.println();

			System.out.println("�ش� �󿵰����� ���� �Ұ����� ��ȭ�Դϴ�.");
			
			System.out.println();

			System.out.println("0. ���� �޴��� ���ư���");
			System.out.println("==========================================");
		}

	}
	
	// ȸ�� ���� �޼ҵ�
	public void updateRound()
	{
		// ȸ�� ������ �󿵰� ���� �޴�
		System.out.println("[ȸ�� ����] ==============");
		
		System.out.println();

		System.out.println("1��");
		System.out.println("2��");
		System.out.println("3��");
		
		System.out.println();

		System.out.println("0. ���� �޴��� ���ư���");
		System.out.println("==========================");

		System.out.println();

		System.out.print("�󿵰� ���� : ");
		sel = Integer.parseInt(br.readLine());
		
		System.out.println();

		// ������ �󿵰��� ��ũ�� Ÿ�� ���� �޴�
		System.out.println("[ȸ�� ����] ==============");

		System.out.println();

		System.out.printf("������ �󿵰��� %d���Դϴ�.", sel);

		System.out.println();

		System.out.println("0. ���� �޴��� ���ư���");
		System.out.println("==========================");

		System.out.println();
		
		System.out.print("ȸ�� �� ��ũ�� Ÿ�� : ");
		sTime[sel] = Integer.parseInt(br.readLine());


		// �Է� �Ϸ� ȭ�� ���
		System.out.println("[ȸ�� ����] ==============");

		System.out.println();

		System.out.println("ȸ�� ����� �Ϸ�Ǿ����ϴ�.");

		System.out.println();

		System.out.println("0. ������ �޴��� ���ư���");
		System.out.println("==========================");
	}

	public void dispScreen()
	{
		int i = 0;

		System.out.println("[�� ���� ��ȭ ����] =========");

		for (Object obj : vt)
		{
			System.out.println( (i+1) + "��");
			System.out.println( ( (MovieData)temp ).getTilte() );

			i++;
		}

		System.out.println("0. ������ �޴��� ���ư���");
		System.out.println("===============================");

		sel = Integer.parseInt(br.readLine());

		if (sel = 0)
			bAdmin();
	}

	public static void main(String[] args) throws IOException
	{
		AmenuDisp();
		AmenuRun();

		movieManage();
		movieManageRun();

	}
}

