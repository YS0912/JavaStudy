/*===================================================================
							클래스 고급
	- 중첩 클래스
===================================================================*/

// Outer
class InnerOuterTest
{
	static int a = 10;
	int b = 20;
	
	// Inner
	class InnerNested
	{
		int c =30;

		void write()		// inner의 write() 메소드
		{
			System.out.println("inner의 write()");
			System.out.println("a : " + a);
			System.out.println("b : " + b);
			System.out.println("c : " + c);
		}

	} // end InnerNested


	void write()		 // outer의 write() 메소드
	{
		System.out.println("outer의 write()");

		InnerNested ob1 = new InnerNested();
		ob1.write();	// inner의 wirte() 메소드 호출
	}

} // end InnerOuterTest


// main() 메소드를 포함하고 있는 외부의 다른 클래스
public class Test124
{
	public static void main(String[] args)
	{
		// InnerOuterTest(outer) 클래스 기반 인스턴스 생성
		InnerOuterTest ob2 = new InnerOuterTest();
		ob2.write();	// outer의 write() 메소드 호출
		/* →
			outer의 write()
			inner의 write()
			a : 10
			b : 20
			c : 30
		*/

		// InnerNested(inner) 클래스 기반의 인스턴스 생성
		// InnerNested ob3 = new InnerNested();
		// → 컴파일 에러: error: cannot find symbol

		// InnerOuterTest(outer) 클래스를 통해 InnerNested(inner) 클래스 기반 인스턴스 생성
		// InnerOuterTest.InnerNested ob4 = new InnerOuterTest.InnerNested();
		// InnerNested() 클래스가 static이 아니기 때문에 ★Test122★와 같은 방법으로 처리 불가

		// 중첩 내부 클래스(static 중첩 클래스)와는 달리,
		// 외부 클래스의 인스턴스(객체)를 사용하지 않고 단독으로 내부 클래스의 인스턴스를 생성 불가
		//	▶ 외부 클래스의 객체를 사용하면 내부 클래스의 객체를 생성하는 것이 가능하다.

		InnerOuterTest.InnerNested ob5 = ob2.new InnerNested();
		ob5.write();
		/* →
			inner의 write()
			a : 10
			b : 20
			c : 30
		*/

		InnerOuterTest.InnerNested ob6 = new InnerOuterTest().new InnerNested();
		ob6.write();
		/* →
			inner의 write()
			a : 10
			b : 20
			c : 30
		*/


	}
}

// outer클래스명.inner클래스명 참조변수명 = new outer생성자().new inner생성자();

// cf) static → 중첩 내부 클래스
// outer클래스명.inner클래스명 참조변수명 = new outer클래스명.inner생성자();