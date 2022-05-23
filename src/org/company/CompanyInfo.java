package org.company;


public class CompanyInfo {
	public void companyName() {
		System.out.println("Company Name Details");
		
	}
	public void companyName(int id) {
		System.out.println("Company Id number is:"+id);
	}
	public void companyName(String name) {
		System.out.println("Company Name is:"+name);
	}
	public void companyName(long mob,String loc) {
		System.out.println("Company Mobile num is:"+mob);
		System.out.println("Company Location is:"+loc);
	}
	public static void main(String[] args) {
		CompanyInfo c=new CompanyInfo();
		c.companyName();
		c.companyName(9393);
		c.companyName("CTS");
		c.companyName(7708709816l, "Coimbatore");
		c.companyName();
		c.companyName(1393);
		c.companyName("EPAM");
		c.companyName(7708709816l, "Bangalore");
	}
}
