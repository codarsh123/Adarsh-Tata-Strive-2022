package collectionsFramework;

import java.util.Set;
import java.util.TreeSet;

public class Sets1 {
	public static void main(String[] args) {
		Set<Integer> st= new TreeSet<Integer>();
		st.add(35);
		st.add(67);
		st.add(17);

		st.add(82);
		st.add(94);
		st.add(37);

		//System.out.println(st);
		
		for(int i : st) {
			System.out.println(i);
		}
	}

}
