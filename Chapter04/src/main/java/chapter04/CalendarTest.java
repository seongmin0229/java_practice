package chapter04;

import java.util.Calendar;

public class CalendarTest {
	public static void main(String args[]) {
		Calendar cal = Calendar.getInstance();	// 얘는 추상 클래스라서 new 못씀. 대신 getinstance쓰면 알아서 객체 생성해서 줌.
		printDate(cal);
		
		cal.set(Calendar.YEAR, 2023);
		cal.set(Calendar.MONTH, 11);	// 12월
		cal.set(Calendar.DATE, 25);		// 연도 -> 월 -> 일 순으로만 세팅할 수 있음.
		printDate(cal);
		
		cal.set(2022, 7, 28);
		cal.add(Calendar.DATE, 365);
		printDate(cal);
	}
	
	public static void printDate(Calendar c) {
		final String[] DAYS = {"일", "월", "화", "수", "목", "금", "토"};
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH) + 1;	// 0~11, +1
		int date = c.get(Calendar.DATE);
		int day = c.get(Calendar.DAY_OF_WEEK);	//1(일)~7(토)
		int hour = c.get(Calendar.HOUR);
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);
		System.out.println(
			year + "-" + 
			month + "-" + 
			date + " " +
			DAYS[day - 1] + "요일 " + 
			hour + ":" + 
			minute + ":" + 
			second);
	}
}
