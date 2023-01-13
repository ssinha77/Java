package question04;

public class Candidate {
	  private String name;
	    private int age;
	    private String education;

	    public Candidate(String name, int age, String education) {
	        this.name = name;
	        if (age < 21) {
	            throw new AgeException("under age");
	        } else if (age > 60) {
	            throw new AgeException("over age");
	        }
	        if (!education.equals("Btech")) {
	            throw new EduException("Sorry ! Invalid Education");
	        }
	        this.age = age;
	        this.education = education;
	        System.out.println("Candidate created successfully");
	    }
	}


