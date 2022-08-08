import java.util.Vector;


class reservedData
{
	// 주요 속성 구성 → 주요 변수 선언(멤버 변수)
	private String rvNumber;		//-- 예매번호
	private String title;			//-- 영화제목
	private String time;			//-- 시간
	private int screen;				//-- 상영관
	private String seatNumber;		//-- 좌석
	private int inwon;				//-- 인원


	// 예매번호 값 가져다 쓰기
	public String getRvNumber()
	{
		return rvNumber;
	}

	// 예매번호 값 세팅하고 저장하기
	public void setRvNumber(String rvNumber)
	{
		this.rvNumber = rvNumber;
	}


	// 영화 제목 값 가져다 쓰기
	public String getTitle()
	{
		return title;
	}

	// 영화 제목 값 세팅하고 저장하기
	public void setTitle(String title)
	{
		this.title = title;
	}


	// 시간 값 가져다 쓰기
	public String getTime()
	{
		return time;
	}

	// 시간 값 세팅하고 저장하기
	public void setTime(String time)
	{
		this.time = time;
	}


	// 상영관 값 가져다 쓰기
	public int getScreen()
	{
		return screen;
	}

	// 상영관 값 세팅하고 저장하기
	public void setScreen(int screen)
	{
		this.screen = screen;
	}


	// 인원 값 가져다 쓰기
	public int getInwon()
	{
		return inwon;
	}

	// 인원 값 세팅하고 저장하기
	public void setInwon(int inwon)
	{
		this.inwon = inwon;
	}

	
	// 좌석 값 가져다 쓰기
	public String getSeatNumber()
	{
		return seatNumber;
	}

	// 좌석 값 세팅하고 저장하기
	public void setSeatNumber(String seatNumber)
	{
		this.seatNumber = seatNumber;		
	}
	

	// 사용자 정의 생성자 (매개변수: 예매번호, 영화 제목, 시간, 상영관, 인원, 좌석)
	public reservedData(String rvNumber, String title, String time, int screen, int inwon, String seatNumber)
	{
		this.rvNumber = rvNumber;		// 예매번호
		this.title = title;				// 영화 제목
		this.time = time;				// 시간
		this.screen = screen;			// 상영관
		this.inwon = inwon;				// 인원
		this.seatNumber = seatNumber;	// 좌석

	}

	// 사용자 정의 생성자
	public reservedData()
	{
		title = "";			// 영화 제목 초기화
		time = "";			// 시간 초기화
		screen = 0;			// 상영관 초기화
		seatNumber = "";	// 좌석 초기화
	}
	
	public String toString()
	{
		return "영화 제목: " + this.title + "시간: " + this.time + "상영관: " + this.screen + "좌석: " + this.seatNumber;
	}
	
}