
public class HardDisk {
	String size;
	
	public HardDisk() {
		
	}

	public HardDisk(String size) {
		super();
		this.size = size;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "HardDisk [size=" + size + "]";
	}
	
}
