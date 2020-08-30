package by.htp.task_4.entity;

import by.htp.task_4.logic.TimeLogic;

public class TestClass {

	public static void main(String[] args) {
		Time t = new Time(02, 12, 13);
		t.print();
		TimeLogic.changeTime(t, 10, 3, 6);
		t.print();
	}

}
