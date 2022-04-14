package Assignment;


public class AvgEmp {
	
	int Total=10000*3;
	int E1=11000;
	int E2=5000;
	

	public static void main(String[] args) {
		
		AvgEmp F=new AvgEmp();
		F.Sal();
		

	}

	 void Sal() {
		int E3= (Total-(E1+E2));
		System.out.println("the third employee earn "+E3);
		
	}

}
/*
output:
The third employee earn 14000
*/
