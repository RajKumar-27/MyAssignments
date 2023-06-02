package week2day3.assignment4;

public class Students {
	public void getStudentInfo() {
		System.out.println("The details of given student:");
	}
	public void getStudentInfo(int id) {
		System.out.println("The id of given student is "+id);
	}
	public void getStudentInfo(String name, String dept) {
		System.out.println("The name of given student is "+name);
		System.out.println("The department of given student is "+dept);
	}
	public void getStudentInfo(String email,double phno) {
		System.out.println("The emailid of given student is "+email);
		System.out.println("The phone number of given student is "+phno);
	}
	public static void main(String[] args) {
		Students stud = new Students();
		stud.getStudentInfo();
		stud.getStudentInfo(100001);
		stud.getStudentInfo("Raj Kumar", "Mechanical");
		stud.getStudentInfo("rajkumarmg@yahoo.com", 9940299402d);
	}
}