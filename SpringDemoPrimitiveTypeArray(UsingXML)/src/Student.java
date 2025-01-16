import java.util.Arrays;

public class Student {

	String sname[];

	public Student() {}

	public Student(String[] sname) {
		super();
		this.sname = sname;
	}

	public String[] getSname() {
		return sname;
	}

	public void setSname(String[] sname) {
		this.sname = sname;
	}

	@Override
	public String toString() {
		return "Student [sname=" + Arrays.toString(sname) + "]";
	}
	public void display() {
		
		System.out.println("Student names are :");
		for(int i=0;i<sname.length;i++)
		{
			System.out.println(" " + sname[i] );
		}
	}
}
