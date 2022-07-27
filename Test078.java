/*===================================================================
							클래스와 인스턴스
	- 생성자(Constructor)와 초기화 블럭(Initialized Block)
===================================================================*/

public class Test078
{
	/*
	-- 수행 불가
	int n;
	int m;
	
	n=100;
	m=200;
	*/
	
	/*
	-- 수행 가능
	int n = 100;
	int m = 200;
	*/

	// 수행 가능
	int n;
	int m;

	// 생성자(Constructor)
	Test078()
	{
		n=100;
		m=200;
		System.out.println("생성자 실행...");
	}

	// 초기화 블럭(Initialized Block)
	{
		n=10;
		m=20;
		System.out.println("초기화 블럭 실행...");
	}

	Test078(int n, int m)
	{
		this.n=n;
		this.m=m;
		System.out.println("매개변수 있는 생성자 실행...");
	}

	// 멤버 출력 메소드 정의
	void write()
	{
		System.out.println("n: " + n + " m: " + m);
		System.out.println();
	}

	public static void main(String[] args)
	{
		Test078 ob1 = new Test078();
		ob1.write();
		/*
			초기화 블럭 실행...
			생성자 실행...							// -- 더 강하다: 최종적으로 해당 멤버의 초기화 값을 결정
		*/

		Test078 ob2 = new Test078(1234, 2345);
		ob2.write();
	}
}

// 최종 결과

/*
	초기화 블럭 실행...
	생성자 실행...
	n: 100 m: 200

	초기화 블럭 실행...
	매개변수 있는 생성자 실행...
	n: 1234 m: 2345

	계속하려면 아무 키나 누르십시오 . . .
*/

/*
	생성자끼리는 영향을 주지 못하고 인스턴스를 따로 생성하기 때문에 별개의 객체로 취급
	메소드로 변경했을 경우에서는 메소드가 생성자의 영향을 받는다 (ex. this.n = this.n + n)
*/
