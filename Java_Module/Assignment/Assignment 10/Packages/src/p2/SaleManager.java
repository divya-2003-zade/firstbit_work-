package p2;

import p1.Employee;

public class SaleManager extends Employee{
	private double incentive;
	private int target;
	public SaleManager(int id, String name, double salary, double incentive, int target) {
		super(id, name, salary);
		this.incentive = incentive;
		this.target = target;
	}
	public double getIncentive() {
		return incentive;
	}
	public void setIncentive(double incentive) {
		this.incentive = incentive;
	}
	public int getTarget() {
		return target;
	}
	public void setTarget(int target) {
		this.target = target;
	}
	public double calSal() {
		return salary+incentive;
	}
	public String toString() {
	 return "SaleManager [id=" +id + " "
				+ ",name= " + name + 
				", salary = "+salary+
				",incentive = "+incentive+
				", target= "+target+
				"]";

	}
}
