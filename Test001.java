//클래스 이름 <Test001>
// 자바 프로그램의 클래스 이름 첫 글자는 <대문자>로 시작

// 당분간 실습 중에는 자바 프로그램 시작할 때 클래스(class)와 main() 메소드를 기본적으로 작성
// 소스코드 저장 시 클래스 이름과 동일한 파일 이름으로 저장
// 확장자는 <.java>

public class Test001
{

	/*	main() 이라는 이름을 가진 함수(메소드)
	자바 인터프리터가 처음 찾는 메소드. 실행 후 종료*/

	public static void main(String[] args)
	{
		// 한동안 코딩할 영역

		System.out.println("Welcome to Java");
		System.out.println("First Java Program");
	}
}

/*
실행결과
Welcome to Java
First Java Program
계속하려면 아무 키나 누르십시오 . . .
*/

// 단일행 주석문(Comment) 라인 단위 주석문

/*
다중행
주석문
블럭 단위 주석문
*/

//==================================================================================

// 이름() → 함수(메소드)

/*
이름() → 함수(메소드) 정의
	{
	}
*/

/* 이름(); → 함수(메소드) 호출

//자바에서의 함수는 독립적으로 존재할 수 없고 클래스에 정의되는 형태로 만들어야 함

// System.out.println("Welcome to Java");
// → println();

/*
System 이라는 도구상자 안의
out 도구상자 안의
println() 이라는 도구 즉, 메소드
	→ System 클래스의 out 객체의 println() 메소드
*/