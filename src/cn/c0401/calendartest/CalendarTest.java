package cn.c0401.calendartest;

import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.GregorianCalendar;

/*
 * 关于calendar的使用示例
 */
public class CalendarTest {
	public static void main(String[] args) {
		//创建d为正确的日期
		GregorianCalendar d = new GregorianCalendar();
		
		int today = d.get(Calendar.DAY_OF_MONTH);
		int mouth = d.get(Calendar.MONTH);
		//将d设为月份的开始日期
		d.set(Calendar.DAY_OF_MONTH,1);
		
		int weekday = d.get(Calendar.DAY_OF_WEEK);
		//得到一周的第一天
		int firstDayOfWeek = d.getFirstDayOfWeek();
		//确定第一行正确的日期缩进
		int indent = 0;
		while (weekday != firstDayOfWeek) {
			indent++;
			d.add(Calendar.DAY_OF_MONTH, -1);
			weekday = d.get(Calendar.DAY_OF_WEEK);	
		}
		//打印星期名字
		String[] weekdayNames = new DateFormatSymbols().getShortWeekdays();		
		do {
			System.out.printf("%4s",weekdayNames[weekday]);
			d.add(Calendar.DAY_OF_MONTH, 1);
			weekday = d.get(Calendar.DAY_OF_WEEK);
		} while (weekday != firstDayOfWeek);
		System.out.println();
		//根据indent打印一号前面的缩进
		for (int i = 1; i <= indent; i++) {
			System.out.print("    ");			
		}
		
		d.set(Calendar.DAY_OF_MONTH, 1);
		do {
			//打印日
			int day =d.get(Calendar.DAY_OF_MONTH);
			System.out.printf("%3d",day);
			//标记当日
			if (day == today) {
				System.out.print("*");
			} else {
				System.out.print(" ");
			}
			//将d指向下一天
			d.add(Calendar.DAY_OF_MONTH, 1);
			weekday = d.get(Calendar.DAY_OF_WEEK);
			//在星期的开始换行
			if (weekday == firstDayOfWeek) {
				System.out.println();
			}
		} while (d.get(Calendar.MONTH) == mouth);
		//打印最后一行如果必要
		if (weekday != firstDayOfWeek ) {
			System.out.println();
		}	
	}
}
