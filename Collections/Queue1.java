package collectionsFramework;

import java.util.LinkedList;
import java.util.Queue;

public class Queue1 {

	public static void main(String[] args) {
		Queue<Integer> O=new LinkedList<Integer>();
		O.add(1);
		O.add(2);
		O.add(3);
		O.add(4);
		O.offer(5);
		
		
		System.out.println(O);
		System.out.println(O.peek());
		System.out.println(O.poll());
		System.out.println(O.poll());

		System.out.println(O.poll());
		System.out.println(O.poll());

		System.out.println(O.poll());

		System.out.println(O.poll());
		System.out.println(O.poll());



	}
}
