package com.pratik;

public class Employee {
// private public protected	
	private int empid;
	private String ename;
	private int sal;
	private int da;
	private int hra;
	private int total;
	
	

	public Employee(int empid, String ename, int sal) {
		super();
		this.empid = empid;
		this.ename = ename;
		this.sal = sal;
	}

	public int getDa() {
		return da;
	}
	
	public int getHra() {
		return hra;
	}
	public void setHra(int hra) {
		this.hra = hra;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}	
	
	
	
	
	void calculate()
	{
	
		if (this.sal >= 30000)
		{
			this.da=2000;
			this.total=this.sal+this.da+this.hra;
		}
		else
		{
			this.da=3000;	
			this.total=this.sal+this.da+this.hra;
		}
		
	}
	
	public int getTotal() {
		return total;
	}
	
	

}
