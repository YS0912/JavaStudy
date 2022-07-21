/*===================================================================
							Ŭ���� ���
	- �������̽�(Interface)
===================================================================*/

// �� �ǽ� ����
//	  ���� ó�� ���α׷��� �����Ѵ�.
//	  ��, �������̽��� Ȱ���� �� �ֵ��� �Ѵ�.

// ���� ��)
// �ο� �� �Է�(1~10) : 11
// �ο� �� �Է�(1~10) : 0
// �ο� �� �Է�(1~10) : 2

// 1��° �л��� �й� �̸� �Է�(���� ����) : 2207123 �ֵ���
// ���� ���� ���� ���� �Է�   (���� ����) : 90 100 85
// 2��° �л��� �й� �̸� �Է�(���� ����) : 2208225 �ֳ���
// ���� ���� ���� ���� �Է�   (���� ����) : 85 70 65

// 2207123 �ֵ���   90 100 85   xxx   xx.xx
//					��  �� ��
// 2208225 �ֳ���   85 70 65   xxx   xx.xx
//					�� �� ��

// ����Ϸ��� �ƹ� Ű�� ��������...


import java.util.Scanner;

// �Ӽ��� �����ϴ� Ŭ���� �� �ڷ��� Ȱ��
class Record
{
	String hak, name;		// -- �й�, �̸�
	int kor, eng, mat;		// -- ����, ����, ���� ����
	int tot;				// -- ����
	double avg;				// -- ���
}

// �������̽�
interface Sungjuk
{
	public void set();		// -- �ο� ����
	public void input();	// -- ������ �Է�
	public void print();	// -- ��� ���
}

// ���� �ذ� �������� �����ؾ� �� Ŭ���� ��  Sungjuk �������̽��� �����ϴ� Ŭ����
class SungjukImpl implements Sungjuk
{
	private int inwon;
	private Record[] rec;

	@Override
	public void set()
	{	
		Scanner sc = new Scanner(System.in);
		
		do
		{
			System.out.print("�ο� �� �Է�(1~10) : ");
			inwon = sc.nextInt();
		}
		while (inwon<1 || inwon>101);

		rec = new Record[inwon];
		
		System.out.println();

	} // end set

	@Override
	public void input()
	{
		Scanner sc = new Scanner(System.in);

		for (int i=0; i<inwon; i++)
		{
			rec[i] = new Record();

			System.out.printf("%d��° �л��� �й� �̸� �Է�(���� ����) : ", i+1);
			rec[i].hak = sc.next();
			rec[i].name = sc.next();

			System.out.print("���� ���� ���� ���� �Է�   (���� ����) : ");
			rec[i].kor = sc.nextInt();
			rec[i].eng = sc.nextInt();
			rec[i].mat = sc.nextInt();

			rec[i].tot = rec[i].kor + rec[i].eng + rec[i].mat;
			rec[i].avg = rec[i].tot / 3.0;
		}

		System.out.println();

	} // end input

	@Override
	public void print()
	{	
		for (int i=0; i<inwon; i++)
		{
			System.out.printf("%s %s   %3d %3d%3d   %d   %.2f%n", rec[i].hak, rec[i].name, rec[i].kor, rec[i].eng, rec[i].mat, rec[i].tot, rec[i].avg);
			System.out.printf("                 %2s %2s%2s%n", panjung(rec[i].kor), panjung(rec[i].eng), panjung(rec[i].mat));
		}

		System.out.println();
		
	}

	// ���������� ��޿� ���� ������ ������ �޼ҵ�
	private String panjung(int score)
	{
		int[] rank = {90, 80, 70, 60};		// ��� ��

		if (score >= rank[0])
			return "��";
		else if (score >= rank[1])
			return "��";
		else if (score >= rank[2])
			return "��";
		else if (score >= rank[3])
			return "��";
		else
			return "��";

		
	} // end panjung

} // end SungjukImpl

// main() �޼ҵ带 �����ϴ� �ܺ��� �ٸ� Ŭ����
public class Test121
{
	public static void main(String[] args)
	{
		SungjukImpl ob = new SungjukImpl();

		// ���� �ذ� �������� �ۼ��ؾ� �� ob ���� �� ��ü ����
		ob.set();
		ob.input();
		ob.print();
	}
}