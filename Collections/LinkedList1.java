package list;

import java.util.LinkedList;

public class LinkedList1 {
public static void main(String[] args) {
	LinkedList<Integer> link= new LinkedList<Integer>();
	link.addLast(3);
	link.addLast(5);
    link.addLast(7);
	link.addFirst(8);
	link.addFirst(4);
	link.add(56);
	System.out.println(link);
	
	link.remove(3);
	System.out.println(link);

	System.out.println(link.get(4));
	
	for(int i=0;i<link.size();i++) {
		System.out.println(i);
	}


	
}
}
