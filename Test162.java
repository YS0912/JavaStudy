/*===================================================================
							컬렉션(Collection)
===================================================================*/

// 자료구조 객체 선언 및 생성 시, 사용자 정의 클래스 활용
// → 자료형

import java.util.Vector;

// 클래스 → 사용자 정의 자료형으로 활용
class MyData
{
	// 주요 속성 구성 ▷ 주요 변수 선언(멤버 변수)
	private String name;
	private int age;

	// getXxx() ▷ getter
	// setXxx()	▷ setter

	// getter / setter 구성
	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}


	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}


	// 생성자(매개변수 2개인 생성자) → 사용자 정의 생성자
	public MyData(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	// ★ 사용자 정의 생성자가 구성될 경우 default 생성자가 자동으로 삽입되지 않기 때문에
	//	  default 생성자 형태의 생성자를 사용자 정의 생성자로 추가 구성하게 되는 것이
	//	  일반적인 클래스 설계 과정
	//	  (반드시 설계해야 한다는 문법적인 규칙은 없음)

	// 생성자(매개변수 없는 생성자) → 사용자 정의 생성자
	public MyData()
	{
		// this("", 0);
		name = "";
		age = 0;
	}


}

public class Test162
{
	public static void main(String[] args)
	{
		// 벡터 자료구조 생성: MyData 객체를 담아서 사용하는 벡터 자료구조
		Vector<MyData> v = new Vector<MyData>();

		// 벡터 자료구조 v에 
		// 정영준 13세 / 정미경 7세 / 한은영 3세
		// 담아내기
		
		/* ①
		MyData st1 = new MyData();
		st1.setName("정영준");
		st1.setAge(13);
		v.add(st1);

		MyData st2 = new MyData();
		st2.setName("정미경");
		st2.setAge(7);
		v.add(st2);

		MyData st3 = new MyData();
		st3.setName("한은영");
		st3.setAge(3);
		v.add(st3);
		*/


		/* ②
		MyData st1 = new MyData("정영준", 13);
		v.add(st1);

		MyData st2 = new MyData("정미경", 7);
		v.add(st2);

		MyData st3 = new MyData("한은영", 3);
		v.add(st3);
		*/


		// ③
		v.add(new MyData("정영준", 13));
		v.add(new MyData("정미경", 7));
		v.add(new MyData("한은영", 3));
	}
}