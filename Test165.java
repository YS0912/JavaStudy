/*===================================================================
							컬렉션(Collection)
===================================================================*/

// List → Vector, ArrayList, LinkedList, etc
//	- 순서 有
//	- 배열과 유사
//	- 중복 허용

/*
○ ArrayList 클래스

	- ArrayList와 Vector 클래스는 List를 크기 변경이 가능한 배열로 구현한 것으로,
	  차이점은 Vector 클래스의 객체는 기본적으로 동기화 되지만,
	  ArrayList는 그렇지 않다는 점이다.

	- 비동기화 컬렉션은 동기화된 컬렉션보다 더 나은 성능을 제공하며
	  스레드들이 컬렉션을 공유하지 않은 프로그램에서는
	  일반적으로 ArrayList를 Vector보다 더 선호하며,
	  ArrayList는 동기화를 고려하지 않은 Vector처럼 동작함으로써
	  스레드 동기화에 따르는 부담을 가지지 않기 때문에 Vector보다 더 빠르게 실행된다.

	- null을 포함한 모든 요소를 허용하며
	  List 인터페이스를 구현하는 것 외에 리스트에 격납하기 위해
	  내부적으로 사용되는 배열의 사이즈를 조작하는 메소드를 제공한다.
*/

import java.util.ArrayList;
import java.util.Vector;
import java.util.List;
import java.util.ListIterator;

public class Test165
{
	public static void main(String[] args)
	{
		// ArrayList 자료구조 인스턴스 생성
		// ArrayList<String> list = new ArrayList<String>();
		// Vector<String> list = new Vector<String>();
		// List<String> list = new Vector<String>;				// 업캐스팅
		List<String> list1 = new ArrayList<String>();			// 업캐스팅

		// list1 자료구조에 요소 추가 → add()
		list1.add("범죄도시2");
		list1.add("탑건2");
		list1.add("마녀2");

		List<String> list2 = new ArrayList<String>(list1);

		// list2에 요소 추가 → add()
		list2.add("인셉션");

		List<String> list3 = new ArrayList<String>();

		// list3에 list2의 전체 요소 추가 → addAll()
		list3.addAll(list2);

		// "탑건2" 앞에 "레미제라블" 추가
		// → [범죄도시2, 레미제라블, 탑건2, 마녀2, 인셉션]
		// list3.add(list3.indexOf("탑건2"), "레미제라블");
		
		// 선생님 풀이 ------------------------------------------------------------------
		// ① "탑건2" 찾기 ▷ indexOf(): 위치 인덱스 반환
		int n = list3.indexOf("탑건2");

		// ② "탑건2" 인덱스 위치에 "레미제라블" 삽입 ▷ add()
		list3.add(n, "레미제라블");

		// 출력 → 더미데이터 확인
		System.out.println("============================================");
		System.out.println(list1);
		// → [범죄도시2, 탑건2, 마녀2]
		System.out.println(list2);
		// → [범죄도시2, 탑건2, 마녀2, 인셉션]
		System.out.println(list3);
		// → []
		// → [범죄도시2, 탑건2, 마녀2, 인셉션]
		// → [범죄도시2, 레미제라블, 탑건2, 마녀2, 인셉션]
		System.out.println("============================================");
		System.out.println();

		// 출력 → listIterator() 메소드를 활용하여 출력
		ListIterator<String> li = list3.listIterator();

		while (li.hasNext())
		{
			System.out.print(li.next() + " ");
		}
		System.out.println();
		// → 범죄도시2 레미제라블 탑건2 마녀2 인셉션


		// 출력 → 역순으로 접근
		while (li.hasPrevious())		// 리딩 포인터? 가 앞으로 이동 (앞에도 똑같은 레일 있음)
		{
			System.out.print(li.previous() + " ");
		}
		System.out.println();
		// → 인셉션 마녀2 탑건2 레미제라블 범죄도시2
	}
}