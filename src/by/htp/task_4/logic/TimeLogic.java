package by.htp.task_4.logic;

import by.htp.task_4.entity.Time;

public class TimeLogic {
	private Time t;

	private static int convertToSec(Time t) {
		int seconds = t.getHours() * 3600 + t.getMin() * 60 + t.getSec();
		return seconds;
	}

	private static Time convertToNormal(int sec) {
		Time t = new Time();
		t.setHour(sec / 3600);
		t.setMin((sec % 3600) / 60);
		t.setSec((sec % 3600) % 60);
		return t;
	}
	
	public static Time check(Time t) {
		if(t.getHours()>23 || t.getHours()<0) {
			t.setHour(0);
			System.out.println("Invalid hours");
		}
		if(t.getMin()>59 || t.getMin()<0) {
			t.setMin(0);
			System.out.println("Invalid minutes");
		}
		if(t.getSec()>59 || t.getSec()<0) {
			t.setSec(0);
			System.out.println("Invalid seconds");
		}
		return t;
	}
	
	
	public static void changeTime(Time t, int h, int m, int s) {
		int temp = convertToSec(t);
		//System.out.println(temp);
		temp = temp + h*3600 + m*60 + s;
		//System.out.println(temp);
		t = convertToNormal(temp);
	}
	
}
