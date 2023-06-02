package week2day3.assignment3.student;

import week2day3.assignment3.department.Department;

public class Student extends Department{
	public void studentName() {
		System.out.println("This is studentName method from Student class of student package");
	}
	public void studentDept() {
		System.out.println("This is studentDept method from Student class of student package");
	}
	public void studentId() {
		System.out.println("This is studentId method from Student class of student package");
	}
	
	public static void main(String[] args) {
		Student stud = new Student();
		stud.collegeName();
		stud.collegeCode();
		stud.collegeRank();
		stud.deptName();
		stud.studentName();
		stud.studentDept();
		stud.studentId();
	}
	
	

}
