package by.htp.task_3.entity;

public class Counter {
	private int x;
	private int lowerBorder;
	private int upperBorder;

	public Counter() {
		this.lowerBorder = 0;
		this.upperBorder = 10;
		this.x = 0;
	}

	public Counter(int x, int lb, int ub) {
		this.lowerBorder = lb;
		this.upperBorder = ub;
		this.x = x;
	}

	public void print() {
		System.out.println("Range: " + this.lowerBorder + " up to " + this.upperBorder + "\nx: " + this.x);
	}

	public int getLowerBorder() {
		return this.lowerBorder;
	}

	public int getUpperBorder() {
		return this.upperBorder;
	}

	public int getX() {
		return this.x;
	}

	public void setLowerBorder(int nlb) {
		this.lowerBorder = nlb;
	}

	public void setUpperBorder(int nub) {
		this.upperBorder = nub;
	}

	public void setX(int nx) {
		this.x = nx;
	}
	
	
}
