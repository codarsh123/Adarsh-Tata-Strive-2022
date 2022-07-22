package lab2207;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ValueRetrive {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		Map<Integer,String> map= new HashMap<Integer,String>();
		map.put(1, "john");
		map.put(2, "sam");
		map.put(3, "ron");
		map.put(4, "harry");
		
		System.out.println("enter a value");
		Integer a=sc.nextInt();
		System.out.println(map.get(a));
		sc.close();
	}
}														
