import java.util.Scanner;

class NotEligibleException extends Exception {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	public String toString() {
		return "Not Eligible";
	}
}

class LowAttendanceException extends Exception {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	public String toString() {
		return "Insufficient Attendance";
	}
}

class LowMarksException extends Exception {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	public String toString() {
		return "Insufficient Marks";
	}
}

class Exam {
	int marks, attendance;
	public Exam() {}
	public Exam(int marks, int attendance) {
		this.marks = marks;
		this.attendance = attendance;
		
	}
	void amiIEligibile() throws NotEligibleException {
		NotEligibleException ne = new NotEligibleException();
		if(marks < 20) {
			ne.initCause(new LowMarksException());
			throw ne;
		}
		else if(attendance < 80) {
			ne.initCause(new LowAttendanceException());
			throw ne;
		}
		else {
			System.out.println("Congrats! you are Eligible!");
		}
	}
}

public class Eligibility {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Marks and Attedance : ");
		int marks = in.nextInt(), attendance = in.nextInt();
		Exam student = new Exam(marks, attendance);
		try {
			student.amiIEligibile();
		} catch (NotEligibleException e) {
			e.printStackTrace();
			System.out.println(e.getCause());
		}
		in.close();
	}

}
