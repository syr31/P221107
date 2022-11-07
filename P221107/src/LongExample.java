import java.util.Calendar;

public class LongExample {
	enum Week {                    // "상수"를 작성할 때 대문자롤 작성한다.
									
		MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
	};

	public static void main(String[] args) {
		Week today = null;
	//변수타입 변수명
		Calendar cal = Calendar.getInstance();     // 내 컴퓨터에 있는 날짜를 읽어온다.싱글턴 패턴 딱 객체를 한개 혹은 두 세개만 생성 
		int iWeek = cal.get(Calendar.DAY_OF_WEEK); //new라는 키워드를 쓰지않고

		switch (iWeek) {
		case 1:
			today = Week.SUNDAY;      //today 넣은 수 있는 값은 한정되어있다.
			break;
		case 2:
			today = Week.MONDAY;
			break;
		case 3:
			today = Week.TUESDAY;
			break;
		case 4:
			today = Week.WEDNESDAY;
			break;
		case 5:
			today = Week.THURSDAY;
			break;
		case 6:
			today = Week.FRIDAY;
			break;
		case 7:
			today = Week.SATURDAY;
			break;
		}
		System.out.println("오늘 요일 : " + today);

		if (today == Week.SUNDAY) {
			System.out.println("오늘은 쉬는 날 입니다.");
		} else {
			System.out.println("오늘은 공부하는 날 입니다.");

		}
	}
}
