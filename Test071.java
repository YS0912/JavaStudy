/*=========================================================
					Ŭ������ �ν��Ͻ�
		CircleTest.java �� ��Ʈ
=========================================================*/

import java.io.IOException;

public class Test071
{
	public static void main(String[] args) throws IOException
	{
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
	}
}