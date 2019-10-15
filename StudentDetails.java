import java.util.Scanner;

public class StudentDetails {
	
	String name;
	int roll_no;
	double[] subject;
	int marksObtained;
	static double maxMarks = 400;
	
	public StudentDetails() {}
	
	StudentDetails(String name, int roll_no, double[] subject) {
		this.name = name;
		this.roll_no = roll_no;
		this.subject = subject;
	}
	
	void calculateMarks() {
		for(double m:subject) {
			marksObtained += m;
		}
	}
	
	void calculateMarks(int m) {
		calculateMarks();
	}
	
	void calculateMarks(double m) {
		
	}
	
	void calculateMarks(int m1, int m2) {
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
