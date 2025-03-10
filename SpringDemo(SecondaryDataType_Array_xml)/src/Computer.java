import java.util.Arrays;

public class Computer {
	String company;
	HardDisk hsd[];
	
	public Computer() {
		
	}

	public Computer(String company, HardDisk[] hsd) {
		super();
		this.company = company;
		this.hsd = hsd;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public HardDisk[] getHsd() {
		return hsd;
	}

	public void setHsd(HardDisk[] hsd) {
		this.hsd = hsd;
	}

	@Override
	public String toString() {
		return "Computer [company=" + company + ", hsd=" + Arrays.toString(hsd) + "]";
	}

	public void printData() {
	
		System.out.println("company=" + company);
		for(int i=0;i<hsd.length;i++)
		{
			System.out.println("hsd=" + hsd[i] );
		}
	}
	
}
