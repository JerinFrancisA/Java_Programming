import java.util.Scanner;

public class StudentDetails {
	
	String name;
	int roll_no;
	double[] subject;
	double marksObtained;
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
		System.out.println(marksObtained);
	}
	
	void calculateMarks(int m) {
		calculateMarks();
		marksObtained  = marksObtained*(1.08);
		if(marksObtained>400.0) {
			marksObtained = 400.0;
		}
		System.out.println(marksObtained);
	}
	
	void calculateMarks(double m) {
		calculateMarks();
		marksObtained  = marksObtained*(1.045);
		if(marksObtained>400.0) {
			marksObtained = 400.0;
		}
		System.out.println(marksObtained);
	}
	
	void calculateMarks(int m1, int m2) {
		calculateMarks();
		marksObtained = marksObtained*(1.045 + 1.08);
		if(marksObtained>400.0) {
			marksObtained = 400.0;
		}
		System.out.println(marksObtained);
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String a = in.next();
		int b = in.nextInt();
		double c[] = new double[4];
		for(int i = 0; i < 4; i++) {
			c[i] = in.nextDouble();
		}
		StudentDetails s = new StudentDetails(a, b, c);
		s.calculateMarks();
		s.calculateMarks(2.0);
		s.calculateMarks(1);
		s.calculateMarks(1, 2);
	}
}
