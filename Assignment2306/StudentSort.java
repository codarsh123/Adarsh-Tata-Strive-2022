package Assignment;

public class StudentSort {

	int Stdroll;
	String Stdname;
	String sub;
	int TotalMarks;
	
	public StudentSort(int Stdroll, String Stdname, String sub, int TotalMarks) {
		super();                                   //creating parameterized constructor for the given fields
		this.Stdroll = Stdroll;
		this.Stdname = Stdname;
		this.sub = sub;
		this.TotalMarks = TotalMarks;
	}
	@Override
	public String toString() {                     //to get string representation of the object
		return "StudentSort [Stdroll=" + Stdroll + ", Stdname=" + Stdname + ", sub=" + sub + ", TotalMarks="+ TotalMarks + "]";
	}
	
	
	
	
	 
}
