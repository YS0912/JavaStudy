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

int ticketNum;	// 예매번호(난수)

String cine;							// 1관 2관 3관
int n;									// 몇 시간마다 상영관 돌릴 건지
boolean[] screen = new boolean[15/n];	// 상영관 회차 이용 여부
String[] screenTime = new String[15/n];	// 상영 회자 정보(시간)

char YN;