import java.util.Scanner;
import java.util.Random;
import java.util.Vector;
import java.util.Arrays;
	
//========================================================================(A)

public class User extends UserData
{

	// ���Ź�ȣ ���� �޼ҵ�
	public void reservNumber()
	{
		Random rd = new Random();
		int n;
		int[] num = new int[10];	

			for (int cnt=0; cnt<10; cnt++)	// 0 ~ 9
			{
				n = rd.nextInt(10);			// 0 ~ 9 �� ������ ����
				num[cnt] = n;         
			}

		String str = "";
		str = Arrays.toString(num).replaceAll("[^0-9]","");		//-- num[10] ������ �迭 ���� ���ڿ��� ��ȯ�Ͽ� str ������ ����

		// ���� �߻� ��� ��
		// String str = (rd.nextInt(90000)+10000) + "" + (rd.nextInt(90000)+10000);	//-- 99999 + 99999 (8�ڸ�) + 10000
		
		
		// ������ ù ��° �� ���� ���� �Ǵ��ϱ�
		if (reservedNum.firstElement() == null)
		{
			reservedNum.add(str);	//-- ���� ��, �ϴ� ����
		}
		else if (reservedNum.contains(str) == false)	//-- ���� ��, �� ���� ���� ����Ǿ� �ִ��� Ȯ�� �� ����
		{
			reservedNum.add(str);	//-- str �� ���Ϳ� �߰�			
		}

	} //end reservNumber method

// ======================================================================================= ��� ���� ���� (���� ��Ʈ ����)

	// �������� ��Ʈ ���� (�ʱ�ȭ�� / ����ȭ������ ���ư���)
	// ������ ���� ���� �������� ��Ʈ ��ȣ �ݿ�
	public void startProcess()
	{
		p_id = "A";		//-- firstMenu()�� �����ϱ� ���� ����
		while(true)
		{
			switch(p_id)
			{
				case "A" :	firstMenu(); break;
				case "B" :	userDisp1(); break;
				//case "C2":	reserv(); break;
				case "C7":	reservedcheck(); break;
				case "C9":	reservCancel(); break;
				case "D2":	moviePick(); break;
				//case "D4":	timePick(); break;
				case "D7":	reservedcheck2(); break;
				case "D9":	reservCancel2(); break;
				case "E2":	moviePick2(); break;
				//case "E4":	timePick2(); break;
				case "F" :	movieRound(); break;
				case "G" :	seatPick(); break;
				//case "end":	break;
				default : System.out.println("�������� �ʴ� ����Դϴ�."); 						   
						  break;
			}

			//if("end".equals(p_id)) break;	//-- ���μ��� ����
		}

	} //end startProcess method


	// �� ó�� �����ڰ� ��й�ȣ�� �Է��� �� �ִ� ȭ�� (A,12)
	public void firstMenu()
	{
		System.out.println("[��ȭ Ƽ�� �߱Ǳ�] ==================");
		System.out.println();
		System.out.println("�����Ϸ��� A �� �����ּ���.");
		System.out.println();
		System.out.println("������ ��й�ȣ�� �Է����ּ���");
		System.out.println();
		System.out.println("=====================================");
		
		Scanner sc = new Scanner(System.in);
		String pw = sc.next();

		System.out.println();

		// ������ ��й�ȣ�� �Է��� ��й�ȣ�� ���� ���
		if (adminPassword.equals(pw))
		{
			System.out.println("������ �ʱ�ȭ�� �޼ҵ� ȣ��");
		}
		else if (pw.equals("A") || pw.equals("a"))
		{
			// ��ϵ� ��ȭ�� ���� ��� �߰� �ʿ� (B,1)
			if (screen[0] == null && screen[1] == null && screen[2] == null)
				userDisp2();	// line 176
			else 
				p_id = "B";
		}

		// �Է��� ��й�ȣ�� Ʋ�� ���, ���Է� ȭ�� ȣ�� ���� (B,12)
		else
		{
			p_id = "A";
		}

	} //end firstMenu method


	// ��ϵ� ��ȭ�� ���� ��, ��� ���� (B,1)
	public void userDisp2()
	{
		System.out.println("[��ȭ Ƽ�� �߱Ǳ�] ==========================");
		System.out.println();
		System.out.println("�� ���� ��ȭ�� �����ϴ�.");
		System.out.println("��ø� ��ٷ��ֽø� �ݹ� ���� �غ��ϰڽ��ϴ�.");
		System.out.println();
		System.out.println("=============================================");		
	} //end userDisp2 method


	// ��� ��ȭ ���� ��, ��� ���� (B,6)
	public void userDisp1()
	{
		System.out.println("[������ ���]==========");
		System.out.println();
		System.out.println("1. �����ϱ�");
		System.out.println("2. ���ų��� Ȯ��");
		System.out.println("3. ���� ���");
		System.out.println("=======================");
		System.out.println();
		System.out.println("0. ���� �޴��� ���ư���");
		System.out.println();
		System.out.print(">> �޴� ���� : ");

		Scanner sc = new Scanner(System.in);
		sel = sc.nextInt();

		System.out.println();

		switch(sel)
		{
			case 1: p_id = "D2"; break;	// �����ϱ� ȭ�� ���
			case 2: p_id = "C7"; break; // ���ų��� Ȯ�� ȭ�� ���
			case 3: p_id = "C9"; break; // ������� ȭ�� ���
			case 0: p_id = "A"; break;	// �����޴�(�ʱ�ȭ��) ���
		}
	} //end userDisp1 method

//========================================================================(C)

	/*
	// 1. [�����ϱ�] ���� �� ���� �޴� (C,3)
	public void reserv()
	{
		System.out.println("[�����ϱ�] ============");
		System.out.println();
		System.out.println("�з� ����");
		System.out.println("1. ��ȭ");
		System.out.println("2. �ð���");
		System.out.println();
		System.out.println("=======================");
		System.out.println("0. ���� �޴��� ���ư���");

		Scanner sc = new Scanner(System.in);
		sel = sc.nextInt();

		System.out.println();

		switch(sel)
		{
			case 1: p_id = "D2"; break;	// moviePick ȭ�� ���
			case 2: p_id = "D4"; break; // timePick Ȯ�� ȭ�� ���
			case 0: p_id = "B"; break;	// ����ȭ�� ���(��������� ó�� ȭ��)
		}
	} //end reserv method
	*/


	// 1. [��ȭ] ���� �� ���� �޴� (D,2)
	public void moviePick()
	{
		System.out.println();
		System.out.println("[�����ϱ�] ======================");
		System.out.println();
		//System.out.println("�����ڰ� ����� ��ȭ ��� ���");
		
		// �󿵰��� ��ϵ� ��ȭ ���� ����� �迭
		for (int i=0; i<screen.length; i++)
		{
			if (screen[i] != null)	// �󿵰��� ��ȭ�� ��ϵǾ� ���� ��쿡��
			{
				System.out.printf(" �󿵰�: %d��\n ��ȭ ���� : %s(%d)\n", (i+1), screen[i].title, screen[i].grade);
				System.out.println();
			}		
		}
		System.out.println("=================================");
		System.out.println("0. ���� �޴��� ���ư���");
		System.out.println();
		System.out.print("�����Ͻ� ��ȭ������ �Է����ּ��� : ");

		Scanner sc = new Scanner(System.in);
		tempTitle = sc.next();	//-- ��ȭ���� �˻� �� ���ڿ� ���ϱ� ���� String ������ tempTitle �̶�� ������ ����
		System.out.println();

		if (tempTitle == "0")
		{
			p_id = "B"; //-- ����ȭ�� ���(��������� ó�� ȭ��)
		}
		System.out.println();

		// ����ڰ� �Է��� ���� �󿵰� �� ���� ������ ���
		if (tempTitle.equals(screen[0].title) || tempTitle.equals(screen[1].title) || tempTitle.equals(screen[2].title))
		{
			p_id = "E2";
		}
		else
		{
			System.out.println("�Է� ���� �߸��Ǿ����ϴ�");
			System.out.println("�ٽ� �Է����ּ���");
			System.out.println();
			p_id = "D2";	//-- ���� ȭ�� ȣ�� (���Է�)
		}
	
	} //end moviePick method


	// [��ȭ����] �� ȸ�� ���� (E,2)
	public void moviePick2()
	{
		System.out.println("[�����ϱ�] ============");
		System.out.println();
		
		// ����ڰ� ������ ��ȭ������ ��ϵ� �󿵰� �� ����ϱ�
		for (int i=0; i<screen.length; i++)
		{
			if (screen[i].title.equals(tempTitle))	
			{
				System.out.print(screen[i].title + " ");
				System.out.printf("(%d)\n", screen[i].grade);
				System.out.println();
				System.out.printf("�󿵰� : %d��", (i+1));
				System.out.println();
				
				runTime = screen[i].playTime;	//-- ����ڰ� ������ ��ȭ�� ����Ÿ�� �� ����
				tempScreen = (i+1);				//-- ����ڰ� ������ ��ȭ�� ��ϵ� �󿵰� ���� ���� (�� ������)
			}		
		}

		int startTime = 9;	

		if (tempScreen == 1)	//-- 1�� 7ȸ�� ��� (2�ð� ���� �)
		{
			for (int i=0; i<7; i++)
			{
				int endTime = (startTime*60 + runTime) / 60;	
				int endMinute = (startTime*60 + runTime) % 60;  
				System.out.printf("%dȸ�� : ", (i+1));
				String st = "";		//-- start time
				String et=  "";		//-- end time
				String em = "";		//-- end minute
				if(startTime == 9) 
					st = "0"+Integer.toString(startTime); 
				else 
					st= Integer.toString(startTime);
				if(endTime >= 0 && endTime <= 9) 
					et = "0"+Integer.toString(endTime); 
				else 
					et= Integer.toString(endTime);
				if(endMinute >= 0 && endMinute <= 9) 
					em = "0"+Integer.toString(endMinute); 
				else 
					em = Integer.toString(endMinute);
				System.out.printf("%s:00 ~ %s:%s \n", st, et, em);
				startTime += 2;
			}
		}

		else if (tempScreen == 2)	//-- 2�� 5ȸ�� ��� (3�ð� ���� �)
		{
			for (int i=0; i<5; i++)
			{
				int endTime = (startTime*60 + runTime) / 60;	//-- end time
				int endMinute = (startTime*60 + runTime) % 60; //-- end minute
				System.out.printf("%dȸ�� : ", (i+1));
				String st = "";
				String et=  "";
				String em = "";
				if(startTime == 9) st = "0"+Integer.toString(startTime); else st= Integer.toString(startTime);
				if(endTime >= 0 && endTime <= 9) et = "0"+Integer.toString(endTime); else et= Integer.toString(endTime);
				if(endMinute >= 0 && endMinute <= 9) em = "0"+Integer.toString(endMinute); else em= Integer.toString(endMinute);
				System.out.printf("%s:00 ~ %s:%s \n", st, et, em);
				startTime += 3;
			}
		}

		else if (tempScreen == 3)	//-- 3�� 3ȸ�� ��� (4�ð� ���� �)
		{
			for (int i=0; i<3; i++)
			{
				int endTime = (startTime*60 + runTime) / 60;	//-- end time
				int endMinute = (startTime*60 + runTime) % 60; //-- end minute
				System.out.printf("%dȸ�� : ", (i+1));
				String st = "";
				String et=  "";
				String em = "";
				if(startTime == 9) st = "0"+Integer.toString(startTime); else st= Integer.toString(startTime);
				if(endTime >= 0 && endTime <= 9) et = "0"+Integer.toString(endTime); else et= Integer.toString(endTime);
				if(endMinute >= 0 && endMinute <= 9) em = "0"+Integer.toString(endMinute); else em= Integer.toString(endMinute);
				System.out.printf("%s:00 ~ %s:%s \n", st, et, em);
				startTime += 4;
			}
		}
		System.out.println("=======================");
		System.out.println("0. ���� �޴��� ���ư���");
		System.out.println();
		System.out.print("ȸ�� ���� : ");

		Scanner sc = new Scanner(System.in);
		sel = sc.nextInt();
		tempRound = sel;
		System.out.println();

		switch(sel)
		{
			case 0: p_id = "B"; break; // ����ȭ�� ���(��������� ó�� ȭ��)
			case 1:  
			case 2: 
			case 3: 
			case 4: 
			case 5: 
			case 6: 
			case 7: p_id = "F"; break;
			default: p_id = "E2"; break;
		}
	} //end moviePick2 method

//=====================================================================�� ��ȭ����(moviePick)
	
	// 2. [�ð���] ���� (D,5)
	//public void timePick()
	//{
		/*
		System.out.println("[�����ϱ�] ============");
		System.out.println();
		System.out.println("1. ����(9~12)");
		System.out.println("2. ����(13~18)");
		System.out.println("3. ����(19~23)");
		System.out.println();
		System.out.println("=======================");
		System.out.println("0. ���� �޴��� ���ư���");

		Scanner sc = new Scanner(System.in);
		sel = sc.nextInt();

		System.out.println();
		
		int st = 0;
		
		// ����, ����, ���� �����ϴ� �κ�
		if (sel == 1)
		{
			st1 = 9;
			st2 = 9;
			st3 = 9;
			for (int i=1; i<=2; i++)	
			{
				if((float)4/(2*i) >= 0) {
				System.out.printf("%d:00 ~ %d:00 ��ȭ ���� : %s(%s)", screen[0].title, screen[0].grade);
				st1 += 2;
				}
				if((float)4/(3*i) >= 0) {
				System.out.printf("%d:00 ~ %d:00 ��ȭ ���� : %s(%s)", screen[1].title, screen[1].grade);
				st1 += 3;
				}
				if((float)4/(4*i) >= 0) {
				System.out.printf("%d:00 ~ %d:00 ��ȭ ���� : %s(%s)", screen[2].title, screen[2].grade);
				st1 += 4;
				}
			}
			p_id = "E3";
		}
		if (sel == 2)
		{
			st1 = 13;
			st2 = 13;
			st3 = 13;
			for (int i=1; i<=3; i++)	
			{
				if(4/(2*i)) {
				System.out.printf("%d:00 ~ %d:00 ��ȭ ���� : %s(%s)", screen[0].title, screen[0].grade);
				st1 += 2;
				}
				if(4/(3*i)) {
				System.out.printf("%d:00 ~ %d:00 ��ȭ ���� : %s(%s)", screen[1].title, screen[1].grade);
				st1 += 3;
				}
				if(4/(4*i)) {
				System.out.printf("%d:00 ~ %d:00 ��ȭ ���� : %s(%s)", screen[2].title, screen[2].grade);
				st1 += 4;
				}
			}
			p_id = "E3";
		}
		if (sel == 3)
		{			
			st1 = 19;
			st2 = 19;
			st3 = 19;
			for (int i=0; i<2; i++)	
			{
				if(4/(2*i)) {
				System.out.printf("%d:00 ~ %d:00 ��ȭ ���� : %s(%s)", screen[0].title, screen[0].grade);
				st1 += 2;
				}
				if(4/(3*i)) {
				System.out.printf("%d:00 ~ %d:00 ��ȭ ���� : %s(%s)", screen[1].title, screen[1].grade);
				st1 += 3;
				}
				if(4/(4*i)) {
				System.out.printf("%d:00 ~ %d:00 ��ȭ ���� : %s(%s)", screen[2].title, screen[2].grade);
				st1 += 4;
				}
			}
			p_id = "E3";
			
		}

		switch(sel)
		{
			case 0: p_id = "B"; break; // ����ȭ�� ���(��������� ó�� ȭ��)
		}
		*/
	//}

	// �����ڰ� �󿵰��� ����� ��ȭ ������ ������ => ���� � �󿵰��� ��ȭ�� ��ϵǾ� �ִ��� �� �� ����
	// ����� ��ȭ�� �� ���� ��ϵǾ� �ִ���, ��ȭ����, ��ȭ ����Ÿ���� ������
	// ��ȭ�� ��ϵ� �󿵰� ���� 9�� ���� +2,+3, +4 �ؼ� �� ȸ���� ���� �ð��� ����

	// �󿵰��� ���� ����ִ� ���� ���� > ��ϵ� �󿵰��� ���� ���� �ʿ�
	/*
	for (int i=0; i<screen.length; i++)	
		{
			if (screen[i] != null)	// �󿵰��� ��ȭ ���� ���� ����ִٸ�
			{
				// � �󿵰�����, � ��ȭ����(����, ���) ������ > �ϴ� �������
				System.out.println(i);
				System.out.println


			}
			System.out.printf("��ȭ ���� : %s", screen[i].title);
		}
	*/


	// [�ð�����] (E, 4) �� ȸ�� ����
	//public void timePick2()
	//{
		/*
		System.out.println("[�����ϱ�] ============");
		
		// ������ �ð��뿡 �ִ� ��ȭ ������ �ҷ��ͼ� ���
		/*
		1. 9:00~11:00 ���˵���2 (19)
		2. 9:00~12:00 ž��2 (15)
		3. 9:00~13:00 �̴Ͼ���2 (��ü)
		*/

		// �������� �ۼ��� �� �󿵰��� ��ϵ� ��ȭ ���� ����� �迭
		/*
		for (int i=0; i<screen.length; i++)
		{
			System.out.printf("��ȭ ���� : %s", screen[i].title);
		}

		System.out.println("=======================");
		System.out.println("0. ���� �޴��� ���ư���");

		Scanner sc = new Scanner(System.in);
		sel = sc.nextInt();

		System.out.println();
		
		num = sel;
		
		// ���ϴ� ��ȭ ��ȣ ����
		// ������ �� �ð��� ȸ���� �� ������ ȭ���̱� ������
		// ��ȭ����Ʈ�� �� ������ �� �� ��� �ϴ� ����

		switch(sel)
		{
			case 0: p_id = "D4"; break; // ����ȭ�� ���
		}

		p_id = "F";
		*/
	//}
	
//=====================================================================�� �ð�����(timePick)

	// [ȸ�� �Ǵ� ��ȭ ����] (F,3)
	public void movieRound()
	{
		MovieData selMovie = screen[tempScreen-1];
		int si = (tempScreen-1) * (7+(2-tempScreen)) + (tempRound-1);	//-- ȸ���� �¼����� (0~6: 1�� ȸ��, 7~11: 2�� ȸ��, 12~15: 3�� ȸ��)
		int startTime = 9;	//-- start time
		
		if (si >= 0 && si < 7)
		{
			startTime += (2*si);
		}
		else if(si >= 7 && si < 12)
		{
			startTime += (3*(si-7));
		}
		else if(si >= 12 && si < 15) 
		{
			startTime += (4*(si-12));
		}

		int endTime = (startTime*60 + selMovie.playTime) / 60;	//-- end time
		int endMinute = (startTime*60 + selMovie.playTime) % 60; //-- end minute

		int leftSeat = 25;	//-- ���� �� �¼� ��
		boolean[][] seatInfo = seatInfos[si];

		for (int i = 0; i < seatInfo.length; i++)
		{
			for (int j = 0; j < seatInfo[i].length; j++)
			{
				if (seatInfo[i][j])
					leftSeat--;		//-- ������ �¼� ����		                                
            }            
        }

		String st = "";
		String et=  "";
		String em = "";
		if(startTime == 9) st = "0"+Integer.toString(startTime); else st= Integer.toString(startTime);
		if(endTime >= 0 && endTime <= 9) et = "0"+Integer.toString(endTime); else et= Integer.toString(endTime);
		if(endMinute >= 0 && endMinute <= 9) em = "0"+Integer.toString(endMinute); else em= Integer.toString(endMinute);

		tempTime = st + ":00 ~ " + et + ":" + em;

		System.out.println("[�����ϱ�]==============");
	    System.out.println();
	    System.out.println(selMovie.title + "(" + selMovie.grade + ")");
	    System.out.println(tempTime);
	    System.out.println();
	    System.out.println("�����ο��� �Է����ּ���.");
	    System.out.println("�ܿ� �¼� : " + leftSeat);
	    System.out.println();   
	    System.out.println("========================");
	    System.out.println("-1. ���� �޴��� ���ư���");	// ������ 0���� ���� ���� �ϴ� 5�� ����
	    System.out.println();

	    Scanner sc = new Scanner(System.in);


	    //System.out.println();

		// �Ʒ��� �������� ���������̱⿡ �޼ҵ� �����Խ� ���� ������ ��� ���� ��. ���� �ʱ�ȭ �ʿ�!
	    adult = 0;
	    teenager = 0;
	    kid = 0;

	    System.out.print("���� : ");
	    adult = sc.nextInt();
	    if (adult == -1)
		{
			p_id = "E2";  //-- ����ȭ�� ���
			return;
		}
	    System.out.print("û�ҳ� (~18) : ");
	    teenager = sc.nextInt();
	    if (teenager == -1)
		{
			p_id = "E2";  //-- ����ȭ�� ���
			return;
		}
	    System.out.print("��� (~14) : ");
	    kid = sc.nextInt();
	    if (kid == -1)
		{
			p_id = "E2";  //-- ����ȭ�� ���
			return;
		}

	    p_id = "G";

	    switch (selMovie.grade)
	    {
			case 19: if (teenager != 0 && kid != 0)
				adultMovie(selMovie.title, selMovie.grade); break;
			case 15: if (kid != 0)
				adultMovie(selMovie.title, selMovie.grade); break;
			default: break;
	    }

	    total = adult + teenager + kid;
	   
	    // [�󿵰����� ���� �ο� �Է� ��] (G,6)
	    if (total > 25)
	    {
			System.out.println("[�����ϱ�] =======================");
			System.out.println();
			System.out.println("�ش� �󿵰��� �¼����� �����մϴ�.");
			System.out.println("�ٽ� �������ּ���.");
			System.out.println();
			System.out.println("==================================");
			System.out.println();

			p_id = "F";
	    }

		if(p_id.equals("F")) return;

   } //end movieRound method


	// [�� �Ұ� ���ɴ� ���� ��] (G,2) > ������ �޴����� ��� ������� ���ǹ� �Ἥ movieRound() �ȿ� �ֱ�
	public void adultMovie(String title, int age)
	{
		System.out.println("[�����ϱ�] ===========================================");
		System.out.println();
		System.out.println(title + "��(��)" + age + " �� �̸� �����Ұ� ��ȭ�Դϴ�.");
		System.out.println("�ٽ� �������ּ���.");
		System.out.println();
		System.out.println("======================================================");
		System.out.println();
		System.out.println();
		p_id = "F";
	} //end adultMovie method


	// �¼� �����ִ� �޼ҵ� ���� (G,3)
	public void showSeat(boolean[][] seatInfo)
	{
		System.out.println();
		System.out.println("�ء�� ǥ�õ� �¼��� ����� �¼��Դϴ�.");      
        for (int i = 0; i < seatInfo.length; i++)
		{
			for (int j = 0; j < seatInfo[i].length; j++)
			{
				if (seatInfo[i][j])
					System.out.print("[��]");
                else                                     
					System.out.print("[" + (char)(65 + i) + (j+1) + "]");                                 
            }
            System.out.println();
        }
		System.out.println();
	}
	
	// [�ο� �Է�] (G,3)
	// �¼� ���� �޼ҵ� ���� (�޼ҵ� ����: seatPick)
	public void seatPick()
	{
		int si = (tempScreen-1) * (7 + (2-tempScreen)) + (tempRound-1);	//�� �󿵰� ȸ���� �¼������� ó���ϱ� ���� 0~6�� 1���� �� ȸ��, 7~11�� 2���� �� ȸ��, 12~14�� 3���� �� ȸ��
		int[] rows = new int[total];
		int[] cols = new int[total];

		Scanner sc = new Scanner(System.in);
		boolean isFirst = true;
		tempSeat = "";

		for (int i=0; i<total; i++)
		{
			if (isFirst)
			{
				showSeat(seatInfos[si]);
				isFirst = false;
			}
			System.out.println("���ϴ� �¼��� �������ּ���. [���ĺ� �빮�ڷ� �Է����ּ���.]");
			System.out.println("�� �ο��� " + total + "���Դϴ�.");
			System.out.print("�¼� �Է�: ");
			String s = sc.next();
			int row = (int)s.charAt(0) - 65;	//-- ��
			int col = (int)s.charAt(1) - 48;	//-- ��
			 
			if (seatInfos[si][row][col-1])
			{
				redun();
				i--;
			}
			else
			{
				seatInfos[si][row][col-1] = true;
				if (i == total-1)
				{
					tempSeat += s;
				}
				else
				{
					tempSeat += (s + ", ");
				}
				rows[i] = row;
				cols[i] = col-1;
			}
			showSeat(seatInfos[si]);
		}
		seatPick2(si, rows, cols);

	} //end seatPick method


	// [�¼� �ߺ�] (H,3)
	public void redun()
	{
		System.out.println("[�����ϱ�] ===========");
		System.out.println();
		System.out.println("�̹� ���õ� �¼��Դϴ�");
		System.out.println("�ٽ� �������ּ���.");
		System.out.println();
		System.out.println("======================");
		System.out.println();
	}

	// [�¼� ���� ����] (H,4)
	public void seatPick2(int si, int[] rows, int[] cols) 
	{
		reservNumber();		//-- ���� ����
		String str="";		//-- ���ڿ� ���� ����
		str = reservedNum.lastElement();	//-- ������ ���Ź�ȣ�� str ������ ������ ����(�ؿ� ��������� ��� ����ó�� �ϱ� ����)

		System.out.println("[�����ϱ�] =================");
		System.out.println();
		System.out.print  ("���Ź�ȣ : " + str);	//-- ���Ź�ȣ �ҷ��ͼ� �����ؾ� ��
		System.out.println();
		System.out.println("��ȭ     : " + tempTitle);
		System.out.println("�ð�     : " + tempTime);
		System.out.println("�󿵰�   : " + tempScreen + "��");
		System.out.println("�ο�     : " + total + "��");
		System.out.println("�¼�     : " + tempSeat);
		System.out.println();
		System.out.println("============================");
		
		System.out.print("�����Ͻðڽ��ϱ�? (Y/N) :");

		Scanner sc = new Scanner(System.in);
		String sel2 = sc.next();

		System.out.println();

		if (sel2.equals("y") || sel2.equals("Y"))
		{	
			ud.add(new reservedData(str, tempTitle, tempTime, tempScreen, total, tempSeat));
			seatPick3(); //-- ���Ű� �Ϸ�Ǿ��ٴ� ���� ����ϴ� ȭ��
		}
		
		// ������ �޴��� ���ư��� (I,5)
		else if (sel2.equals("n") || sel2.equals("N"))
		{	
			reservedNum.remove(str);
			p_id = "B";	
			for(int i=0; i<total; i++) {
				int row = rows[i];
				int col = cols[i];
				seatInfos[si][row][col] = false;
			}
		}
		else
		{
			reservedNum.remove(str);
			System.out.println("�������� �ʴ� ����Դϴ�.");
			seatPick2(si, rows, cols);
		}

	} //end seatPick2 method

	
	// �¼� ���� ��ɿ��� Y ���� �� ȭ��(I,4)
	public void seatPick3()
	{
		System.out.println("[�����ϱ�] ===============");												
		System.out.println();
		System.out.println("���Ű� �Ϸ�Ǿ����ϴ�.");
		System.out.println();
		System.out.println("==========================");
		System.out.print("0. ������ �޴��� ���ư��� : ");

		Scanner sc = new Scanner(System.in);
		sel = sc.nextInt();
		System.out.println();

		switch(sel)
		{
			case 0: p_id = "B";	//-- ����ȭ�� ���(��������� ó�� ȭ��)
		}
	} //end seatPick3 method

// ============================================================ �� �����ϱ�

	// [���ų��� Ȯ��]�ϴ� �޼��� (C,7)
	public void reservedcheck()
	{
		System.out.println("[���ų��� Ȯ��] ========");
		System.out.println();
		System.out.println("���Ź�ȣ�� �Է����ּ���.");
		System.out.println();	
		System.out.println("========================");
		System.out.println("0. ���� �޴��� ���ư���");
		System.out.println();
		System.out.print("���Ź�ȣ : ");

		Scanner sc = new Scanner(System.in);
		bookNumber = sc.next();
		System.out.println();

		if (reservedNum == null)
		{
			reservedcheck3();
			return;
		}
		
		if (bookNumber.equals("0"))
		{
			p_id = "B";	//-- ����ȭ�� ���(��������� ó�� ȭ��)
		}

		else if (reservedNum.contains(bookNumber)==true) //-- str ���ڰ�(���Ź�ȣ) �� reservedNum(����) ���� ���� ��� 
		{
			p_id = "D7"; //-- ���� ȭ��(���ų��� Ȯ�� ȭ�� D��) ��ȯ
		}
		else
		{
			reservedcheck3(); //-- ���� ���Ź�ȣ �Է� �� ȭ�� ��ȯ
		}
		
	} //end reservedcheck method


	// [���Ź�ȣ �Է�] (D,7)
	public void reservedcheck2()
	{
		int udIndex = reservedNum.indexOf(bookNumber);
		reservedData res_ud = ud.get(udIndex);
		System.out.println("[���ų��� Ȯ��] ============");
		System.out.println(); 
		System.out.print  ("���Ź�ȣ  : " + bookNumber);
		System.out.println();
		System.out.println("��ȭ ���� : " + res_ud.getTitle());
		System.out.println("�ð�      : " + res_ud.getTime());
		System.out.println("�󿵰�    : " + res_ud.getScreen() + "��");
		System.out.println("�ο�      : " + res_ud.getInwon() + "��");
		System.out.println("�¼�      : " + res_ud.getSeatNumber());
		System.out.println();
		System.out.println("============================");
		System.out.print("0. ���� �޴��� ���ư��� : ");

		Scanner sc = new Scanner(System.in);
		sel = sc.nextInt();
		System.out.println();

		switch(sel)
		{
			case 0: p_id = "B"; //-- ����ȭ�� ���(��������� ó�� ȭ��)
		}
		
	} //end reservedcheck2 method


	// ���� ���Ź�ȣ �Է� �� (D,8)
	public void reservedcheck3()
	{
		System.out.println("[���ų��� Ȯ��] =============");
		
		System.out.println(); 
		System.out.println("�������� �ʴ� ���Ź�ȣ�Դϴ�.");
		System.out.println("�ٽ� �Է��� �ּ���.");
		System.out.println();

		System.out.println("=============================");
		System.out.println();

		p_id = "C7"; 
	}

// ======================================================== �� ���ų��� Ȯ��	

	// ���� ��� ù ȭ��(���� ��ȣ �Է��ϴ� ��������) (C,10)
	public void reservCancel()
	{
		System.out.println("[�������] =======================");
		System.out.println();
		System.out.println("���� ��ȣ�� �Է����ּ���. (10�ڸ�)"); 
		System.out.println();
		System.out.println("==================================");
		System.out.println("0. ���� �޴��� ���ư���");
		System.out.println();
		System.out.print("���� ��ȣ �Է�: ");
		Scanner sc = new Scanner(System.in);
		bookNumber = sc.next();
		System.out.println();
			
		if (bookNumber.equals("0"))
			p_id = "B";		 //-- ����ȭ�� ���(��������� ó�� ȭ��)
		else if (reservedNum.contains(bookNumber) == true)		//-- str ���ڰ�(���Ź�ȣ)�� reservedNum(����) ���� ���� ��� 
		{
			p_id = "D9";	 //-- ���� ȭ��(���Ź�ȣ �Է�ȭ�� D��) ��ȯ
		}
		else
			reservCancel3(); //-- ���� ���Ź�ȣ �Է� �� ȭ�� ��ȯ
		if (reservedNum == null)
			reservCancel3();

	} //end reservCancel method


	// [���Ź�ȣ �Է�] (D,9)
	public void reservCancel2()
	{
		int udIndex = reservedNum.indexOf(bookNumber);
		reservedData res_ud = ud.get(udIndex);

		System.out.println("[�������] =================");
		
		System.out.println(); 
		System.out.print  ("���Ź�ȣ  : " + bookNumber);
		System.out.println();
		System.out.println("��ȭ ���� : " + res_ud.getTitle());
		System.out.println("�ð�      : " + res_ud.getTime());
		System.out.println("�󿵰�    : " + res_ud.getScreen() + "��");
		System.out.println("�ο�      : " + res_ud.getInwon() + "��");
		System.out.println("�¼�      : " + res_ud.getSeatNumber());
		System.out.println();
		System.out.println("============================");
		System.out.println("0. ���� �޴��� ���ư���");
		System.out.println();

		System.out.print("���� ����Ͻðڽ��ϱ�? (Y/N) :");	
		Scanner sc = new Scanner(System.in);
		String sel2 = sc.next();

		System.out.println();

		if (sel2.equals("y") || sel2.equals("Y"))
		{	
			int i = reservedNum.indexOf(bookNumber);	//-- ���Ź�ȣ�� ���Ϳ� �� ��°�� ��ġ�ϴ��� ã�Ƽ� i �� ����
			reservedNum.remove(i);
			reservCancelY(); //-- ���Ű� ��ҵǾ��ٴ� ���� ����ϴ� ȭ��
		}
		else if (sel2.equals("n") || sel2.equals("N"))
			p_id = "C9"; //-- �����޴�(���Ź�ȣ �Է��ϴ� ȭ��)�� ���ư��� ȭ��
		else if (sel2.equals("0"))
			p_id = "B";
		else
		{
			System.out.println("�������� �ʴ� ����Դϴ�.");
			p_id = "D9";
		}

	} //end reservCancel2 method


	// ���� ���Ź�ȣ �Է� �� (D,8), (D,11)
	public void reservCancel3()
	{
		System.out.println("[�������] ==================");
		System.out.println(); 
		System.out.println("�������� �ʴ� ���Ź�ȣ�Դϴ�.");
		System.out.println("�ٽ� �Է��� �ּ���.");
		System.out.println();
		System.out.println("=============================");
		System.out.println();

		p_id = "C9"; 
	}


	// [���� ���] (E,9)
	public void reservCancelY()
	{
		System.out.println("[�������] ==============");
		System.out.println(); 
		System.out.println("���Ÿ� ����߽��ϴ�.");
		System.out.println();
		System.out.println("=========================");
		System.out.print("0. ������ �޴��� ���ư��� : ");

		Scanner sc = new Scanner(System.in);
		sel = sc.nextInt();
		System.out.println();

		switch(sel)
		{
			case 0: p_id = "B"; // ����ȭ�� ���(��������� ó�� ȭ��)
		}
	}


	// ���� �󿵰��� ��ϵ� ��ȭ ���� ����ϴ� �޼ҵ�
	public void movieList()
	{
		//�󿵰��� ��ϵ� ��ȭ ���� ����� �迭
		for (int i=0; i<screen.length; i++)
		{
			System.out.printf("��ȭ ���� : %s, �󿵰�: %d��\n", screen[i].title, (i+1));
		}
	}
// ============================================================ �� �������

} //end User class