/*=====================================
	■■■ 자바 기본 프로그래밍 ■■■
	변수와 자료형
	키워드 및 식별자
=====================================*/

public class Test004
{
	public static void main(String[] args)
	{
		double height = 172.8;
		int age = 25;
		char degree = 'A';

		String name = "고연수";			// class에 해당 (문자열이 많아 Java 제공)
		//String name = "어쩌구";	(X)
		// -- 스코프 영역 안에서 변수명은 식별자 (하나만 선언 가능)

		// String #name = "저쩌구";	(X)
		// -- 『$』 와 『_』 만 사용 가능

		// int tel = 01012345678	(X)
		// -- 가장 앞에 0의 가능성이 있는 데이터는 문자열로 처리
		String _tel = "01012345678";	

		String 주소 = "경기도 남양주시";
		// -- 문법적으로는 맞지만 실무적으로는 한글 변수명 사용 X

		// 결과 출력
		System.out.println("name : " + name);
		System.out.println("_tel : " + _tel);
		System.out.println("주소 : " + 주소);

		// 실행 결과
		/*
			name : 고연수
			_tel : 01012345678
			주소 : 경기도 남양주시
		*/
	}
}