package assignment2306;

public class RectangleArea {
	
	private int rl;
	private int rb;
	public int getRl() {
		return rl;
	}
	public void setRl(int rl) {
		if(rl<=10 || rl>=50) {
			System.out.println("Lenth should between 10 to 50");
		}
		this.rl = rl;
	}
	public int getRb() {
		return rb;
	}
	public void setRb(int rb) {
		if(rb<=5 || rb>=20) {
			System.out.println("Lenth should between 5 to 20");
		}
		this.rb = rb;
	}
	
	public RectangleArea(int rl, int rb) {
		
		setRl(rl);
		setRb(rb);
	}
	void displayArea() {
		if(getRb()<=20 && getRb()>=5)
		{
			if(getRl()<=50 && getRl()>=10) {
				System.out.println(getRb()*getRl());
			}
			else {
				System.out.println("Rl Error!");
			}
		}
		else {
			System.out.println("Rb Error!");
			
		}
	}
	
}
