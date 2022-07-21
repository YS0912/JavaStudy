/*===================================================================
							클래스 고급
	- 중첩 클래스
===================================================================*/

/*
○ Annonymous 클래스(익명의 클래스 : 무명 클래스)

	- AWT 나 안드로이드 이벤트 처리에서 일반적으로 사용
	- 상위 클래스 메소드를 하나 정도 재정의할 필요성이 있을 때 사용
	- 클래스의 객체가 필요하면 또 다시 클래스를 생성해야 하는 번거로움으로 인해
	  빈번하게 객체 생성이 필요한 경우 익명의 클래스를 생성하여 처리 가능

○ 형식 및 구조

	new 상위클래스의 생성자()
	{
		접근제어지시자 자료형 메소드()
		{
			내용
		}
	};
	▲ 세미콜론 필수
*/

// import java.lang.*;		∋ String, System, etc

class Test3 // extends Object
{
	/*
	Object의 멤버 변수 및 메소드
	
	Ex)
	public String toString()
	{
	}
	*/

	public Object getString()
	{
		/*
		Object ob = new Object();
		ob.xxx();
		ob.xxxx();

		return ob;
		*/

		// return new Object();
		//			 ---------- Object 형

		// return new Object(){ 특정 메소드 재구성 };

		return new Object()
		{
			// 특정 메소드 재구성
			@Override
			public String toString()
			{
				return "익명의 클래스";
			}
		};
	}
}

public class Test125 // extends Object (다중 상속이 되지 않도록 최상위 클래스에 붙는다)
{
	public static void main(String[] args)
	{
		Test3 ob1 = new Test3();

		System.out.println(ob1.toString());
		// → Test3@15db9742
		
		System.out.println(ob1.getString());
		// → 익명의 클래스

	}
}