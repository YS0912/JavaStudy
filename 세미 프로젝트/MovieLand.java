public static MovieLand
{}

String nameM;
int rateM;
int runtimeM;

int inwonAdult;
int inwonTeen;
int inwonChild;

boolean[] seat = new boolean[5, 5];
int line;
int row;

int ticketNum;	// ���Ź�ȣ(����)

String cine;							// 1�� 2�� 3��
int n;									// �� �ð����� �󿵰� ���� ����
boolean[] screen = new boolean[15/n];	// �󿵰� ȸ�� �̿� ����
String[] screenTime = new String[15/n];	// �� ȸ�� ����(�ð�)

char YN;