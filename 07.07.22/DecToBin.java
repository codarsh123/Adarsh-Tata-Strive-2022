package assignment0707;

import java.util.Scanner;

public class DecToBin {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Binary Number:");
		int dec=sc.nextInt();
		System.out.println(Integer.toBinaryString(dec));
	}

}
