/*===================================================================
							클래스 고급
	- 자바에서 기본적으로 제공하는 주요 클래스들
	- Wrapper 클래스
===================================================================*/

import java.math.BigInteger;

public class Test132
{
	public static void main(String[] args)
	{
		// int a1 = 123456789123456789;
		// System.out.println(a1);
		// ▶ 불가
		
		// long b1 = 123456789123456789;
		// System.out.println(b1);
		// ▶ 불가

		// long c1 = 123456789123456789L;		-- 원래 정수 int에 담아서 저장하지만 이번에는 L에 해줘
		// System.out.println(c1);
		// ▶ 가능

		// long d1 = 123456789123456789123456789L;
		// System.out.println(d1);
		// ▶ 불가

		BigInteger a = new BigInteger("123456789123456789");
		BigInteger b = new BigInteger("123456789123456789");

		//BigInteger c = a + b;
		// System.out.println(c);

		// 더하기
		BigInteger c = a.add(b);
		System.out.println("덧셈 결과 : " + c);
		// → 덧셈 결과 : 246913578246913578

		// 빼기
		BigInteger d = a.subtract(b);
		System.out.println("뺄셈 결과 : " + d);
		// → 뺄셈 결과 : 0

		// 곱하기
		BigInteger e = a.multiply(b);
		System.out.println("곱셈 결과 : " + e);
		// → 곱셈 결과 : 15241578780673678515622620750190521

		// 나누기
		BigInteger f = a.divide(b);
		System.out.println("나눗셈 결과 : " + f);
		// → 나눗셈 결과 : 1

		// 지수승
		BigInteger g = new BigInteger("2");
		System.out.println("2의 3승 : " + g.pow(3));
		// → 2의 3승 : 8
	}
}