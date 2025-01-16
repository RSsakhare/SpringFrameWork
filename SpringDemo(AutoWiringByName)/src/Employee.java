
public class Employee {

	int eid;
	String ename;
	int esal;
	Address paddr;
	Address taddr;
	Address oaddr;
	public Employee() {}
	public Employee(int eid, String ename, int esal, Address paddr, Address taddr, Address oaddr) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
		this.paddr = paddr;
		this.taddr = taddr;
		this.oaddr = oaddr;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getEsal() {
		return esal;
	}
	public void setEsal(int esal) {
		this.esal = esal;
	}
	public Address getPaddr() {
		return paddr;
	}
	public void setPaddr(Address paddr) {
		this.paddr = paddr;
	}
	public Address getTaddr() {
		return taddr;
	}
	public void setTaddr(Address taddr) {
		this.taddr = taddr;
	}
	public Address getOaddr() {
		return oaddr;
	}
	public void setOaddr(Address oaddr) {
		this.oaddr = oaddr;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", esal=" + esal + ", paddr=" + paddr + ", taddr=" + taddr
				+ ", oaddr=" + oaddr + "]";
	}
}