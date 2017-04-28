package com.pratik1;

public class MainProd {

	public static void main(String[] args) {
		System.out.println("hello world");

		Prod p=new Prod();
		p.setPcost1(20);
		p.setPcost2(30);
		p.setPid(124);
		p.setPname("ghee");
		p.calculate();
		
		
		Prod d=new Prod();
		d.setPcost1(45);
		d.setPcost2(87);
		d.setPid(123);
		d.setPname("masala");
		d.calculate();
		
		/*System.out.println("name is: "+p.getPname());
		System.out.println("cost is: "+p.getPcost3());*/
		System.out.println("everything is:\n"+p);
		System.out.println("everything is:\n"+d);
		
		
		
	}

}
