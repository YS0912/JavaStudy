import java.util.Scanner;
import java.util.Random;
import java.util.Vector;
import java.util.Arrays;
	
//========================================================================(A)

public class User extends UserData
{

	// 예매번호 생성 메소드
	public void reservNumber()
	{
		Random rd = new Random();
		int n;
		int[] num = new int[10];	

			for (int cnt=0; cnt<10; cnt++)	// 0 ~ 9
			{
				n = rd.nextInt(10);			// 0 ~ 9 중 랜덤한 숫자
				num[cnt] = n;         
			}

		String str = "";
		str = Arrays.toString(num).replaceAll("[^0-9]","");		//-- num[10] 정수형 배열 값을 문자열로 변환하여 str 변수에 저장

		// 난수 발생 방법 ②
		// String str = (rd.nextInt(90000)+10000) + "" + (rd.nextInt(90000)+10000);	//-- 99999 + 99999 (8자리) + 10000
		
		
		// 벡터의 첫 번째 값 존재 여부 판단하기
		if (reservedNum.firstElement() == null)
		{
			reservedNum.add(str);	//-- 없을 시, 일단 저장
		}
		else if (reservedNum.contains(str) == false)	//-- 있을 시, 그 값이 현재 저장되어 있는지 확인 후 저장
		{
			reservedNum.add(str);	//-- str 값 벡터에 추가			
		}

	} //end reservNumber method

// ======================================================================================= 출력 구문 시작 (구글 시트 참고)

	// 스프레드 시트 기준 (초기화면 / 이전화면으로 돌아가기)
	// 가독성 위해 구글 스프레드 시트 번호 반영
	public void startProcess()
	{
		p_id = "A";		//-- firstMenu()로 시작하기 위해 지정
		while(true)
		{
			switch(p_id)
			{
				case "A" :	firstMenu(); break;
				case "B" :	userDisp1(); break;
				//case "C2":	reserv(); break;
				case "C7":	reservedcheck(); break;
				case "C9":	reservCancel(); break;
				case "D2":	moviePick(); break;
				//case "D4":	timePick(); break;
				case "D7":	reservedcheck2(); break;
				case "D9":	reservCancel2(); break;
				case "E2":	moviePick2(); break;
				//case "E4":	timePick2(); break;
				case "F" :	movieRound(); break;
				case "G" :	seatPick(); break;
				//case "end":	break;
				default : System.out.println("지원되지 않는 기능입니다."); 						   
						  break;
			}

			//if("end".equals(p_id)) break;	//-- 프로세스 종료
		}

	} //end startProcess method


	// 맨 처음 관리자가 비밀번호를 입력할 수 있는 화면 (A,12)
	public void firstMenu()
	{
		System.out.println("[영화 티켓 발권기] ==================");
		System.out.println();
		System.out.println("예매하려면 A 를 눌러주세요.");
		System.out.println();
		System.out.println("관리자 비밀번호를 입력해주세요");
		System.out.println();
		System.out.println("=====================================");
		
		Scanner sc = new Scanner(System.in);
		String pw = sc.next();

		System.out.println();

		// 관리자 비밀번호와 입력한 비밀번호가 같을 경우
		if (adminPassword.equals(pw))
		{
			System.out.println("관리자 초기화면 메소드 호출");
		}
		else if (pw.equals("A") || pw.equals("a"))
		{
			// 등록된 영화가 없을 경우 추가 필요 (B,1)
			if (screen[0] == null && screen[1] == null && screen[2] == null)
				userDisp2();	// line 176
			else 
				p_id = "B";
		}

		// 입력한 비밀번호가 틀린 경우, 재입력 화면 호출 구문 (B,12)
		else
		{
			p_id = "A";
		}

	} //end firstMenu method


	// 등록된 영화가 없을 시, 출력 구문 (B,1)
	public void userDisp2()
	{
		System.out.println("[영화 티켓 발권기] ==========================");
		System.out.println();
		System.out.println("상영 중인 영화가 없습니다.");
		System.out.println("잠시만 기다려주시면 금방 영업 준비하겠습니다.");
		System.out.println();
		System.out.println("=============================================");		
	} //end userDisp2 method


	// 등록 영화 있을 시, 출력 구문 (B,6)
	public void userDisp1()
	{
		System.out.println("[관람객 모드]==========");
		System.out.println();
		System.out.println("1. 예매하기");
		System.out.println("2. 예매내역 확인");
		System.out.println("3. 예매 취소");
		System.out.println("=======================");
		System.out.println();
		System.out.println("0. 이전 메뉴로 돌아가기");
		System.out.println();
		System.out.print(">> 메뉴 선택 : ");

		Scanner sc = new Scanner(System.in);
		sel = sc.nextInt();

		System.out.println();

		switch(sel)
		{
			case 1: p_id = "D2"; break;	// 예매하기 화면 출력
			case 2: p_id = "C7"; break; // 예매내역 확인 화면 출력
			case 3: p_id = "C9"; break; // 예매취소 화면 출력
			case 0: p_id = "A"; break;	// 이전메뉴(초기화면) 출력
		}
	} //end userDisp1 method

//========================================================================(C)

	/*
	// 1. [예매하기] 선택 후 다음 메뉴 (C,3)
	public void reserv()
	{
		System.out.println("[예매하기] ============");
		System.out.println();
		System.out.println("분류 기준");
		System.out.println("1. 영화");
		System.out.println("2. 시간대");
		System.out.println();
		System.out.println("=======================");
		System.out.println("0. 이전 메뉴로 돌아가기");

		Scanner sc = new Scanner(System.in);
		sel = sc.nextInt();

		System.out.println();

		switch(sel)
		{
			case 1: p_id = "D2"; break;	// moviePick 화면 출력
			case 2: p_id = "D4"; break; // timePick 확인 화면 출력
			case 0: p_id = "B"; break;	// 이전화면 출력(관람객모드 처음 화면)
		}
	} //end reserv method
	*/


	// 1. [영화] 선택 후 다음 메뉴 (D,2)
	public void moviePick()
	{
		System.out.println();
		System.out.println("[예매하기] ======================");
		System.out.println();
		//System.out.println("관리자가 등록한 영화 목록 출력");
		
		// 상영관에 등록된 영화 정보 저장된 배열
		for (int i=0; i<screen.length; i++)
		{
			if (screen[i] != null)	// 상영관에 영화가 등록되어 있을 경우에만
			{
				System.out.printf(" 상영관: %d관\n 영화 제목 : %s(%d)\n", (i+1), screen[i].title, screen[i].grade);
				System.out.println();
			}		
		}
		System.out.println("=================================");
		System.out.println("0. 이전 메뉴로 돌아가기");
		System.out.println();
		System.out.print("예매하실 영화제목을 입력해주세요 : ");

		Scanner sc = new Scanner(System.in);
		tempTitle = sc.next();	//-- 영화제목 검색 시 문자열 비교하기 위해 String 형태의 tempTitle 이라는 변수에 저장
		System.out.println();

		if (tempTitle == "0")
		{
			p_id = "B"; //-- 이전화면 출력(관람객모드 처음 화면)
		}
		System.out.println();

		// 사용자가 입력한 값이 상영관 내 값과 동일한 경우
		if (tempTitle.equals(screen[0].title) || tempTitle.equals(screen[1].title) || tempTitle.equals(screen[2].title))
		{
			p_id = "E2";
		}
		else
		{
			System.out.println("입력 값이 잘못되었습니다");
			System.out.println("다시 입력해주세요");
			System.out.println();
			p_id = "D2";	//-- 현재 화면 호출 (재입력)
		}
	
	} //end moviePick method


	// [영화선택] 후 회차 고르기 (E,2)
	public void moviePick2()
	{
		System.out.println("[예매하기] ============");
		System.out.println();
		
		// 사용자가 선택한 영화제목이 등록된 상영관 값 출력하기
		for (int i=0; i<screen.length; i++)
		{
			if (screen[i].title.equals(tempTitle))	
			{
				System.out.print(screen[i].title + " ");
				System.out.printf("(%d)\n", screen[i].grade);
				System.out.println();
				System.out.printf("상영관 : %d관", (i+1));
				System.out.println();
				
				runTime = screen[i].playTime;	//-- 사용자가 선택한 영화의 러닝타임 값 저장
				tempScreen = (i+1);				//-- 사용자가 선택한 영화가 등록된 상영관 정보 저장 (몇 관인지)
			}		
		}

		int startTime = 9;	

		if (tempScreen == 1)	//-- 1관 7회차 출력 (2시간 간격 운영)
		{
			for (int i=0; i<7; i++)
			{
				int endTime = (startTime*60 + runTime) / 60;	
				int endMinute = (startTime*60 + runTime) % 60;  
				System.out.printf("%d회차 : ", (i+1));
				String st = "";		//-- start time
				String et=  "";		//-- end time
				String em = "";		//-- end minute
				if(startTime == 9) 
					st = "0"+Integer.toString(startTime); 
				else 
					st= Integer.toString(startTime);
				if(endTime >= 0 && endTime <= 9) 
					et = "0"+Integer.toString(endTime); 
				else 
					et= Integer.toString(endTime);
				if(endMinute >= 0 && endMinute <= 9) 
					em = "0"+Integer.toString(endMinute); 
				else 
					em = Integer.toString(endMinute);
				System.out.printf("%s:00 ~ %s:%s \n", st, et, em);
				startTime += 2;
			}
		}

		else if (tempScreen == 2)	//-- 2관 5회차 출력 (3시간 간격 운영)
		{
			for (int i=0; i<5; i++)
			{
				int endTime = (startTime*60 + runTime) / 60;	//-- end time
				int endMinute = (startTime*60 + runTime) % 60; //-- end minute
				System.out.printf("%d회차 : ", (i+1));
				String st = "";
				String et=  "";
				String em = "";
				if(startTime == 9) st = "0"+Integer.toString(startTime); else st= Integer.toString(startTime);
				if(endTime >= 0 && endTime <= 9) et = "0"+Integer.toString(endTime); else et= Integer.toString(endTime);
				if(endMinute >= 0 && endMinute <= 9) em = "0"+Integer.toString(endMinute); else em= Integer.toString(endMinute);
				System.out.printf("%s:00 ~ %s:%s \n", st, et, em);
				startTime += 3;
			}
		}

		else if (tempScreen == 3)	//-- 3관 3회차 출력 (4시간 간격 운영)
		{
			for (int i=0; i<3; i++)
			{
				int endTime = (startTime*60 + runTime) / 60;	//-- end time
				int endMinute = (startTime*60 + runTime) % 60; //-- end minute
				System.out.printf("%d회차 : ", (i+1));
				String st = "";
				String et=  "";
				String em = "";
				if(startTime == 9) st = "0"+Integer.toString(startTime); else st= Integer.toString(startTime);
				if(endTime >= 0 && endTime <= 9) et = "0"+Integer.toString(endTime); else et= Integer.toString(endTime);
				if(endMinute >= 0 && endMinute <= 9) em = "0"+Integer.toString(endMinute); else em= Integer.toString(endMinute);
				System.out.printf("%s:00 ~ %s:%s \n", st, et, em);
				startTime += 4;
			}
		}
		System.out.println("=======================");
		System.out.println("0. 이전 메뉴로 돌아가기");
		System.out.println();
		System.out.print("회차 선택 : ");

		Scanner sc = new Scanner(System.in);
		sel = sc.nextInt();
		tempRound = sel;
		System.out.println();

		switch(sel)
		{
			case 0: p_id = "B"; break; // 이전화면 출력(관람객모드 처음 화면)
			case 1:  
			case 2: 
			case 3: 
			case 4: 
			case 5: 
			case 6: 
			case 7: p_id = "F"; break;
			default: p_id = "E2"; break;
		}
	} //end moviePick2 method

//=====================================================================↑ 영화선택(moviePick)
	
	// 2. [시간대] 선택 (D,5)
	//public void timePick()
	//{
		/*
		System.out.println("[예매하기] ============");
		System.out.println();
		System.out.println("1. 오전(9~12)");
		System.out.println("2. 오후(13~18)");
		System.out.println("3. 저녁(19~23)");
		System.out.println();
		System.out.println("=======================");
		System.out.println("0. 이전 메뉴로 돌아가기");

		Scanner sc = new Scanner(System.in);
		sel = sc.nextInt();

		System.out.println();
		
		int st = 0;
		
		// 오전, 오후, 저녁 선택하는 부분
		if (sel == 1)
		{
			st1 = 9;
			st2 = 9;
			st3 = 9;
			for (int i=1; i<=2; i++)	
			{
				if((float)4/(2*i) >= 0) {
				System.out.printf("%d:00 ~ %d:00 영화 제목 : %s(%s)", screen[0].title, screen[0].grade);
				st1 += 2;
				}
				if((float)4/(3*i) >= 0) {
				System.out.printf("%d:00 ~ %d:00 영화 제목 : %s(%s)", screen[1].title, screen[1].grade);
				st1 += 3;
				}
				if((float)4/(4*i) >= 0) {
				System.out.printf("%d:00 ~ %d:00 영화 제목 : %s(%s)", screen[2].title, screen[2].grade);
				st1 += 4;
				}
			}
			p_id = "E3";
		}
		if (sel == 2)
		{
			st1 = 13;
			st2 = 13;
			st3 = 13;
			for (int i=1; i<=3; i++)	
			{
				if(4/(2*i)) {
				System.out.printf("%d:00 ~ %d:00 영화 제목 : %s(%s)", screen[0].title, screen[0].grade);
				st1 += 2;
				}
				if(4/(3*i)) {
				System.out.printf("%d:00 ~ %d:00 영화 제목 : %s(%s)", screen[1].title, screen[1].grade);
				st1 += 3;
				}
				if(4/(4*i)) {
				System.out.printf("%d:00 ~ %d:00 영화 제목 : %s(%s)", screen[2].title, screen[2].grade);
				st1 += 4;
				}
			}
			p_id = "E3";
		}
		if (sel == 3)
		{			
			st1 = 19;
			st2 = 19;
			st3 = 19;
			for (int i=0; i<2; i++)	
			{
				if(4/(2*i)) {
				System.out.printf("%d:00 ~ %d:00 영화 제목 : %s(%s)", screen[0].title, screen[0].grade);
				st1 += 2;
				}
				if(4/(3*i)) {
				System.out.printf("%d:00 ~ %d:00 영화 제목 : %s(%s)", screen[1].title, screen[1].grade);
				st1 += 3;
				}
				if(4/(4*i)) {
				System.out.printf("%d:00 ~ %d:00 영화 제목 : %s(%s)", screen[2].title, screen[2].grade);
				st1 += 4;
				}
			}
			p_id = "E3";
			
		}

		switch(sel)
		{
			case 0: p_id = "B"; break; // 이전화면 출력(관람객모드 처음 화면)
		}
		*/
	//}

	// 관리자가 상영관에 등록한 영화 정보를 가져와 => 현재 어떤 상영관이 영화가 등록되어 있는지 알 수 있음
	// 등록한 영화가 몇 관에 등록되어 있는지, 영화제목, 영화 러닝타임을 가져와
	// 영화가 등록된 상영관 별로 9시 기준 +2,+3, +4 해서 각 회차면 시작 시간을 구해

	// 상영관이 전부 비어있는 경우는 없음 > 등록된 상영관만 따로 추출 필요
	/*
	for (int i=0; i<screen.length; i++)	
		{
			if (screen[i] != null)	// 상영관에 영화 제목 값이 들어있다면
			{
				// 어떤 상영관인지, 어떤 영화인지(제목, 등급) 가져와 > 일단 출력하자
				System.out.println(i);
				System.out.println


			}
			System.out.printf("영화 제목 : %s", screen[i].title);
		}
	*/


	// [시간선택] (E, 4) 후 회차 고르기
	//public void timePick2()
	//{
		/*
		System.out.println("[예매하기] ============");
		
		// 선택한 시간대에 있는 영화 데이터 불러와서 출력
		/*
		1. 9:00~11:00 범죄도시2 (19)
		2. 9:00~12:00 탑건2 (15)
		3. 9:00~13:00 미니언즈2 (전체)
		*/

		// 연수님이 작성해 준 상영관에 등록된 영화 정보 저장된 배열
		/*
		for (int i=0; i<screen.length; i++)
		{
			System.out.printf("영화 제목 : %s", screen[i].title);
		}

		System.out.println("=======================");
		System.out.println("0. 이전 메뉴로 돌아가기");

		Scanner sc = new Scanner(System.in);
		sel = sc.nextInt();

		System.out.println();
		
		num = sel;
		
		// 원하는 영화 번호 선택
		// 관별로 그 시간대 회차가 다 나오는 화면이기 때문에
		// 영화리스트가 몇 개인지 알 수 없어서 일단 공백

		switch(sel)
		{
			case 0: p_id = "D4"; break; // 이전화면 출력
		}

		p_id = "F";
		*/
	//}
	
//=====================================================================↑ 시간선택(timePick)

	// [회차 또는 영화 선택] (F,3)
	public void movieRound()
	{
		MovieData selMovie = screen[tempScreen-1];
		int si = (tempScreen-1) * (7+(2-tempScreen)) + (tempRound-1);	//-- 회차별 좌석정보 (0~6: 1관 회차, 7~11: 2관 회차, 12~15: 3관 회차)
		int startTime = 9;	//-- start time
		
		if (si >= 0 && si < 7)
		{
			startTime += (2*si);
		}
		else if(si >= 7 && si < 12)
		{
			startTime += (3*(si-7));
		}
		else if(si >= 12 && si < 15) 
		{
			startTime += (4*(si-12));
		}

		int endTime = (startTime*60 + selMovie.playTime) / 60;	//-- end time
		int endMinute = (startTime*60 + selMovie.playTime) % 60; //-- end minute

		int leftSeat = 25;	//-- 관별 총 좌석 수
		boolean[][] seatInfo = seatInfos[si];

		for (int i = 0; i < seatInfo.length; i++)
		{
			for (int j = 0; j < seatInfo[i].length; j++)
			{
				if (seatInfo[i][j])
					leftSeat--;		//-- 선택한 좌석 빠짐		                                
            }            
        }

		String st = "";
		String et=  "";
		String em = "";
		if(startTime == 9) st = "0"+Integer.toString(startTime); else st= Integer.toString(startTime);
		if(endTime >= 0 && endTime <= 9) et = "0"+Integer.toString(endTime); else et= Integer.toString(endTime);
		if(endMinute >= 0 && endMinute <= 9) em = "0"+Integer.toString(endMinute); else em= Integer.toString(endMinute);

		tempTime = st + ":00 ~ " + et + ":" + em;

		System.out.println("[예매하기]==============");
	    System.out.println();
	    System.out.println(selMovie.title + "(" + selMovie.grade + ")");
	    System.out.println(tempTime);
	    System.out.println();
	    System.out.println("관람인원을 입력해주세요.");
	    System.out.println("잔여 좌석 : " + leftSeat);
	    System.out.println();   
	    System.out.println("========================");
	    System.out.println("-1. 이전 메뉴로 돌아가기");	// 성인이 0명인 경우로 인해 일단 5로 변경
	    System.out.println();

	    Scanner sc = new Scanner(System.in);


	    //System.out.println();

		// 아래의 변수들은 전역변수이기에 메소드 재진입시 이전 정보를 계속 갖게 됨. 따라서 초기화 필요!
	    adult = 0;
	    teenager = 0;
	    kid = 0;

	    System.out.print("성인 : ");
	    adult = sc.nextInt();
	    if (adult == -1)
		{
			p_id = "E2";  //-- 이전화면 출력
			return;
		}
	    System.out.print("청소년 (~18) : ");
	    teenager = sc.nextInt();
	    if (teenager == -1)
		{
			p_id = "E2";  //-- 이전화면 출력
			return;
		}
	    System.out.print("어린이 (~14) : ");
	    kid = sc.nextInt();
	    if (kid == -1)
		{
			p_id = "E2";  //-- 이전화면 출력
			return;
		}

	    p_id = "G";

	    switch (selMovie.grade)
	    {
			case 19: if (teenager != 0 && kid != 0)
				adultMovie(selMovie.title, selMovie.grade); break;
			case 15: if (kid != 0)
				adultMovie(selMovie.title, selMovie.grade); break;
			default: break;
	    }

	    total = adult + teenager + kid;
	   
	    // [상영관보다 많은 인원 입력 시] (G,6)
	    if (total > 25)
	    {
			System.out.println("[예매하기] =======================");
			System.out.println();
			System.out.println("해당 상영관의 좌석수가 부족합니다.");
			System.out.println("다시 선택해주세요.");
			System.out.println();
			System.out.println("==================================");
			System.out.println();

			p_id = "F";
	    }

		if(p_id.equals("F")) return;

   } //end movieRound method


	// [상영 불가 연령대 기입 시] (G,2) > 관리자 메뉴에서 기능 끌어오면 조건문 써서 movieRound() 안에 넣기
	public void adultMovie(String title, int age)
	{
		System.out.println("[예매하기] ===========================================");
		System.out.println();
		System.out.println(title + "은(는)" + age + " 세 미만 관람불가 영화입니다.");
		System.out.println("다시 선택해주세요.");
		System.out.println();
		System.out.println("======================================================");
		System.out.println();
		System.out.println();
		p_id = "F";
	} //end adultMovie method


	// 좌석 보여주는 메소드 생성 (G,3)
	public void showSeat(boolean[][] seatInfo)
	{
		System.out.println();
		System.out.println("※■로 표시된 좌석은 예약된 좌석입니다.");      
        for (int i = 0; i < seatInfo.length; i++)
		{
			for (int j = 0; j < seatInfo[i].length; j++)
			{
				if (seatInfo[i][j])
					System.out.print("[■]");
                else                                     
					System.out.print("[" + (char)(65 + i) + (j+1) + "]");                                 
            }
            System.out.println();
        }
		System.out.println();
	}
	
	// [인원 입력] (G,3)
	// 좌석 선택 메소드 생성 (메소드 변수: seatPick)
	public void seatPick()
	{
		int si = (tempScreen-1) * (7 + (2-tempScreen)) + (tempRound-1);	//각 상영관 회차별 좌석정보를 처리하기 위해 0~6은 1관의 총 회차, 7~11은 2관의 총 회차, 12~14는 3관의 총 회차
		int[] rows = new int[total];
		int[] cols = new int[total];

		Scanner sc = new Scanner(System.in);
		boolean isFirst = true;
		tempSeat = "";

		for (int i=0; i<total; i++)
		{
			if (isFirst)
			{
				showSeat(seatInfos[si]);
				isFirst = false;
			}
			System.out.println("원하는 좌석을 선택해주세요. [알파벳 대문자로 입력해주세요.]");
			System.out.println("총 인원은 " + total + "명입니다.");
			System.out.print("좌석 입력: ");
			String s = sc.next();
			int row = (int)s.charAt(0) - 65;	//-- 열
			int col = (int)s.charAt(1) - 48;	//-- 행
			 
			if (seatInfos[si][row][col-1])
			{
				redun();
				i--;
			}
			else
			{
				seatInfos[si][row][col-1] = true;
				if (i == total-1)
				{
					tempSeat += s;
				}
				else
				{
					tempSeat += (s + ", ");
				}
				rows[i] = row;
				cols[i] = col-1;
			}
			showSeat(seatInfos[si]);
		}
		seatPick2(si, rows, cols);

	} //end seatPick method


	// [좌석 중복] (H,3)
	public void redun()
	{
		System.out.println("[예매하기] ===========");
		System.out.println();
		System.out.println("이미 선택된 좌석입니다");
		System.out.println("다시 선택해주세요.");
		System.out.println();
		System.out.println("======================");
		System.out.println();
	}

	// [좌석 선택 가능] (H,4)
	public void seatPick2(int si, int[] rows, int[] cols) 
	{
		reservNumber();		//-- 난수 생성
		String str="";		//-- 문자열 변수 선언
		str = reservedNum.lastElement();	//-- 생성된 예매번호를 str 문자형 변수에 저장(밑에 결제취소할 경우 삭제처리 하기 위해)

		System.out.println("[예매하기] =================");
		System.out.println();
		System.out.print  ("예매번호 : " + str);	//-- 예매번호 불러와서 적용해야 함
		System.out.println();
		System.out.println("영화     : " + tempTitle);
		System.out.println("시간     : " + tempTime);
		System.out.println("상영관   : " + tempScreen + "관");
		System.out.println("인원     : " + total + "명");
		System.out.println("좌석     : " + tempSeat);
		System.out.println();
		System.out.println("============================");
		
		System.out.print("결제하시겠습니까? (Y/N) :");

		Scanner sc = new Scanner(System.in);
		String sel2 = sc.next();

		System.out.println();

		if (sel2.equals("y") || sel2.equals("Y"))
		{	
			ud.add(new reservedData(str, tempTitle, tempTime, tempScreen, total, tempSeat));
			seatPick3(); //-- 예매가 완료되었다는 문구 출력하는 화면
		}
		
		// 관람객 메뉴로 돌아가기 (I,5)
		else if (sel2.equals("n") || sel2.equals("N"))
		{	
			reservedNum.remove(str);
			p_id = "B";	
			for(int i=0; i<total; i++) {
				int row = rows[i];
				int col = cols[i];
				seatInfos[si][row][col] = false;
			}
		}
		else
		{
			reservedNum.remove(str);
			System.out.println("존재하지 않는 기능입니다.");
			seatPick2(si, rows, cols);
		}

	} //end seatPick2 method

	
	// 좌석 선택 기능에서 Y 누른 후 화면(I,4)
	public void seatPick3()
	{
		System.out.println("[예매하기] ===============");												
		System.out.println();
		System.out.println("예매가 완료되었습니다.");
		System.out.println();
		System.out.println("==========================");
		System.out.print("0. 관람객 메뉴로 돌아가기 : ");

		Scanner sc = new Scanner(System.in);
		sel = sc.nextInt();
		System.out.println();

		switch(sel)
		{
			case 0: p_id = "B";	//-- 이전화면 출력(관람객모드 처음 화면)
		}
	} //end seatPick3 method

// ============================================================ ↑ 예매하기

	// [예매내역 확인]하는 메서드 (C,7)
	public void reservedcheck()
	{
		System.out.println("[예매내역 확인] ========");
		System.out.println();
		System.out.println("예매번호를 입력해주세요.");
		System.out.println();	
		System.out.println("========================");
		System.out.println("0. 이전 메뉴로 돌아가기");
		System.out.println();
		System.out.print("예매번호 : ");

		Scanner sc = new Scanner(System.in);
		bookNumber = sc.next();
		System.out.println();

		if (reservedNum == null)
		{
			reservedcheck3();
			return;
		}
		
		if (bookNumber.equals("0"))
		{
			p_id = "B";	//-- 이전화면 출력(관람객모드 처음 화면)
		}

		else if (reservedNum.contains(bookNumber)==true) //-- str 문자값(예매번호) 이 reservedNum(벡터) 값에 없는 경우 
		{
			p_id = "D7"; //-- 다음 화면(예매내역 확인 화면 D열) 전환
		}
		else
		{
			reservedcheck3(); //-- 없는 예매번호 입력 시 화면 전환
		}
		
	} //end reservedcheck method


	// [예매번호 입력] (D,7)
	public void reservedcheck2()
	{
		int udIndex = reservedNum.indexOf(bookNumber);
		reservedData res_ud = ud.get(udIndex);
		System.out.println("[예매내역 확인] ============");
		System.out.println(); 
		System.out.print  ("예매번호  : " + bookNumber);
		System.out.println();
		System.out.println("영화 제목 : " + res_ud.getTitle());
		System.out.println("시간      : " + res_ud.getTime());
		System.out.println("상영관    : " + res_ud.getScreen() + "관");
		System.out.println("인원      : " + res_ud.getInwon() + "명");
		System.out.println("좌석      : " + res_ud.getSeatNumber());
		System.out.println();
		System.out.println("============================");
		System.out.print("0. 이전 메뉴로 돌아가기 : ");

		Scanner sc = new Scanner(System.in);
		sel = sc.nextInt();
		System.out.println();

		switch(sel)
		{
			case 0: p_id = "B"; //-- 이전화면 출력(관람객모드 처음 화면)
		}
		
	} //end reservedcheck2 method


	// 없는 예매번호 입력 시 (D,8)
	public void reservedcheck3()
	{
		System.out.println("[예매내역 확인] =============");
		
		System.out.println(); 
		System.out.println("존재하지 않는 예매번호입니다.");
		System.out.println("다시 입력해 주세요.");
		System.out.println();

		System.out.println("=============================");
		System.out.println();

		p_id = "C7"; 
	}

// ======================================================== ↑ 예매내역 확인	

	// 예매 취소 첫 화면(예매 번호 입력하는 문구포함) (C,10)
	public void reservCancel()
	{
		System.out.println("[예매취소] =======================");
		System.out.println();
		System.out.println("예매 번호를 입력해주세요. (10자리)"); 
		System.out.println();
		System.out.println("==================================");
		System.out.println("0. 이전 메뉴로 돌아가기");
		System.out.println();
		System.out.print("예매 번호 입력: ");
		Scanner sc = new Scanner(System.in);
		bookNumber = sc.next();
		System.out.println();
			
		if (bookNumber.equals("0"))
			p_id = "B";		 //-- 이전화면 출력(관람객모드 처음 화면)
		else if (reservedNum.contains(bookNumber) == true)		//-- str 문자값(예매번호)이 reservedNum(벡터) 값에 없는 경우 
		{
			p_id = "D9";	 //-- 다음 화면(예매번호 입력화면 D열) 전환
		}
		else
			reservCancel3(); //-- 없는 예매번호 입력 시 화면 전환
		if (reservedNum == null)
			reservCancel3();

	} //end reservCancel method


	// [예매번호 입력] (D,9)
	public void reservCancel2()
	{
		int udIndex = reservedNum.indexOf(bookNumber);
		reservedData res_ud = ud.get(udIndex);

		System.out.println("[예매취소] =================");
		
		System.out.println(); 
		System.out.print  ("예매번호  : " + bookNumber);
		System.out.println();
		System.out.println("영화 제목 : " + res_ud.getTitle());
		System.out.println("시간      : " + res_ud.getTime());
		System.out.println("상영관    : " + res_ud.getScreen() + "관");
		System.out.println("인원      : " + res_ud.getInwon() + "명");
		System.out.println("좌석      : " + res_ud.getSeatNumber());
		System.out.println();
		System.out.println("============================");
		System.out.println("0. 이전 메뉴로 돌아가기");
		System.out.println();

		System.out.print("정말 취소하시겠습니까? (Y/N) :");	
		Scanner sc = new Scanner(System.in);
		String sel2 = sc.next();

		System.out.println();

		if (sel2.equals("y") || sel2.equals("Y"))
		{	
			int i = reservedNum.indexOf(bookNumber);	//-- 예매번호가 벡터에 몇 번째에 위치하는지 찾아서 i 에 저장
			reservedNum.remove(i);
			reservCancelY(); //-- 예매가 취소되었다는 문구 출력하는 화면
		}
		else if (sel2.equals("n") || sel2.equals("N"))
			p_id = "C9"; //-- 이전메뉴(예매번호 입력하는 화면)로 돌아가는 화면
		else if (sel2.equals("0"))
			p_id = "B";
		else
		{
			System.out.println("존재하지 않는 기능입니다.");
			p_id = "D9";
		}

	} //end reservCancel2 method


	// 없는 예매번호 입력 시 (D,8), (D,11)
	public void reservCancel3()
	{
		System.out.println("[예매취소] ==================");
		System.out.println(); 
		System.out.println("존재하지 않는 예매번호입니다.");
		System.out.println("다시 입력해 주세요.");
		System.out.println();
		System.out.println("=============================");
		System.out.println();

		p_id = "C9"; 
	}


	// [예매 취소] (E,9)
	public void reservCancelY()
	{
		System.out.println("[예매취소] ==============");
		System.out.println(); 
		System.out.println("예매를 취소했습니다.");
		System.out.println();
		System.out.println("=========================");
		System.out.print("0. 관람객 메뉴로 돌아가기 : ");

		Scanner sc = new Scanner(System.in);
		sel = sc.nextInt();
		System.out.println();

		switch(sel)
		{
			case 0: p_id = "B"; // 이전화면 출력(관람객모드 처음 화면)
		}
	}


	// 현재 상영관에 등록된 영화 정보 출력하는 메소드
	public void movieList()
	{
		//상영관에 등록된 영화 정보 저장된 배열
		for (int i=0; i<screen.length; i++)
		{
			System.out.printf("영화 제목 : %s, 상영관: %d관\n", screen[i].title, (i+1));
		}
	}
// ============================================================ ↑ 예매취소

} //end User class