package lab1407;

import java.util.LinkedList;
import java.util.Scanner;

public class ReverseLL {

	static LinkedList<Integer> reverse(LinkedList<Integer> ll)
	{
		for(int i=ll.size()-1; i>=0; i--)
		{
			System.out.print(ll.get(i) + " ");
		}
		
		return ll;
	}

	public static void main(String[] args) {
		
		LinkedList<Integer> ll = new LinkedList<Integer>();
		Scanner sc = new Scanner (System.in);
		System.out.println("enter 1st Element");
		ll.addFirst(sc.nextInt());
		System.out.println("Enter 2nd Element");
		ll.addLast(sc.nextInt());
		
		System.out.println("BEFORE REVERSING : ");
		System.out.println(ll);
		System.out.println();
		
		System.out.println("AFTER REVERSING");
		reverse(ll);
		sc.close();
	}
}
