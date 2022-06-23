package Assignment;

import java.util.Comparator;

public class TotalMarksComparator implements Comparator<StudentSort>{

	@Override
	public int compare(StudentSort o1, StudentSort o2) {
		return o1.TotalMarks -o2.TotalMarks;
	}

	

}
