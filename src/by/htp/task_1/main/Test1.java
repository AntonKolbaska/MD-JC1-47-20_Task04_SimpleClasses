package by.htp.task_1.main;

public class Test1 {
	private int x;
	private int y;
	public Test1(){
		this.x=10;
		this.y=20;
	}
	public void print() {
		System.out.println("x: " + this.x + " y: " + y);
	}
	public void setX(int nx) {
		this.x = nx;
	}
	public void setY(int ny) {
		this.y = ny;
	}
	public int compare() {
		if(this.x>this.y) {
			return this.x;
		}
		else {
			return this.y;
		}
	}
	public int sum() {
		return this.x+this.y;
	}
	
	
	public static void main(String[] args) {
		Test1 test = new Test1();
		test.print();
		System.out.println(test.sum());
		System.out.println(test.compare());
		test.setX(80);
		test.print();
	}
}
