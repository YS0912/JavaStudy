import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

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

	// static 초기화 블럭
	static
	{
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
				System.out.println( (i+1) + ". " + vt.get(i));
			System.out.println();

			System.out.println("0. 이전 메뉴로 돌아가기");
			System.out.println("=======================");

			System.out.pirntln();

			System.out.print("영화 선택 : ");
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

