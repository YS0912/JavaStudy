public class MovieData
{
	// 영화관리 번호
	//private int num;
	// 영화 제목
	private String title;
	// 관람 등급
	private int grade;
	// 러닝타임
	private int playTime;


	public MovieData() 
	{
	}

	//public MovieData(int num, String title, int grade, int playTime) 
	public MovieData(String title, int grade, int playTime)
	{
		super();
		/*this.num = num;*/
		this.title = title;
		this.grade = grade;
		this.playTime = playTime;
	}
/*
	public int getNum() 
	{
		return num;
	}

	public void setNum(int num) 
	{
		this.num = num;
	}
*/
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

	public String toString()
	{
		//return "Movie{ [num : "+this.num+"] [title : " +this.title +"] [grade : " + this.grade + "]  [playTime : " + this.playTime + "] }";
		return "Movie{ [title : " +this.title +"] [grade : " + this.grade + "]  [playTime : " + this.playTime + "] }";
	}
}
