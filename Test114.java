/*===================================================================
							클래스 고급
	- 상속(Inheritance)
===================================================================*/

/*
○ 메소드 오버라이딩(Method Overriding)의 특장
	- 메소드 이름, 리턴타입, 파라미터 수나 타입이 완전히 일치해야 함
	- 반드시 상속 관계가 있어야 한다.
	- 재정의된 하위 클래스의 메소드 접근제어지시자는
	  상위클래스의 메소드 접근제어지시자보다 범위가 크거나 같아야 한다.
	  예를 들어, 상위 클래스 메소드의 접근제어지시자가 『protected』인 경우
	  하위 클래스가 이 메소드를 오버라이딩(Overriding)한다면
	  접근제어지시자는 『public』 또는 『protected』여야 한다.
	- 『static』 『final』 『private』 메소드는 오버라이딩(Overriding)할 수 없다.
	- Exceptional의 추가가 불가능하다.
	  즉, 상위 메소드가 가지고 있는 예외 사항 외의 새로운 Exceptional을 추가하는 것을 불가능
*/

// 부모 클래스
class SuperTest114
{
	private int a = 5;
	protected int b = 10;
	public int c = 20;
	
	public void write()
	{
		System.out.println("Super write() 메소드 : " + a + " : " + b + " : " + c);
	}
}

// 자식 클래스(하위 클래스, sub class)
class SubTest114 extends SuperTest114
{
	protected int b = 100;

	public void print()
	{
		// System.out.println("Sub print() 메소드 : " + a + " : " + b + " : " + c);
		// → 컴파일 에러: 슈퍼클래스에서 선언된 변수 a에 접근할 수 X

		System.out.println("Sub print() 메소드 : " + b + " : " + c);

		System.out.println("Sub print() 메소드 : " + b);
		System.out.println("Sub print() 메소드 : " + this.b);	// SubTest114.b
		System.out.println("Sub print() 메소드 : " + super.b);	// SuperTest114.b
		// → Sub print() 메소드 : 100
		//	  Sub print() 메소드 : 100
		//	  Sub print() 메소드 : 10
		// -- 변수b는 접근 방법에 따라 다른 b로 접근 및 출력이 이루어진다.
		//	  슈퍼클래스에서 선언된 b, 서브클래스에서 선언된 b

		System.out.println("Sub print() 메소드 : " + c);
		System.out.println("Sub print() 메소드 : " + this.c);
		System.out.println("Sub print() 메소드 : " + super.c);
		// → Sub print() 메소드 : 20
		//	  Sub print() 메소드 : 20
		//	  Sub print() 메소드 : 20
		// -- 변수 c는 접근하는데 아무런 제약과 제한이 없다.
		//	  슈퍼클래스에서 선언된 c
	
	} // end print

	@Override
	public void write()
	{
		System.out.println("Sub print() 메소드 : " + b + " : " + c);
	}
}


// main() 메소드를 포함하는 외부의 다른 클래스
public class Test114
{
	public static void main(String[] args)
	{
		// 하위 클래스(SubTest114) 인스턴스 생성
		SubTest114 ob = new SubTest114();

		ob.print();
		// → Sub print() 메소드 : 100 : 20
		//		변수는 메소드처럼 덮어쓰기를 통해 처리가 되지 않는다.
		//		메소드는 부모자식이 같은 공간에 저장이 되지만,
		//		변수는 서로 다른 공간에 저장되기 때문에 별개로 취급해야 하기 때문.
		//		즉, 부모 클래스에서 정의한 변수라고 해도 자식 클래스에서 동일하게 정의할 수 있다.
		//		자식 클래스에서 지정 없이 변수를 호출할 때는 자식 클래스 변수가 호출되고,
		//		super.변수명 으로 호출하면 부모 클래스 변수가 호출된다.

		ob.write();
		// → Super write() 메소드 : 5 : 10 : 20
		// 재정의 후
		// → 컴파일 에러: 슈퍼클래스에서 선언된 변수 a에 접근할 수 X
		// 수정 후
		// → Sub print() 메소드 : 100 : 20 

		System.out.println("------------------------------------ 구분선");

		System.out.println(ob.b);
		// → 100

		System.out.println( ((SuperTest114)ob).b);
		// → 10
		// ▶ 슈퍼 부름

		((SuperTest114)ob).write();
		// → Sub print() 메소드 : 100 : 20
		//		이미 메소드는 재정의를 통해 덮어쓰기 했기 때문에 슈퍼 부름을 해도
		//		기존의 형태를 불러올 수 없다.
	}
}