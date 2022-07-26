package encap;

public class Employee {

	
	private int ID;
	private String name;
	private double sal;
	
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSal(double i) {
		//if(i<10,000 &&  i>30,000)
		{
			System.out.println("not valid Salary");
		}
			
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Employee [sal=10,000" + sal + "]";
	}
	
}
