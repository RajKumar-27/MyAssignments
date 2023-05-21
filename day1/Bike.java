package week1.day1;

public class Bike {
	public void driveBike() {
		// TODO Auto-generated method stub
		System.out.println("driveBike Method");
	}
public void applyBreak() {
	System.out.println("applyBreak Method");
}
public void soundHorn() {
	System.out.println("soundHorn Method");
}
public void isPuncture() {
	System.out.println("isPuncture Method");
}
public static void main(String[] args) {
	Bike b1 = new Bike();
	b1.driveBike();
	b1.applyBreak();
	b1.soundHorn();
	b1.isPuncture();
}
}

