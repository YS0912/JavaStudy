/*=========================================================
					�޼ҵ��� ��� ȣ��
=========================================================*/

public class InfRecul
{
	public static void main(String[] args)
	{
		showHi(3);
	}

	// �ڵ� ������ 2���� ��ġ�� �ٲٸ� �۵� 
	
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
		if(cnt==1)								// �� �� �κ��� Ȯ���� ���� ����
			return;

		
		System.out.println("Hi-");	
		if(cnt==1)								// ���� 1 ���θ� Ȯ���ؾ� ��
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