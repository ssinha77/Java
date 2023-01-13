package question08;
import java.util.HashMap;
public class Tester {
	 public static void main(String[] args) {
	        HashMap<Integer,Double> courseDetails = new HashMap<>();
	        courseDetails.put(1001,55000.00);
	        courseDetails.put(1002,35675.00);
	        courseDetails.put(1003,28300.00);
	        courseDetails.put(1004,28350.00);
	        courseDetails.put(1005,115000.00);

	        Student student = new Student();
	        student.setName("Peter");
	        student.setRegistrationId(5001);
	        student.setQualifyingMarks(85);
	        student.setCourseId(1002);
	        student.setHostelRequired(true);


	        boolean isValidStudent = Validation.validateStudent(student);
	        if(isValidStudent){
	           double fees = Validation.calculateFees(student.getQualifyingMarks(), student.getCourseId(), courseDetails.get(student.getCourseId()));
	            System.out.println(fees);
	            System.out.println("***********Course Allocation Details***************");
	            System.out.println("Student Name                :" + student.getName());
	            System.out.println("Course Id                   :" + student.getCourseId());
	            System.out.println("Qualifying Exam Marks       :" + student.getQualifyingMarks());
	            System.out.println("Student's Registration Id   :" +student.getRegistrationId());
	            System.out.println("Total Course Fee            :" + fees);
	            System.out.println("Hostel Required             :" + student.isHostelRequired());
	        }
	    }



	


}
