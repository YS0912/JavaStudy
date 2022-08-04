class MovieData
{
	public String title;
	public int grade;
	public int playTime;

	public String getTitle()
	{
		return title;
	}
	public void setTitle(String title)
	{
		this.title = title;
	}

	public int getGrade()
	{
		return grade;
	}
	public void setGrade(int grade)
	{
		this.grade = grade;
	}

	public int getPlayTime()
	{
		return playTime;
	}
	public void setPlayTime(int playTime)
	{
		this.playTime = playTime;
	}

	// ������(�Ű����� 3��)
	public MovieData(String title, int grade, int playTime)
	{
		this.title = title;
		this.grade = grade;
		this.playTime = playTime;
	}

	// ������(�Ű�����X)
	public MovieData()
	{
		title = "";
		grade = 0;
		playTime = 0;
	}
}