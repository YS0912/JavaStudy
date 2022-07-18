/*=============================================================================
								클래스와 인스턴스
	- 메소드 중복 정의(Method Overloading)이 가능한 형태와 불가능한 형태
=============================================================================*/

public class Test104
{
	public static void main(String[] args)
	{
		print('A');

		print(3.14);

		double result = print(3.14);
	}

	public static void print() {}
	// public static void print() {}			   → 위에 동일한 메소드가 있어서 불가
	public static void print(int i) {}
	// public static void print(int j) {}		   → 매개변수의 갯수와 자료형이 같아서 불가
	public static void print(char c) {}			// → 되지만 주의!! ★자동형변환 규칙 有★
	public static void print(int i, int j) {}
	public static void print(double d) {}		// → 되지만 주의!! ★자동형변환 규칙 有★
	
	//public static void print(double e) {return 10.0}		// → void인디...
	public static double print(double e) {return 10.0}		// return 자료형은 오버로딩에 영향 X → ★불가★
}