package list;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList1 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(0,6);
		list.add(1,3);
		list.add(2,8);
		list.add(3,9);
		
		System.out.println("1)"+list);
		
		System.out.println(list.get(3));
		
		list.add(1,5);

		System.out.println("2)"+list);
		
		System.out.println(list.set(2, 20));
		System.out.println("3)"+list);
		System.out.println(list.remove(4));
		System.out.println("4)"+list);
		System.out.println(list.size());
		
		for( int i = 0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		Collections.sort(list);
		System.out.println("5)"+list);
		



	}
	
}
