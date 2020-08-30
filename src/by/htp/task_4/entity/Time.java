package by.htp.task_4.entity;

import by.htp.task_4.logic.TimeLogic;

public class Time {
	private int hour;
	private int min;
	private int sec;

	public Time() {
		this.hour = 0;
		this.min = 0;
		this.sec = 0;
	}

	public Time(int h, int m, int s) {
		this.hour = h;
		this.min = m;
		this.sec = s;
		//check
		TimeLogic.check(this);
	}
	public int getHours() {
		return this.hour;
	}
	public int getMin() {
		return this.min;
	}
	public int getSec() {
		return this.sec;
	}
	public void setHour(int h) {
		this.hour = h;
		TimeLogic.check(this);
	}
	public void setMin(int m) {
		this.min = m;
		TimeLogic.check(this);
	}
	public void setSec(int s) {
		this.sec = s;
		TimeLogic.check(this);
	}
	public void print() {
		System.out.println("H: " + this.hour + " M: " + this.min + " S: " + this.sec);
	}
}
