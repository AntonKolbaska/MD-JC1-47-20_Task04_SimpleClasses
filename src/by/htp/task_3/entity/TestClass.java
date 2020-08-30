package by.htp.task_3.entity;

import by.htp.task_3.logic.CounterLogic;

public class TestClass {

	public static void main(String[] args) {
		Counter c = new Counter(10, 0, 20);
		c.print();
		for(int i=0; i<11; ++i) {
			CounterLogic.increase(c);
			c.print();
		}
		for(int i=0; i<21; ++i) {
			CounterLogic.decrease(c);
			c.print();
		}
	}

}
