/*===================================================================
							클래스 고급
	- 인터페이스(Interface)
===================================================================*/

/*
○ 인터페이스(Interface)란

	완전히 미완성된 채로 남겨져 인터페이스 안에 존재하는 그 어떤 메소드도
	몸체(정의부)가 없기 때문에 사실상 실행 부분이 존재하지 않는다.
	클래스를 위한 ★템플릿★으로써의 기능을 수행하는 추상 클래스의 한 종류이다.

	인터페이스는 클래스와 달리 다중 상속이 가능하며, 인터페이스 자체도 상속된다.
	기존의 C++ 언어 등에서 지원되는 다중 상속이 사용 과정에서 많은 문제점을 노출시켰기 때문에
	자바에서는 다중 상속의 개념을 인터페이스라는 개념으로 변형하여
	인터페이스를 통해 다중 상속을 구현하는 방법을 지원한다.

	인터페이스는 상수와 추상 메소드만 가질 수 있으며,
	인터페이스 안의 메소드들은 접근제어지시자를 명시하지 않아도 『public』으로 설정되어
	클래스에서 구현(implements)함으로써 바로 접근이 이루어질 수 있다.

○ 특징
	
	- 추상 클래스의 일종으로 선언만 있고 정의가 없다.
	- final 변수는 가질 수 있다. (상수의 개념)
	- 인터페이스는 『public static final』상수만 만들 수 있다.
	- 인터페이스를 구현하기 위해서는 『extends』 대신에 『implements』를 이용한다.
	- 하나 이상의 인터페이스를 implements 할 수 있다.
	- 인터페이스를 implements한 클래스는 인터페이스의 모든 메소드를 Overriding 해야 한다.
	- 인터페이스가 다른 인터페이스를 상속받을 수 있으며, 이때 『extends』 키워드를 사용한다.
	  또한 클래스와 달리 인터페이스는 다중 상속이 가능하다.
*/


interface Demo
{
	public static final double PI = 3.141592;
	
	// 인터페이스의 멤버 변수는 『static final』을 별도로 명시하지 않아도
	// 자동으로 『static final』이 된다.
	public int a = 10;

	// 인터페이스의 메소드는 선언만 가능 (정의 불가)
	// 별도로 명시하지 않아도 자동으로 『abstract』
	public void print();
	/*
	{
		System.out.println("PI : " + PI)
	}
	*/
}

// class DemoImp1 extends Demo				▶ 불가능
// class DemoImp1 implements Demo			▶ 불가능

// 추상 클래스 - 인터페이스를 구현하는 추상 클래스
//abstract class DemoImp1 implements Demo

// 클래스 - 인터페이스를 구현하는 클래스 (print() 메소드 재정의)
class DemoImp1 implements Demo
{
	@Override
	public void print()
	{
		System.out.println("인터페이스 메소드 재정의");
	}

	public void write()
	{
		System.out.println("클래스에 정의된 메소드");
	}
}

// main() 메소드를 포함하는 외부의 다른 클래스
public class Test117
{
	public static void main(String[] args)
	{
		// Demo ob = new Demo();		▶ 불가능: 인터페이스는 인스턴스를 생성할 수 없음

		// DemoImp1 ob = new DemoImp1();
		// -- 인터페이스를 implements만 한 상태에서는 불가
		//	  print() 메소드를 재정의한 후 abstract를 떼어낸 후 가능
		
		// DemoImp1 obTemp = new DemoImp1();
		// Demo ob = (Demo)obTemp;
		// Demo ob = obTemp;
		
		// ▼ 업 캐스팅
		Demo ob = new DemoImp1();
		ob.print();
		// → 인터페이스 메소드 재정의

		// ob.write();
		// → 컴파일 에러: error: cannot find symbol

		// ▼ 다운 캐스팅
		((DemoImp1)ob).write();
		// → 클래스에 정의된 메소드

		System.out.println(Demo.PI);		// ▶ 가능: static 이기 때문에

		System.out.println(Demo.a);			// ▶ 가능: static 이기 때문에

		Demo.a = 30;						// ▶ 불가: final 이기 때문에 재정의 X
		// → 컴파일 에러: error: cannot assign a value to final variable a
	}
}