import java.util.Vector;


class reservedData
{
	// �ֿ� �Ӽ� ���� �� �ֿ� ���� ����(��� ����)
	private String rvNumber;		//-- ���Ź�ȣ
	private String title;			//-- ��ȭ����
	private String time;			//-- �ð�
	private int screen;				//-- �󿵰�
	private String seatNumber;		//-- �¼�
	private int inwon;				//-- �ο�


	// ���Ź�ȣ �� ������ ����
	public String getRvNumber()
	{
		return rvNumber;
	}

	// ���Ź�ȣ �� �����ϰ� �����ϱ�
	public void setRvNumber(String rvNumber)
	{
		this.rvNumber = rvNumber;
	}


	// ��ȭ ���� �� ������ ����
	public String getTitle()
	{
		return title;
	}

	// ��ȭ ���� �� �����ϰ� �����ϱ�
	public void setTitle(String title)
	{
		this.title = title;
	}


	// �ð� �� ������ ����
	public String getTime()
	{
		return time;
	}

	// �ð� �� �����ϰ� �����ϱ�
	public void setTime(String time)
	{
		this.time = time;
	}


	// �󿵰� �� ������ ����
	public int getScreen()
	{
		return screen;
	}

	// �󿵰� �� �����ϰ� �����ϱ�
	public void setScreen(int screen)
	{
		this.screen = screen;
	}


	// �ο� �� ������ ����
	public int getInwon()
	{
		return inwon;
	}

	// �ο� �� �����ϰ� �����ϱ�
	public void setInwon(int inwon)
	{
		this.inwon = inwon;
	}

	
	// �¼� �� ������ ����
	public String getSeatNumber()
	{
		return seatNumber;
	}

	// �¼� �� �����ϰ� �����ϱ�
	public void setSeatNumber(String seatNumber)
	{
		this.seatNumber = seatNumber;		
	}
	

	// ����� ���� ������ (�Ű�����: ���Ź�ȣ, ��ȭ ����, �ð�, �󿵰�, �ο�, �¼�)
	public reservedData(String rvNumber, String title, String time, int screen, int inwon, String seatNumber)
	{
		this.rvNumber = rvNumber;		// ���Ź�ȣ
		this.title = title;				// ��ȭ ����
		this.time = time;				// �ð�
		this.screen = screen;			// �󿵰�
		this.inwon = inwon;				// �ο�
		this.seatNumber = seatNumber;	// �¼�

	}

	// ����� ���� ������
	public reservedData()
	{
		title = "";			// ��ȭ ���� �ʱ�ȭ
		time = "";			// �ð� �ʱ�ȭ
		screen = 0;			// �󿵰� �ʱ�ȭ
		seatNumber = "";	// �¼� �ʱ�ȭ
	}
	
	public String toString()
	{
		return "��ȭ ����: " + this.title + "�ð�: " + this.time + "�󿵰�: " + this.screen + "�¼�: " + this.seatNumber;
	}
	
}