/*===================================================================
							클래스 고급
	- 중첩 클래스
===================================================================*/

// outer
class Test2
{
	static int a = 10;
	int b = 20;

	void write()
	{
		System.out.println("write()...①");
		final int c = 20;
		int d = 40;
		
		// inner
		// 메소드 안에 존재하는 또다른 클래스(로컬 클래스, 지역 클래스)
		class LocalTest
		{
			void write()
			{
				System.out.println("write()...②");
				System.out.println("a : " + a);
				System.out.println("b : " + b);
				System.out.println("c : " + c);
				// System.out.println("d : " + d);
			}
		}

		// 변수  c와 변수 d는 둘 다 지역변수지만,
		// (첫 번재 write() 메소드 안에서 선언된 변수이기 때문에)
		// c는 final 변수이기 때문에 두 번째 write() 메소드에서 언제 접근하더라도 고정된 값
		// 두 번째 write() 메소드에서 언제 접근하더라도 고정된 값 20을 보장받을 수 있다.
		// 반면에  d는 그 값이 수시로 변할 수 있는 상황이므로
		// LocalTest 클래스의 인스턴스 생성 시점이 언제인지 알 수 없기 때문에
		// 이로 인해 인스턴스 생성 시점에 d에 어떤 값이 담겨있는지 보장 받을 수 없기 때문에
		// 변수 d 에 접근하는 것을 피할 수 있도록 문법적으로 처리.

		// d += 10;

		d += 10;

		d += 20;

		LocalTest lt = new LocalTest();
		lt.write();										// → 두 번째 write() 메소드

		d += 30;

		d += 40;

		
	}
}


// main() 메소드를 포함하고 있는 외부의 다른 클래스
public class Test123
{
	public static void main(String[] args)
	{
		// Test2(outer) 기반의 인스턴스 생성
		Test2 ob = new Test2();
		ob.write();										// → 첫 번째 write() 메소드

		// → 컴파일 에러:  error: local variables referenced from an inner class must be final or effectively final (d)
		// d = 10; 을 주석 처리한 후 →
		// write()...①
		// write()...②
		// a : 10
		// b : 20
		// c : 20
		// d : 40

		
	}
}

// 최종 결과

/*
	write()...①
	write()...②
	a : 10
	b : 20
	c : 20
	계속하려면 아무 키나 누르십시오 . . .
*/