/*===================================================================
							클래스 고급
	- 자바에서 기본적으로 제공하는 주요 클래스들
	- Wrapper 클래스
===================================================================*/

public class Test134
{
	public static void main(String[] args)
	{
		byte b =3;
		int i = 256;
		float f = 1.2f;

		Byte b2 = new Byte(b);
		Integer i2 = new Integer(i);
		Float f2 = new Float(f);

		System.out.println(b2);
		System.out.println(i2);
		// → 3
		//	  256

		print(b2);
		print(i2);
		print(f2);
	}

	// print(Object obj) 말고 b2와 i2를 넘겨 받을 수 있는 방법을 찾아라
	
	/*
	static void print(double x)
	{
		System.out.println(x);
	}
	*/
	
	// java.lang.Number 클래스(추상 클래스)는 모든 숫자형 Wrapper 클래스의 부모 클래스이다.
	// b2, i2 자료형이 Number 에 넘어오면서 업 캐스팅이 일어나게 된다.
	public static void print(Number nb)
	{
		System.out.println(nb);
		
		/*
		if (n.instanceof Integer)
		{
			System.out.println(n.intValue());
		}
		else if (n.instanceof Double)
		{
			...
		}
		*/
	}
	
}
