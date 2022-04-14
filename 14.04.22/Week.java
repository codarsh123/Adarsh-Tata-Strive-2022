package Assignment;
import java.util.Scanner;
public class Week {

	public static void main(String[] args)  
	{ 
		 int nos;
		 Scanner sc = new Scanner(System.in);
		
		 boolean input=true;
		 do {
		    System.out.println("Type a Number:");
		    nos = sc.nextInt();	  
		    switch (nos) {
	        case 1:
	            System.out.println("Monday");
	            break;
	        case 2:
	            System.out.println("Tuesday");
	            break;
	        case 3:
	            System.out.println("Wednesday");
	            break;
	        case 4:
	            System.out.println("Thursday");
	            break;
	        case 5:
	            System.out.println("Friday");
	            break;
	        case 6,7:
	            System.out.println("Weekend");
	            break;
	        case 8:
	        	input= false;
	            System.out.println("Have a good day");	           
	        default:
	            System.out.println("Re-enter");
	            break;
		    }
		 }
		    while(input==true); 
		    	
		    
		   
		    
	}

}

/*
output:
Type a Number:
1
Monday
Type a Number:
2
Tuesday
Type a Number:
3
Wednesday
Type a Number:
4
Thursday
Type a Number:
5
Friday
Type a Number:
6
Weekend
Type a Number:
7
Weekend
Type a Number:
8
Have a good day
Re-enter
*/