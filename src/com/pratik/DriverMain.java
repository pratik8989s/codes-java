package com.pratik;

public class DriverMain {

	public static void main(String[] args) {
		Employee obj1=new Employee(1001,"suhas",100);
		Employee obj2=new Employee(1002,"vijay",200);

		
		
		Employee emp[]={obj1,obj2};
		int emp1[]=new int[3];
		
		
		

		for (int i=0;i<emp.length;i++)
		{
		System.out.println(emp[i].getEmpid());
		System.out.println(emp[i].getEname());
		System.out.println(emp[i].getSal());
		}

	}

}
