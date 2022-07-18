/*===================================================================
							클래스와 인스턴스
	- 클래스와 인스턴스 활용
===================================================================*/

// 1~3 사이의 난수를 발생시켜서 가위 바위 보 게이 프로그램을 구현
// 단, 클래스의 개념을 활용하여 처리할 수 있도록 한다.
// 또한 배열을 활용하여 처리할 수 있도록 한다.
// 최종적으로 RpsGame 클래스를 완성할 수 있도록 한다.

// 기준 데이터 → 1: 가위, 2: 바위, 3: 보

// 실행 예)
// 1: 가위, 2: 바위, 3: 보 중 입력(1~3) : 4
// 1: 가위, 2: 바위, 3: 보 중 입력(1~3) : -2
// 1: 가위, 2: 바위, 3: 보 중 입력(1~3) : 2

// - 유저   : 바위
// - 컴퓨터 : 보

// >> 승부 최종 결과 : 컴퓨터가 이겼습니다!
// 계속하려면 아무 키나 누르세요...

import java.util.Scanner;
import java.util.Random;

class RpsGame
{
	// 변수 선언
	private int user, com;
	String[] arr = {"가위", "바위", "보"};

	Random rd = new Random();
	
	// 주요 기능
	// 사용자 입력값
	public void input()
	{
		com = rd.nextInt(3) +1;

		do
		{
			Scanner sc = new Scanner(System.in);

			System.out.print("1: 가위, 2: 바위, 3: 보 중 입력(1~3) : ");
			user = sc.nextInt();
		}
		while (user>3 || user<1);
	}

	// 난수생성 및 비교
	public String choose()
	{
		String choose = "무승부 상황입니다!";

		// (유저=="가위" && 컴=="보") || (유저=="바위" && 컴=="가위") || (유저=="보" && 컴=="바위")
		if ((user==1 && com==3) || (user==2 && com==1) || (user==3 && com==2))
			choose = "당신의 승리입니다!";
		// (유저=="가위" && 컴=="바위") || (유저=="바위" && 컴=="보") || (유저=="보" && 컴=="가위")
		else if ((user==1 && com==2) || (user==2 && com==3) || (user==3 && com==1))
			choose = "컴퓨터의 승리입니다!";

		return choose;
	}

	// 결과 출력
	public void print(String str)
	{	
		System.out.printf("- 유저   : %s%n", arr[user-1]);
		System.out.printf("- 컴퓨터 : %s%n", arr[com-1]);

		System.out.println();

		System.out.printf(">> 승부 최종 결과 : %s%n", str);

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