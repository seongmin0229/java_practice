package chapter04;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		Date now = new Date();
		
		//시간을 내 입맛대로 변환시키고 싶음
		printDate01(now);
		printDate02(now);
	}
	
	public static void printDate01(Date d) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH:mm:ss");
		String date = sdf.format(d);
		System.out.println(date);
	}
	
	public static void printDate02(Date d) {
		// 년도	(+1900을 해줘야함, Y2K 이슈때문에)
		int year = d.getYear();
		
		// 월	(+1을 해줘야함 전산은 0부터 시작이기 때문)
		int month = d.getMonth();
		
		// 일
		int day = d.getDay();
		
		// 시
		int hour = d.getHours();
		
		// 분
		int minute = d.getMinutes();
		
		// 초
		int second = d.getSeconds();
		
		
		System.out.println(
				(year + 1900) + "-" + 
				(month > 9 ? "" : "0") + (month + 1) + "-" + 
				day + " " + 
				hour + ":" + 
				minute + ":" + 
				second
				);
		
		
	}

}
