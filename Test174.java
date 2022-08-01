/*===================================================================
					자바의 기본 입출력(I/O)
	- Reader 실습
===================================================================*/

import java.io.Reader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test174
{
	public static void main(String[] args) throws IOException
	{
		int data;
		char ch;

		// System.in		 : 자바 표준 입력 스트림 (바이트 기반 스트림)
		// InputStreamReader : 바이트 기반의 스트림을 문자 기반 스트림으로 변환
		// Reader			 : 문자 기반 스트림 객체
		Reader rd = new InputStreamReader(System.in);
		//				----------------- ---------
		//				   문자로 변환	   바이트

		System.out.println("문자열 입력(종료:Ctrl+z)");

		while ( (data = rd.read()) != -1)
		{
			ch = (char)data;

			// System.out.print(ch);						// 문자 기반 스트림으로 출력
			/* →
				문자열 입력(종료:Ctrl+z)
				abcd
				abcd
				1234
				1234
				가나다라
				가나다라
				^Z
				계속하려면 아무 키나 누르십시오 . . .
			*/

			System.out.write(ch);							// 바이트 기반 스트림으로 출력
			/* →
				문자열 입력(종료:Ctrl+z)
				abcd
				abcd
				1234
				1234
				가나다라
				 섆|
				^Z
				계속하려면 아무 키나 누르십시오 . . .
			*/
		}
	}
}