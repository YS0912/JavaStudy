import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.Vector;

// Vector 생성용 데이터 클래스
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

	// 생성자(매개변수 3개)
	public MovieData(String title, int grade, int playTime)
	{
		this.tilte = title;
		this.grade = grade;
		this.playTime = playTime;
	}

	// 생성자(매개변수X)
	public MovieData()
	{
		title = "";
		grade = 0;
		playTime = 0;
	}
}

class AdminMenu
{
	public static final int M_MANAGE  = 1;	// 상영영화관리
	public static final int S_MANAGE  = 2;	// 상영관 관리
	public static final int B_ADMIN  = 0;	// 관리자 메뉴로 돌아가기
}

class MConMenu
{
	public static final int M_ADD  = 1;	// 영화 등록
	public static final int M_DEL  = 2;	// 영화 삭제
	public static final int M_DISP = 3;	// 등록 영화 확인
}

class SConMenu
{
	public static final int UP_SCREEN = 1;	// 상영 영화 등록
	public static final int UP_ROUND = 2;	// 상영관 회차 관리
	public static final int S_DISP  = 3;	// 상영관 이용 내역
}

class ReservMenu
{
	public static final int R_MPICK = 1;	// 영화 기준으로 예매
	public static final int R_TPICK  = 2;	// 시간 기준으로 예매
	public static final int B_MENU  = 0;	// 이전으로 돌아가기
}

public class Admin
{
	// 주요 속성 구성
	// private static final Vector<Object> vt;
	private static Integer sel;
	private static BufferedReader br;
	private static char answer;

	private static Vector<MovieData> vt;
	MovieData[3] screen = new MovieData();	// 각 관에서 상영할 영화 정보를 담을 배열
	int[3] sTime = new int();				// 각 관의 스크린 타임

	// static 초기화 블럭
	static
	{
		// Vector 자료 구조 생성
		vt = new Vector<MovieData>();
		screen = new Vector<MovieData>();

		// BufferedReader 인스턴스 생성
		br = new BufferedReader(new InputStreamReader(System.in));

		// 사용자 입력값 초기화
		sel = 1;

	}

	
	// 관리자 메뉴 출력 메소드
	public static void AmenuDisp() throws IOException
	{
		System.out.println("\n[관리자 모드]==================");
		System.out.println("1. 상영 영화 관리");
		System.out.println("2. 상영관 관리");
		System.out.println();
		System.out.println("0. 이전 메뉴로 돌아가기");
		System.out.println("===============================");
	
		do
		{
			System.out.print("\n메뉴 선택 : ");
			sel = Integer.parseInt(br.readLine());
		}
		while (sel<1 || sel>2);
		
		System.out.println();
	}

	/* 
	// 관리자 메뉴 선택 메소드
	public static void AmenuSelect() throws IOException
	{
		반복해서 사용할 수 있는 방법을 찾을 때까지는 주석
	}
	*/

	// 관리자 메뉴 선택에 따라 기능 호출 메소드
	public static void AmenuRun() throws IOException
	{
		switch (sel)
		{
			case AdminMenu.M_MANAGE : movieManage(); break;
			case AdminMenu.S_MANAGE : screenManage(); break;
			case ReservMenu.B_MENU  : bMenu(); break;
			default : System.out.println(">> 잘못된 메뉴 선택입니다."); break;
		}

		System.out.println();
	}
	
	// 1. 상영 영화 관리 메뉴 출력
	public static void  movieManage() throws IOException
	{
		System.out.println("\n[상영 영화 관리]==================");
		System.out.println("1. 영화 정보 등록");
		System.out.println("2. 등록된 영화 삭제");
		System.out.println("3. 영화 목록 확인");
		System.out.println();
		System.out.println("0. 이전 메뉴로 돌아가기");
		System.out.println("==================================");
		
		do
		{
			System.out.print("\n메뉴 선택 : ");
			sel = Integer.parseInt(br.readLine());
		}
		while (sel<1 || sel>3);
		
		System.out.println();	
	}

	// 1. 상영 영화 관리 메뉴 선택에 따라 기능 호출 메소드
	public static void movieManageRun() throws IOException
	{
		switch (sel)
		{
			case MConMenu.M_ADD    : addMovie(); break;
			case MConMenu.M_DEL    : delMovie(); break;
			case MConMenu.M_DISP   : dispMovie(); break;
			case ReservMenu.B_MENU : bMenu(); break;
			default : System.out.println(">> 잘못된 메뉴 선택입니다."); break;
		}

		System.out.println();
	}

	// 2. 상영관 관리 메뉴 출력
	public static void  screenManage() throws IOException
	{
		System.out.println("\n[상영관 관리]==================");
		System.out.println("1. 상영할 영화 등록");
		System.out.println("2. 회차 관리");
		System.out.println("3. 상영 중인 영화 내역");
		System.out.println();
		System.out.println("0. 이전 메뉴로 돌아가기");
		System.out.println("=================================");
		
		do
		{
			System.out.print("\n메뉴 선택 : ");
			sel = Integer.parseInt(br.readLine());
		}
		while (sel<1 || sel>3);
		
		System.out.println();	
	}

	// 2. 상영관 관리 메뉴 출력에서 선택한 기능 호출
	public static void screenManageRun() throws IOException
	{
		switch (sel)
		{
			case SConMenu.UP_SCREEN : updateScreen(); break;
			case SConMenu.UP_ROUND  : updateRound(); break;
			case SConMenu. S_DISP   : dispScreen(); break;
			case ReservMenu.B_MENU  : bMenu(); break;
			default : System.out.println(">> 잘못된 메뉴 선택입니다."); break;
		}

		System.out.println();
	}

	// ====================================================================== 메뉴판
	
	// 상영관에서 상영할 영화 등록
	public void updateScreen()
	{
		do
		{
			System.out.println("[상영할 영화 등록] =========");
			// 현재 등록된 영화 리스트 전체 출력
			for (int i=0; i<vt.size; i++)
				System.out.println( (i+1) + ". " + vt.get(i).getTitle());
			System.out.println();

			System.out.println("0. 이전 메뉴로 돌아가기");
			System.out.println("=======================");

			System.out.pirntln();

			System.out.print("영화 선택 : ");
			sel = Integer.parseInt(br.readLine());
		}
		while (br<0 || br>vt.length);

		if (sel = 0)
			bMenu();
	}

	// 여기서부터 내가 한 거 =======================================================

	public void updateScreen()
	{
		// 상영할 영화 선택 화면
		int i = 0;
		System.out.println("[상영할 영화 등록] ============");

		for (Object temp : vt)
		{
			System.out.printf( "%d. %s\n", (i+1), ( (MovieData)temp ).getTilte() );

			i++;
		}

		System.out.println("0. 이전 메뉴로 돌아가기");
		System.out.println("===============================");

		System.out.print("영화 선택(제목 입력) : ");
		String tempTitle = br.readLine();

		if (sel = 0)
			bMenu();

		// 선택한 영화 상영관 배정
		System.out.println("[상영할 영화 등록] ==============================");
		System.out.println();
		
		System.out.printf("선택한 영화는 %s입니다.\n", tempTitle);
		
		System.out.println();

		System.out.println("현재 상영관 이용내역은 다음과 같습니다.");

		System.out.println();

		System.out.println("1관");
		System.out.println(sTime[0]);

		System.out.println();

		System.out.println("2관");
		System.out.println(sTime[1]);

		System.out.println();

		System.out.println("2관");
		System.out.println(sTime[2]);

		System.out.println();

		System.out.println("0. 이전 메뉴로 돌아가기");
		System.out.println("==============================================");

		System.out.println();

		System.out.println("이미 사용 중인 상영관을 선택할 시 상영 영화가 변경됩니다.");
		System.out.print("상영관 선택 : ");
		sel = Integer.parseInt(br.readLine());

		if (sTime[se1-1] >= vt.get(sel-1).getPlayTime())
		{
			// 입력받은 상영관에 해당하는 배열에 벡터 자료구조에 저장된 데이터 전달
			screen[sel-1].title = vt.get(sel-1).getTitle();
			screen[sel-1].grade = vt.get(sel-1).getGrade();
			screen[sel-1].playTime = vt.get(sel-1).getPlayTime();
			
			// 상영할 영화 등록 완료 메시지 출력 화면
			System.out.println("[상영할 영화 등록] =====================");

			System.out.println();

			System.out.println("%d관에서 %s이(가) %d회차까지 상영됩니다.", sel, vt.get(sel-1).getTitle(), 15/sTime[sel-1]);

			System.out.println();
			
			System.out.println("0. 이전 메뉴로 돌아가기");
			System.out.println("========================================");
		}
		else
		{
			System.out.println("[상영할 영화 등록] =======================");
			
			System.out.println();

			System.out.println("해당 상영관에서 상영이 불가능한 영화입니다.");
			
			System.out.println();

			System.out.println("0. 이전 메뉴로 돌아가기");
			System.out.println("==========================================");
		}

	}
	
	// 회차 관리 메소드
	public void updateRound()
	{
		// 회차 관리할 상영관 선택 메뉴
		System.out.println("[회차 관리] ==============");
		
		System.out.println();

		System.out.println("1관");
		System.out.println("2관");
		System.out.println("3관");
		
		System.out.println();

		System.out.println("0. 이전 메뉴로 돌아가기");
		System.out.println("==========================");

		System.out.println();

		System.out.print("상영관 선택 : ");
		sel = Integer.parseInt(br.readLine());
		
		System.out.println();

		// 선택한 상영관의 스크린 타임 설정 메뉴
		System.out.println("[회차 관리] ==============");

		System.out.println();

		System.out.printf("선택한 상영관은 %d관입니다.", sel);

		System.out.println();

		System.out.println("0. 이전 메뉴로 돌아가기");
		System.out.println("==========================");

		System.out.println();
		
		System.out.print("회차 당 스크린 타임 : ");
		sTime[sel] = Integer.parseInt(br.readLine());


		// 입력 완료 화면 출력
		System.out.println("[회차 관리] ==============");

		System.out.println();

		System.out.println("회차 등록이 완료되었습니다.");

		System.out.println();

		System.out.println("0. 관리자 메뉴로 돌아가기");
		System.out.println("==========================");
	}

	public void dispScreen()
	{
		int i = 0;

		System.out.println("[상영 중인 영화 내역] =========");

		for (Object obj : vt)
		{
			System.out.println( (i+1) + "관");
			System.out.println( ( (MovieData)temp ).getTilte() );

			i++;
		}

		System.out.println("0. 관리자 메뉴로 돌아가기");
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

