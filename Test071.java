/*=========================================================
					Ŭ������ �ν��Ͻ�
		CircleTest.java �� ��Ʈ
=========================================================*/

import java.io.IOException;

public class Test071
{
	public static void main(String[] args) throws IOException
	{	
		// �� Ǯ�� ----------------------------------------------------------------------

		/*
		// CircleTest ����� �ν��Ͻ� ����
		CircleTest ob = new CircleTest();

		// ������ �ν��Ͻ��� �Է� �޼ҵ� ȣ��
		ob.input();

		// ������ �ν��Ͻ��� ���� ���� �޼ҵ� ȣ��
		double area = ob.calArea();

		// ������ �ν��Ͻ��� �ѷ� ���� �޼ҵ� ȣ��
		double length = ob.calLength();

		// ������ �ν��Ͻ��� ��� ��� �޼ҵ� ȣ��
		ob.print(area, length);
		*/

		// ������ Ǯ�� ------------------------------------------------------------------

		// CircleTest Ŭ���� ��� �ν��Ͻ� ����
		// CircleTest �ν��Ͻ� ����
		// CircleTest ��ü ����
		CircleTest ob = new CircleTest();

		ob.input();
		// �� ������ ����
		//	  CircleTest���� input �޼ҵ� �ٱ����� ���� ���ɼ��� �ִ� ������ ��������,
		//	  main�� ������� ���߱� ������ �� �� �� ���� ��� �Ѵ�.

		double num1 = ob.calArea();
		double num2 = ob.calLength();
		
		ob.print(num1, num2);
	}
}