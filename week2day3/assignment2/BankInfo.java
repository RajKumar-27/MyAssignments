package week2day3.assignment2;

public class BankInfo {
	public void saving() {
		System.out.println("This is saving method from BankInfo class");
	}
	public void fixed() {
		System.out.println("This is fixed method from BankInfo class");
	}
	public void deposit() {
		System.out.println("This is deposit method from BankInfo class");
	}
	public static void main(String[] args) {
		Axis a1 = new Axis();
		a1.saving();
		a1.fixed();
		a1.deposit();
	}
}
