/*===================================================================
					자바의 기본 입출력(I/O)
===================================================================*/

import java.io.OutputStream;
import java.io.IOException;

public class Test173
{
	public static void main(String[] args) throws IOException
	{
		// System.in  : 자바의 표준 입력 스트림
		// System.out : 자바의 표준 출력 스트림
		OutputStream out = System.out;

		// 배열 구성
		byte[] ch = new byte[3];

		ch[0] = 65;			// A
		ch[1] = 97;			// a
		ch[2] = 122;		// z

		out.write(ch);		// 밖으로 내보낼 데이터(변수)를 스트림(물줄기)에 기록

		out.flush();		// 기록된 스트림을 내보내는(밀어내는) 기능을 수행
							// 지금은 Buffer를 활용하지 않았기 때문에 생략이 가능한 코드
							// (Buffered 되어 있는 스트림(stream)일 경우 생략 불가)

		// out.close();		// 출력 스트림(물줄기)에 대한 리소스 반납
							// out 스트림을 막아버린 상황 (수도꼭지를 잠궜다!)

		System.out.println("절대적인 신뢰를 갖고 있는 구문");
		// ▷ 『out.close()』를 작성하면 그 후로는 출력되지 않는 구문
		//	   출력되는 스트림(물줄기)를 닫았기 때문이다
	}
}