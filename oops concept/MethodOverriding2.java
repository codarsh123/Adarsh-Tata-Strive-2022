package polymorphism;

public class MethodOverriding2 extends MethodOverriding{
 
	@Override //Doesn't play a role in running program it only indicates that this method is overridden for others to know
	void company() {
		super.company();
		System.out.println("this company is called Amazon ");
	}
}
