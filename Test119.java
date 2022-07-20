/*===================================================================
							클래스 고급
	- 인터페이스(Interface)
===================================================================*/

// 인터페이스
interface Demo
{
	public void write();
	public void print();
}

// 인터페이스를 구현하는 추상 클래스
abstract class DemoImpl implements Demo
{
	@Override
	public void write()
	{
		System.out.println("write() 메소드 재정의");
	}

	// public abstract void print();		← 이게 아직 재정의 X
}

// 추상 클래스를 상속받는 추상 클래스
// abstract class DemoImplSub extends DemoImpl
//				▼
// 추상 클래스를 상속받는 클래스
class DemoImplSub extends DemoImpl
{
	public void test()
	{
		System.out.println("test");
	}

	@Override
	public void print()
	{
		System.out.println("print() 메소드 재정의");
	}
}

public class Test119
{
	public static void main(String[] args)
	{
		// Demo ob1 = new Demo();		▶ 불가능: 인터페이스 인스턴스 생성 X
		
		// DemoImpl ob2 = new DemoImpl();
		// → 인스턴스 생성 불가: 추상 클래스

		DemoImplSub ob3 = new DemoImplSub();

		ob3.write();
		ob3.print();
		// → write() 메소드 재정의
		//	  print() 메소드 재정의
	}
}

// 최종 결과

/*
	write() 메소드 재정의
	print() 메소드 재정의
	계속하려면 아무 키나 누르십시오 . . .
*/