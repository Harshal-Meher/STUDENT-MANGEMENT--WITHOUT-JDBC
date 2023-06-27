package model;

public class Student {

	private int roll;
	private String name;
	private String add;
	private double p1,p2,p3,result;
	
	public Student() {
		super();
	
	}

	public Student(int roll, String name, String add, double p1, double p2, double p3, double result) {
		this.roll = roll;
		this.name = name;
		this.add = add;
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
		this.result = result;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdd() {
		return add;
	}

	public void setAdd(String add) {
		this.add = add;
	}

	public double getP1() {
		return p1;
	}

	public void setP1(double p1) {
		this.p1 = p1;
	}

	public double getP2() {
		return p2;
	}

	public void setP2(double p2) {
		this.p2 = p2;
	}

	public double getP3() {
		return p3;
	}

	public void setP3(double p3) {
		this.p3 = p3;
	}

	public double getResult() {
		return result;
	}

	public void setResult(double result) {
		this.result = result;
	}
	
	
	
}
