/*=========================================================
					메소드의 재귀 호출
=========================================================*/

public class InfRecul
{
	public static void main(String[] args)
	{
		showHi(3);
	}

	// 코드 내에서 2군데 위치만 바꾸면 작동 
	
	/*
	public static void showHi(int cnt)
	{
		System.out.println("Hi-");
		showHi(cnt--);							// showHi(3);
		if(cnt==1)
			return;

		
		System.out.println("Hi-");				// 2
		showHi(--cnt);							// showHi(2);
		if(cnt==1)
			return;

		System.out.println("Hi-");				// 1
		showHi(--cnt);							// showHi(1);
		if(cnt==1)
			return;

		System.out.println("Hi-");				// 0
		showHi(--cnt);							// showHi(0);
		if(cnt==1)								// → 이 부분을 확인할 일이 없음
			return;

		
		System.out.println("Hi-");	
		if(cnt==1)								// 먼저 1 여부를 확인해야 함
			return;			
		showHi(--cnt);							
		
	}
	*/
	

	
	public static void showHi(int cnt)
	{
		System.out.println("Hi-");
		if(cnt==1)
			return;
		showHi(--cnt);
	}
}