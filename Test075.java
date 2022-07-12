/*=========================================================
					Ŭ������ �ν��Ͻ�
	- ������(Constructor)
=========================================================*/

class NumberTest2
{
	int num;
	
	// ����Ʈ(default) ������
	
	/*
	NumberTest2()
	{
		// null
	}
	
	�� ����� ���� �����ڰ� ���ǵǾ� �����Ƿ� default �����ڰ� �ڵ����� ���Ե��� �ʴ´�.

	*/
	
	// ������ �� ����� ���� ������
	NumberTest2(int n)
	{
		num = n;
		System.out.println("������ ȣ�� �� �Ű����� ���� : " + n);
	}

	int getNum()
	{
		return num;
	}
}

public class Test075
{
	public static void main(String[] args)
	{
		// NumberTest2 �ν��Ͻ� ����
		// NumberTest2 ob1 = new NumberTest2();
		// �� ������ ����
		//	  ����� ���� �����ڰ� �Ű������� ���� �����̱� ������
		//	  ���� ���� �Ű����� ���� �����ڸ� ȣ���ϴ� ������ ������ ������ �߻���Ų��.

		NumberTest2 ob1 = new NumberTest2(10);
		// �� ������ ȣ�� �� �Ű����� ���� : 10

		System.out.println("�޼ҵ� ��ȯ �� : " + ob1.getNum());
		// �� �޼ҵ� ��ȯ �� : 10
		System.out.println("ob1.num : " + ob1.num);
		// �� ob1.num : 10


		NumberTest2 ob2 = new NumberTest2(3654);
		// �� ������ ȣ�� �� �Ű����� ���� : 3654

		System.out.println("�޼ҵ� ��ȯ �� : " + ob2.getNum());
		System.out.println("ob2.num : " + ob2.num);
		/*
			�޼ҵ� ��ȯ �� : 3654
			ob2.num : 3654
		*/
	}
}