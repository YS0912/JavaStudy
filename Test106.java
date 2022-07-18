/*===================================================================
						주민등록번호 유효성 검사
===================================================================*/

/*
○ 주민등록번호 검출 공식

	① 마지막 자리를 제외한 앞자리 수를 규칙에 맞게 곱한다
		
		123456-1234567	(주민번호)
		****** ******	----------------------- 각 자릿수에 곱하기
		234567 892345	(각 자리에 곱해질 수)

	② 규칙에 맞게 곱셈 연산을 수행한 결과를 모두 더한다

	ex) 7 5 0 6 1 5 - 1 8 6 2 1 3 3
		* * * * * *   * * * * * *
		2 3 4 5 6 7   8 9 2 3 4 5
		---------------------------
		→ 14 + 15 + 0 + 30 + 6 + 35 + 8 + 72 + 12 + 6 + 4 + 15
		   == 217
	
	③ 더한 결과값을 11로 나누어 『나머지』를 취한다.

			   1 9
			-------
		11 | 2 1 7
			 1 1
			-------
			 1 0 7
			   9 9
			-------
				 8		→ 나머지

	④ 11에서 나머지 8을 뺀 결과값을 구한다.

		11 - 8 → 3

		if ③의 처리 과정에서 나머지가 0인 경우 → 11 - 0 = 11
							  나머지가 1인 경우 → 11 - 1 = 10
		
		이를 다시 10으로 나누어 나머지를 취함	11 → 1
												10 → 0

	⑤ ④의 연산 결과가 주민번호를 구성하는 마지막 숫자와 일치하는지 여부를 비교하여 확인
		일치	→ 유효한 주민번호
		불일치	→ 잘못된 주민번호
*/

// 실행 예)
// 주민번호입력 (xxxxxx-xxxxxxx) : 123456-12345678 → 입력 갯수 초과
// >> 입력 오류
// 계속하려면 아무 키나 누르세요...

// 주민번호입력 (xxxxxx-xxxxxxx) : 123456-123456 → 입력 갯수 미달
// >> 입력 오류
// 계속하려면 아무 키나 누르세요...

// 주민번호입력 (xxxxxx-xxxxxxx) : 750615-1252085 → 유효한 주민번호
// >> 정확한 주민번호
// 계속하려면 아무 키나 누르세요...

// 주민번호입력 (xxxxxx-xxxxxxx) : 750615-1252086 → 잘못된 주민번호
// >> 잘못된 주민번호
// 계속하려면 아무 키나 누르세요...

// ★Hint
//		배열.length				→ 배열의 길이(배열방의 갯수) 반환
//		문자열.length()			→ 문자열의 길이 반환
//		문자열.substring()		→ 문자열 추출
//		문자열.substring(m, n)	→ 문자열 m번째 위치에서 n-1번째 위치까지 추출(인덱스는 0부터)
//		문자열.substring(m)		→ 문자열 n번째 위치에서 문자열의 끝까지 추출(인덱스는 0부터)

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test106
{
	public static void main(String[] args) throws IOException
	{
		/*
		// 테스트
		String strTemp = "김태민";
		System.out.println(strTemp.length());
		// → 3

		strTemp = "동해물과 백두산이";
		System.out.println(strTemp.length());
		// → 9

		strTemp = "study-hard";
		System.out.println(strTemp.length());
		// → 10

		// ------------------------------------------------------------------------------

		strTemp = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println(strTemp.substring(13, 17));
		// → NOPQ

		// System.out.println(strTemp.substring(13, 57));
		// → 컴파일 에러
		//		StringIndexOutOfBoundsException

		System.out.println(strTemp.substring(13));
		// → NOPQRSTUVWXYZ
		*/
		
		// 내 풀이 ----------------------------------------------------------------------
		
		// 변수 선언
		String code;
		int result=0;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 사용자 입력값
		System.out.print("주민번호입력 (xxxxxx-xxxxxxx) : ");
		code = br.readLine();

		// 결과 출력
		// -- 입력 갯수 초과 또는 미달일 경우
		if (code.length()<14 || code.length()>14)
			System.out.println(">> 입력 오류");

		// "-"를 제외한 숫자값만 추출하여 code에 담아내기
		code = code.substring(0, 6) + code.substring(7);

		// System.out.println(code);

		// System.out.println(result);
		
		// 주민등록번호 유효성 검사 연산
		// ① 마지막 자리를 제외한 앞자리 수를 규칙에 맞게 곱하고 더한다
		for (int i=0; i<(code.length()-1); i++)
		{
			if (i<=7)
				result += Integer.parseInt(code.substring(i, i+1)) * (i+2);
			else
				result += Integer.parseInt(code.substring(i, i+1)) * (i-6);
		}


		/*
		for (int i=1; i<=6; i++)
		{
			if (i<=9)
				result += Integer.parseInt(code.substring(i-1,i)) * i;
		}

		for (int i=8; i<=13; i++)
		{	
			if (i<=11)
				result += Integer.parseInt(code.substring(i-1,i)) * i;
			else
				result += Integer.parseInt(code.substring(i-1,i)) * i;
		}
		*/

		// ② result를 11로 나눈 나머지
		result = result%11;

		// ③ 나눈 값이 10보다 큰 경우 10으로 다시 나누기
		if (result>=10)
			result = result%10;

		// ④ 11에서 result 값을 뺀 결과값을 구한다
		result = 11 - result;

		// System.out.println(result);

		// 결과 출력
		// -- 유효성 검사 결과
		if (result==Integer.parseInt(code.substring(12)))
			System.out.println(">> 정확한 주민번호");
		else
			System.out.println(">> 잘못된 주민번호");

		// System.out.println(Integer.parseInt(code.substring(2, 3))*5);


	}
}