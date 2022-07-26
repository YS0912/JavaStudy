/*===================================================================
							클래스 고급
	- 자바에서 기본적으로 제공하는 주요 클래스들
	- Random 클래스
===================================================================*/

/*
○ java.util.Random 클래스는
	
	여러 형태의 난수를 발생시켜 제공하는 클래스이다.
	Math 클래스의 정적 메소드인 random() 메소드도 난수를 제공하는 메소드이지만,
	0.0 ~ 1.0 사이의 실수 형태만 발생시키므로
	필요한 여러 형태의 난수를 만들어내기 위해서는 추가적인 연산을 수행해야 한다.
	그래서 자바는 여러 형태의 난수를 발생시켜주는 전용클래스인
	Random 클래스를 별도로 제공하고 있다.
*/

// 로또 번호 생성 (난수 발생 프로그램)

// 프로그램이 실행되면 기본적으로 로또를 5게임 수행하는 프로그램을 구현한다.

// 실행 예)
// 3 5 12 24 31 41
// 1 2 8 36 41 42
// 4 9 12 13 22 30
// 5 10 13 14 22 40
// 22 31 36 40 43 44
// 계속하려면 아무 키나 누르세요...

import java.util.Random;
import java.util.Arrays;							// 추가~!!!  check~!!!

class Lotto
{
	// 배열 변수 선언 및 메모리 할당 → 로또 번호를 담아둘 배열방 6칸
	private int[] num;

	// 생성자
	Lotto()
	{
		num = new int[6];
	}

	// getter
	public int[] getNum()
	{
		return num;
	}

	// 6개의 난수를 발생시키는 메소드 정의
	public void start()
	{
		// 내 풀이 --------------------------------------------------------------------------------

		/*
		Random random = new Random();
		
		// 배열에 난수 초기화
		for (int i=0; i<num.length; i++)
		{
			num[i] = random.nextInt(45) +1;
			
		}

		// 각각의 배열 값을 비교해 같은 값이 있을 경우 재초기화
		boolean flag = false;
		
		do
		{
			for (int i=0; i<num.length-1; i++)
			{
				for (int j=(i+1); j<num.length; j++)
				{
					if (num[i] == num[j])
					{
						flag = true;
						num[i] = random.nextInt(45) +1;
					}
				}
			}
		}
		while (flag);
		
		// 출력
		for (int i : num)
			System.out.print(" " + i);
		*/


	// 선생님 풀이 --------------------------------------------------------------------------------

		Random rd = new Random();
		int n;
		int cnt = 0;

		jump: 

		while (cnt<6)										// 난수 발생
		{
			n = rd.nextInt(45) + 1;

			for (int i=0; i<cnt; i++)						// 비교
			{
				if (num[i] == n)
					continue jump;
			}

			num[cnt++] = n;

			// 정렬 메소드 호출
			//sorting();									// 위치가 잘못된 상황~!!!
		}

		// 정렬 메소드 호출
		sorting();											// 위치 이동~!!!

	} // end start
	
	// 정렬 메소드 정의
	private void sorting()
	{
		Arrays.sort(num);
	}

} // end Lotto

public class Test146
{
	public static void main(String[] args)
	{	
		// Lotto 클래스 기반 인스턴스 생성
		Lotto lotto = new Lotto();
		
		// 기본 5 게임
		for (int i=1; i<=5; i++)
		{
			// 로또 게임 수행
			lotto.start();

			// 결과 출력
			//for (int n : lotto.getNum)			// 여기서 호출한 것은 메소드~!!!
			for (int n : lotto.getNum())
				System.out.printf("%4d", n);
			System.out.println();
		}
	}
}