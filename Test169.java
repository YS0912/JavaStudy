/*===================================================================
							�÷���(Collection)
===================================================================*/

// Set �� HashSet, TreeSet
//	- ���� ����
//	- �ߺ��� ������� �ʴ� ����(�⺻)

/*
�� TreeSet<E> Ŭ����

	java.util.TreeSet<E> Ŭ������
	Set �������̽��� ����� SortedSet �������̽��� ������ Ŭ������
	�����͸� �߰��ϸ� �����͵��� �ڵ����� �������� ������ �ȴ�.
*/

// VO - Value Object
// DTO - Data Transfer Object
// DAO - Data Access Object

import java.util.TreeSet;
import java.util.Iterator;
import java.util.Comparator;

class GradeVO
{
	// �ֿ� �Ӽ� ����
	private String hak;					// �й�
	private String name;				// �̸�
	private int kor, eng, mat;			// ������ ����
	
	// ������(����� ���� ������) �� 5���� �Ű������� ���� ������
	GradeVO(String hak, String name, int kor, int eng, int mat)
	{
		this.hak = hak;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	// �� default ������ �ڵ����� ���� ����

	// ������(����� ���� ������) �� �Ű����� ���� ������
	// -- �Ű������� �����ϴ� �����ڸ� ����� ���� �����ڷ� �����Ͽ��� ������ 
	//	  default �����ڰ� �ڵ����� ���Ե��� ���� ���� ����Ͽ� �߰��� ������ ������
	GradeVO()
	{
		this("", "", 0, 0, 0);
	}

	// getter / setter ����
	public String getHak()
	{
		return hak;
	}
	public void setHak(String hak)
	{
		this.hak = hak;
	}

	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}

	public int getKor()
	{
		return kor;
	}
	public void setKor(int kor)
	{
		this.kor = kor;
	}

	public int getEng()
	{
		return eng;
	}
	public void setEng(int eng)
	{
		this.eng = eng;
	}

	public int getMat()
	{
		return mat;
	}
	public void setMat(int mat)
	{
		this.mat = mat;
	}


	// �߰� �޼ҵ� ����(���� ����)
	public int getTot()
	{
		// return kor + eng + mat;
		return this.kor + this.eng + this.mat;
	}
}

class MyComparator<T> implements Comparator<T>
{
	// �� �޼ҵ� ������
	@Override
	public int compare(T o1, T o2)
	{
		GradeVO s1 = (GradeVO)o1;
		GradeVO s2 = (GradeVO)o2;

		// �й� ����(�������� ����)
		// return Integer.parseInt(s1.getHak()) - Integer.parseInt(s2.getHak());
		// �� return Interger.parseInt("2206113") - Integer.parseInt("2206113");
		// �� return 2206113 - "2206113";
		// �� return -2;

		// �й� ����(�������� ����)
		// return Integer.parseInt(s2.getHak()) - Integer.parseInt(s1.getHak());
		
		// ���� ���� (�������� ����)
		// return s1.getTot() - s2.getTot();

		// ���� ���� (�������� ����)
		// return s2.getTot() - s1.getTot();

		// �̸� ���� (�������� ����)
		// return s1.getName().compareTo(s2.getName());

		// �̸� ���� (�������� ����)
		return s2.getName().compareTo(s1.getName());
	}
}

public class Test169
{
	public static void main(String[] args)
	{
		// Treeset �ڷᱸ�� �ν��Ͻ� ����
		TreeSet<String> set = new TreeSet<String>();

		// TreeSet �ڷᱸ�� set�� ��� �߰� �� add();
		set.add("�͸���Į��");
		set.add("��Ž���ڳ�");
		set.add("����ť");
		set.add("�����̸���");
		set.add("���ϸ�");
		set.add("����ġ���������Ҹ�");
		set.add("������ ��庥ó");
		set.add("�̿��������");
		set.add("¯���¸�����");
		set.add("�Ʊ����Ѹ������������");
		set.add("������̺�");

		// Iterator�� Ȱ���� set ��� ��ü ���
		Iterator<String> it = set.iterator();
		while (it.hasNext())
		{
			System.out.print(it.next() + " ");
		}
		System.out.println();
		// �� �͸���Į�� �����̸��� ������ ��庥ó ������̺� ��Ž���ڳ� ����ġ���������Ҹ� �Ʊ����Ѹ������������
		//	  �̿�������� ¯���¸����� ���ϸ� ����ť
		// -- ��Ҹ� ���ڿ��� ������ ���, �����ټ�(��������) ���� Ȯ��

		System.out.println();

		// TreeSet �ڷᱸ�� �ν��Ͻ� ����
		// TreeSet<GradeVO> set2 = new TreeSet<GradeVO>();
		//				��
		// MyComparator Ŭ������ �����Ͽ�
		// compare() �޼ҵ带 �������� �� �ٽ� ����
		TreeSet<GradeVO> set2 = new TreeSet<GradeVO>(new MyComparator<GradeVO>());

		// TreeSet �ڷᱸ�� set2�� ��� �߰�
		set2.add(new GradeVO("2206113", "������", 90, 80, 70));
		set2.add(new GradeVO("2206115", "�ֵ���", 91, 81, 71));
		set2.add(new GradeVO("2206128", "���α�", 88, 78, 68));
		set2.add(new GradeVO("2206139", "������", 70, 60, 50));
		set2.add(new GradeVO("2206150", "������", 99, 82, 72));

		// Iterator�� Ȱ���� set2 ��� ��ü ���
		/*
		Iterator<GradeVO> it2 = set2.iterator();
		while (it2.hasNext())
		{
			System.out.print(it2.next() + " ");
		}
		System.out.println();
		// �� ��Ÿ�� ���� : ClassCastException: GradeVO cannot be cast to java.lang.Comparable
		*/

		// ��
		
		// MyComparator Ŭ������ �����Ͽ�
		// compare() �޼ҵ带 �������� �� �ٽ� ����
		/*
		Iterator<GradeVO> it2 = set2.iterator();
		while (it2.hasNext())
		{
			System.out.print(it2.next() + " ");
		}
		System.out.println();
		// �� GradeVO@15db9742 GradeVO@6d06d69c GradeVO@7852e922 GradeVO@4e25154f GradeVO@70dea4e
		*/
		
		// ��
		
		// ��ü�� ���� �����Ͽ� ����ϴ� ���� �ƴ϶�.
		// ��ü�� ���� �ִ� �Ӽ��� �����Ͽ� ����� �� �ֵ��� ó��
		Iterator<GradeVO> it2 = set2.iterator();
		while (it2.hasNext())
		{
			// GradeVO v = new GradeVO();		�� ������ GradeVO() ������� ���� ����
			// GradeVO v = new set2();			�� set2�� �޼ҵ尡 �ƴ�!
			// GradeVO v = set2.iterator();		�� set2�� Interator<GradeVO> ������ ������ ��ü�̱� ������ GradeVO ������ ���� �Ұ�
			// GradeVO v = it2();				�� it2�� �޼ҵ尡 �ƴ�!
			GradeVO v = it2.next();
			System.out.printf("%7s %7s %4d %4d %4d %6d\n"
								, v.getHak(), v.getName()
								, v.getKor(), v.getEng(), v.getMat()
								, v.getTot());
		}
		System.out.println();

		// �й� ���� (��������)
		// �� 2206113     ������   90   80   70    240
		//	  2206115     �ֵ���   91   81   71    243
		//	  2206128     ���α�   88   78   68    234
		//	  2206139     ������   70   60   50    180
		//	  2206150     ������   99   82   72    253
		
		// �й� ���� (��������)
		// �� 2206150     ������   99   82   72    253
		//	  2206139     ������   70   60   50    180
		//	  2206128     ���α�   88   78   68    234
		//	  2206115     �ֵ���   91   81   71    243
		//	  2206113     ������   90   80   70    240


		// ���� ���� (��������)
		// �� 2206139     ������   70   60   50    180
		//	  2206128     ���α�   88   78   68    234
		//	  2206113     ������   90   80   70    240
		// 	  2206115     �ֵ���   91   81   71    243
		//	  2206150     ������   99   82   72    253

		// ���� ���� (��������)
		// �� 2206150     ������   99   82   72    253
		//	  2206115     �ֵ���   91   81   71    243
		//	  2206113     ������   90   80   70    240
		//	  2206128     ���α�   88   78   68    234
		//	  2206139     ������   70   60   50    180

		// �̸� ���� (��������)
		// �� 2206128     ���α�   88   78   68    234
		//	  2206113     ������   90   80   70    240
		//	  2206150     ������   99   82   72    253
		//	  2206139     ������   70   60   50    180
		//	  2206115     �ֵ���   91   81   71    243

		// �̸� ���� (��������)
		// �� 2206115     �ֵ���   91   81   71    243
		//	  2206139     ������   70   60   50    180
		//	  2206150     ������   99   82   72    253
		//	  2206113     ������   90   80   70    240
		//	  2206128     ���α�   88   78   68    234
	}
}

