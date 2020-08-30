package by.htp.task_3.logic;

import by.htp.task_3.entity.Counter;

public class CounterLogic {
	private Counter counter;
	public static Counter increase(Counter counter) {
		int temp = counter.getX();
		if(temp==counter.getUpperBorder()) {
			System.out.println("Unavailable to increase");
		}
		else {
			counter.setX(++temp);
		}
		return counter;
	}
	public static Counter decrease(Counter counter) {
		int temp = counter.getX();
		if(temp==counter.getLowerBorder()) {
			System.out.println("Unavailable to decrease");
		}
		else {
			counter.setX(--temp);
		}
		return counter;
	}
}
