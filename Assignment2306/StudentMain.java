package Assignment;

import java.util.Arrays;

public class StudentMain {

	public static void main(String[] args) {
		
                     //Creating Student Objects
			StudentSort s1=new StudentSort(13,"pratik","Maths",88);
			StudentSort s2=new StudentSort(23,"Vinod","Chemistry",54);
			StudentSort s3=new StudentSort(33,"roy","CS",67);
			StudentSort s4=new StudentSort(43,"John","English",76);
			StudentSort s5=new StudentSort(53,"amol","Physics",76);
			StudentSort[] arr= {s1,s2,s3,s4,s5};
			
			Arrays.sort(arr, new NameComparator());
			
			for(StudentSort St : arr)
			{
				System.out.println(St+ " ");
			}
			System.out.println(" ");
			
            Arrays.sort(arr, new TotalMarksComparator());
			
			for(StudentSort St : arr)
			{
				System.out.println(St+ " ");
			}
	}	
	
}
	

