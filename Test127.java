/*===================================================================
							클래스 고급
	- 자바에서 기본적으로 제공하는 주요 클래스들
	- Test126.java 와 세트
===================================================================*/

// import java.lang.*;
// (import java.lang.Object;)

public class Test127 // extends Object
{
	/*
	Object의 멤버들
	
	ex)
	public String toString()
	{
	}
	*/

	@Override
	public String toString()
	{
		return "재정의한 toString()";
	}
	

	public static void main(String[] args)
	{
		Test127 ob = new Test127();

		System.out.println(ob.toString());
		// → 재정의한 toString()

		System.out.println(ob);
		// → 재정의한 toString()
		
	}
}