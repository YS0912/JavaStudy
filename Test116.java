/*===================================================================
							클래스 고급
	- 상속 관계에 있는 클래스들 간의 캐스팅
	  (업 캐스팅, 다운 캐스팅)
===================================================================*/

// super class, 부모 클래스, 상위 클래스
class SuperTest116
{
	public int a=10, b=20;

	public void write()
	{
		System.out.println("슈퍼 클래스 write() 메소드");
	}

	public int hap()
	{
		return a + b;
	}
}

// sub class, 자식 클래스, 하위 클래스
class SubTest116 extends SuperTest116
{
	public int b=100, c=200;

	@Override
	public int hap()
	{
		return a + b + c;
	}

	public void print()
	{
		System.out.println("서브 클래스 print() 메소드");
	}
}

// main() 메소드를 포함하는 외부의 다른 클래스
public class Test116
{
	public static void main(String[] args)
	{	
		// sub class(하위 클래스) 기반 인스턴스 생성
		SubTest116 ob1 = new SubTest116();

		System.out.println("ob1.b : " + ob1.b);
		// → ob1.b : 100

		// ▼ 업 캐스팅
		// SuperTest116 ob2;	→ 가능
		SuperTest116 ob2 = ob1;
		// -- 『SuperTest116 ob2 = (SuperTest116)ob1;』과 동일한 코드
		//		▶ 부모 클래스와 같은 기능
		
		/*
			학생 소연이 = new 학생();

			포유류 사람 = 소연이;		// ▶ 포유류 사람 = (사람)소연이

			★ 학생도 포유류

			class 포유류			class 학생 extends 포유류
			{						{
			}						}

			비교)

			byte a = 10;

			int b = a;					// ▶ int b = (int)a;
		*/
		

		System.out.println("ob2.b : " + ob2.b);
		// → ob2.b : 20
		// -- 변수는 객체별로 따로 할당되기 때문에 변수 b는 ob2의 변수이다.

		System.out.println("합    : " + ob2.hap());
		// → 합    : 310
		// -- hap() 메소드는 오버라이딩(Overriding) 되어 있고
		//	  ob2 는 ob1 을 업캐스팅한 상태의 객체이므로
		//	  『SuperTest116』의 hap() 메소드를 호출하는 것이 아니라,
		//	  『SubTest116』에서 재정의한 hap() 메소드를 호출하게 된다.
		//	  즉, 메소드는 업캐스팅이 되더라도 재정의(덮어쓰기)한 이상 원래의 기능으로 돌릴 수 X

		ob2.write();
		// → 슈퍼 클래스 write() 메소드

		// ob2.print();
		// → 컴파일 에러: error: cannot find symbol
		//		▶ ob2는 부모 클래스의 기능을 하기 때문에 자식 클래스의 메소드를 가져올 수 X
		
		// ▼ 다운 클래스
		((SubTest116)ob2).print();
		// → 서브 클래스 print() 메소드
		//		▶ ob2는 자식 클래스 기반의 인스턴스를 생성한 ob1을 부모 클래스로 업 클래스한 것이므로
		//		   자식 클래스로의 다운 클래스 역시 가능하다.


		// 추가 관찰 -----------------------------------------------------------------------------------

		SuperTest116 ob3 = new SuperTest116();
		SubTest116 ob4;

		// System.out.println(ob3.c);
		// → 컴파일 에러: error: cannot find symbol
		// -- 상위 객체는 하위 객체의 멤버에 접근하는 것이 불가능
		//    (상위 객체 입장에서는 어떤 하위 객체가 존재하는지도 알 수 없음)\
		
		// ob4 = ob3;
		// → 컴파일 에러: error: incompatible types: SuperTest116 cannot be converted to SubTest116
		//		▶ SubTest116은 아직 ob4 라는 이름으로 인스턴스 생성이 되지 않았음
		//		   위에서는 자식 클래스 기반의 인스턴스가 생성이 되면서 부모 클래스도 호출이 된 상태지만,
		//		   여기서는 부모 클래스 기반의 인스턴스가 생성이 되었기 때문에 자식 클래스가 오리무중이 된다.

		ob4 = (SubTest116)ob3;
		// → 런타임 에러: ClassCastException: SuperTest116 cannot be cast to SubTest116
		//		▶ 작성된 구문의 문법적인 구조만 봤을 때, 다운 캐스팅이 이루어지는 상황
		//		   하지만 정상적인 캐스팅이 이루어지지 X
		//		   현재 SubTest116 객체에 대해 메모리 할당이 이루어지지 않은 상태이기 때문에 다운 캐스팅 불가
	}
}

/*
○ 업 캐스팅, 다운 캐스팅이 정상적으로 이루어지는 경우 --------------------------------------------------

	1. 하위 객체 생성;
	2. 상위 = 하위;			▶ 업 캐스팅, 가능
	3. 하위 = 상위;			▶ 에러 발생
	4. 하위 = (하위)상위;	▶ 다운 캐스팅, 가능

	★ 생성된 객체가 하위 객체 ★

○ 다운 캐스팅이 정상적으로 이루어지지 않는 경우 --------------------------------------------------------

	1. 상위 객체 생성;
	2. 하위 = 상위;			▶ 에러 발생
	3. 하위 = (하위)상위;	▶ 다운 캐스팅, 런타임 에러 발생

★ 업 캐스팅은 항상 가능, 다운 캐스팅은 경우에 따라 가능

*/