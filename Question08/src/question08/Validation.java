package question08;

import java.util.HashMap;
public class Validation {

    public static boolean validateMarks(double marks) {
        if (marks < 65) {
            System.out.println("Marks is less than 65. You are not eligible for admission");
            return false;
        }
        return true;
    }

    public static boolean validateCourseId(int courseId) {
        if (courseId < 1001 || courseId > 1005) {
            System.out.println("Invalid Course Id");
            return false;
        }
        return true;
    }

    public static double calculateFees(double marks, int courseId, double amount) {
        if (marks >= 65 && marks <= 69) {
            return discountedFees(amount, 5);
        } else if (marks >= 70 && marks <= 84) {
            return discountedFees(amount, 10);
        } else if (marks >= 85) {
            return discountedFees(amount, 15);
        } else
            return amount;

    }

    public static boolean validateStudent(Student student){
        if(!validateMarks(student.getQualifyingMarks())){
            return false;
        }
        if(!validateCourseId(student.getCourseId())) {
            return false;
        }
        return true;
    }

    private static double discountedFees(double amount, int percent) {
        double x = percent / 100.00;
        double y = x * amount;
        return amount - y;

    }
}
