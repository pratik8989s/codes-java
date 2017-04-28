package com.pratik1;

public class Prod {
	
	private int pid;
	private int pcost1;
	private int pcost2;
	private int pcost3;
	private String pname;
	
	
	
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public int getPcost1() {
		return pcost1;
	}
	public void setPcost1(int pcost1) {
		this.pcost1 = pcost1;
	}
	public int getPcost2() {
		return pcost2;
	}
	public void setPcost2(int pcost2) {
		this.pcost2 = pcost2;
	}
	public int getPcost3() {
		return pcost3;
	}
	

	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	
	
	@Override
	public String toString() {
	
		return "Product ID: "+pid+"\nProduct Name: "+pname +"\nProduct cost: "+pcost3;
	}
	public void calculate()
	{
		
	this.pcost3=this.pcost2+this.pcost1;
	}
	
	
}
