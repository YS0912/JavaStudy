import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.Vector;

// Vector ������ ������ Ŭ����
class MovieData
{
	public String title;
	public int grade;
	public int playTime;

	public String getTitle()
	{
		return title;
	}
	public void setTitle(String title)
	{
		this.title = title;
	}

	public int getGrade()
	{
		return grade;
	}
	public void setGrade(int grade)
	{
		this.grade = grade;
	}

	public int getPlayTime()
	{
		return playTime;
	}
	public void setPlayTime(int playTime)
	{
		this.playTime = playTime;
	}

	// ������(�Ű����� 3��)
	public MovieData(String title, int grade, int playTime)
	{
		this.title = title;
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


// �󿵰� ���� �޴� �޴���
class SConMenu
{
	public static final int UP_SCREEN = 1;	// �� ��ȭ ���
	public static final int UP_ROUND = 2;	// �󿵰� ȸ�� ����
	public static final int S_DISP  = 3;	// �󿵰� �̿� ����
}

public class me
{
	// �ֿ� �Ӽ� ����
	public static String tempTitle;
	public static int tempIndex = 0;

	private static Integer sel;
	private static BufferedReader br;

	private static Vector<MovieData> vt;
	//private static Vector<MovieData> screen;		// �� ������ ���� ��ȭ ������ ���� �迭
	static MovieData[] screen = new MovieData[3];	
	static int[] sTime = new int[3];				// �� ���� ��ũ�� Ÿ��

	int[] openTime = {9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23};

	// static �ʱ�ȭ ��
	static
	{
		// Vector �ڷ� ���� ����
		vt = new Vector<MovieData>();
		//screen = new Vector<MovieData>();

		// BufferedReader �ν��Ͻ� ����
		br = new BufferedReader(new InputStreamReader(System.in));

		// ����� �Է°� �ʱ�ȭ
		sel = 1;
	}

// ------------------------------------------------------------------------------------------------

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

		AmenuRun();
	}

	// ������ �޴� ���ÿ� ���� ��� ȣ�� �޼ҵ�
	public static void AmenuRun() throws IOException
	{
		switch (sel)
		{
			//case AdminMenu.M_MANAGE : movieManage(); break;
			case AdminMenu.S_MANAGE : screenManage(); break;
			default : System.out.println(">> �߸��� �޴� �����Դϴ�."); break;
		}

		System.out.println();
	}

// ------------------------------------------------------------------------------------------------

	// 2. �󿵰� ���� �޴� ���
	public static void screenManage() throws IOException
	{
		System.out.println("\n[�󿵰� ����]==================");
		System.out.println("1. ���� ��ȭ ���");
		System.out.println("2. ȸ�� ����");
		System.out.println("3. �� ���� ��ȭ ����");
		System.out.println();
		System.out.println("99. ������ �޴��� ���ư���");
		System.out.println("=================================");
		
		do
		{
			System.out.print("\n�޴� ���� : ");
			sel = Integer.parseInt(br.readLine());
		}
		while (sel<1 || sel>3 && sel!=99);
		
		System.out.println();

		switch (sel)
		{
			case 99 : AmenuDisp(); break;
		}

		screenManageRun();
	}

// ------------------------------------------------------------------------------------------------

	// 2. �󿵰� ���� �޴� ��¿��� ������ ��� ȣ��
	public static void screenManageRun() throws IOException
	{
		switch (sel)
		{
			case SConMenu.UP_SCREEN : updateScreen_M(); break;
			case SConMenu.UP_ROUND  : updateRound_S(); break;
			case SConMenu.S_DISP   : dispScreen(); break;
			default : System.out.println(">> �߸��� �޴� �����Դϴ�."); break;
		}

		System.out.println();
	}

// ------------------------------------------------------------------------------------------------
	// ���� ��ȭ ��� �޼ҵ�
	
	// ���� ��ȭ ����ȭ��
	public static void updateScreen_M() throws IOException
	{
		int i = 0;
		System.out.println("\n[���� ��ȭ ���] ============");

		for (Object temp : vt)
		{
			System.out.printf( "%d. %s\n", (i+1), ( (MovieData)temp ).getTitle() );

			i++;
		}

		System.out.println("0. ���� �޴��� ���ư���");
		System.out.println("99. ������ �޴��� ���ư���");
		System.out.println("===============================");

		System.out.print("��ȭ ����(���� �Է�) : ");
		tempTitle = br.readLine();

		switch (sel)
		{
			case 0  : screenManage(); break;
			case 99 : AmenuDisp(); break;
		}

		updateScreen_S();
	}
// ------------------------------------------------------------------------------------------------

	// ������ ��ȭ �󿵰� ����
	public static void updateScreen_S() throws IOException
	{
		System.out.println("\n[���� ��ȭ ���] ==============================");
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
		System.out.println("99. ������ �޴��� ���ư���");
		System.out.println("==============================================");

		System.out.println();

		System.out.println("�̹� ��� ���� �󿵰��� ������ �� �� ��ȭ�� ����˴ϴ�.");
		System.out.print("�󿵰� ���� : ");
		sel = Integer.parseInt(br.readLine());

		switch (sel)
		{
			case 0  : updateScreen_M(); break;
			case 99 : AmenuDisp(); break;
		}
		
		// ������ ��ȭ�� ����ִ� vt�� �ε����� ���ϱ�
		for (int n=0; n<vt.size(); n++)
			{
				boolean flag = ( vt.get(n).getTitle() ).equals(tempTitle);

				if (flag)
					tempIndex = n;
			}

		if (sTime[sel-1] >= vt.get(tempIndex).getPlayTime())
		{
			// �Է¹��� �󿵰��� �ش��ϴ� �迭�� ���� �ڷᱸ���� ����� ������ ����
			screen[sel-1].title = vt.get(tempIndex).getTitle();
			screen[sel-1].grade = vt.get(tempIndex).getGrade();
			screen[sel-1].playTime = vt.get(tempIndex).getPlayTime();
			//MovieData md(sel) = new MovieData();
			//md(sel).setName( vt.get(tempIndex).getTitle() );
			//md(sel).setGrade( vt.get(tempIndex).getGrade() );
			//md(sel).setPlayTime( vt.get(tempIndex).getPlayTime() );
			
			updateScreen_C();

		}
		else
		{
			System.out.println("\n[���� ��ȭ ���] =======================");
			
			System.out.println();

			System.out.println("�ش� �󿵰����� ���� �Ұ����� ��ȭ�Դϴ�.");
			
			System.out.println();

			System.out.println("0. ���� �޴��� ���ư���");
			System.out.println("99. ������ �޴��� ���ư���");
			System.out.println("==========================================");

			sel = Integer.parseInt(br.readLine());
		}

		switch (sel)
		{
			case 0  : updateScreen_M(); break;
			case 99 : AmenuDisp(); break;
		}
	}

// ------------------------------------------------------------------------------------------------
	
	// ��� �Ϸ� �޼ҵ�
	public static void updateScreen_C() throws IOException
	{
		System.out.println("\n[���� ��ȭ ���] =====================");

			System.out.println();

			System.out.printf("%d������ %s��(��) %dȸ������ �󿵵˴ϴ�.", sel, vt.get(sel-1).getTitle(), 15/sTime[sel-1]);

			System.out.println();
			
			System.out.println("99. ������ �޴��� ���ư���");
			System.out.println("========================================");

			sel = Integer.parseInt(br.readLine());
	}

// ------------------------------------------------------------------------------------------------
	// ȸ�� ���� �޼ҵ�

	// ȸ�� ������ �󿵰� ���� �޴�
	public static void updateRound_S() throws IOException
	{
		System.out.println("\n[ȸ�� ����] ==============");
		
		System.out.println();

		System.out.println("1��");
		System.out.println("2��");
		System.out.println("3��");
		
		System.out.println();

		System.out.println("0. ���� �޴��� ���ư���");
		System.out.println("99. ������ �޴��� ���ư���");
		System.out.println("==========================");

		System.out.println();

		System.out.print("�󿵰� ���� : ");
		sel = Integer.parseInt(br.readLine());

		switch (sel)
		{
			case 0  : screenManage(); break;
			case 99 : AmenuDisp(); break;
		}

		updateRound_T();
	}

	// ������ �󿵰��� ��ũ�� Ÿ�� ���� �޴�
	public static void updateRound_T() throws IOException
	{
		System.out.println("\n[ȸ�� ����] ==============");

		System.out.println();

		System.out.printf("������ �󿵰��� %d���Դϴ�.\n", sel);
		System.out.print("ȸ�� �� �Ҵ��� �ð��� �������ּ���.\n");

		System.out.println();

		System.out.println("0. ���� �޴��� ���ư���");
		System.out.println("99. ������ �޴��� ���ư���");
		System.out.println("==========================");

		System.out.println();
		
		System.out.print("ȸ�� �� �ð� : ");
		sTime[sel-1] = Integer.parseInt(br.readLine());


		// �Է� �Ϸ� ȭ�� ���
		System.out.println("\n[ȸ�� ����] ==============");

		System.out.println();

		System.out.println("ȸ�� ����� �Ϸ�Ǿ����ϴ�.");

		System.out.println();
		
		System.out.println("0. ���� �޴��� ���ư���");
		System.out.println("99. ������ �޴��� ���ư���");
		System.out.println("==========================");
		
		sel = Integer.parseInt(br.readLine());

		switch (sel)
		{
			case 0  : updateRound_S(); break;
			case 99 : AmenuDisp(); break;
		}
	}
	
// ------------------------------------------------------------------------------------------------
// �� ���� ��ȭ ��� ���

	public static void dispScreen() throws IOException
	{
		//int i = 0;

		System.out.println("\n[�� ���� ��ȭ ����] =========");

		//for (Object temp : vt)
		//{
		//	System.out.println("\n" + (i+1) + "��");
		//	System.out.println( ( (MovieData)temp ).getTitle() );
		//	System.out.println();

		//	i++;
		//}

		for (int i=0; i<screen.length; i++)
		{
			System.out.printf("\n%d��", i+1);
			System.out.println(screen[i].title);
			System.out.println();
		}

		System.out.println("99 ������ �޴��� ���ư���");
		System.out.println("===============================");

		sel = Integer.parseInt(br.readLine());

		switch (sel)
		{
			case 99 : AmenuDisp(); break;
		}
	}

	public static void main(String[] args) throws IOException
	{
		vt.add(new MovieData("���˵���2", 19, 80));
		vt.add(new MovieData("ž��2", 15, 70));
		vt.add(new MovieData("�̴Ͼ���2", 0, 60));

		AmenuDisp();
	}
}
