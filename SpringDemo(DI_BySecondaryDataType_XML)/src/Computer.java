
public class Computer {
	String company;
	HardDisk hsd;
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public HardDisk getHsd() {
		return hsd;
	}
	public void setHsd(HardDisk hsd) {
		this.hsd = hsd;
	}
	@Override
	public String toString() {
		return "Computer [company=" + company + ", hsd=" + hsd + "]";
	}
	public void printData() {
	
		System.out.println("company=" + company);
		System.out.println("hsd=" + hsd );
	}
	
}
