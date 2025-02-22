package com.Model;

public class Product {

	int pid;
	String pname;
	int pqnty;
	double price;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int pid, String pname, int pqnty, double price) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pqnty = pqnty;
		this.price = price;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPqnty() {
		return pqnty;
	}
	public void setPqnty(int pqnty) {
		this.pqnty = pqnty;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", pqnty=" + pqnty + ", price=" + price + "]";
	}
	 public void display()
	  {
		 System.out.println("Product Id:"+pid);
		 System.out.println("Product Name:"+pname);
		 System.out.println("Product Qty:"+pqnty);
		 System.out.println("Product Price:"+price);
	  }
	
}
