package Assignment;

import java.util.Comparator;

public class NameComparator implements Comparator<StudentSort> {

	@Override
	public int compare(StudentSort o1, StudentSort o2) {
		// TODO Auto-generated method stub
		return o1.Stdname.compareToIgnoreCase(o2.Stdname);
	}

	
	

}
