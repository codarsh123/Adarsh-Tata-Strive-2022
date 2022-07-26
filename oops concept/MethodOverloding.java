package polymorphism;

public class MethodOverloding //Also called as compile time polymorphism
{

	    void add() //method with same name but different parameters id called method overloading
	{          
		int a=3; int b=5; int c= a+b;
		System.out.println(c);
	}
		void add(int x,int y)   //method with same name but different parameters id called method overloading
		{
			int c=x+y;
			System.out.println(c);
		}
		void add(int x,double y) //method with same name but different parameters id called method overloading
		{
			double c=x+y;
			System.out.println(c);
		}
     public static void main(String[] args) 
	{
		MethodOverloding Mo=new MethodOverloding();
		Mo.add();
		Mo.add(34, 45.33);
		Mo.add(23, 56);
	}
}
