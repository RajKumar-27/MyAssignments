package week2day3.assignment1;

public class Desktop extends Computer{
	public void desktopSize() {
		System.out.println("This is desktopSize method from Desktop class");
	}
	public static void main(String[] args) {
		Desktop d1 = new Desktop();
		d1.desktopSize();
		d1.computerModel();
	}
}
