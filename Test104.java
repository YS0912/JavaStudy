/*=============================================================================
								Ŭ������ �ν��Ͻ�
	- �޼ҵ� �ߺ� ����(Method Overloading)�� ������ ���¿� �Ұ����� ����
=============================================================================*/

public class Test104
{
	public static void main(String[] args)
	{
		print('A');

		print(3.14);

		double result = print(3.14);
	}

	public static void print() {}
	// public static void print() {}			   �� ���� ������ �޼ҵ尡 �־ �Ұ�
	public static void print(int i) {}
	// public static void print(int j) {}		   �� �Ű������� ������ �ڷ����� ���Ƽ� �Ұ�
	public static void print(char c) {}			// �� ������ ����!! ���ڵ�����ȯ ��Ģ ���
	public static void print(int i, int j) {}
	public static void print(double d) {}		// �� ������ ����!! ���ڵ�����ȯ ��Ģ ���
	
	//public static void print(double e) {return 10.0}		// �� void�ε�...
	public static double print(double e) {return 10.0}		// return �ڷ����� �����ε��� ���� X �� �ںҰ���
}