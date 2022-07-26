/*===================================================================
					예외 처리(Exception Handling)
===================================================================*/

// 다른 예외 다시 던지기

public class Test153
{
	public int getValue(int value) throws Exception				// ⑦ 예외 던지기
	{
		int a = 0;

		try
		{
			a = getData(-2);									// ③ 예외 발생
		}
		catch (Exception e)										// ④ 예외 잡아내기
		{
			// ⑤ 예외 처리
			System.out.println("printStackTrace...");
			e.printStackTrace();

			// ⑥ 예외 발생 (★new!)
			throw new Exception("value가 음수입니다.");
		}

		return a;
	}

	public int getData(int data) throws Exception				// ② 예외 던지기
	{
		if (data < 0)
		{
			throw new Exception("data가 0보다 작습니다.");		// ① 예외 발생
		}

		return data + 10;
	}

	public static void main(String[] args)
	{
		Test153 ob = new Test153();
		
		try
		{
			int a = ob.getValue(-2);								// ⑧ 예외 발생
			System.out.println("a : " + a);
		}
		catch (Exception e)											// ⑨ 예외 잡아내기
		{
			// ⑩ 예외 처리
			System.out.println("printStackTrace...");
			e.printStackTrace();
		}
	}
}

// 최종 결과

/*
	// ▷ 첫 번째 예외 처리
	printStackTrace...
	java.lang.Exception: data가 0보다 작습니다.
			at Test153.getData(Test153.java:34)
			at Test153.getValue(Test153.java:15)
			at Test153.main(Test153.java:46)
	// ▷ 두 번재 예외 처리
	printStackTrace...
	java.lang.Exception: value가 음수입니다.
			at Test153.getValue(Test153.java:24)
			at Test153.main(Test153.java:46)
	계속하려면 아무 키나 누르십시오 . . .
*/