/*===================================================================
					��ü ����ȭ(Object Serialization)
===================================================================*/

/*
�� ��ü ����ȭ(Object Serialization)

	�޸𸮿� ������ Ŭ���� ��ü�� ��� ������ ���� ���¸� �״�� �����ؼ� ���Ͽ� �����ϰų�
	��Ʈ��ũ�� ���� ������ �� �ִ� �������,
	��� ���� ���� �����Ѵٰų� �ٸ� ��Ʈ��ũ�� �ִ� ȣ��Ʈ�� ���� ���� ��� ����ϰ� �ȴ�.

	��, ��ü ����ȭ�� ���빰�� ����Ʈ ������ ��ȯ�Ͽ�
	���� �Ǵ� ��Ʈ��ũ�� ���� �ۼ���(��Ʈ��)�� �����ϰ� ������ִ� ������
	�̶�, ��ü�� ��� ������ �޸𸮸����� ������ ���� ���Ѵ�.

	���󰡼� �޼ҵ�� �����ڴ� ��ü ����ȭ�� ��󿡼� ���ܵȴ�.

�� ��ü ����ȭ�� ����
	
	��ü ��ü�� ������ ����� ���Ŀ� ���ֹ��� �ʰ�
	��ü�� ���Ͽ� ���������ν� ���Ӽ�(���������� �����Ǵ� �Ӽ�)�� ������ �� ������
	��ü ��ü�� ��Ʈ��ũ�� ���� �ս��� ��ȯ�� �� �ְ� �ȴ�.

	��ü ����ȭ�� �ڹ� 1.1 ���Ŀ� ���ԵǾ��µ� �� ������ RMI�� Bean �����̾���.
	RMI�� ���� ��ü ����� �����ؾ� �ϱ� ������ ��ü�� �״�� �̵��� �� �־�� �Ѵ�.
	���� �̸� �����ϱ� ���ؼ��� ��ü ����ȭ�� �ʼ����̾���.

	���� Bean�� ���� �� ���¿� ���� ������ ������ ��
	�� ��ü ����ȭ�� ����ϸ� ���ϰ� ��ü ���¸� ������ �� �ִ�.

	�� RMI(Remot Method Invocation)
	   ���� �ٸ� ���� �����ġ�� �����ϴ� �Լ��� ȣ���ϰ� �����ϴ� ����� ����Ѵ�.
	   ���� �ٸ� ��� ������ ��ġ�� ������ ���� ��ü�� ����
	   ��� ������ �����ϴ� �������� �����ϸ� ����.

	�� Bean (: ��Ģ, �Ծ�)
	   C/S ������ �𵨿��� ������ ������ �ش��ϸ�,
	   ���� ������ ����Ʈ���� ��ü�� ���� �� �ְ� �ϴ� ������Ʈ ���
	   �ۼ��� ��ü�� ������ �����ϸ� ������Ʈ�� ���� ���Խ�ų �� �ֵ��� �Ѵ�.
	   Ŭ���̾�Ʈ���� ���̶�� ���α׷� ������Ʈ�� �й��ϴ� ������� ó��

�� Serializable �������̽�

	��ü ����ȭ�� �ϱ� ���� ���� ��ü ����ȭ�� �����ϵ���
	java.io.Serializable �������̽��� ������ �־�� �Ѵ�.
	�� �������̽��� ��ü ����ȭ�� �����Ǿ�� �Ѵٴ� ����� JVM�� �˷��ִ� ������ �����Ѵ�.
	����, Serializabel �������̽��� �ٸ� �������̽��� �޸�
	�����ؾ� �� �޼ҵ尡 ���� ������ ���� ���� ���ָ� �ȴ�.
	(�߻� �޼ҵ带 �������̵� �ؾ� �� �ʿ䰡 ���� ������ �߻��� ������ ������ �� �ִ�.)

	����:
	
	��
	public class Ŭ������ implements Serializable
	{
		����
	}

	��
	Serializable �������̽��� ������ ��,
	ObjectInpuStream Ŭ������ ObjectOutputStream Ŭ������ �̿��Ͽ� ��ü ������ ������� �����ϰ� �ȴ�.

	�� ��� ������ static���� ����� ��� (�� Ŭ���� ������ ���) ��ü ����ȭ ��󿡼� ���ܵȴ�.

�� Object Stream

	java.io.ObjectInputStream
	ObjectInputStream Ŭ������ ObjectOutputStream Ŭ������ ���� ���Ͽ� ����� �ִ� ��ü�� ��Ʈ��ũ�� ����
	���޵� ��ü�� ����ȭ�� �����ϴ� ����� �����Ѵ�.

	��, java.io.Serializable �������̽���
	java.io.Externalizable �������̽��� �������ִ� ��ü�� ���ؼ��� ����� �����ϴ�.
	��, Serializable �������̽��� Externalizable �������̽��� ������ ��ü������ ����� �����ϴٴ� ���̴�.
	�̶�, readObjec() �޼ҵ带 �̿��Ͽ� ��Ʈ�����κ��� ����ȭ�� ��ü�� ���� �� ������

	�̷��� ���� ��ü�� �迭, ���ڿ� �Ǵ� �� ��ü �� ������ ��(Type)���� ĳ���� �� �־�� �Ѵ�.
	(�ٿ� ĳ����)
*/

import java.io.File;
import java.util.Hashtable;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Enumeration;

public class Test177
{
	public static void main(String[] args) throws Exception
	{
		String appDir = System.getProperty("user.dir");

		// �׽�Ʈ
		// System.out.println(appDir);
		// �� C:\JavaStudy

		// ���� ��ü ����
		File f0 = new File(appDir, "\\data\\test.ser");
		// appDir �� C:\JavaStudy
		//	-- appDir ��ġ�� �������� "\\data\\test.ser"�� �����ϰڴٴ� �ǹ�
		//	-- ��������� ��C:\JavaStudy\data\test.ser��

		// �׽�Ʈ
		// System.out.println(f0.getParentFile().exists());
		// �� false
		//		-- ��test.ser�� ������ ������� ���͸� ��ΰ� �����Ǿ� ���� �ʴ�.

		// ��C:\JavaStudy�� ��ο� ��data�� ���͸� ���� �� �ٽ� Ȯ��
		// System.out.println(f0.getParentFile().exists());
		// �� true
		//		-- ��test.ser�� ������ ������� ���͸� ��ΰ� �����Ǿ� �ִ�.

		// ��test.ser�������� ������� ���͸� ��ΰ� �����Ǿ� ���� �ʴٸ�
		if (!f0.getParentFile().exists())
		{
			// ���͸��� ����ڴ�.
			f0.getParentFile().mkdirs();
		}


		// Hashtable �ڷᱸ�� �ν��Ͻ� ����
		Hashtable<String, String> h1 = new Hashtable<String, String>();

		// ������ h1�̶�� Hashtable �ڷᱸ���� ��� �߰�
		h1.put("2206428", "���ҿ�");
		h1.put("2206436", "������");
		h1.put("2206512", "�ӽÿ�");
		h1.put("2206524", "������");
		h1.put("2206537", "������");

		// �׽�Ʈ
		// System.out.println(h1.get("2206524"));
		// �� ������

		// ���� ���� ��� ��Ʈ�� ����(�������� ����)
		//	-- ���� ���� ��� ��Ʈ���� f0��� ��ü�� ���ڴ�!
		//	   �� InputStreamReader isr = new InputStreamReader(System.in);
		FileOutputStream fos = new FileOutputStream(f0);


		// ��ü ���� ��� ��Ʈ�� ����
		//	-- ��ü ���� ��� ��Ʈ������ fos��� ���� ���� ��Ʈ���� ���ΰڴ�!
		//	   �� BufferedReader br = new BufferedReader(isr);
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		// ���� line 136 + 142 �� ���������� ������ ����
		//	�� BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//	�� ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f0));

		// ObjectOutputStream Ŭ������ ��ü���� ����ϴ� ����� �����ϴ� Ŭ������
		// ��� ��Ʈ���� ����ϱ� ���� ���������� ��ü ����ȭ�� �����ϰ� �ȴ�.
		// �ڹ� �⺻�� ������ �Ǵ� ��ü���� ���Ͽ� �����ϰų� ��Ʈ��ũ�� ���� �����ϱ� ����
		// ������ ��ü�� ����ȭ�ϴ� ����� �����ϴ� ���̴�.


		// ������ ��Ʈ���� ������ ��ü�� ���
		//	-- out.write(ch); �� ���� ������ ����
		oos.writeObject(h1);


		// ��ü ���� ���ҽ� �ݳ�
		//	-- ObjectOutputStream ���ҽ� �ݳ�
		oos.close();

		// ���� ���� ���ҽ� �ݳ�
		//	-- FileOutputStream ���ҽ� �ݳ�
		fos.close();


		// (��ü�� ����ȭ�Ͽ� ���Ϸ�) �������� ��! ----------------------------------------------------------
		// ==================================================================================================



		// (��ü�� ����ȭ�Ͽ� ������ ����) �о���̱� ���� --------------------------------------------------

		// f0 ���� ��ü�� �����Ѵٸ�
		if (f0.exists())
		{
			// f0 ������ ���� �Է� ��Ʈ��(fis, FileInputStream)���� �о���̰�
			FileInputStream fis = new FileInputStream(f0);


			// fis ���� �Է� ��Ʈ�����κ��� ��ü �Է� ��Ʈ��(ois, ObjectInputStream)�� ����
			ObjectInputStream ois = new ObjectInputStream(fis);


			// ��ü �Է� ��Ʈ��(ois, ObjectInputStream)�� �о���� ��ü(Object)��
			// ĳ����(Hashtable) �Ͽ� h2��� Hashtable �ڷᱸ���� ��Ƴ���
			// Object obj = ois.readObject();
			Hashtable h2 = (Hashtable)ois.readObject();


			// ois, ObjectInputStream ���ҽ� �ݳ�
			ois.close();

			// fis, FileInputStream ���ҽ� �ݳ�
			fis.close();

			// �� -------------------------------------------------------------------------------------------


			// �о���� h2 ��ü�� ���� Ȯ��

			String key;
			String value;

			// �� Iterator ����� �� ����

			Enumeration e = h2.keys();

			while (e.hasMoreElements())
			{
				// Hashtable �ڷᱸ���� ������� key ���� �о���̴� ����
				key = (String)e.nextElement();

				// �׽�Ʈ
				// System.out.println(key);
				/* ��
					2206512
					2206524
					2206436
					2206537
					2206428
				*/

				// Hashtable �ڷᱸ���� ������� key�� Ȱ���Ͽ� value�� ���� ����
				value = (String)h2.get(key);
				
				System.out.println(key + " �� " + value);
				/* ��
					2206512 �� �ӽÿ�
					2206524 �� ������
					2206436 �� ������
					2206537 �� ������
					2206428 �� ���ҿ�
				*/
			}
			// ==============================================================================================
		}
	}
}