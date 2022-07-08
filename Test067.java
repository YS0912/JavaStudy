/*===================================================================
				■■■ 실행 흐름의 컨트롤 (제어문) ■■■
	return 실습 및 관찰
===================================================================*/

// return : 값을 반환하고 메소드를 종료해라

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test067
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n, s;

		System.out.print("임의의 정수 입력(10 이상) : ");
		n = Integer.parseInt(br.readLine());
		
		if (n<10)
		{
			System.out.println("10 이상의 정수를 입력해야 합니다.");
			return;
			// 메소드 종료 → return 문을 포함하고 있는 메소드(main) 종료: 프로그램 종료
		}

		s = 0;
		for (int i=1; i<=n; i++)
		{
			s += i;
		}

		System.out.println("결과 : " + s);
	}
}